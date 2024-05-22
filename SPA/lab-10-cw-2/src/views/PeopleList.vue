<template lang="">
    <div>
        <h1>{{title}}</h1>
        <ul>
            <li v-for="person in store.all">
                <p>{{ person.name }} {{ person.lastName }}</p>
            </li>
        </ul>
        <div>Total: {{ personCount }}</div>
    </div>
</template>
<script setup>
    defineProps({
        title: String,
    })
    import { ref, computed } from 'vue';
    import { store } from './store.js';
    const personCount = computed(() => {
        return store.all.length;  
    });

</script>
<style lang="">
    
</style>