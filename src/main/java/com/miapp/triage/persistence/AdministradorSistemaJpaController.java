/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.persistence;

import com.miapp.triage.persistence.exceptions.NonexistentEntityException;
import com.miapp.triage.triage.AdministradorSistema;
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
public class AdministradorSistemaJpaController implements Serializable {

    public AdministradorSistemaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public AdministradorSistemaJpaController(){
        emf= Persistence.createEntityManagerFactory("com.miapp_Triage_jar_1.0-SNAPSHOTPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(AdministradorSistema administradorSistema) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(administradorSistema);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(AdministradorSistema administradorSistema) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            administradorSistema = em.merge(administradorSistema);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = administradorSistema.getId();
                if (findAdministradorSistema(id) == null) {
                    throw new NonexistentEntityException("The administradorSistema with id " + id + " no longer exists.");
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
            AdministradorSistema administradorSistema;
            try {
                administradorSistema = em.getReference(AdministradorSistema.class, id);
                administradorSistema.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The administradorSistema with id " + id + " no longer exists.", enfe);
            }
            em.remove(administradorSistema);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<AdministradorSistema> findAdministradorSistemaEntities() {
        return findAdministradorSistemaEntities(true, -1, -1);
    }

    public List<AdministradorSistema> findAdministradorSistemaEntities(int maxResults, int firstResult) {
        return findAdministradorSistemaEntities(false, maxResults, firstResult);
    }

    private List<AdministradorSistema> findAdministradorSistemaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AdministradorSistema.class));
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

    public AdministradorSistema findAdministradorSistema(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AdministradorSistema.class, id);
        } finally {
            em.close();
        }
    }

    public int getAdministradorSistemaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<AdministradorSistema> rt = cq.from(AdministradorSistema.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
