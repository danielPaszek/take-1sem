<template lang="">
    <div>
        <h1>{{title}}</h1>
        <form @submit.prevent="onSubmit">
            <input placeholder="Type name" v-model="name" />
            <input placeholder="Type last name" v-model="lastName" />
            <button type="submit">Submit</button>
        </form>
    </div>
</template>
<script setup>
    defineProps({
        title: String,
    })
import router from '@/router/index.js';
    import { defineModel } from 'vue';
    import { store } from './store.js'
    const name = defineModel('name');
    const lastName = defineModel('lastName');

    const onSubmit = () => {
        store.addPerson(name.value, lastName.value);
        name.value = '';
        lastName.value = '';
        router.push('/');
    }
</script>
<style lang="">
    
</style>