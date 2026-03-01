/*Sample JPA DAO implementation*/
package com.daw.clubspringboot.model.dao;

import com.daw.clubspringboot.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**  DAO Implementation using Spring Data Repository
 *
 * @author jrbalsas
 */
@Repository("clienteDAORepository")
public class ClienteDAORepository implements ClienteDAO {

    private final Logger logger = Logger.getLogger(ClienteDAORepository.class.getName());

    @Autowired
    private ClienteRepository clientesRepo;

    public ClienteDAORepository() {
    }

    @Override
    public Cliente buscaId(Integer id) {
        Cliente c=null;

        try {
            c=clientesRepo.findById(id).orElse(null);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return c;
    }
    @Override
    public List<Cliente> buscaTodos() {
        List<Cliente> lc = null;
        try {
            lc = new java.util.ArrayList<>();
            clientesRepo.findAll().forEach(lc::add);

        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return lc;
    }

    public Cliente buscaByNIF(String dni) {
        Cliente c = null;
        try {
            c=clientesRepo.findByDni(dni);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return c;
    }

    @Override
    public boolean crea(Cliente c) {
        //Spring Data Repository uses save() method to insert or update
        return guarda(c);
    }

    @Override
    public boolean guarda(Cliente c) {
        boolean guardado = false;
        try {
            clientesRepo.save(c);
            guardado = true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return guardado;
    }

    @Override
    public boolean borra(Integer id) {
        boolean borrado = false;
        try {
            clientesRepo.deleteById(id);
            borrado=true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return borrado;
    }
}
