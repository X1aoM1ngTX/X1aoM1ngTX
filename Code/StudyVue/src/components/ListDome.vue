<template>
  <h3>ListDome</h3>
  <span v-for="item in list">{{ item }}</span>
  <div v-for="i of result" :key="i.id">
    <span>{{ i.name }}</span>
    <span>{{ i.age }}</span>
    <span><img :src="i.url" alt=""></span>
  </div>
  <div v-for="(index,key,value) in userInfo">
    <span>{{ index }}</span>
    <span>{{ key }}</span>
    <span>{{ value }}</span>
  </div>
</template>

<script>
export default {
  data() {
    return {
      list: ["1 ", "2 ", "3 "],
      result: [
        {id: 3216549, name: "张三", age: 18, url: "https://www.baidu.com/img/bd_logo1.png?where=super"},
        {id: 9845611, name: "李四", age: 19, url: "https://www.baidu.com/img/bd_logo1.png?where=super"},
        {id: 6216798, name: "王五", age: 20, url: "https://www.baidu.com/img/bd_logo1.png?where=super"}
      ],
      userInfo: {
        name: "张三",
        age: 18,
        sex: "男"
      }
    }
  }
}
</script>