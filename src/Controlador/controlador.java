/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Persistencia.Persistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import javax.swing.JTextField;
import modelo.*;
/**
 *
 * @author Tatiana
 */
public class controlador {
    Persistencia persistencia;
    

public controlador (Persistencia p){
    this.persistencia = p;
    
}
public List ListarReclamos() {
   return this.persistencia.buscarTodosOrdenadosPor(Reclamo.class, Reclamo_.id);
    
}
public void agregarReclamos (Long id , String descripcion , String fechaIngreso, String fechaEstimada, TipoArticulo tipoArt){
    this.persistencia.iniciarTransaccion();
    try {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Reclamo r = new Reclamo (id, descripcion , formatoFecha.parse(fechaIngreso),formatoFecha.parse(fechaEstimada), tipoArt);
        //si es un articulo valido 
        if (tipoArt != null){
            tipoArt.agregarReclamos(r);
            this.persistencia.modificar(tipoArt);
    }
        this.persistencia.insertar(r);
        this.persistencia.confirmarTransaccion();
    } catch (ParseException ex) {
        this.persistencia.descartarTransaccion();
        System.out.print("Error al capturar la fecha");
        
    }
        
}

public void agregarTipoArt (String nombre, List Tecnico, List Tareas){
    this.persistencia.iniciarTransaccion();
    TipoArticulo tipoAr = new TipoArticulo(nombre,Tecnico, Tareas);
    this.persistencia.insertar(tipoAr);
    this.persistencia.confirmarTransaccion();
    

}
public List ListarTipoArt (){
   return this.persistencia.buscarTodosOrdenadosPor(TipoArticulo.class, TipoArticulo_.nombre);
}


        
        
 public int eliminarTipoArt(TipoArticulo tipoAr){
     if (tipoAr.getReclamos().isEmpty()){
         this.persistencia.iniciarTransaccion();
         Tecnico t = (Tecnico) tipoAr.getTecnico();
         t.eliminarTipoArt(tipoAr);
         t.setTipoArt(null);
         this.persistencia.eliminar(tipoAr);
         this.persistencia.modificar(t);
         this.persistencia.confirmarTransaccion();
         return 0;
     } else{
         return 1;
         
     }     
     }
   
 
  
  public void editarTipoArt (TipoArticulo tipoAr, String nombre){
      this.persistencia.iniciarTransaccion();
      tipoAr.setNombre(nombre);
      this.persistencia.modificar(tipoAr);
      this.persistencia.confirmarTransaccion();
  }
 
public List Tecnico (){
    return this.persistencia.buscarTodosOrdenadosPor(Tecnico.class, Tecnico_.apellidos);
}
 
public List Tareas (){
    return this.persistencia.buscarTodosOrdenadosPor(Tareas.class, Tareas_.TipoArt);
}

public void agregarTareas (String nombre, String descripcion, List<TareasAsignadas> tareasAsig, List<TipoArticulo> tipoArts){
   this.persistencia.iniciarTransaccion();
   Tareas tar= new Tareas (nombre,descripcion,tipoArts);
   this.persistencia.insertar(tar);
   this.persistencia.confirmarTransaccion();
}
    
public int eliminarTarea (Tareas tar){
    if (tar.getTipoArts().isEmpty()){
        this.persistencia.iniciarTransaccion();
        TipoArticulo tipoAr = (TipoArticulo) tar.getTipoArts();
        tipoAr.eliminarTarea(tar);
        tipoAr.setTareas(null);
        this.persistencia.eliminar(tar);
        this.persistencia.modificar(tipoAr);
        this.persistencia.confirmarTransaccion();
        return 0;
    } else{
        return 1;
    }
}
   
  public void agregarMensual (int dni, String apellidos, String nombres, String domicilio, List<TipoArticulo> tipoArt){
    this.persistencia.iniciarTransaccion();
    Mensual tecnMensual = new Mensual (dni,apellidos,nombres,domicilio,tipoArt);
    this.persistencia.insertar(tecnMensual);
    this.persistencia.confirmarTransaccion();   
  }
  
  public void agregarJornalero (int dni, String apellidos, String nombres, String domicilio, List<TipoArticulo> tipoArt, double tarifa){
      this.persistencia.iniciarTransaccion();
      Jornalero tecnJornal = new Jornalero (dni,apellidos,nombres,domicilio,tipoArt,tarifa);
      this.persistencia.insertar(tecnJornal);
      this.persistencia.confirmarTransaccion();
      
  }
  
 
    
    
    
    
    
}
 


