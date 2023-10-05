/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.persistence;

import com.miapp.triage.persistence.exceptions.NonexistentEntityException;
import com.miapp.triage.triage.BoxAtencion;
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
public class BoxAtencionJpaController implements Serializable {

    public BoxAtencionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(BoxAtencion boxAtencion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente paciente = boxAtencion.getPaciente();
            if (paciente != null) {
                paciente = em.getReference(paciente.getClass(), paciente.getId());
                boxAtencion.setPaciente(paciente);
            }
            em.persist(boxAtencion);
            if (paciente != null) {
                BoxAtencion oldBoxAtencionOfPaciente = paciente.getBoxAtencion();
                if (oldBoxAtencionOfPaciente != null) {
                    oldBoxAtencionOfPaciente.setPaciente(null);
                    oldBoxAtencionOfPaciente = em.merge(oldBoxAtencionOfPaciente);
                }
                paciente.setBoxAtencion(boxAtencion);
                paciente = em.merge(paciente);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(BoxAtencion boxAtencion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            BoxAtencion persistentBoxAtencion = em.find(BoxAtencion.class, boxAtencion.getId_box());
            Paciente pacienteOld = persistentBoxAtencion.getPaciente();
            Paciente pacienteNew = boxAtencion.getPaciente();
            if (pacienteNew != null) {
                pacienteNew = em.getReference(pacienteNew.getClass(), pacienteNew.getId());
                boxAtencion.setPaciente(pacienteNew);
            }
            boxAtencion = em.merge(boxAtencion);
            if (pacienteOld != null && !pacienteOld.equals(pacienteNew)) {
                pacienteOld.setBoxAtencion(null);
                pacienteOld = em.merge(pacienteOld);
            }
            if (pacienteNew != null && !pacienteNew.equals(pacienteOld)) {
                BoxAtencion oldBoxAtencionOfPaciente = pacienteNew.getBoxAtencion();
                if (oldBoxAtencionOfPaciente != null) {
                    oldBoxAtencionOfPaciente.setPaciente(null);
                    oldBoxAtencionOfPaciente = em.merge(oldBoxAtencionOfPaciente);
                }
                pacienteNew.setBoxAtencion(boxAtencion);
                pacienteNew = em.merge(pacienteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = boxAtencion.getId_box();
                if (findBoxAtencion(id) == null) {
                    throw new NonexistentEntityException("The boxAtencion with id " + id + " no longer exists.");
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
            BoxAtencion boxAtencion;
            try {
                boxAtencion = em.getReference(BoxAtencion.class, id);
                boxAtencion.getId_box();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The boxAtencion with id " + id + " no longer exists.", enfe);
            }
            Paciente paciente = boxAtencion.getPaciente();
            if (paciente != null) {
                paciente.setBoxAtencion(null);
                paciente = em.merge(paciente);
            }
            em.remove(boxAtencion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<BoxAtencion> findBoxAtencionEntities() {
        return findBoxAtencionEntities(true, -1, -1);
    }

    public List<BoxAtencion> findBoxAtencionEntities(int maxResults, int firstResult) {
        return findBoxAtencionEntities(false, maxResults, firstResult);
    }

    private List<BoxAtencion> findBoxAtencionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(BoxAtencion.class));
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

    public BoxAtencion findBoxAtencion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(BoxAtencion.class, id);
        } finally {
            em.close();
        }
    }

    public int getBoxAtencionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<BoxAtencion> rt = cq.from(BoxAtencion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
