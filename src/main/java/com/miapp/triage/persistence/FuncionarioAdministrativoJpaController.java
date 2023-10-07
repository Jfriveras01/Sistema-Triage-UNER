/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.persistence;

import com.miapp.triage.persistence.exceptions.NonexistentEntityException;
import com.miapp.triage.triage.FuncionarioAdministrativo;
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
public class FuncionarioAdministrativoJpaController implements Serializable {

    public FuncionarioAdministrativoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
     public FuncionarioAdministrativoJpaController(){
        emf= Persistence.createEntityManagerFactory("com.miapp_Triage_jar_1.0-SNAPSHOTPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(FuncionarioAdministrativo funcionarioAdministrativo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(funcionarioAdministrativo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(FuncionarioAdministrativo funcionarioAdministrativo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            funcionarioAdministrativo = em.merge(funcionarioAdministrativo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = funcionarioAdministrativo.getId();
                if (findFuncionarioAdministrativo(id) == null) {
                    throw new NonexistentEntityException("The funcionarioAdministrativo with id " + id + " no longer exists.");
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
            FuncionarioAdministrativo funcionarioAdministrativo;
            try {
                funcionarioAdministrativo = em.getReference(FuncionarioAdministrativo.class, id);
                funcionarioAdministrativo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The funcionarioAdministrativo with id " + id + " no longer exists.", enfe);
            }
            em.remove(funcionarioAdministrativo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<FuncionarioAdministrativo> findFuncionarioAdministrativoEntities() {
        return findFuncionarioAdministrativoEntities(true, -1, -1);
    }

    public List<FuncionarioAdministrativo> findFuncionarioAdministrativoEntities(int maxResults, int firstResult) {
        return findFuncionarioAdministrativoEntities(false, maxResults, firstResult);
    }

    private List<FuncionarioAdministrativo> findFuncionarioAdministrativoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(FuncionarioAdministrativo.class));
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

    public FuncionarioAdministrativo findFuncionarioAdministrativo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(FuncionarioAdministrativo.class, id);
        } finally {
            em.close();
        }
    }

    public int getFuncionarioAdministrativoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<FuncionarioAdministrativo> rt = cq.from(FuncionarioAdministrativo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
