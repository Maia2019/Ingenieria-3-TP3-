/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Tatiana
 */
@Entity
@Table (name= "Tecnico")
 @Inheritance(strategy = InheritanceType.JOINED)
public class Tecnico implements Serializable {
  
    @Id
    @GeneratedValue
            
    @Column (name= "dni")
    private int dni;
    @Column (name= "apellidos")
    private String apellidos;
    @Column (name = "nombres")
    private String nombres;
    @Column (name="domicilio")
    private String domicilio;
    @OneToMany  (mappedBy= "tecnico")
    private List <TareasAsignadas> tareasAsig;
    @ManyToMany  
    private List <TipoArticulo> tipoArt;
    
    public Tecnico(int dni, String apellidos, String nombres, String domicilio, List<TareasAsignadas> tareasAsig, List<TipoArticulo> tipoArt) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.domicilio = domicilio;
        this.tareasAsig = tareasAsig;
        this.tipoArt = tipoArt;
    }
    
    public Tecnico (){
        this.tareasAsig = new ArrayList();
        this.tipoArt = new ArrayList ();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public List<TareasAsignadas> getTareasAsig() {
        return tareasAsig;
    }

    public void setTareasAsig(List<TareasAsignadas> tareasAsig) {
        this.tareasAsig = tareasAsig;
    }

    public List<TipoArticulo> getTipoArt() {
        return tipoArt;
    }

    public void setTipoArt(List<TipoArticulo> tipoArt) {
        this.tipoArt = tipoArt;
    }

 public void eliminarTipoArt (TipoArticulo tipoAr){
     this.tipoArt.remove(tipoAr);
 }
 
}
