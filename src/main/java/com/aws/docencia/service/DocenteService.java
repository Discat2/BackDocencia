package com.aws.docencia.service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aws.docencia.dao.DocenteRepository;
import com.aws.docencia.dao.EspecialidadRepository;
import com.aws.docencia.domain.Docente;
import com.aws.docencia.domain.Especialidad;
import com.aws.docencia.service.exeption.CreateException;

@Service
public class DocenteService {
    private final DocenteRepository docenteRepository;
    private final EspecialidadRepository especialidadRepository;

    public DocenteService(DocenteRepository docenteRepository, EspecialidadRepository especialidadRepository) {
        this.docenteRepository = docenteRepository;
        this.especialidadRepository = especialidadRepository;
    }

    public Iterable<Docente> GetAll(){
        return this.docenteRepository.findAll();
    }
    public Docente create(Docente docente) {
        try {
            String codEspecialidad = docente.getCodEspecialidad();
            Optional<Especialidad> especialidad = especialidadRepository.findById(codEspecialidad);
            if (especialidad.isPresent()) {
                Date fechaIngreso = docente.getFechaIngreso();
                Date fechaActual = new Date(System.currentTimeMillis());
                if (fechaIngreso.after(fechaActual)) {
                    return this.docenteRepository.save(docente);
                } else {
                    throw new RuntimeException("Registro Incorrecto, la fecha " + fechaIngreso
                    + " no es mayor a la actual " + fechaActual);
                }
            } else {
                throw new RuntimeException("Registro Incorrecto, la especialidad " + codEspecialidad + " no existe ");
            }
        } catch (Exception e) {
            throw new CreateException("Ocurrio un error al crear el docente: " + docente.toString(), e);
        }
    }
}
