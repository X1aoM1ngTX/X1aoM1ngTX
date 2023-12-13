// 定义选择器，选中类名为'slider-wrapper'的元素并赋值给变量sliderWrapper
const sliderWrapper = document.querySelector('.slider-wrapper');
// 定义选择器，选中所有类名为'indicator'的元素并赋值给变量indicators
const indicators = document.querySelectorAll('.indicator');

// 定义变量currentIndex，并赋值为0
let currentIndex = 0;

// 定义函数updateSlider，用于更新滑块的位置和更新指示器的状态
function updateSlider() {
    // 计算新的transform属性的值，并赋值给变量newTransformValue
    const newTransformValue = -currentIndex * 1000 + 'px';
    // 将newTransformValue赋值给滑块容器的transform属性
    sliderWrapper.style.transform = 'translateX(' + newTransformValue + ')';
    // 调用updateIndicators函数更新指示器的状态
    updateIndicators();
}

// 定义函数updateIndicators，用于更新指示器的状态
function updateIndicators() {
    // 遍历所有的指示器，对于每个指示器，如果其下标与currentIndex相等，为其添加'active'类名，否则移除'active'类名
    indicators.forEach((indicator, index) => {
        indicator.classList.toggle('active', index === currentIndex);
    });
}

// 定义函数nextSlide，用于切换到下一张图片
function nextSlide() {
    // 计算下一张图片的下标，并赋值给currentIndex
    currentIndex = (currentIndex + 1) % 3;
    // 调用updateSlider函数更新滑块的位置
    updateSlider();
}

// 定义函数prevSlide，用于切换到上一张图片
function prevSlide() {
    // 计算上一张图片的下标，并赋值给currentIndex
    currentIndex = (currentIndex - 1 + 3) % 3;
    // 调用updateSlider函数更新滑块的位置
    updateSlider();
}

// 遍历所有的指示器，为每个指示器添加点击事件监听器
indicators.forEach((indicator, index) => {
    // 当点击指示器时，将currentIndex设置为当前指示器的下标，并调用updateSlider函数更新滑块的位置
    indicator.addEventListener('click', () => {
        currentIndex = index;
        updateSlider();
    });
})

// 每隔2000毫秒调用一次nextSlide函数，实现自动切换图片
setInterval(nextSlide, 5000); // 切换间隔，单位：毫秒
