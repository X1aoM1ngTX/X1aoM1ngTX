<template>
  <div v-bind:id="msg">Test</div>
  <button :disabled="isBtnDisabled">按钮</button>
</template>

<script>
export default {
  data() {
    return {
      msg: 'test',
      isBtnDisabled: true
    }
  }
}
</script>