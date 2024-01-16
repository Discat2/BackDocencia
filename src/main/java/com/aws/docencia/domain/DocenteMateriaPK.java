package com.aws.docencia.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class DocenteMateriaPK implements Serializable {
    @Column(name = "COD_DOCENTE")
    private Integer codDocente;
    @Column(name = "COD_MATERIA")
    private Integer codMateria;
    
    public DocenteMateriaPK() {
    }

    public DocenteMateriaPK(Integer codMateria, Integer codDocente) {
        this.codMateria = codMateria;
        this.codDocente = codDocente;
    }

    @Override
    public String toString() {
        return "DocenteMateriaPK [codMateria=" + codMateria + ", codDocente=" + codDocente + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codMateria == null) ? 0 : codMateria.hashCode());
        result = prime * result + ((codDocente == null) ? 0 : codDocente.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DocenteMateriaPK other = (DocenteMateriaPK) obj;
        if (codMateria == null) {
            if (other.codMateria != null)
                return false;
        } else if (!codMateria.equals(other.codMateria))
            return false;
        if (codDocente == null) {
            if (other.codDocente != null)
                return false;
        } else if (!codDocente.equals(other.codDocente))
            return false;
        return true;
    }

    
}
