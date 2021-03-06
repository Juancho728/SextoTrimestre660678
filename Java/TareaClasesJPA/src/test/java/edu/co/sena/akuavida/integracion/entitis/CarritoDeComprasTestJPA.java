/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.akuavida.integracion.entitis;

import edu.co.sena.akuavida.integracion.jpa.util.EntityManagerHelper;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ColsutecR
 */
public class CarritoDeComprasTestJPA {

    CarritoDeCompras carroCompras;
    EntityManagerFactory emf;
    EntityManager em;

    public CarritoDeComprasTestJPA() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        carroCompras = new CarritoDeCompras();
        carroCompras.setIDCarrito("123456789abc");
        carroCompras.setTotal(750000);
        carroCompras.setSubtotal(650000);
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
    public void insertarCarritoCompras() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(carroCompras);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

    @Test
    public void actualizarCarritoCompras() {

        String idCarrito = JOptionPane.showInputDialog("insertar El Id Del Carrito");
        String actTotal = JOptionPane.showInputDialog("Digite El Total");

        carroCompras.setIDCarrito(idCarrito);
        carroCompras.setTotal(Float.parseFloat(actTotal));

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(carroCompras);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

    @Test
    public void buscarUnCarrito() {

        String idCarrito = JOptionPane.showInputDialog("Inserte El Id Del Carrito");

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        CarritoDeCompras car = em.find(CarritoDeCompras.class, idCarrito);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(car.toString());
    }

    @Test
    public void borrarUnCarrito() {
        String idCarrito = JOptionPane.showInputDialog("Escriba el id del carrito a eliminar");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();
            em.remove(em.find(CarritoDeCompras.class, idCarrito));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();
        } catch (Exception e) {
            System.out.println("No se puedo eliminar el carrito" + e.getMessage());
        }

    }

    @Test
    public void buscarCarritosDeCompras() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("CarritoDeCompras.findAll");
        List<CarritoDeCompras> lis = q.getResultList();
        for (CarritoDeCompras carritoT : lis) {
            System.out.println("Id Carrito: " + carritoT.getIDCarrito() + " / Total: " + +carritoT.getTotal() + " / Subtotal: " + carritoT.getSubtotal());
        }
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }

    @Test
    public void buscarCategoriaPorTotal() {

        String total = JOptionPane.showInputDialog("Escriba el total del carrito de compras");
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query q = em.createNamedQuery("CarritoDeCompras.findByTotal");
        q.setParameter("total", Float.parseFloat(total));

        List<CarritoDeCompras> lista = q.getResultList();
        for (CarritoDeCompras lista1 : lista) {
            System.out.println("IdCarrito:" + lista1.getIDCarrito() + " Total " + lista1.getTotal() + " Total " + lista1.getSubtotal());
        }
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

    @Test
    public void buscarCategoriaPorSubtotal() {

        String subTotal = JOptionPane.showInputDialog("Escriba el subTotal del carrito de compras");
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Query q = em.createNamedQuery("CarritoDeCompras.findBySubtotal");
        q.setParameter("subtotal", Float.parseFloat(subTotal));

        CarritoDeCompras carrito = (CarritoDeCompras) q.getSingleResult();

        List<CarritoDeCompras> lista = q.getResultList();
        for (CarritoDeCompras lista1 : lista) {
            System.out.println("IdCarrito:" + lista1.getIDCarrito() + " Total " + lista1.getTotal() + " Total " + lista1.getSubtotal());
        }
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

}
