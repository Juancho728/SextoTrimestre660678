/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplos.relaciones.unoamuchos;


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ColsutecR
 */
@Entity
@Table(name = "MATERIA3")
public class Materia3 implements Serializable {

    @Id
    @Column(name = "IDMATERIA")
    private String idMateria;

    @Column(name = "NOMBREMATERIA")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @OneToMany(mappedBy = "materia")
    private Collection<Estudiante3> estudiante;

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


    public Collection<Estudiante3> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Collection<Estudiante3> estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Materia3{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }



}
