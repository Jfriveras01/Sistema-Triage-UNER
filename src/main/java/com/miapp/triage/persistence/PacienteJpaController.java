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
import com.miapp.triage.triage.Triage;
import com.miapp.triage.triage.BoxAtencion;
import com.miapp.triage.triage.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fran
 */
public class PacienteJpaController implements Serializable {

    public PacienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public PacienteJpaController() {
        this.emf = Persistence.createEntityManagerFactory("com.miapp_Triage_jar_1.0-SNAPSHOTPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Paciente paciente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Triage triage = paciente.getTriage();
            if (triage != null) {
                triage = em.getReference(triage.getClass(), triage.getId_triage());
                paciente.setTriage(triage);
            }
            BoxAtencion boxAtencion = paciente.getBoxAtencion();
            if (boxAtencion != null) {
                boxAtencion = em.getReference(boxAtencion.getClass(), boxAtencion.getId_box());
                paciente.setBoxAtencion(boxAtencion);
            }
            em.persist(paciente);
            if (triage != null) {
                Paciente oldPacienteOfTriage = triage.getPaciente();
                if (oldPacienteOfTriage != null) {
                    oldPacienteOfTriage.setTriage(null);
                    oldPacienteOfTriage = em.merge(oldPacienteOfTriage);
                }
                triage.setPaciente(paciente);
                triage = em.merge(triage);
            }
            if (boxAtencion != null) {
                Paciente oldPacienteOfBoxAtencion = boxAtencion.getPaciente();
                if (oldPacienteOfBoxAtencion != null) {
                    oldPacienteOfBoxAtencion.setBoxAtencion(null);
                    oldPacienteOfBoxAtencion = em.merge(oldPacienteOfBoxAtencion);
                }
                boxAtencion.setPaciente(paciente);
                boxAtencion = em.merge(boxAtencion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Paciente paciente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente persistentPaciente = em.find(Paciente.class, paciente.getId());
            Triage triageOld = persistentPaciente.getTriage();
            Triage triageNew = paciente.getTriage();
            BoxAtencion boxAtencionOld = persistentPaciente.getBoxAtencion();
            BoxAtencion boxAtencionNew = paciente.getBoxAtencion();
            if (triageNew != null) {
                triageNew = em.getReference(triageNew.getClass(), triageNew.getId_triage());
                paciente.setTriage(triageNew);
            }
            if (boxAtencionNew != null) {
                boxAtencionNew = em.getReference(boxAtencionNew.getClass(), boxAtencionNew.getId_box());
                paciente.setBoxAtencion(boxAtencionNew);
            }
            paciente = em.merge(paciente);
            if (triageOld != null && !triageOld.equals(triageNew)) {
                triageOld.setPaciente(null);
                triageOld = em.merge(triageOld);
            }
            if (triageNew != null && !triageNew.equals(triageOld)) {
                Paciente oldPacienteOfTriage = triageNew.getPaciente();
                if (oldPacienteOfTriage != null) {
                    oldPacienteOfTriage.setTriage(null);
                    oldPacienteOfTriage = em.merge(oldPacienteOfTriage);
                }
                triageNew.setPaciente(paciente);
                triageNew = em.merge(triageNew);
            }
            if (boxAtencionOld != null && !boxAtencionOld.equals(boxAtencionNew)) {
                boxAtencionOld.setPaciente(null);
                boxAtencionOld = em.merge(boxAtencionOld);
            }
            if (boxAtencionNew != null && !boxAtencionNew.equals(boxAtencionOld)) {
                Paciente oldPacienteOfBoxAtencion = boxAtencionNew.getPaciente();
                if (oldPacienteOfBoxAtencion != null) {
                    oldPacienteOfBoxAtencion.setBoxAtencion(null);
                    oldPacienteOfBoxAtencion = em.merge(oldPacienteOfBoxAtencion);
                }
                boxAtencionNew.setPaciente(paciente);
                boxAtencionNew = em.merge(boxAtencionNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = paciente.getId();
                if (findPaciente(id) == null) {
                    throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.");
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
            Paciente paciente;
            try {
                paciente = em.getReference(Paciente.class, id);
                paciente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.", enfe);
            }
            Triage triage = paciente.getTriage();
            if (triage != null) {
                triage.setPaciente(null);
                triage = em.merge(triage);
            }
            BoxAtencion boxAtencion = paciente.getBoxAtencion();
            if (boxAtencion != null) {
                boxAtencion.setPaciente(null);
                boxAtencion = em.merge(boxAtencion);
            }
            em.remove(paciente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Paciente> findPacienteEntities() {
        return findPacienteEntities(true, -1, -1);
    }

    public List<Paciente> findPacienteEntities(int maxResults, int firstResult) {
        return findPacienteEntities(false, maxResults, firstResult);
    }

    private List<Paciente> findPacienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paciente.class));
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

    public Paciente findPaciente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paciente.class, id);
        } finally {
            em.close();
        }
    }

    public int getPacienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paciente> rt = cq.from(Paciente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
