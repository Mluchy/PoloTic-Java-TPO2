/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import logica.Mascota;

/**
 *
 * @author Luchy
 */
public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    
    //Método para alta
    public void crearMascota(Mascota m) {
        
        try {
            mascotaJPA.create(m);
        } catch (Exception e) {
            System.out.println("NO se puedo crear un nuevo ingreso");
        }
         
    }
    
    
}
