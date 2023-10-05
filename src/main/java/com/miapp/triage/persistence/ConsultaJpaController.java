/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.persistence;

import com.miapp.triage.persistence.exceptions.NonexistentEntityException;
import com.miapp.triage.triage.Consulta;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.miapp.triage.triage.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fran
 */
public class ConsultaJpaController implements Serializable {

    public ConsultaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public ConsultaJpaController() {
        emf = Persistence.createEntityManagerFactory("com.miapp_Triage_jar_1.0-SNAPSHOTPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Consulta consulta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente consul = consulta.getConsul();
            if (consul != null) {
                consul = em.getReference(consul.getClass(), consul.getId());
                consulta.setConsul(consul);
            }
            em.persist(consulta);
            if (consul != null) {
                consul.getConsulta().add(consulta);
                consul = em.merge(consul);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Consulta consulta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Consulta persistentConsulta = em.find(Consulta.class, consulta.getId_consulta());
            Paciente consulOld = persistentConsulta.getConsul();
            Paciente consulNew = consulta.getConsul();
            if (consulNew != null) {
                consulNew = em.getReference(consulNew.getClass(), consulNew.getId());
                consulta.setConsul(consulNew);
            }
            consulta = em.merge(consulta);
            if (consulOld != null && !consulOld.equals(consulNew)) {
                consulOld.getConsulta().remove(consulta);
                consulOld = em.merge(consulOld);
            }
            if (consulNew != null && !consulNew.equals(consulOld)) {
                consulNew.getConsulta().add(consulta);
                consulNew = em.merge(consulNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = consulta.getId_consulta();
                if (findConsulta(id) == null) {
                    throw new NonexistentEntityException("The consulta with id " + id + " no longer exists.");
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
            Consulta consulta;
            try {
                consulta = em.getReference(Consulta.class, id);
                consulta.getId_consulta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The consulta with id " + id + " no longer exists.", enfe);
            }
            Paciente consul = consulta.getConsul();
            if (consul != null) {
                consul.getConsulta().remove(consulta);
                consul = em.merge(consul);
            }
            em.remove(consulta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Consulta> findConsultaEntities() {
        return findConsultaEntities(true, -1, -1);
    }

    public List<Consulta> findConsultaEntities(int maxResults, int firstResult) {
        return findConsultaEntities(false, maxResults, firstResult);
    }

    private List<Consulta> findConsultaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Consulta.class));
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

    public Consulta findConsulta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Consulta.class, id);
        } finally {
            em.close();
        }
    }

    public int getConsultaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Consulta> rt = cq.from(Consulta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
