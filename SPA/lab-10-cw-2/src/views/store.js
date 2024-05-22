import { reactive } from 'vue'

export const store = reactive({
    all: [],
    addPerson(name, lastName) {
        this.all.push({
            name: name,
            lastName: lastName
        });
    }
})