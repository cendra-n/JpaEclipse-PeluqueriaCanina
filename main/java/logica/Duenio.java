package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Nadia Cendra
 */

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idDuenio;
    @Basic
    private String nombreDuenio;
    private String celDuenio;
    private String dniDuenio;

    public Duenio() {
    }

    public Duenio(int idDuenio, String nombreDuenio, String celDuenio, String dniDuenio) {
        this.idDuenio = idDuenio;
        this.nombreDuenio = nombreDuenio;
        this.celDuenio = celDuenio;
        this.dniDuenio = dniDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
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

    public String getDniDuenio() {
        return dniDuenio;
    }

    public void setDniDuenio(String dniDuenio) {
        this.dniDuenio = dniDuenio;
    }

    
    
    
}
