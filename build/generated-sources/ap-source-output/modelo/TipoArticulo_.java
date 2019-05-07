package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Reclamo;
import modelo.Tareas;
import modelo.Tecnico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-23T18:03:33")
@StaticMetamodel(TipoArticulo.class)
public class TipoArticulo_ { 

    public static volatile SingularAttribute<TipoArticulo, Integer> codArt;
    public static volatile ListAttribute<TipoArticulo, Reclamo> reclamos;
    public static volatile ListAttribute<TipoArticulo, Tecnico> tecnico;
    public static volatile ListAttribute<TipoArticulo, Tareas> tareas;
    public static volatile SingularAttribute<TipoArticulo, String> nombre;

}