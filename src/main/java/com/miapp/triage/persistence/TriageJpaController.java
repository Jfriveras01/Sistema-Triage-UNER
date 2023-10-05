/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.persistence;

import com.miapp.triage.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.miapp.triage.triage.Paciente;
import com.miapp.triage.triage.Triage;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fran
 */
public class TriageJpaController implements Serializable {

    public TriageJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public TriageJpaController() {
        emf = Persistence.createEntityManagerFactory("com.miapp_Triage_jar_1.0-SNAPSHOTPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Triage triage) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente paciente = triage.getPaciente();
            if (paciente != null) {
                paciente = em.getReference(paciente.getClass(), paciente.getId());
                triage.setPaciente(paciente);
            }
            em.persist(triage);
            if (paciente != null) {
                Triage oldTriageOfPaciente = paciente.getTriage();
                if (oldTriageOfPaciente != null) {
                    oldTriageOfPaciente.setPaciente(null);
                    oldTriageOfPaciente = em.merge(oldTriageOfPaciente);
                }
                paciente.setTriage(triage);
                paciente = em.merge(paciente);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Triage triage) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Triage persistentTriage = em.find(Triage.class, triage.getId_triage());
            Paciente pacienteOld = persistentTriage.getPaciente();
            Paciente pacienteNew = triage.getPaciente();
            if (pacienteNew != null) {
                pacienteNew = em.getReference(pacienteNew.getClass(), pacienteNew.getId());
                triage.setPaciente(pacienteNew);
            }
            triage = em.merge(triage);
            if (pacienteOld != null && !pacienteOld.equals(pacienteNew)) {
                pacienteOld.setTriage(null);
                pacienteOld = em.merge(pacienteOld);
            }
            if (pacienteNew != null && !pacienteNew.equals(pacienteOld)) {
                Triage oldTriageOfPaciente = pacienteNew.getTriage();
                if (oldTriageOfPaciente != null) {
                    oldTriageOfPaciente.setPaciente(null);
                    oldTriageOfPaciente = em.merge(oldTriageOfPaciente);
                }
                pacienteNew.setTriage(triage);
                pacienteNew = em.merge(pacienteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = triage.getId_triage();
                if (findTriage(id) == null) {
                    throw new NonexistentEntityException("The triage with id " + id + " no longer exists.");
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
            Triage triage;
            try {
                triage = em.getReference(Triage.class, id);
                triage.getId_triage();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The triage with id " + id + " no longer exists.", enfe);
            }
            Paciente paciente = triage.getPaciente();
            if (paciente != null) {
                paciente.setTriage(null);
                paciente = em.merge(paciente);
            }
            em.remove(triage);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Triage> findTriageEntities() {
        return findTriageEntities(true, -1, -1);
    }

    public List<Triage> findTriageEntities(int maxResults, int firstResult) {
        return findTriageEntities(false, maxResults, firstResult);
    }

    private List<Triage> findTriageEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Triage.class));
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

    public Triage findTriage(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Triage.class, id);
        } finally {
            em.close();
        }
    }

    public int getTriageCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Triage> rt = cq.from(Triage.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
