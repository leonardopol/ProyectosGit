package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    //llamo a la controladora persistencia con la instancia controlPersis
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //recibo los datos del btn agregar de la igu
    public void crearMascota(String numCliente, String nombrePerro, String raza, String color, 
            String alergico, String atencionEspecial, String nombreDuenio, String celDuenio, String observaciones){
        
        //Creo un objeto masc de tipo Mascota que va a setearce con los datos que recibo
        Mascota masc = new Mascota();
        masc.setNumCliente(numCliente);
        masc.setNombrePerro(nombrePerro);
        masc.setRaza(raza);
        masc.setColor(color);
        masc.setAlergico(alergico);
        masc.setAtencionEspecial(atencionEspecial);
        masc.setNombreDuenio(nombreDuenio);
        masc.setCelDuenio(celDuenio);
        masc.setObservaciones(observaciones);
        
        //paso el objeto masc seteado con los datos al metodo altaMascota de la controladora de la persistencia
        
        controlPersis.altaMascota(masc);
    }
    
    //llamamos a los metodos que tenemos en la persistencia y le pasamos el objeto
    public void altaMascota(Mascota masco){
        controlPersis.altaMascota(masco);
    }
    
    public void bajaMascota(Mascota masco){
        controlPersis.bajaMascota(masco);
    }
    
    public void bajaMascota(int id){
        controlPersis.bajaMascota(id);
    }
    
    public List<Mascota> obtenerMascotas(){
        return controlPersis.obtenerMascotas();
    }
    
    public void modificarMascota(Mascota masco){
        controlPersis.modificarMascota(masco);
    }
    
    public Mascota buscarMascota(Mascota masco){
        return controlPersis.buscarMascota(masco);
    }
    public Mascota buscarMascota(int id){
        return controlPersis.buscarMascota(id);
    }
}
