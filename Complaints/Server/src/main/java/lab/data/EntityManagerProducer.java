package lab.data;

import jakarta.enterprise.context.Dependent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;

@Dependent
public class EntityManagerProducer {
    @PersistenceContext
    private EntityManager em;
    @Produces
    @RequestScoped
    public EntityManager getEntityManager() {
        return em;
    }
}
