
package gestionbanco;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rmunoz
 */
public abstract class Persona {
    
    String nombre;
    String apellidos;
    Date fechaNacimiento;
    
    public Persona(String nombre, String apellidos, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        SimpleDateFormat fecha = new SimpleDateFormat ("dd-MM-yyyy");
        return "Fecha de nacimiento: " + nombre.toUpperCase() + " " 
                + apellidos.toUpperCase() + "\nNombre: " 
                + fecha.format(fechaNacimiento);
    }

}
