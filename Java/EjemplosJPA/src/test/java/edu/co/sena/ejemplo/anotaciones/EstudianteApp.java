/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.anotaciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ColsutecR
 */
public class EstudianteApp {

    public EstudianteApp() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void insertarEstudianteMateria() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemplosJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Estudiante e1 = new Estudiante();
        e1.setIdEstudiante("Juancho728");
        e1.setNombre("Juancho");
        e1.setTelefono("3217915742");
        e1.setEdad("18");
        e1.setCorreo("Jdmontero0@misena.edu.co");

        em.getTransaction().begin();
        em.persist(e1);
        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("_______________");

        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("edu.co.sena_EjemplosJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em2 = emf2.createEntityManager();

        Materia m1 = new Materia();
        m1.setIdMateria("123ABC");
        m1.setNombre("Ciencias Sociales");
        m1.setDescripcion("son una denominación genérica para las disciplinas o campos del saber");

        em2.getTransaction().begin();
        em2.persist(m1);
        em2.getTransaction().commit();
        em2.close();
        emf2.close();

    }
}
