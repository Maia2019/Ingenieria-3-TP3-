package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.TareasAsignadas;
import modelo.TipoArticulo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T18:03:33")
@StaticMetamodel(Tareas.class)
public class Tareas_ { 

    public static volatile SingularAttribute<Tareas, String> descripcion;
    public static volatile ListAttribute<Tareas, TipoArticulo> tipoArt;
    public static volatile SingularAttribute<Tareas, Integer> codTarea;
    public static volatile ListAttribute<Tareas, TipoArticulo> tipoArts;
    public static volatile ListAttribute<Tareas, TareasAsignadas> tareasAsig;
    public static volatile ListAttribute<Tareas, TipoArticulo> TipoArt;
    public static volatile SingularAttribute<Tareas, String> nombre;

}