package HR_gestionbanco;
/**
* Clase base para las cuentas bancarias. Contiene funcionalidad com�n 
* para diferentes tipos de cuentas y maneja operaciones b�sicas.
* @author hruiz
*/
public class HR_Bancaria {
 
   protected String numeroCuenta;
   HR_Persona cliente;
   protected double saldo;
   protected double cantidadRetirada;
   protected double cantidadIngresada;
   protected double disponible;
   
   /**
    * Constructor principal que inicializa una cuenta bancaria con sus datos b�sicos.
    * Establece los valores iniciales necesarios para que la cuenta funcione.
    * Sin estos datos, la cuenta no podr�a operar correctamente.
    * @param numeroCuenta Identificador �nico de la cuenta, como un DNI para la cuenta
    * @param cliente Propietario de la cuenta, quien puede realizar operaciones
    * @param saldo Cantidad inicial de dinero en la cuenta
    */
   public HR_Bancaria(String numeroCuenta, HR_Persona cliente, 
           double saldo) {
      
       this.numeroCuenta = numeroCuenta;
       this.cliente = cliente;
       this.saldo = saldo;
   }
   
   /**
    * Constructor vac�o para inicializaci�n posterior.
    * Permite crear una cuenta sin datos iniciales,
    * �til cuando no tenemos toda la informaci�n disponible
    * en el momento de crear la cuenta.
    */
   public HR_Bancaria() { 
       
   }
  
   public String getNumeroCuenta() {
       return numeroCuenta;
   }
   public void setNumeroCuenta(String numeroCuenta) {
       this.numeroCuenta = numeroCuenta;
   }
   
   public HR_Persona getCliente() {
       return cliente;
   }
   public void setCliente(HR_Persona cliente) {
       this.cliente = cliente;
   }
   public double getSaldo() {
       return saldo;
   }
   public void setSaldo(double saldo) {
       this.saldo = saldo;
   }
   public double getDisponible() {
       return disponible;
   }
   public void setDisponible(double disponible) {
       this.disponible = disponible;
   }
   public double getCantidadRetirada() {
       return cantidadRetirada;
   }
   public void setCantidadRetirada(double cantidadRetirada) {
       this.cantidadRetirada = cantidadRetirada;
   }
   public double getCantidadIngresada() {
       return cantidadIngresada;
   }
   public void setCantidadIngresada(double cantidadIngresada) {
       this.cantidadIngresada = cantidadIngresada;
   }
   
   /**
    * Verifica si los d�gitos de control de una cuenta son correctos.
    * Los d�gitos de control son un mecanismo de seguridad para
    * evitar errores en el n�mero de cuenta.
    * Este m�todo extrae los d�gitos de control del CCC proporcionado y
    * los compara con los calculados.
    * @param CCC C�digo Cuenta Cliente completo a verificar
    * @return true si los d�gitos son correctos, false en caso contrario
    */
   public boolean comprobarDigitosControl(String CCC) {
       
       String DC = CCC.substring(8, 10);
       String DC_Calculado = obtenerDigitosControl(CCC.substring(0, 4),
           CCC.substring(4, 8), CCC.substring(10));
       
       return DC.equals(DC_Calculado);
   }
   
   /**
    * Calcula los d�gitos de control para una cuenta bancaria.
    * Utiliza la entidad, oficina y n�mero de cuenta para generar
    * los d�gitos de control seg�n el algoritmo bancario est�ndar.
    * Este m�todo es est�tico porque no depende de ninguna instancia espec�fica.
    * @param entidad C�digo de la entidad bancaria (4 d�gitos)
    * @param oficina C�digo de la oficina (4 d�gitos)
    * @param numCuenta N�mero de cuenta (10 d�gitos)
    * @return Los d�gitos de control calculados (2 d�gitos)
    */
   public static String obtenerDigitosControl(String entidad, String oficina, String numCuenta) {
       return calculaDigito("00" + entidad + oficina) + calculaDigito(numCuenta);
   }
   
   /**
    * M�todo auxiliar para el c�lculo de los d�gitos de control.
    * Aplica el algoritmo seg�n normativa bancaria espa�ola.
    * Este m�todo asigna pesos a cada posici�n y realiza operaciones
    * matem�ticas para obtener un d�gito de control.
    * Es privado porque solo se usa internamente en esta clase.
    * @param strDigitos D�gitos a procesar (10 d�gitos)
    * @return D�gito de control calculado (1 d�gito)
    */
   private static String calculaDigito(String strDigitos) {
       int pesoDigito[]= {1, 2, 4, 8, 5, 10, 9, 7, 3, 6 };
       int suma=0, resto;
       String DC_Calculado;
       for (int i=0; i<10; i++) {
           suma = suma + pesoDigito[i] *
                   Integer.parseInt( strDigitos.substring(i, i+1));
       }
       resto = suma % 11;
      
       switch (resto) {
           case 0:
               DC_Calculado = 0 + "";
               break;
           case 1:
               DC_Calculado = 1 + "";
               break;
           default:
               DC_Calculado = 11-resto + "";
               break;
       }
       return DC_Calculado;
   }
    
   /**
    * Genera una representaci�n en texto de la cuenta bancaria.
    * Este m�todo formatea la informaci�n b�sica de la cuenta
    * para mostrarla de manera legible. Incluye n�mero de cuenta,
    * informaci�n del cliente y saldo actual.
    * @return Cadena con la informaci�n b�sica de la cuenta formateada
    */
   @Override
   public String toString() {
       return  ("Numero de Cuenta: " +numeroCuenta + "\n" +
                cliente.toString()+ 
               "\nSaldo: " + saldo + " �");
   }
   
   /**
    * Registra un ingreso en la cuenta y actualiza el saldo.
    * Este m�todo permite aumentar el dinero disponible en la cuenta.
    * Toma la cantidad ingresada y la establece como el nuevo saldo.
    * @param cantidadIngresada Cantidad a ingresar en la cuenta
    * @return Nuevo saldo tras el ingreso
    */
   public double ingresar (double cantidadIngresada){
           
       this.saldo = cantidadIngresada; 
       return saldo;
   }
   
   /**
    * Realiza un retiro de dinero de la cuenta.
    * Este m�todo permite extraer dinero de la cuenta,
    * restando del disponible y actualizando el saldo.
    * @param cantidadRetirada Cantidad a retirar de la cuenta
    * @return Saldo disponible tras el retiro
    */
   public double reintegro(double cantidadRetirada) {
       
       disponible -= cantidadRetirada;
       saldo = cantidadRetirada;
       return disponible;
   }   
   
}