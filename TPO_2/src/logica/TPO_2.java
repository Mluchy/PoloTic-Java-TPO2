
package logica;

import igu.Principal;


public class TPO_2 {

    
    public static void main(String[] args) {
       
        Controladora control = new Controladora();
        
        //Instanciar y ubicar la pantalla
        Principal sc = new Principal(control);
        sc.setVisible(true);
        sc.setLocationRelativeTo(null);
    
       
        
    
    }
    
}
