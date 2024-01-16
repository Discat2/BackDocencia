package com.aws.docencia.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aws.docencia.domain.Materia;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Integer>{

    
}
