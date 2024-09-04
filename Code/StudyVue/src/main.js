import { createApp } from 'vue'
import App from './App.vue'
// import 'element-plus/dist/index.css'
import Header from "@/pages/Header.vue";

const app = createApp(App)
// 全局注册组件
app.component('Header', Header)

app.mount('#app')
