package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

/**
 *
 * Nadia Cendra
 */

@Entity // mapea que esta clase sera tomada a futuro como tabla en BD
public class Mascota implements Serializable {
    @Id //define el id la futura tabla
    @GeneratedValue(strategy=GenerationType.IDENTITY)//se define la estrategia de creacion del id
    private int numCliente;
    @Basic
    private String nombrePerro;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEspecial;
    private String observaciones;
    @OneToOne //define la relacion
    private Duenio unDuenio; //por ahora la relacion va a ser 1 a 1, entre duenio y mascota

    public Mascota() {
    }

    public Mascota(int numCliente, String nombrePerro, String raza, String color, String alergico, String atencionEspecial, String observaciones, Duenio unDuenio) {
        this.numCliente = numCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

   
}
