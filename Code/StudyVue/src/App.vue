<script>
import IfDome from "@/components/IfDome.vue";
import ListDome from "@/components/ListDome.vue"
import EvenDome from "@/components/EvenDome.vue"
import HelloWorld from "@/components/HelloWorld.vue";
import ArrayList from "@/components/ArrayList.vue";
import Computed from "@/components/Computed.vue";
import ClassDome from "@/components/ClassDome.vue";
import StyleDome from "@/components/StyleDome.vue";
import WatchDome from "@/components/WatchDome.vue";
import VModel from "@/components/VModel.vue";
import RefDome from "@/components/RefDome.vue";
import {defineComponent} from "vue";
import Header from "@/pages/Header.vue";
import Main from "@/pages/Main.vue";
import Aside from "@/pages/Aside.vue";
import SlotsBase from "@/components/SlotsBase.vue";

export default defineComponent({
  components: {
    Aside,
    Main,
    Header,
    HelloWorld,
    IfDome,
    ListDome,
    EvenDome,
    ArrayList,
    Computed,
    ClassDome,
    StyleDome,
    WatchDome,
    VModel,
    RefDome,
    SlotsBase
  }
})
</script>

<template>
  <SlotsBase>
    <div><h3>Slot Base Main</h3></div>
  </SlotsBase>
  <Header/>
  <Main/>
  <Aside/>
  <!--  <HelloWorld/>-->
  <!--  <IfDome/>-->
  <!--  <ListDome/>-->
  <!--  <EvenDome/>-->
  <!--  <ArrayList/>-->
  <!--  <Computed/>-->
  <!--  <ClassDome/>-->
  <!--  <StyleDome/>-->
  <!--  <WatchDome/>-->
  <!--  <VModel/>-->
  <!--  <RefDome/>-->
</template>