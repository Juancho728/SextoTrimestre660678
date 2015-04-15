/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.sinrelaciones.unoauno;

import edu.co.sena.ejemplo.relaciones.unoauno.*;
import edu.co.sena.ejemplo.anotaciones.*;
import edu.co.sena.ejemplos.relaciones.unoauno.Estudiante1;
import edu.co.sena.ejemplos.relaciones.unoauno.Materia1;
import edu.co.sena.ejemplos.sinrelaciones.unoauno.Estudiante2;
import edu.co.sena.ejemplos.sinrelaciones.unoauno.Materia2;
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
public class UnoAUnoSinRelacionesTest {

    public UnoAUnoSinRelacionesTest() {
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

        Estudiante2 e2 = new Estudiante2();
        e2.setIdEstudiante("Juancho728");
        e2.setNombre("Juancho");
        e2.setTelefono("3217915742");
        e2.setEdad("18");
        e2.setCorreo("Jdmontero0@misena.edu.co");
        e2.setIdMateria("123ABC");

        em.getTransaction().begin();
        em.persist(e2);
        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("_______________");

        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("edu.co.sena_EjemplosJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em2 = emf2.createEntityManager();

        Materia2 m2 = new Materia2();
        m2.setIdMateria("123ABC");
        m2.setNombre("Ciencias Sociales");
        m2.setDescripcion("son una denominación genérica para las disciplinas o campos del saber");
        em2.getTransaction().begin();
        em2.persist(m2);
        em2.getTransaction().commit();
        em2.close();
        emf2.close();

    }
}
