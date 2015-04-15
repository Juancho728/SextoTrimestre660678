package edu.co.sena.akuavida.integracion.entitis;

import edu.co.sena.akuavida.integracion.entitis.Cuenta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-12T18:03:59")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile SingularAttribute<Usuario, String> idUsuario;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile CollectionAttribute<Usuario, Cuenta> cuentaCollection;
    public static volatile SingularAttribute<Usuario, String> rol;

}