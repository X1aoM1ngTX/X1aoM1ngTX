<template>
  <div>EvenDome</div>
  <button @click="count++"> {{ count }}</button>
  <button @click="addCount"> {{ count }}</button>
  <p v-for="(item) in names" key="index" @click="getNameToPrint(item,$event)">{{ item }}</p>
  <div @click="clickDiv">
    <p @click="clickP">Click</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      count: 0,
      names: ['akt', 'bus', 'cat', 'dank']
    }
  },
  methods: {
    addCount() {
      this.count++
    },
    getNameToPrint(item, e) {
      console.log(item)
      console.log(e)
    },
    clickDiv() {
      console.log('clickDiv')
    },
    clickP(e) {
      e.stopPropagation()
      console.log('clickP')
    }
  }
}
</script>