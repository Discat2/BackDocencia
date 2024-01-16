package com.aws.docencia.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aws.docencia.domain.DocenteMateria;
import com.aws.docencia.domain.DocenteMateriaPK;

@Repository
public interface DocenteMateriaRepository  extends CrudRepository<DocenteMateria, DocenteMateriaPK>{

    
}