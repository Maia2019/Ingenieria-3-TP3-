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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Tatiana
 */
@Entity
@Table(name="TipoArticulo")
public class TipoArticulo implements Serializable {
    @Id
    @SequenceGenerator(name="sec_tipoArticulo", initialValue=1, allocationSize=1)
    @GeneratedValue (strategy=GenerationType.SEQUENCE, generator="sec_tipoArticulo")
    private int codArt;
    private String nombre;
    @ManyToMany
    private List <Tecnico>tecnico;
    @OneToMany (mappedBy = "tipoArt")
    private List <Reclamo> reclamos;
    @ManyToMany (mappedBy="tipoArt")
    private List <Tareas> tareas;

    public TipoArticulo(int codArt, String nombre, List<Tecnico> tecnico, List<Reclamo> reclamos, List<Tareas> tareas) {
        this.codArt = codArt;
        this.nombre = nombre;
        this.tecnico = tecnico;
        this.reclamos = reclamos;
        this.tareas = tareas;
    }
    public TipoArticulo (){
        this.tecnico= new ArrayList();
        this.reclamos = new ArrayList();
        this.tareas = new ArrayList ();
    }


    public TipoArticulo(String nombre, List Tecnico, List Tareas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodArt() {
        return codArt;
    }

    public void setCodArt(int codArt) {
        this.codArt = codArt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tecnico> getTecnico() {
        return tecnico;
    }

    public void setTecnico(List<Tecnico> tecnico) {
        this.tecnico = tecnico;
    }

    public List<Reclamo> getReclamos() {
        return reclamos;
    }

    public void setReclamos(List<Reclamo> reclamos) {
        this.reclamos = reclamos;
    }

    public List<Tareas> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tareas> tareas) {
        this.tareas = tareas;
    }
    
    public void agregarReclamos (Reclamo r){
        this.reclamos.add(r);
    }
    
    public void eliminarTarea (Tareas tar){
        this.tareas.remove(tar);
    }
}
