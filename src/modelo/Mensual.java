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
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 *
 * @author Tatiana
 */
@Entity
@Table (name = "Mensual")
public class Mensual extends Tecnico implements Serializable {
    
    
    private double sueldo;

    public Mensual() {
    }

    public Mensual(int dni, String apellidos, String nombres, String domicilio, List<TipoArticulo> tipoArt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public Mensual(int dni, String apellidos, String nombres, String domicilio, List<TareasAsignadas> tareasAsig, List<TipoArticulo> tipoArt, double sueldo) {
        super(dni, apellidos, nombres, domicilio, tareasAsig, tipoArt);
    }
    
    
}
