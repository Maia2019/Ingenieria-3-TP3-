package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.TareasAsignadas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T18:03:33")
@StaticMetamodel(Tiempo.class)
public class Tiempo_ { 

    public static volatile SingularAttribute<Tiempo, Date> fecha;
    public static volatile SingularAttribute<Tiempo, Double> cantHs;
    public static volatile SingularAttribute<Tiempo, TareasAsignadas> tareasAsig;
    public static volatile SingularAttribute<Tiempo, Integer> idTiempo;

}