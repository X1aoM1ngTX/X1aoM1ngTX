<template>
  <h1>Slots Base Header</h1>
  <slot></slot>
</template>

<script>
import Header from "@/pages/Header.vue";

export default {
  components: {Header}
}
</script>