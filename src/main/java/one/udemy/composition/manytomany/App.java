package one.udemy.composition.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jan
 */
public class App {
    
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.udemy.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Professor prof1 = new Professor("Stewen Hawking");
        Professor prof2 = new Professor("Albert Einstein");
        
        ResearchProject pj1 = new ResearchProject("Black Hole Project");
        ResearchProject pj2 = new ResearchProject("Quantuum Field Theory Project");
        ResearchProject pj3 = new ResearchProject("Thermodynamic Fluctuations Project");

        prof1.assignProjectToProf(pj1);
        prof1.assignProjectToProf(pj2);
        prof2.assignProjectToProf(pj3);
        prof2.assignProjectToProf(pj1);
        
        pj1.assignProfToProject(prof1);
        pj1.assignProfToProject(prof2);
        pj2.assignProfToProject(prof1);
        pj3.assignProfToProject(prof2);
        
        entityManager.persist(prof1);
        entityManager.persist(prof2);
        entityManager.persist(pj1);
        entityManager.persist(pj2);
        entityManager.persist(pj3);
        
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}