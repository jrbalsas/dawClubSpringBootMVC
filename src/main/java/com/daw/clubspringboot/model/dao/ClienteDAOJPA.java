/*Sample JPA DAO implementation*/
package com.daw.clubspringboot.model.dao;

import com.daw.clubspringboot.model.Cliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jrbalsas
 */
@Repository("clienteDAOJPA")
@Transactional
public class ClienteDAOJPA implements ClienteDAO {

    private final Logger logger = Logger.getLogger(ClienteDAOJPA.class.getName());

    @PersistenceContext //Injected by LocalEntityManagerFactory
    private EntityManager em;

    public ClienteDAOJPA() {
    }

    @Override
    public Cliente buscaId(Integer id) {
        Cliente c=null;
        try {
            c=em.find(Cliente.class, id);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);

        };
        return c;
    }

    public Cliente buscaByNIF(String dni) {
        Cliente c=null;
        try {
            Query q = em.createQuery("Select c from Cliente c where c.dni=:dni", Cliente.class);
            q.setParameter(":dni", dni);
            c = (Cliente)q.getSingleResult();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
   
        return c;
    }

    @Override
    public List<Cliente> buscaTodos() {
        List<Cliente> lc = null;
        try {
            Query q = em.createQuery("Select c from Cliente c", Cliente.class);
            lc = q.getResultList();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return lc;
    }

    @Override
//    @Transactional
    public boolean crea(Cliente c) {
        boolean creado = false;
        try {
            em.persist(c);
            creado = true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return creado;
    }

    @Override
//    @Transactional
    public boolean guarda(Cliente c) {
        boolean guardado = false;
        try {
            c = em.merge(c);
            guardado = true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return guardado;
    }

    @Override
//    @Transactional
    public boolean borra(Integer id) {
        boolean borrado = false;
        try {
            Cliente c = null;
            try {
                c = em.getReference(Cliente.class, id);
            } catch (EntityNotFoundException ex) {
                logger.log(Level.SEVERE, ex.getMessage(), ex);

            }
            em.remove(c);
            borrado = true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return borrado;
    }

}
