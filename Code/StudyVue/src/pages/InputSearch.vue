<script>
export default {
  data() {
    return {
      search:""
    }
  },
  watch: {
    search(newVal, oldVal) {
      this.$emit("searchEvent",  newVal)
    }
  },
  props: {
    "onEvent": {
      type: Function,
      default: function(){
        console.log("default")
      }
    }
  }
}
</script>

<template>
  <h2>InputSearch</h2>
  <input type="text" v-model="search">
  <h2>{{ onEvent("AAAABBBB") }}</h2>
</template>

<style scoped>
h2{
  margin: 0;
}
</style>