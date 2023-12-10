// 获取左右按钮和图片列表
let oLeft = document.querySelector(".left");
let oRight = document.querySelector(".right");
let oImgList = document.querySelector(".img-list");

// 克隆第一张图片
let clonefirstImg = oImgList.firstElementChild.cloneNode();
// 将第一张图片添加至图片列表的末尾
oImgList.appendChild(clonefirstImg);

// 图片索引 代表当前是第几张图片  index:0代表第一张图片
let index = 0;

// 设置函数节流锁
let lock = true;
function handleRightBtn() {
  // 如果锁定了就返回
  if (!lock) return;
  // 索引加1
  index++;
  // 根据索引移动图片列表
  oImgList.style.left = index * -1226 + "px";
  // 添加过渡效果
  oImgList.style.transition = "0.5s ease";

  // 如果索引为5，代表已经切换到了最后一张假图
  if (index === 5) {
    // 索引重置为0
    index = 0;
    // 延时500毫秒后切换第一张真图
    setTimeout(() => {
      oImgList.style.left = 0;
      // 取消过渡效果
      oImgList.style.transition = "none";
    }, 500);
  }

  // 设置小圆点的高亮
  setCircles();
  // 关锁
  lock = false;
  // 延时500毫秒后解锁
  setTimeout(() => {
    lock = true;
  }, 500);
}

// 添加点击右按钮的事件监听器
oRight.addEventListener("click", handleRightBtn);

// 左按钮的实现  瞬间切换到假图然后拉到真实最后一张图片
oLeft.addEventListener("click", () => {
  // 如果锁定了就返回
  if (!lock) return;
  // 索引减1
  index--;
  // 如果索引为-1，代表已经切换到了第一张假图
  if (index === -1) {
    // 移动图片列表到最后一张真图
    oImgList.style.left = 5 * -1226 + "px";
    oImgList.style.transition = "none";
    // 索引重置为4
    index = 4;
    // 延时0毫秒后切换到倒数第二张真图
    setTimeout(() => {
      oImgList.style.left = index * -1226 + "px";
      oImgList.style.transition = "0.5s ease";
    }, 0);
  } else {
    // 移动图片列表
    oImgList.style.left = index * -1226 + "px";
  }

  // 设置小圆点的高亮
  setCircles();

  // 关锁
  lock = false;
  // 延时500毫秒后解锁
  setTimeout(() => {
    lock = true;
  }, 500);
});

// 获取五个小圆点
const circles = document.querySelectorAll(".circle");

// 小圆点高亮的显示
function setCircles() {
  for (let i = 0; i < circles.length; i++) {
    // 如果当前小圆点索引和index相等
    if (i === index) {
      circles[i].classList.add("active");
    } else {
      circles[i].classList.remove("active");
    }
  }
}

// 小圆点点击切换图片 使用事件代理
const oCircle = document.querySelector(".circle-list");
oCircle.addEventListener("click", (e) => {
  // 当我点击小圆点的时候
  if (e.target.nodeName.toLowerCase() === "li") {
    // 当前元素的data-n对应得值 和index一一对应
    const n = Number(e.target.getAttribute("data-n"));
    // 更新index
    index = n;
    // 设置小圆点的高亮
    setCircles();
    // 切换图片列表
    oImgList.style.transition = "0.5s ease";
    oImgList.style.left = index * -1226 + "px";
  }
});

// 自动轮播
let autoplay = setInterval(handleRightBtn, 2000);
const oWrap = document.getElementById("wrap");
// 移入停止轮播
oWrap.addEventListener("mouseenter", () => {
  // 清除定时器
  clearInterval(autoplay);
});
// 移出继续轮播
oWrap.addEventListener("mouseleave", () => {
  // 先清除定时器
  clearInterval(autoplay);
  // 重新设置定时器
  autoplay = setInterval(handleRightBtn, 2000);
});

// https://segmentfault.com/a/1190000018445196