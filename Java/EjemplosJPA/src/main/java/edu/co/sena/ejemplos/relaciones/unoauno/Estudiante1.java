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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

/**
 *
 * @author ColsutecR
 */
@Entity
@Table(name = "ESTUDIANTE1")
public class Estudiante1 implements Serializable {

    @Id
    private String idEstudiante;

    @Column(name = "NOMBREESTUDIANTE", nullable = false)
    private String nombre;

    @Column(name = "TELEFONO", nullable = false)
    private String telefono;

    @Column(name = "EDAD", nullable = false)
    private String edad;

    @Column(name = "CORREO", nullable = false)
    private String correo;

    @JoinColumn(name = "MATERIA",referencedColumnName = "IDMATERIA")
    @OneToOne()
    private Materia1 materia;

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Materia1 getMateria() {
        return materia;
    }

    public void setMateria(Materia1 materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Estudiante1{" + "idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad + ", correo=" + correo + ", materia=" + materia.getIdMateria() + '}';
    }



}
