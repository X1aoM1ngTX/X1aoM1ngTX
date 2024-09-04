<script>
import Fielder from "@/pages/Fielder.vue"

export default {
  data() {
    return {
      msg: "",
      num: 123,
      names: ["A", "B", "C"],
      users: {
        name: "Tom",
        age: 18,
        sex: "man",
        address: "China",
        email: "tom@163.com",
        phone: "123456789"
      }
    }
  },
  methods: {
    getHandle(fielder_data) {
      console.log("getHandle", fielder_data)
      this.msg = fielder_data
    }
  },
  components: {Fielder}
}
</script>

<template>
  <div class="main">
    <h2>Main</h2>
    <Fielder @clickEvent="getHandle" title="String: Main_Data" :num="num" :names="names" :users="users"/>
    <div>
      <p>num:{{ msg }}</p>
    </div>
  </div>
</template>

<style scoped>
.main {
  float: left;
  width: 69.3%;
  height: auto;
  border: 3px solid gray;
  box-sizing: border-box;
}
</style>