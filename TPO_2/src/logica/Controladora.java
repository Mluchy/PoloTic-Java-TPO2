/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import persistencia.ControladoraPersistencia;

/**
 *
 * @author Luchy
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public int crearMascota(String nombreP, String raza, String color, String nombreDuenio, String celu, String obser, String alergia, String atencion ) {
        Mascota m = new Mascota();
        m.setNombre_perro(nombreP);
        m.setRaza(raza);
        m.setColor(color);
        m.setNombre_duenio(nombreDuenio);
        m.setCelular_duenio(nombreDuenio);
        m.setObservaciones(atencion);
        m.setAlergico(alergia);
        m.setAtencion_especial(atencion);
                
        controlPersis.crearMascota(m);
        return m.getNum_cliente();
    }
    
    
    public void altaMascota(Mascota m) {
        
        controlPersis.crearMascota(m);
    }
}
