package edu.co.sena.akuavida.integracion.entitis;

import edu.co.sena.akuavida.integracion.entitis.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-12T18:03:59")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile CollectionAttribute<Categorias, Producto> productoCollection;
    public static volatile SingularAttribute<Categorias, String> nombre;
    public static volatile SingularAttribute<Categorias, Boolean> activa;
    public static volatile SingularAttribute<Categorias, Integer> pariente;
    public static volatile SingularAttribute<Categorias, Integer> iDCategoria;

}