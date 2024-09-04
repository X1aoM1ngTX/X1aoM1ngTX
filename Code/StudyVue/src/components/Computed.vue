<template>
  <h3>{{ student.name }}</h3>
  <p>{{ getHobby }}</p>
  <p>{{ getHobbys() }}</p>
</template>

<script>
export default {
  data() {
    return {
      student: {
        name: 'XM',
        hobby: ['打篮球', '踢足球', '打游戏']
      }
    }
  },
  computed: {
    getHobby() {// 计算属性一次调用就计算一次（多次调用有缓存值）
      return this.student.hobby.length > 0 ? "YES" : "NO"
    }
  },
  methods: {
    getHobbys() {// 方法每次调用都会重新计算（多次调用无缓存值）
      return this.student.hobby.length > 0 ? "YES" : "NO"
    }
  }
}
</script>
