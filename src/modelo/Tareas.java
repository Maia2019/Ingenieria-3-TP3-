/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Tatiana
 */
@Entity 
@Table (name= "Tareas")

public class Tareas implements Serializable{
    @Id
    @SequenceGenerator(name="sec_tareas", initialValue=1, allocationSize=1)
    @GeneratedValue (strategy=GenerationType.SEQUENCE, generator="sec_tareas")
    private int codTarea;
    private String nombre;
    private String descripcion;
    @OneToMany (mappedBy= "tareas")
    private List<TareasAsignadas> tareasAsig;
    @ManyToMany
    private List <TipoArticulo> tipoArt;
    @ManyToMany (mappedBy ="tareas")
    private List<TipoArticulo> TipoArt;
    

    public Tareas(List<TareasAsignadas> tareasAsig) {
        this.tareasAsig = tareasAsig;
    }
    
    

    
    public Tareas(String nombre, String descripcion, List<TipoArticulo> tipoArts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    public List<TareasAsignadas> getTareasAsig() {
        return tareasAsig;
    
    }

    
    @ManyToMany (mappedBy="tareas")
    private List <TipoArticulo> tipoArts; 

    public Tareas(int codTarea, String nombre, String descripcion, List<TareasAsignadas> tareasAsig, List<TipoArticulo> tipoArts, List<TareasAsignadas> tarAsignadas) {
        this.codTarea = codTarea;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoArts = tipoArts;
        this.tareasAsig = tareasAsig;
    }
    
    public Tareas (){
        this.tareasAsig= new ArrayList();
        this.tipoArts = new ArrayList();
    }

    
    
    public int getCodTarea() {
        return codTarea;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public List<TipoArticulo> getTipoArts() {
        return tipoArts;
    }

    public void setTipoArts(List<TipoArticulo> tipoArts) {
        this.tipoArts = tipoArts;
    }

    public List<TareasAsignadas> getTarAsignadas() {
        return tareasAsig;
    }

    
 
    
}
