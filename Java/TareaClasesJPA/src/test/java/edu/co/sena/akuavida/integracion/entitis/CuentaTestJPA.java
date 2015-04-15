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
import static org.junit.Assert.*;

/**
 *
 * @author ColsutecR
 */
public class CuentaTestJPA {

    Cuenta cuenta;

    EntityManagerFactory emf;
    EntityManager em;

    public CuentaTestJPA() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cuenta = new Cuenta();
        cuenta.setCuentaPK(new CuentaPK("C.C", "1033790199"));
        cuenta.setPrimerNombre("Juan");
        cuenta.setSegundoNombre("David");
        cuenta.setPrimerApellido("Montero");
        cuenta.setSegundoApellido("Bogota");
        cuenta.setDireccion("Calle 49 G # 6 A 29 sur ");
        cuenta.setTelefono("3217915742");
        cuenta.setRool("Cliente");
        cuenta.setActivo(true);
        cuenta.setUsuarioidUsuario(new Usuario("1"));
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
    public void insertarCuenta() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(cuenta);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

    @Test
    public void actualizarCuenta() {

        String idTD = JOptionPane.showInputDialog("Escriba el tipo de documento");
        String idND = JOptionPane.showInputDialog("Escriba el numero de documento");
        String actSeg_Nom = JOptionPane.showInputDialog("Escriba El Nombre");
        String actTele = JOptionPane.showInputDialog("Escriba El Telefono");

        cuenta.setCuentaPK(new CuentaPK(idTD, idND));
        cuenta.setSegundoNombre(actSeg_Nom);
        cuenta.setTelefono(actTele);

        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.merge(cuenta);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }

    @Test
    public void buscarUnaCuenta() {

        String idTd = JOptionPane.showInputDialog("Inserte El Tipo Documento");
        String idNd = JOptionPane.showInputDialog("Inserte El Numero Documento");
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();

        Cuenta cue = em.find(Cuenta.class, new CuentaPK(idTd, idNd));
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

        System.out.println(cue.toString());
    }

    @Test
    public void borrarUnaCuenta() {
        String idTd = JOptionPane.showInputDialog("Inserte El Tipo Documento");
        String idNd = JOptionPane.showInputDialog("Inserte El Numero Documento");
        try {
            em = EntityManagerHelper.getEntityManager();
            EntityManagerHelper.beginTransaction();

            em.remove(em.find(CarritoDeCompras.class, new CuentaPK(idTd, idNd)));
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
            EntityManagerHelper.closeEntityManagerFactory();

        } catch (Exception e) {
            System.out.println("No se pudo eliminar la cuenta" + e.getMessage());
        }

    }

    @Test
    public void buscarCuentas() {
        em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        Query q = em.createNamedQuery("Cuenta.findAll");
        List<Cuenta> lis = q.getResultList();
        for (Cuenta cuentaT : lis) {
            System.out.println("Id Cuenta: " + cuentaT.getCuentaPK() + " / Primer NOmbre: " + cuentaT.getPrimerNombre() + " / Segundo Nombre: " + cuentaT.getSegundoNombre() + " / Primer Apellido: " + cuentaT.getPrimerApellido() + " / Segundo Apelido: "
                    + cuentaT.getSegundoApellido()  + " / Direccion: " + cuentaT.getDireccion() + " / Telefono: " + cuentaT.getTelefono() + " / Rool: " + cuentaT.getRool() + " / Activo: " + cuentaT.getActivo() + " / Id Usuario: " + cuentaT.getUsuarioidUsuario());
        }

        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();

    }

    @Test
    public void actualizarPkCuenta() {
        em = EntityManagerHelper.getEntityManager();
        String nuevoTiDoc = JOptionPane.showInputDialog("Digite el nuevo tipo documento");
        String nuevoNumDoc = JOptionPane.showInputDialog("Digite el nuevo numero documento ");
        String viejoTiDoc = JOptionPane.showInputDialog("Digite el viejo tipo documento");
        String viejoNumeDocu = JOptionPane.showInputDialog("Digite el viejo numero documento ");
        

        String sql = "UPDATE akuavida.cuenta"
                + " SET"
                + " Tipo_Documento = '" + nuevoTiDoc + "' ,"
                + " Numero_Documento = '" + nuevoNumDoc + "' "
                + " WHERE Tipo_Documento = '" + viejoTiDoc + "' AND Numero_Documento = '" + viejoNumeDocu + "' ;"; 
        
        System.out.println(sql);
        Query query = em.createNativeQuery(sql);
        EntityManagerHelper.beginTransaction();
        int rowCount = query.executeUpdate();
        System.out.println("Se actualizo " + rowCount + " Registros");
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        EntityManagerHelper.closeEntityManagerFactory();
    }

}
