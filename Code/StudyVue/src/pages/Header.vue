<script>
import InputSearch from "./InputSearch.vue"

export default {
  components: {
    InputSearch
  },
  data() {
    return {
      search: ""
    }
  },
  methods: {
    getSearchEvent(input_data) {
      this.search = input_data
    },
    getData(data) {
      this.search = data
    }
  }
}
</script>

<template>
  <div class="header">
    <h1>Welcome to My Vue.js App</h1>
    <InputSearch @searchEvent="getSearchEvent"/>
    <InputSearch :onEvent="getData"/>
    <p>{{ search }}</p>
  </div>
</template>

<style scoped>
.header {
  width: 100%;
  height: auto;
  border: 3px solid gray;
  text-align: center;
  box-sizing: border-box;
}

h1 {
  margin: 0;
}
</style>