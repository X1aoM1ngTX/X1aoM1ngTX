<script>
export default {
  data() {
    return {
      msg: "This is a fielder data"
    }
  },
  props: {// props 从父级传递到子级的数据是只读的，子级不可以修改，否则会警告⚠️
    "title": {
      type: [String, Number],// 类型校验传入非type指定类型时，会警告⚠️
    },
    "num": {
      type: Number,
      default: 0,// 传入非type指定类型或为传入数据时，默认值生效
    },
    "names": {
      type: Array,
      default: function () {//数组和对象类型默认值必须为函数
        return ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
      }
    },
    "users": {
      type: Object,
      default: function () {
        return {
          name: "null",
          age: 0,
          sex: "null",
          address: "null",
          email: "null",
          phone: "null"
        }
      },
      required: true// required: true 必须传入数据，否则会警告⚠️
    }
  },
  methods: {
    clickEventHandle() {
      this.$emit("clickEvent", this.msg)
    }
  }
}

</script>

<template>
  <h2>Fielder</h2>
  <p>{{ title }}</p>
  <p>{{ msg }}</p>
  <ul>
    <li v-for="(name, index) in names" :key="index">{{ name }}</li>
  </ul>
  <div>
    <p>{{ users.name }}</p>
    <p>{{ users.age }}</p>
    <p>{{ users.sex }}</p>
    <p>{{ users.address }}</p>
    <p>{{ users.email }}</p>
    <p>{{ users.phone }}</p>
  </div>
  <button @click="clickEventHandle">按钮</button>
</template>

<style scoped>
h2 {
  width: 80%;
  text-align: center;
  line-height: 50px;
  background-color: rgb(145, 145, 145);
  margin: 10px auto 0;
  box-sizing: border-box;
}
</style>