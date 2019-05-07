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
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="Tiempo") 
public class Tiempo implements Serializable {
    @Id
    @GeneratedValue
    private int idTiempo;
    private double cantHs;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @ManyToOne
    private TareasAsignadas tareasAsig;

    public Tiempo(int idTiempo, double cantHs, Date fecha, TareasAsignadas tareasAsig) {
        this.idTiempo = idTiempo;
        this.cantHs = cantHs;
        this.fecha = fecha;
        this.tareasAsig = tareasAsig;
    }
    
   public Tiempo(){
       this.fecha= new Date();
   }
    public int getIdTiempo() {
        return idTiempo;
    }

    public void setIdTiempo(int idTiempo) {
        this.idTiempo = idTiempo;
    }

    public double getCantHs() {
        return cantHs;
    }

    public void setCantHs(double cantHs) {
        this.cantHs = cantHs;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TareasAsignadas getTareasAsig() {
        return tareasAsig;
    }

    public void setTareasAsig(TareasAsignadas tareasAsig) {
        this.tareasAsig = tareasAsig;
    }
    
}
