package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    //llamo a la controladoraJpa a traves de la instancia mascotaJpa
    //para acceder a los metodos CRUD de la controladoraJPA
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    
    public void altaMascota(Mascota masco){
        mascotaJpa.create(masco);
    }
    //aplico sobrecarga de metodos
    //si recibe un objeto borro por id
    public void bajaMascota(Mascota masco){
        try {
            mascotaJpa.destroy(masco.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //si recibo la id borra directamente por id
    public void bajaMascota(int id){
        try {
            mascotaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //funcion lectura uso Collections para que devuelva una lista de registros de la entidad
    public List<Mascota> obtenerMascotas(){
        return mascotaJpa.findMascotaEntities();
    }
    
    //metodo modificar tambien se puede hacer por id
    public void modificarMascota(Mascota masco){
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion busqueda
    public Mascota buscarMascota(int id){
        return mascotaJpa.findMascota(id);
    }
    //Funcion buscar recibo Objeto
    public Mascota buscarMascota(Mascota masco){
        return mascotaJpa.findMascota(masco.getId());
    }
}
