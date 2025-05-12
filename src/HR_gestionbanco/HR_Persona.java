package HR_gestionbanco;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
* Clase abstracta que define las características básicas de una persona en el sistema bancario.
* Sirve como base para diferentes tipos de clientes del banco.
* @author hruiz
*/
public abstract class HR_Persona {
   
   String nombre;
   String apellidos;
   Date fechaNacimiento;
   
   /**
    * Constructor principal que inicializa una persona con sus datos básicos.
    * Establece los valores iniciales necesarios para identificar a una persona
    * en el sistema bancario.
    * @param nombre Nombre de la persona
    * @param apellidos Apellidos o apellido de la persona
    * @param fechaNacimiento Fecha en que nació la persona
    */
   public HR_Persona(String nombre, String apellidos, Date fechaNacimiento) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.fechaNacimiento = fechaNacimiento;
   }
   
   /**
    * Constructor vacío para inicialización posterior.
    * Permite crear una persona sin datos iniciales,
    * útil cuando no tenemos toda la información disponible.
    */
   public HR_Persona() {
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
   
   /**
    * Genera una representación en texto de la persona.
    * Formatea los datos básicos de la persona para mostrarlos de manera legible,
    * incluyendo el nombre, apellidos y fecha de nacimiento con formato específico.
    * @return Cadena con la información básica de la persona formateada
    */
   @Override
   public String toString() {
       SimpleDateFormat fecha = new SimpleDateFormat ("dd-MM-yyyy");
       return "Fecha de nacimiento: " + nombre.toUpperCase() + " " 
               + apellidos.toUpperCase() + "\nNombre: " 
               + fecha.format(fechaNacimiento);
   }
}