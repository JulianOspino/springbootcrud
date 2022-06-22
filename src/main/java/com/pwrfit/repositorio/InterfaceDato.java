package com.pwrfit.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pwrfit.modelos.Datos;

@Repository
public interface InterfaceDato extends CrudRepository<Datos, Integer> {

}
