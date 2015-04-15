/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo.relaciones.unoamuchos;

import edu.co.sena.ejemplos.relaciones.unoamuchos.Estudiante3;
import edu.co.sena.ejemplos.relaciones.unoamuchos.Materia3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
public class UnoAMuchosTest {

    public UnoAMuchosTest() {
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

        Estudiante3 e1 = new Estudiante3();
        e1.setIdEstudiante("Juancho1996");
        e1.setNombre("Juancho");
        e1.setTelefono("3217915742");
        e1.setEdad("18");
        e1.setCorreo("Jdmontero0@misena.edu.co");

        Estudiante3 e2 = new Estudiante3();
        e2.setIdEstudiante("Miguelz18");
        e2.setNombre("Miguel");
        e2.setTelefono("3134194242");
        e2.setEdad("21");
        e2.setCorreo("m631@hotmail.com");

        Materia3 m1 = new Materia3();
        m1.setIdMateria("ABC123");
        m1.setNombre("Ciencias Sociales");
        m1.setDescripcion("son una denominación genérica para las disciplinas o campos del saber");

        List<Estudiante3> estudiantes = new ArrayList<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        m1.setEstudiante(estudiantes);

        e1.setMateria(m1);
        e2.setMateria(m1);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemplosJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(m1);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    @Test
    public void consulta() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.co.sena_EjemplosJPA_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Collection<Estudiante3> et = em.find(Materia3.class, "ABC123").getEstudiante();
        Materia3 mt = em.find(Estudiante3.class, "Juancho1996").getMateria();

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println(mt.toString());
        for (Estudiante3 et1 : et) {
            System.out.println(et1.toString());
        }

    }
}
