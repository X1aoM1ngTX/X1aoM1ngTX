<template>
  <div :style="{color:colorActive,fontSize:fontSize + 'px'}">TEST1</div>
  <div :style="objStyle">TEST2</div>
</template>

<script>
export default {
  data() {
    return {
      colorActive: "blue",
      fontSize: 50,
      objStyle: {
        color: "green",
        fontSize: "50px"
      }
    }
  }
}
</script>