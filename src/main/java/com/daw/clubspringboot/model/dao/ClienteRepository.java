package com.daw.clubspringboot.model.dao;


import com.daw.clubspringboot.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/** Spring Data repository for using in ClienteDAOJData DAO Implementation*/
@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Integer> {
    
    // Inherit basic CRUD methods definitions

    // Spring Data Repository custom definition using method name
    Cliente findByDni(String dni);
    void deleteByDni(String id);

    // More information in https://docs.spring.io/spring-data/jpa/reference/repositories/core-concepts.html

}
