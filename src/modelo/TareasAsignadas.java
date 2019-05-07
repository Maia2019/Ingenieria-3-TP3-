/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Tatiana
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name = "TareasAsignadas")
public class TareasAsignadas implements Serializable  {
    @Id
    @SequenceGenerator(name="sec_tareasAsignadas", initialValue=1, allocationSize=1)
    @GeneratedValue (strategy=GenerationType.SEQUENCE, generator="sec_tareasAsignadas")
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tareaFinalizada;
    @ManyToOne
    private Reclamo reclamo;
    @ManyToOne
    private Tecnico tecnico;
    @OneToMany (mappedBy= "tareasAsig")
    private List <Tiempo> tiempo;
    @ManyToOne 
    private Tareas tareas;

    public Tareas getTareas() {
        return tareas;
    }

    public void setTareas(Tareas tareas) {
        this.tareas = tareas;
    }
    

    public TareasAsignadas(Long id, Date tareaFinalizada, Reclamo reclamo, Tecnico tecn, List<Tiempo> tiempo, Tareas tareas) {
        this.id = id;
        this.tareaFinalizada = tareaFinalizada;
        this.reclamo = reclamo;
        this.tiempo = tiempo;
        this.tecnico= tecn;
        this.tareas=tareas;
        
    }
    public TareasAsignadas (){
        this.tiempo= new ArrayList();
    }

    public Long getId() {
        return id;
    }


    public Date getTareaFinalizada() {
        return tareaFinalizada;
    }

    public void setTareaFinalizada(Date tareaFinalizada) {
        this.tareaFinalizada = tareaFinalizada;
    }

    public Reclamo getReclamo() {
        return reclamo;
    }

    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public List<Tiempo> getTiempo() {
        return tiempo;
    }

    public void setTiempo(List<Tiempo> tiempo) {
        this.tiempo = tiempo;
    }

    
        
}
