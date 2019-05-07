/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Tatiana
 */
@Entity
@Table (name= "Jornalero")
public class Jornalero extends Tecnico implements Serializable{
    
    
    
   private double tarifa;
   
    

    public Jornalero() {
    }

    public Jornalero(int dni, String apellidos, String nombres, String domicilio, List<TipoArticulo> tipoArt, double tarifa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    

    public Jornalero(int dni, String apellidos, String nombres, String domicilio, List<TareasAsignadas> tareasAsig, List<TipoArticulo> tipoArt) {
        super(dni, apellidos, nombres, domicilio, tareasAsig, tipoArt);
    }
    
}
