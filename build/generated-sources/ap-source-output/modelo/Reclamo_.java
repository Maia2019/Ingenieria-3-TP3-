package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.TareasAsignadas;
import modelo.TipoArticulo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T18:03:33")
@StaticMetamodel(Reclamo.class)
public class Reclamo_ { 

    public static volatile SingularAttribute<Reclamo, String> descripcion;
    public static volatile SingularAttribute<Reclamo, Date> fechaIngreso;
    public static volatile SingularAttribute<Reclamo, TipoArticulo> tipoArt;
    public static volatile SingularAttribute<Reclamo, Long> id;
    public static volatile SingularAttribute<Reclamo, Date> fechaEstimada;
    public static volatile ListAttribute<Reclamo, TareasAsignadas> tareaAsig;

}