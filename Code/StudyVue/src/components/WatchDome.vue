<template>
  <h1>WatchDome</h1>
  <div>{{ msg }}
    <button @click="changeMsg">ChangeMsg</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      msg: "Hello Vue!"
    }
  }, methods: {
    changeMsg() {
      this.msg = "Hello World!"
    }
  }, watch: {
    msg(newVal, oldVal) {
      console.log(newVal, oldVal)
    }
  }
}
</script>