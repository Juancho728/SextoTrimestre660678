package edu.co.sena.akuavida.integracion.entitis;

import edu.co.sena.akuavida.integracion.entitis.Factura;
import edu.co.sena.akuavida.integracion.entitis.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-12T18:03:59")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Date> fecha;
    public static volatile SingularAttribute<Pedido, Float> total;
    public static volatile SingularAttribute<Pedido, Factura> factura;
    public static volatile CollectionAttribute<Pedido, Item> itemCollection;
    public static volatile SingularAttribute<Pedido, Float> subtotal;
    public static volatile SingularAttribute<Pedido, Integer> facturaIDFactura;

}