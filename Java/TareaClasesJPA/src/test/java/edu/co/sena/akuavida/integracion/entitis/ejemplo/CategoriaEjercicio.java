/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.akuavida.integracion.entitis.ejemplo;

import edu.co.sena.akuavida.integracion.entitis.Categorias;
import edu.co.sena.akuavida.integracion.entitis.Departamento;
import edu.co.sena.akuavida.integracion.entitis.Municipio;
import edu.co.sena.akuavida.integracion.entitis.Producto;
import edu.co.sena.akuavida.integracion.jpa.util.EntityManagerHelper;
import java.util.ArrayList;
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
public class CategoriaEjercicio {

//    Categorias categoria;
//    Categorias categoria2;
//    List<Producto> productos;
//    Producto producto;
//    Producto producto1;
//    Producto producto2;
//    Producto producto4;
//
//    EntityManagerFactory emf;
//    EntityManager em;
//
//    public CategoriaEjercicio() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//
//        categoria = new Categorias();
//        categoria.setIDCategoria(1);
//        categoria.setNombre("Purificadores de acero ");
//        categoria.setPariente(1);
//        categoria.setActiva(true);
//
//        categoria2 = new Categorias();
//        categoria2.setIDCategoria(2);
//        categoria2.setNombre("Purificadores de acrilico ");
//        categoria2.setPariente(1);
//        categoria2.setActiva(true);
//
//        productos = new ArrayList<>();
//
//        producto = new Producto();
//        producto.setIDproducto("1");
//        producto.setNombre("Purificador Tipo Oso");
//        producto.setPrecio(150000);
//        producto.setDescripcion("Un nuevo producto que innovara su casa");
//        producto.setCantidad(25);
//        producto.setActivo(true);
//        producto.setImpuesto(16);
//        producto.setCategoriasIDCategoria(new Categorias(1));
//
//        producto1 = new Producto();
//        producto1.setIDproducto("2");
//        producto1.setNombre("Purificador Tipo Manzana");
//        producto1.setPrecio(200000);
//        producto1.setDescripcion("Un nuevo producto");
//        producto1.setCantidad(30);
//        producto1.setActivo(true);
//        producto1.setImpuesto(16);
//        producto1.setCategoriasIDCategoria(new Categorias(1));
//
//        producto2 = new Producto();
//        producto2.setIDproducto("3");
//        producto2.setNombre("Purificador Tipo vaca");
//        producto2.setPrecio(250000);
//        producto2.setDescripcion("Un nuevo producto listo para decorar su casa");
//        producto2.setCantidad(40);
//        producto2.setActivo(true);
//        producto2.setImpuesto(16);
//        producto2.setCategoriasIDCategoria(new Categorias(1));
//
//        producto4 = new Producto();
//        producto4.setIDproducto("4");
//        producto4.setNombre("Purificador Tipo Manzana");
//        producto4.setPrecio(300000);
//        producto4.setDescripcion("Un nuevo producto listo para decorar su hogar ");
//        producto4.setCantidad(50);
//        producto4.setActivo(true);
//        producto4.setImpuesto(16);
//        producto4.setCategoriasIDCategoria(new Categorias(2));
//
//        productos.add(producto);
//        productos.add(producto1);
//        productos.add(producto2);
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    // @Test
//    // public void hello() {}
//    @Test
//    public void insertarCategoriaProducto() {
//        categoria.setProductoList(productos);
//        em = EntityManagerHelper.getEntityManager();
//        EntityManagerHelper.beginTransaction();
//        em.merge(categoria);
//        EntityManagerHelper.commit();
//        EntityManagerHelper.closeEntityManager();
//        EntityManagerHelper.closeEntityManagerFactory();
//    }
//
//    @Test
//    public void insertarProductoCategoria() {
//        producto4.setCategoriasIDCategoria(categoria2);
//        em = EntityManagerHelper.getEntityManager();
//        EntityManagerHelper.beginTransaction();
//        em.merge(producto4);
//        EntityManagerHelper.commit();
//        EntityManagerHelper.closeEntityManager();
//        EntityManagerHelper.closeEntityManagerFactory();
//    }
//
//    @Test
//    public void buscarMunicipiosPorDepartamento() {
//
//        String MunDelDep = JOptionPane.showInputDialog("Escriba el id del Deprtamento");
//   
//        em = EntityManagerHelper.getEntityManager();
//        EntityManagerHelper.beginTransaction();       
//        Departamento dep = em.find(Departamento.class, MunDelDep);
//        EntityManagerHelper.commit();
//        EntityManagerHelper.closeEntityManager();
//        EntityManagerHelper.closeEntityManagerFactory();
//        
//       List<Municipio> mun = dep.getMunicipioList();
//        for (Municipio mun1 : mun) {
//            System.out.println(mun1.toString());
//        }
//    }
}
