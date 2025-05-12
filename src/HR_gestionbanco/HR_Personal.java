package HR_gestionbanco;
import java.util.ArrayList;
/**
* Clase que representa una cuenta bancaria personal.
* Extiende la funcionalidad básica de HR_Bancaria con características
* específicas para cuentas personales.
* @author hruiz
*/
public class HR_Personal extends HR_Bancaria {
  
      
   double comisionMantenimiento;
   String codigoEnt;
   double maxPermitido;
   ArrayList entidadesPropias = new ArrayList ();
       
   /**
    * Constructor principal que inicializa una cuenta personal.
    * Configura todos los parámetros específicos para cuentas personales,
    * como la comisión de mantenimiento y las entidades autorizadas.
    * @param numeroCuenta Identificador único de la cuenta bancaria
    * @param cliente Propietario o titular de la cuenta
    * @param saldo Cantidad inicial de dinero en la cuenta
    * @param comisionMantenimiento Comisión fija que se aplica por mantenimiento de la cuenta
    * @param codigoEnt Código de la entidad bancaria
    * @param maxPermitido Cantidad máxima permitida para operaciones
    * @param entidadesPropias Lista de entidades autorizadas para operar con la cuenta
    */
   public HR_Personal(String numeroCuenta, HR_Persona cliente, double saldo, 
           double comisionMantenimiento, String codigoEnt, double maxPermitido, ArrayList entidadesPropias) {
       super(numeroCuenta, cliente, saldo);
       this.comisionMantenimiento = comisionMantenimiento;
       this.entidadesPropias = entidadesPropias;
       this.codigoEnt = codigoEnt;
       this.maxPermitido = maxPermitido;
   }
   
   public double getComisionMantenimiento() {
       return comisionMantenimiento;
   }
   public void setComisionMantenimiento(double comisionMantenimiento) {
       this.comisionMantenimiento = comisionMantenimiento;
   }
   
   public String getCodigoEnt() {
       return codigoEnt;
   }
   public void setCodigoEnt(String codigoEnt) {
       this.codigoEnt = codigoEnt;
   }
   public double getMaxPermitido() {
       return maxPermitido;
   }
   public void setMaxPermitido(double maxPermitido) {
       this.maxPermitido = maxPermitido;
   }
   public ArrayList getEntidadesPropias() {
       return entidadesPropias;
   }
   public void setEntidadesPropias(ArrayList entidadesPropias) {
       this.entidadesPropias = entidadesPropias;
   }
   
   /**
    * Constructor vacío para inicialización posterior.
    * Permite crear una cuenta sin datos iniciales.
    */
   public HR_Personal() {
   }
   
   /**
    * Sobrescribe el método getDisponible para definir el disponible en cuentas personales.
    * En cuentas personales, el disponible es igual al saldo actual.
    * @return Cantidad total disponible en la cuenta personal
    */
   @Override
    public double getDisponible() {
       return saldo;
   }
   
   @Override
   public void setDisponible(double disponible) {
       this.disponible = saldo;
   }
   
   /**
    * Añade una nueva entidad autorizada a la lista de entidades propias.
    * Almacena el código de la entidad junto con el máximo permitido.
    * @param cod Código identificador de la entidad
    * @param maxPer Cantidad máxima permitida para esa entidad
    */
   public void almacenarEntidadesPropias (String cod, double maxPer){
       String entidad = cod + " " + maxPer + " €";
       entidadesPropias.add(entidad);
   }
    
   /**
    * Genera una representación en texto de la cuenta personal.
    * Incluye la información básica de la cuenta bancaria más
    * los detalles específicos de las cuentas personales.
    * @return Cadena con toda la información de la cuenta personal
    */
   @Override
   public String toString() {
       
       return "CUENTA CORRIENTE PERSONAL\n"+
               super.toString()+
               "\nTipo de interés de mantenimiento: " + comisionMantenimiento + "€" +
               "\nEntidades autorizadas: " + entidadesPropias.toString()+
               "\n_______________________________________________\n";
   }
   
}