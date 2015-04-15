/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.relaciones.unoauno;

import edu.co.sena.ejemplos.relaciones.unoauno.Estudiante1;
import edu.co.sena.ejemplos.relaciones.unoauno.Materia1;
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
public class UnoAUnoTest {

    public UnoAUnoTest() {
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

        Estudiante1 e1 = new Estudiante1();
        e1.setIdEstudiante("Juancho1996");
        e1.setNombre("Juancho");
        e1.setTelefono("3217915742");
        e1.setEdad("18");
        e1.setCorreo("Jdmontero0@misena.edu.co");

        Materia1 m1 = new Materia1();
        m1.setIdMateria("ABC123");
        m1.setNombre("Ciencias Sociales");
        m1.setDescripcion("son una denominación genérica para las disciplinas o campos del saber");
        e1.setMateria(m1);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemplosJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(e1);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    @Test
    public void consulta() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemplosJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Estudiante1 et = em.find(Materia1.class, "ABC123").getEstudiante();
        Materia1 mt = em.find(Estudiante1.class, "Juancho1996").getMateria();

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println(et.toString());
        System.out.println(mt.toString());

    }
}
