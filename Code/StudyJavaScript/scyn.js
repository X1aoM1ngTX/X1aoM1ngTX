import axios from "axios";

// Promise类处理异步操作
let promise = new Promise((resolve, reject) => {
    // resolve("还钱") // 状态改变为fulfilled
    reject("没钱") // 状态改变为rejected
}).then(value => {   // fulfilled状态
    console.log(value)
}).catch(reason => {      // rejected状态
    console.log(reason)
}).finally(() => {
    console.log("End.")
})

// 使用fetch函数发送一个HTTP GET请求到指定的URL
fetch("http://127.0.0.1:3456/get").then(response => {
    //返回的解析后的json数据会传递给下一个 then() 方法中的回调函数作为参数,这个参数就是 data
    return response.json() //response.json() 用于将响应数据解析为json格式的数据
}).then(data => { //data 解析后的json数据
    console.log("Get.Data:", data)
}).catch(error => {
    console.log("Get.Error:", error.message)
}).finally(() => {
    console.log("Get.Finally")
})

// 使用fetch函数发送一个HTTP POST请求到指定的URL
fetch("http://127.0.0.1:3456/post", {
    // 设置请求方法为POST
    method: "POST",
    // 设置请求头，指定数据类型为表单数据
    headers: {
        "Content-Type": "application/x-www-form-urlencoded"
    },
    // 请求体，使用URLSearchParams处理表单数据
    body: new URLSearchParams({
        // 设置表单参数，name和website
        name: "Alice",
        website: 'https://github.com/Alice-Wang-2021'
    }),
    // 处理fetch请求的响应
}).then(response => {
    // 检查响应状态并返回响应体的JSON解析 promise
    return response.json()
}).then(data => {
    // 打印接收到的数据
    console.log("Post.Data:", data)
}).catch(error => {
    // 处理请求或响应过程中的错误
    console.log("Post.Error:", error.message)
}).finally(() => {
    // 请求完成后的操作，无论成功或失败
    console.log("Post.Finally")
})

// 使用fetch发送一个POST请求到指定URL，请求体为JSON格式的数据
fetch("http://127.0.0.1:3456/postJson", {
    // 设置请求方法为POST
    method: "POST",
    // 设置请求头
    headers: {
        // 设置内容类型为JSON
        "Content-Type": "application/json"
    },
    // 将请求体内容转换为JSON字符串
    body: JSON.stringify({
        name: "Xm",
        website: 'https://github.io/XiaoMing-7276'
    }),
    // 上面的代码块解释了如何构建请求以及发送什么数据
}).then(response => {
    // 解析响应体为JSON格式
    return response.json()
}).then(data => {
    // 处理解析后的数据
    console.log("Data", data)
}).catch(error => {
    // 处理请求或响应过程中可能出现的错误
    console.log("Error: ", error.message)
}).finally(() => {
    // 请求完成后的最终操作，无论成功或失败都会执行
    console.log("Finally")
})

// 使用axios发送一个HTTP GET请求
axios.get("http://127.0.0.1:3456/get")
    .then(response => {
        // 处理响应数据
        console.log("Get.Data:", response.data)
    })
    .catch(error => {
        // 处理错误
        console.log("Get.Error:", error.message)
    })
    .finally(() => {
        // 请求完成后的操作，无论成功或失败
        console.log("Get.Finally")
    })

// 定义请求体数据
let data = {
    name: "kk_aaa",
    website: 'https://kaithub.com/kkaaa-Lang-2039'
}
// 使用axios发送一个HTTP POST请求
axios.post("http://127.0.0.1:3456/post", data,{
    headers: {
        "Content-Type": "application/x-www-form-urlencoded"
    }
}).then(response => {
    // 请求成功时执行，打印响应的数据
    console.log("Post.Data:", response.data)
}).catch(error => {
    // 请求失败时执行，打印错误信息
    console.log("Post.Error:", error.message)
}).finally(() => {
    // 无论请求成功还是失败都会执行，通常用于清理操作
    console.log("Post.Finally")
})

// 指定请求头为JSON类型，这是许多API所要求的
axios.post("http://127.0.0.1:3456/postJson", data, {
    headers: {
        "Content-Type": "application/json"//axios 的默认请求头是 application/json
    }
}).then(response => {
    // 请求成功时执行，打印响应的数据
    console.log("Post.Data:", response.data)
}).catch(error => {
    // 请求失败时执行，打印错误信息
    console.log("Post.Error:", error.message)
}).finally(() => {
    // 无论请求成功还是失败都会执行，通常用于清理操作
    console.log("Post.Finally")
})