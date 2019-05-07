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
@Table (name= "Reclamo")
public class Reclamo implements Serializable {

    @Id
    @SequenceGenerator(name="sec_reclamo", initialValue=1, allocationSize=1)

    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_reclamo")
    private Long id;
    private String descripcion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaIngreso;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEstimada;
    @ManyToOne 
    private TipoArticulo tipoArt; 
    @OneToMany (mappedBy = "reclamo")
    private List <TareasAsignadas> tareaAsig;
    
     public Reclamo(Long id, String descripcion, Date fechaIngreso, Date fechaEstimada, TipoArticulo tipoArt, List<TareasAsignadas> tareaAsig) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.fechaEstimada = fechaEstimada;
        this.tipoArt = tipoArt;
        this.tareaAsig = tareaAsig;
    }
     public Reclamo (){
         this.tareaAsig = new ArrayList();
         this.fechaIngreso = new Date ();
         this.fechaEstimada = new Date ();
     }

    public Reclamo(Long id, String descripcion, Date parse, Date parse0, TipoArticulo tipoArt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEstimada() {
        return fechaEstimada;
    }

    public void setFechaEstimada(Date fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    public TipoArticulo getTipoArt() {
        return tipoArt;
    }

    public void setTipoArt(TipoArticulo tipoArt) {
        this.tipoArt = tipoArt;
    }

    public List<TareasAsignadas> getTareaAsig() {
        return tareaAsig;
    }

    public void setTareaAsig(List<TareasAsignadas> tareaAsig) {
        this.tareaAsig = tareaAsig;
    }

    
    
   
    
}
