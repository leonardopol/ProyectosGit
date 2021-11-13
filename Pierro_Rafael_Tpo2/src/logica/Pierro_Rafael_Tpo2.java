package logica;

import igu.Principal;

public class Pierro_Rafael_Tpo2 {

    public static void main(String[] args) {
        
        //llamo a la controladora de la logica atraves de la instancia control
        Controladora control = new Controladora();
        
        //llamo a la igu y le paso la instancia control
        Principal princ = new Principal(control);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        princ.setResizable(false);
    }
    
}
