package logica;

/**
 * @author Nadia Cendra
 */

import persistencia.ControladoraPersistencia;
import validator.DuenioValidator;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import validator.MascotaValidator;

/*
Esta clase tiene como función centralizar los métodos, es decir recibe las peticiones
e irá pasando entre la persistencia y la interfaz gráfica
según corresponda
 */

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia(); //instancia de la controladoraPersistencia
    
    //metodos para duenio
    public void crearDuenio(Duenio due){
      //aca se va a crer el metodo para logica vaya al guardar de la interfaz y este pase a la bd?
    }

    public void guardarDatos(String nombreMas, String raza, String color, String alergico, String atencion, String nombreDue, String dniDue, String celular, String observacion) {
      /*los valores recibidos los guardaremos en mascota y dueño según corresponda, para eso crearemos una instancia
      de cada una de las clases, pero antes de guardar miramos que estos datos no esten vacios 
        */
      
        //objeto dueño
        Duenio duenio = new Duenio();
        duenio.setNombreDuenio(nombreDue);
        duenio.setDniDuenio(dniDue);
        duenio.setCelDuenio(celular);

        //objeto mascota
        Mascota mascota= new Mascota();
        mascota.setNombrePerro(nombreMas);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencion);
        mascota.setObservaciones(observacion);
        mascota.setUnDuenio(duenio);
      
       // Validamos ambos objetos antes de proceder al guardado en la BD
        if (!DuenioValidator.validarDuenio(duenio) || !MascotaValidator.validarMascota(mascota)) {
            JOptionPane.showMessageDialog(null, "¡No cumple las reglas!\nRevise los datos ingresados.","Error de validación", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("Procedo al insert en la base de datos");
            // Aquí llamamos a la persistencia para guardar
            controlPersis.guardar(duenio, mascota);
            
            JOptionPane.showMessageDialog(null, "La información fue guardada con éxito en la BD.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
      
      
    }

    public List<Mascota> traerMascotas() { // se comunica con la persitencia y esta se comunica a su vez con los jpa controler que corresponda y traer de la base la info
       return controlPersis.traerListaMascota();
    }

    public void borrarMascota(int numCliente) {
       controlPersis.eliminarMascota(numCliente);
    }

    public Mascota traerUnaMascota(int numCliente) {
       return controlPersis.buscarMascota(numCliente);
    }

    public void modificarDatos(Mascota masco, String nombreMas, String raza, String color, String alergico, String atencion, String nombreDue, String dniDuenio, String celular, String observacion) {
       //seteo mascota
       masco.setNombrePerro(nombreMas);
       masco.setRaza(raza);
       masco.setColor(color);
       masco.setObservaciones(observacion);
       masco.setAlergico(alergico);
       masco.setAtencionEspecial(atencion);
     
       controlPersis.modificarMascota(masco); //modificar mascota
       
       Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getIdDuenio()); //lo llamo aca "**"2 ,
       // ahora puedo setear los valores de duenio
       duenio.setNombreDuenio(nombreDue);
       duenio.setDniDuenio(dniDuenio);
       duenio.setCelDuenio(celular);
       
       //modificar dueño
       this.modificarDuenio(duenio);
       
       
    }

    private Duenio buscarDuenio(int idDuenio) { //tiene el id del duenio "**"1
        return controlPersis.traerDuenio(idDuenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.cambiarDuenio(duenio);
    }
    

    
}
