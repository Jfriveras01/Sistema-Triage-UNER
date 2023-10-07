/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.persistence;

import com.miapp.triage.persistence.exceptions.NonexistentEntityException;
import com.miapp.triage.triage.PersonalEnfermeria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author iCentro
 */
public class PersonalEnfermeriaJpaController implements Serializable {

    public PersonalEnfermeriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
     public PersonalEnfermeriaJpaController(){
        emf= Persistence.createEntityManagerFactory("com.miapp_Triage_jar_1.0-SNAPSHOTPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PersonalEnfermeria personalEnfermeria) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(personalEnfermeria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PersonalEnfermeria personalEnfermeria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            personalEnfermeria = em.merge(personalEnfermeria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = personalEnfermeria.getId();
                if (findPersonalEnfermeria(id) == null) {
                    throw new NonexistentEntityException("The personalEnfermeria with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PersonalEnfermeria personalEnfermeria;
            try {
                personalEnfermeria = em.getReference(PersonalEnfermeria.class, id);
                personalEnfermeria.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The personalEnfermeria with id " + id + " no longer exists.", enfe);
            }
            em.remove(personalEnfermeria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PersonalEnfermeria> findPersonalEnfermeriaEntities() {
        return findPersonalEnfermeriaEntities(true, -1, -1);
    }

    public List<PersonalEnfermeria> findPersonalEnfermeriaEntities(int maxResults, int firstResult) {
        return findPersonalEnfermeriaEntities(false, maxResults, firstResult);
    }

    private List<PersonalEnfermeria> findPersonalEnfermeriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PersonalEnfermeria.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public PersonalEnfermeria findPersonalEnfermeria(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PersonalEnfermeria.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonalEnfermeriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PersonalEnfermeria> rt = cq.from(PersonalEnfermeria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
