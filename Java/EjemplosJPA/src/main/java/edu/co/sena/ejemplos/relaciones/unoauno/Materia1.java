/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplos.relaciones.unoauno;

import edu.co.sena.ejemplo.anotaciones.*;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author ColsutecR
 */
@Entity
@Table(name = "MATERIA1")
public class Materia1 implements Serializable {

    @Id
    @Column(name = "IDMATERIA")
    private String idMateria;

    @Column(name = "NOMBREMATERIA")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @OneToOne(mappedBy = "materia")
    private Estudiante1 estudiante;

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estudiante1 getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante1 estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Materia1{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estudiante=" + estudiante.getIdEstudiante() + '}';
    }
    


}
