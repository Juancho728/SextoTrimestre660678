/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplos.sinrelaciones.unoauno;

import edu.co.sena.ejemplos.relaciones.unoauno.*;
import edu.co.sena.ejemplo.anotaciones.*;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 *
 * @author ColsutecR
 */
@Entity
@Table(name = "ESTUDIANTE2")
public class Estudiante2 implements Serializable {

    @Id
    private String idEstudiante;

    @Column(name = "NOMBREeSTUDIANTE", nullable = false)
    private String nombre;

    @Column(name = "TELEFONO", nullable = false)
    private String telefono;

    @Column(name = "EDAD", nullable = false)
    private String edad;

    @Column(name = "CORREO", nullable = false)
    private String correo;

    @Column(name = "IDMATERIA", nullable = false)
    private String idMateria;

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

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

}
