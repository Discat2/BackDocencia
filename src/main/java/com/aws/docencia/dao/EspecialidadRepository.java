package com.aws.docencia.dao;

import org.springframework.stereotype.Repository;
import com.aws.docencia.domain.Especialidad;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface EspecialidadRepository extends CrudRepository<Especialidad, String>{
    public List<Especialidad> findByNombreContaining(String nombre); 
}