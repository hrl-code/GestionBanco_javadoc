package HR_gestionbanco;
/**
* Clase base para las cuentas bancarias. Contiene funcionalidad común 
* para diferentes tipos de cuentas y maneja operaciones básicas.
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
    * Constructor principal que inicializa una cuenta bancaria con sus datos básicos.
    * Establece los valores iniciales necesarios para que la cuenta funcione.
    * Sin estos datos, la cuenta no podría operar correctamente.
    * @param numeroCuenta Identificador único de la cuenta, como un DNI para la cuenta
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
    * Constructor vacío para inicialización posterior.
    * Permite crear una cuenta sin datos iniciales,
    * útil cuando no tenemos toda la información disponible
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
    * Verifica si los dígitos de control de una cuenta son correctos.
    * Los dígitos de control son un mecanismo de seguridad para
    * evitar errores en el número de cuenta.
    * Este método extrae los dígitos de control del CCC proporcionado y
    * los compara con los calculados.
    * @param CCC Código Cuenta Cliente completo a verificar
    * @return true si los dígitos son correctos, false en caso contrario
    */
   public boolean comprobarDigitosControl(String CCC) {
       
       String DC = CCC.substring(8, 10);
       String DC_Calculado = obtenerDigitosControl(CCC.substring(0, 4),
           CCC.substring(4, 8), CCC.substring(10));
       
       return DC.equals(DC_Calculado);
   }
   
   /**
    * Calcula los dígitos de control para una cuenta bancaria.
    * Utiliza la entidad, oficina y número de cuenta para generar
    * los dígitos de control según el algoritmo bancario estándar.
    * Este método es estático porque no depende de ninguna instancia específica.
    * @param entidad Código de la entidad bancaria (4 dígitos)
    * @param oficina Código de la oficina (4 dígitos)
    * @param numCuenta Número de cuenta (10 dígitos)
    * @return Los dígitos de control calculados (2 dígitos)
    */
   public static String obtenerDigitosControl(String entidad, String oficina, String numCuenta) {
       return calculaDigito("00" + entidad + oficina) + calculaDigito(numCuenta);
   }
   
   /**
    * Método auxiliar para el cálculo de los dígitos de control.
    * Aplica el algoritmo según normativa bancaria española.
    * Este método asigna pesos a cada posición y realiza operaciones
    * matemáticas para obtener un dígito de control.
    * Es privado porque solo se usa internamente en esta clase.
    * @param strDigitos Dígitos a procesar (10 dígitos)
    * @return Dígito de control calculado (1 dígito)
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
    * Genera una representación en texto de la cuenta bancaria.
    * Este método formatea la información básica de la cuenta
    * para mostrarla de manera legible. Incluye número de cuenta,
    * información del cliente y saldo actual.
    * @return Cadena con la información básica de la cuenta formateada
    */
   @Override
   public String toString() {
       return  ("Numero de Cuenta: " +numeroCuenta + "\n" +
                cliente.toString()+ 
               "\nSaldo: " + saldo + " ï¿½");
   }
   
   /**
    * Registra un ingreso en la cuenta y actualiza el saldo.
    * Este método permite aumentar el dinero disponible en la cuenta.
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
    * Este método permite extraer dinero de la cuenta,
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