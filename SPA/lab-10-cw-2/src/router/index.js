import { createRouter, createWebHistory } from 'vue-router'
import PeopleForm from '@/views/PeopleForm.vue'
import PeopleList from '@/views/PeopleList.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'list',
      component: PeopleList,
      props: {title: 'People List'}
    },
    {
      path: '/form',
      name: 'form',
      component: PeopleForm,
      props: {title: 'Add Person'}

    }
  ]
})

export default router
