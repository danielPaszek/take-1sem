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
<script>
import { ref, computed } from 'vue';
export default {
    setup() {
        let all = ref([]);

        const addPerson = (name, lastName) => {
            all.value.push({
                name: name,
                lastName: lastName
            });
        };

        const personCount = computed(() => {
          return all.value.length;  
        });
        return {
            all,
            addPerson,
            personCount
        }
    },
    methods: {
        onSubmit() {
            this.addPerson(this.name.valueOf(), this.lastName.valueOf());
            this.name = '';
            this.lastName = '';
        }
    }
}
</script>
<style lang="">
    
</style>