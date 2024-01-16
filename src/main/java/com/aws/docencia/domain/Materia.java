package com.aws.docencia.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MATERIA")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_MATERIA", nullable = false)
    private Integer codMateria;

    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    
    @Column(name = "HORAS_CLASE", nullable = false)
    private Integer horasClase;

    @Version
    private Long version;

    public Materia() {
    }

    public Materia(Integer codMateria) {
        this.codMateria = codMateria;
    }

    @Override
    public String toString() {
        return "Materia [codMateria=" + codMateria + ", nombre=" + nombre + ", horasClase=" + horasClase + ", version="
                + version + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codMateria == null) ? 0 : codMateria.hashCode());
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
        Materia other = (Materia) obj;
        if (codMateria == null) {
            if (other.codMateria != null)
                return false;
        } else if (!codMateria.equals(other.codMateria))
            return false;
        return true;
    }
    
}
