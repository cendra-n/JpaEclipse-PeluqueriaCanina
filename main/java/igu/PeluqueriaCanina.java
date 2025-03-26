/*
Ejercicio Integrador: Peluquería Canina
Una peluquería canina necesita de un formulario para almacenar los datos de cada una
de sus mascotas clientes.
Para ello, solicita el desarrollo de una aplicación que sea capaz de 
registrar los siguientes datos de cada una de ellas y sus dueños:
- Mascotas: num_cliente, nombre_perro, raza,color,alergico,atencion_especial, observaciones
- Dueño: id_duenio, nombre, celular, direccion

La aplicación debe permitir:
✅ Crear un registro de mascotas
✅ Leer la información almacenada
✅ Actualizar los datos
✅ Eliminar registros

El sistema contará con una interfaz gráfica para facilitar la carga de datos y mejorar la experiencia del usuario.
 * Este proyecto tiene como objetivo desarrollar una aplicación de escritorio
 * capaz de registrar y almacenar datos en una base de datos.
 * Requerimientos principales:
 * - Los datos deben permanecer en el tiempo, permitiendo el acceso futuro a los empleados.
 * - Implementar una base de datos para almacenar los registros.
 * - La aplicación debe permitir la gestión de datos de mascotas y dueños a través de una interfaz gráfica.
 * - Se debe seguir el modelo de capas para la estructura del desarrollo (igu/logica/persitencia).
 *- Se agrega el package validator para controlar los imput que ingresan antes de ser llevados a la bd
*/

/*En el paquete igu se representa todo lo visto en relacion a la vista del usuario*/

package igu;

import igu.Principal;


public class PeluqueriaCanina {

    public static void main(String[] args) {
        Principal menu = new Principal(); //instancia de la clase principal(jframe)
        menu.setVisible(true); // muestra el form
        menu.setLocationRelativeTo(null); //lo centra en la mitad sin tener en cuenta ningunan posicion en particular
        
        
    }
}
