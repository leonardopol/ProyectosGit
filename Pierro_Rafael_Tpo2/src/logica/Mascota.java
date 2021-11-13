package logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Mapeo la clase para la persistencia
@Entity
public class Mascota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String numCliente;
    private String nombrePerro;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEspecial;
    private String nombreDuenio;
    private String celDuenio;
    private String Observaciones;

    //Creo constructor vacio, con parametros, getters y setters, toString
    public Mascota() {
    }

    public Mascota(int id, String numCliente, String nombrePerro, String raza, String color, String alergico, String atencionEspecial, String nombreDuenio, String celDuenio, String Observaciones) {
        this.id = id;
        this.numCliente = numCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.nombreDuenio = nombreDuenio;
        this.celDuenio = celDuenio;
        this.Observaciones = Observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", numCliente=" + numCliente + ", nombrePerro=" + nombrePerro + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico + ", atencionEspecial=" + atencionEspecial + ", nombreDuenio=" + nombreDuenio + ", celDuenio=" + celDuenio + ", Observaciones=" + Observaciones + '}';
    }
}
