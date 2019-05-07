/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Controlador.controlador;
import Persistencia.Persistencia;
import Vistas.VentanaPrincipal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;


/**
 *
 * @author Tatiana
 */
public class Sistema {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("IntegradorPU");
        Persistencia persistencia = new Persistencia (emf);
        controlador c = new controlador (persistencia);
     
        
        VentanaPrincipal ventPrincipal = new VentanaPrincipal(c);
        ventPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventPrincipal.setResizable(false);
        ventPrincipal.setLocationRelativeTo(null);
        ventPrincipal.setVisible(true);
        
        
    
}

}