<template>
  <p>ArrayList</p>
  <button @click="addList">原数组添加(尾部)</button>
  <button @click="addHard">原数组添加(头部)</button>
  <button @click="removeHard">原数组删除(头部)</button>
  <button @click="removeList">原数组删除(尾部)</button>
  <button @click="andList">原数组合并</button>
  <button @click="sortList">原数组排序</button>
  <button @click="reverseList">原数组反转</button>
  <button @click="splice">原数组插入/删除</button>
  <ul>
    <li v-for="(item,index) in list" :key="index">{{item}}</li>
  </ul>
</template>

<script>
export default {
  data() {
    return {
      list: [12, 567, 94, 965, 123, 456, 789, 123, 49]
    }
  },
  methods: {
    addList() {// push():    在数组末尾添加一个或多个元素，并返回新的数组长度;
      this.list.push(123)
    },
    addHard() {// unshift(): 在数组开头添加一个或多个元素，并返回新的数组长度;
      this.list.unshift(123)
    },
    removeList() {// pop():     删除数组最后一个元素，并返回该元素;
      this.list.pop()
    },
    removeHard() {// shift():   删除数组第一个元素，并返回该元素。同时，数组中的其他元素会自动前移一位;
      this.list.shift()
    },
    andList() {// concat():   连接两个或多个数组，并返回一个新数组。
      this.list = this.list.concat([123, 456, 789])
    },
    sortList() {// sort():    对数组进行排序，默认是按照字母顺序排序。可以传入一个函数作为参数，该函数定义了排序规则;
      this.list.sort()
    },
    reverseList() {// reverse(): 颠倒数组中元素的顺序。该方法会对原数组进行修改，并返回颠倒后的数组。
      this.list.reverse()
    },
    splice() {// splice():  在数组中插入或删除元素。第一个参数指定插入或删除的位置，第二个参数指定删除的个数，
              //            之后的参数是要插入的元素。该方法会对原数组进行修改，并返回被删除的元素组成的新数组;
      this.list.splice(1, 1, 123, 456, 789)
    }
  }
}
</script>
