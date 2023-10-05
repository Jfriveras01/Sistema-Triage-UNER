/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.persistence;

import com.miapp.triage.persistence.exceptions.NonexistentEntityException;
import com.miapp.triage.triage.InfomeEstudios;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.miapp.triage.triage.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Fran
 */
public class InfomeEstudiosJpaController implements Serializable {

    public InfomeEstudiosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(InfomeEstudios infomeEstudios) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente informe = infomeEstudios.getInforme();
            if (informe != null) {
                informe = em.getReference(informe.getClass(), informe.getId());
                infomeEstudios.setInforme(informe);
            }
            em.persist(infomeEstudios);
            if (informe != null) {
                informe.getInformeEstudios().add(infomeEstudios);
                informe = em.merge(informe);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(InfomeEstudios infomeEstudios) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            InfomeEstudios persistentInfomeEstudios = em.find(InfomeEstudios.class, infomeEstudios.getId_informe());
            Paciente informeOld = persistentInfomeEstudios.getInforme();
            Paciente informeNew = infomeEstudios.getInforme();
            if (informeNew != null) {
                informeNew = em.getReference(informeNew.getClass(), informeNew.getId());
                infomeEstudios.setInforme(informeNew);
            }
            infomeEstudios = em.merge(infomeEstudios);
            if (informeOld != null && !informeOld.equals(informeNew)) {
                informeOld.getInformeEstudios().remove(infomeEstudios);
                informeOld = em.merge(informeOld);
            }
            if (informeNew != null && !informeNew.equals(informeOld)) {
                informeNew.getInformeEstudios().add(infomeEstudios);
                informeNew = em.merge(informeNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = infomeEstudios.getId_informe();
                if (findInfomeEstudios(id) == null) {
                    throw new NonexistentEntityException("The infomeEstudios with id " + id + " no longer exists.");
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
            InfomeEstudios infomeEstudios;
            try {
                infomeEstudios = em.getReference(InfomeEstudios.class, id);
                infomeEstudios.getId_informe();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The infomeEstudios with id " + id + " no longer exists.", enfe);
            }
            Paciente informe = infomeEstudios.getInforme();
            if (informe != null) {
                informe.getInformeEstudios().remove(infomeEstudios);
                informe = em.merge(informe);
            }
            em.remove(infomeEstudios);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<InfomeEstudios> findInfomeEstudiosEntities() {
        return findInfomeEstudiosEntities(true, -1, -1);
    }

    public List<InfomeEstudios> findInfomeEstudiosEntities(int maxResults, int firstResult) {
        return findInfomeEstudiosEntities(false, maxResults, firstResult);
    }

    private List<InfomeEstudios> findInfomeEstudiosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(InfomeEstudios.class));
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

    public InfomeEstudios findInfomeEstudios(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(InfomeEstudios.class, id);
        } finally {
            em.close();
        }
    }

    public int getInfomeEstudiosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<InfomeEstudios> rt = cq.from(InfomeEstudios.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
