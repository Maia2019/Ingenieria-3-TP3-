package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.TareasAsignadas;
import modelo.TipoArticulo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T18:03:33")
@StaticMetamodel(Tecnico.class)
public class Tecnico_ { 

    public static volatile SingularAttribute<Tecnico, String> apellidos;
    public static volatile ListAttribute<Tecnico, TipoArticulo> tipoArt;
    public static volatile SingularAttribute<Tecnico, String> domicilio;
    public static volatile ListAttribute<Tecnico, TareasAsignadas> tareasAsig;
    public static volatile SingularAttribute<Tecnico, Integer> dni;
    public static volatile SingularAttribute<Tecnico, String> nombres;

}