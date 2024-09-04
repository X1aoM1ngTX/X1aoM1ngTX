<template>
  <div ref="container" class="container">{{ msg }}</div>
  <button @click="getElement">GetMsg</button>
  <input ref="input" type="text">
</template>

<script>
export default {
  data() {
    return {
      msg: "Hello Vue!"
    }
  },
  methods: {
    getElement() {
      console.log(this.$refs.container.innerHTML = "Hello World!");
      console.log(this.$refs.input.value)
    }
  }
}
</script>
