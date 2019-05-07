package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Reclamo;
import modelo.Tareas;
import modelo.Tecnico;
import modelo.Tiempo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T18:03:33")
@StaticMetamodel(TareasAsignadas.class)
public class TareasAsignadas_ { 

    public static volatile SingularAttribute<TareasAsignadas, Reclamo> reclamo;
    public static volatile SingularAttribute<TareasAsignadas, Date> tareaFinalizada;
    public static volatile ListAttribute<TareasAsignadas, Tiempo> tiempo;
    public static volatile SingularAttribute<TareasAsignadas, Long> id;
    public static volatile SingularAttribute<TareasAsignadas, Tecnico> tecnico;
    public static volatile SingularAttribute<TareasAsignadas, Tareas> tareas;

}