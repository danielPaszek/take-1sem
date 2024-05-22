<template lang="">
    <div>
        <form @submit.prevent="onSubmit">
            <input placeholder="Type name" v-model="name" />
            <input placeholder="Type last name" v-model="lastName" />
            <button type="submit">Submit</button>
        </form>
        <ul>
            <li v-for="person in all">
                <p>{{ person.name }} {{ person.lastName }}</p>
            </li>
        </ul>
        <div>Total: {{ personCount }}</div>
    </div>
</template>
<script setup>
    import { ref, computed } from 'vue';
    let all = ref([]);
    let name = ref('');
    let lastName = ref('');

    const addPerson = (name, lastName) => {
        all.value.push({
            name: name,
            lastName: lastName
        });
    };

    const personCount = computed(() => {
        return all.value.length;  
    });
    const onSubmit = () => {
        addPerson(name.valueOf(), lastName.valueOf());
        name = '';
        lastName = '';
    }
</script>
<style lang="">
    
</style>