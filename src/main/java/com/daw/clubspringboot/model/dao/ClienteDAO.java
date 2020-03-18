package com.daw.clubspringboot.model.dao;

import com.daw.clubspringboot.model.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, Integer>{
    //Declare here specific methods for EntityDAO
    public Cliente buscaByNIF(String nif);
    //..
}
