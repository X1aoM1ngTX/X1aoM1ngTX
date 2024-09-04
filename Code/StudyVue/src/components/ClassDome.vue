<template>
  <p :class="{ 'active':isActive, 'fontcolor':isRed}">AAA</p>
  <p :class="objClass">BBB</p>
  <p :class="[arrClass]">CCC</p>
  <p :class="[arrActive,arrColor]">DDD</p>
  <p :class="[isActive ? 'active' : '',isRed ? 'fontcolor' : '']">EEE</p>
  <p :class="[isActive ? 'active' : '',{'fontcolor':isRed}]">FFF</p>
</template>

<script>
export default {
  data() {
    return {
      //AAA,EEE,FFF
      isActive: false,
      isRed: true,
      //BBB
      objClass: {
        active: true,
        fontcolor: true
      },
      //CCC
      arrClass: [
        'active',
        'fontcolor'
      ],
      //DDD
      arrActive: "active",
      arrColor:"fontcolor"
    }
  }
}
</script>

<!-- scoped:样式只在当前组件生效 -->
<style scoped>

.active{
  font-size: 50px;
}

.fontcolor{
  color: #ff0000;
}
</style>