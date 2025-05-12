package HR_gestionbanco;
import java.util.ArrayList;
/**
* Clase que representa una cuenta bancaria personal.
* Extiende la funcionalidad b�sica de HR_Bancaria con caracter�sticas
* espec�ficas para cuentas personales.
* @author hruiz
*/
public class HR_Personal extends HR_Bancaria {
  
      
   double comisionMantenimiento;
   String codigoEnt;
   double maxPermitido;
   ArrayList entidadesPropias = new ArrayList ();
       
   /**
    * Constructor principal que inicializa una cuenta personal.
    * Configura todos los par�metros espec�ficos para cuentas personales,
    * como la comisi�n de mantenimiento y las entidades autorizadas.
    * @param numeroCuenta Identificador �nico de la cuenta bancaria
    * @param cliente Propietario o titular de la cuenta
    * @param saldo Cantidad inicial de dinero en la cuenta
    * @param comisionMantenimiento Comisi�n fija que se aplica por mantenimiento de la cuenta
    * @param codigoEnt C�digo de la entidad bancaria
    * @param maxPermitido Cantidad m�xima permitida para operaciones
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
    * Constructor vac�o para inicializaci�n posterior.
    * Permite crear una cuenta sin datos iniciales.
    */
   public HR_Personal() {
   }
   
   /**
    * Sobrescribe el m�todo getDisponible para definir el disponible en cuentas personales.
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
    * A�ade una nueva entidad autorizada a la lista de entidades propias.
    * Almacena el c�digo de la entidad junto con el m�ximo permitido.
    * @param cod C�digo identificador de la entidad
    * @param maxPer Cantidad m�xima permitida para esa entidad
    */
   public void almacenarEntidadesPropias (String cod, double maxPer){
       String entidad = cod + " " + maxPer + " �";
       entidadesPropias.add(entidad);
   }
    
   /**
    * Genera una representaci�n en texto de la cuenta personal.
    * Incluye la informaci�n b�sica de la cuenta bancaria m�s
    * los detalles espec�ficos de las cuentas personales.
    * @return Cadena con toda la informaci�n de la cuenta personal
    */
   @Override
   public String toString() {
       
       return "CUENTA CORRIENTE PERSONAL\n"+
               super.toString()+
               "\nTipo de inter�s de mantenimiento: " + comisionMantenimiento + "�" +
               "\nEntidades autorizadas: " + entidadesPropias.toString()+
               "\n_______________________________________________\n";
   }
   
}