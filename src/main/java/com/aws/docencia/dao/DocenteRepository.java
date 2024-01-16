package com.aws.docencia.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aws.docencia.domain.Docente;

@Repository
public interface DocenteRepository extends CrudRepository<Docente, Integer> {

    
} 