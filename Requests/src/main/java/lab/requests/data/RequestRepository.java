package lab.requests.data;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaQuery;
import lab.requests.entities.Request;

import java.util.List;

@ApplicationScoped
public class RequestRepository {
    @Inject
    private EntityManager em;

    public void create(Request entity) {
        em.persist(entity);
    }
    public void edit(Request entity) {
        em.merge(entity);
    }
    public void remove(Request entity) {
        em.remove(em.merge(entity));
    }
    public Request find(Object id) {
        return em.find(Request.class, id);
    }
    public List<Request> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Request.class));
        return em.createQuery(cq).getResultList();
    }
}
