package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    //llamo a la controladora persistencia con la instancia controlPersis
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
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
