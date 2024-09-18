'use strict'

console.log('Happy developing ✨')

let a = 1
let b = "Hello world!"
let c = 2 > 1

// && || !

console.log("1" == 1); // false，因为一个是字符串，另一个是数字
console.log(a === c); // false，因为一个是数字，另一个是布尔值
console.log(isNaN(NaN)); // NaN 是特殊值，不能和任何值相等（包括Nan自己）

//null：空   undefined：未定义

let x = 1;
x = 2; // 合法

const y = 3; // 声明时必须初始化
// y = 4; // 错误：Assignment to constant variable.
const arr = [1, 2, 3, null, "b"];
arr[2] = 2; // 合法：修改对象(或数组)内部属性


console.log("\'\t122 \n \u4e2d \x41")
console.log(`dada
wad
addon124`) //多行注释 Tab上面的~键（``）
// 多维数组
let arr2 = [[1, 2], [3, 4], [5, 6, 7]]
console.log(arr2[0][0])

// Person = new Person("Alice", 25, "man"); Java 类的定义
let rson = {
    name: "Alice",
    age: 25,
    sex: "man",
    sayHi: function () {
        console.log("Hi, I am " + this.name)
    }
}
console.log(rson.sayHi())
console.log(rson.age, rson.name, rson.sex)
console.log(`Msg: Hello, ${rson.name} !`) // 模板字符串

// if
if (2 > 1) {
    console.log("2>1")
} else {
    console.log("idk?")
}

// while
while (rson.age < 37) {
    rson.age++
    console.log(rson.age)
}

// do while
do {
    console.log("Do while ~");
    console.log(rson.age);
    rson.age++;
} while (rson.age < 55);

// for
for (let i = 0; i < 5; i++) {
    console.log("WoW")
}
// for in
let arr3 = ["atk", "bus", "car"]
for (let i in arr3) {
    console.log(arr3[i]) // 输出索引
}
// for of
for (let item of arr3) {
    console.log(item)
}
// forEach
arr3.forEach(item => console.log(item))
arr3.forEach(function (item) {
    console.log(item)
})

// map
let arr4 = new Map([["akt", 429234], ["bus", 809221], ["car", 622456]])
arr4.set("bike", 753406)
for (let x of arr4) {
    console.log(x)
}
console.log(arr4)
console.log(arr4.get("akt"));

// set
let arr5 = new Set([5, 2, 2, 4, 9,])
console.log(arr5) // set无重复元素
arr5.add(7)
arr5.delete(2)
for (let x of arr5) {
    console.log(x)
}
console.log(arr5)
console.log(arr5.has(5)) // 判断是否包含某元素

// 函数
function add(a, b) {
    return a + b
}

console.log(add(1, 2))
// 箭头函数
let add2 = (a, b) => a + b
// 匿名函数
let abs = function (x) {
    if (typeof x !== "number") throw "Error: Not a number"
    return x >= 0 ? x : -x
}
console.log(abs(1))

// 剩余参数
function sum(x, y, ...rest) {
    return x + y + rest.reduce((a, b) => a + b)
}

console.log(sum(1, 2, 3, 4, 5))

// 类
class Person {
    name
    age
    sex

    // 构造函数/初始化函数/构造方法/初始化方法/构造器
    constructor(name, age, sex) {
        this.name = name
        this.age = age
        this.sex = sex
    }

    sayHi() {
        return `Hi, I am ${this.name}`
    }
}

// 子类(继承)
class Student extends Person {
    grade

    // 构造函数/初始化函数/构造方法/初始化方法/构造器
    constructor(name, age, sex, grade) {
        super(name, age, sex)
        this.grade = grade
    }

    study() {
        return `${this.name} is studying`
    }
}

let stu = new Student("Alice", 25, "man", "2021")
console.log(stu.name)
console.log(stu.sayHi())// 继承自Person的方法
console.log(stu.study())// 本类方法

let [xi, yi] = [1, 2]// 解构赋值
console.log('x:' + xi, 'y:' + yi)

let [, , zi] = [1, 2, 3]
console.log(zi)

let [ax, ...ay] = [1, 2, 3, 4, 5]//
console.log(ax, ay)

let [a1, a2 = 200] = [100]// 默认值 a2 = 200
console.log(a1, a2)

let d = 22
let p = 44;//不加;会影响下一行代码导致报错
[p, d] = [d, p]//交换值
console.log(d, p)

let obj = {
    name1: "Alice",
    age: 25,
    sex: "man",
}
let {name1} = obj
console.log(name1)
let {name1: n1, age, sex} = obj
console.log(n1, age, sex)

// 日期对象
let now = new Date()
console.log(now)
console.log('TS:     ', now.getTime())     // 1970年1月1日0时0分0秒到当前时间之间的毫秒数 (时间戳/UNIX时间) 全世界统一
console.log('Year:   ', now.getFullYear()) // 当前年份20XX
console.log('Month:  ', now.getMonth() + 1)    // 0-11月
console.log('Day:    ', now.getDate())     // 1-31日
console.log('Week:   ', now.getDay())      // 0为周日，1-6为周一至周六
console.log('Hour:   ', now.getHours())    // 0-23时
console.log('Minute: ', now.getMinutes())  // 0-59分
console.log('Second: ', now.getSeconds())  // 0-59秒
console.log('ms:     ', now.getMilliseconds()) // 0-999毫秒
console.log('Time:   ', now.getTimezoneOffset()) // 当前日期时间与 UTC 时间的时差，单位(分钟)
console.log('Now:    ', now.toLocaleString()) // 当前日期时间

// 对象
let MI = {
    name: "XIAOMI",// 品牌
    price: 30.15,// 单位：万
    color: "blue",// 颜色
    model: "XM-SU7",// 型号
    year: 2024,// 年款
    country: "China",// 国家
    boot: function () {
        console.log("Booting...")
    }
}
let BYD = {
    name: "BYD",
    price: 25.15,
    color: "red",
    model: "BYD-Qin",
    year: 2023,
    country: "China",
}
BYD.__proto__ = MI // BYD继承自MI 原型继承，不推荐
console.log(BYD.boot())
// JSON
console.log(MI)
let JsonByd = JSON.stringify(MI) // 对象转JSON字符串
console.log(JsonByd)
console.log(JSON.parse(JsonByd)) // JSON字符串转对象




