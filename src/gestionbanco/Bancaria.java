
package gestionbanco;

/**
 *
 * @author rmunoz
 */
public class Bancaria {
  
    protected String numeroCuenta;
    Persona cliente;
    protected double saldo;

    protected double cantidadRetirada;
    protected double cantidadIngresada;
    protected double disponible;
    

    public Bancaria(String numeroCuenta, Persona cliente, 
            double saldo) {
       
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = saldo;

    }

    public Bancaria() { 
        
    }
   
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
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

    public boolean comprobarDigitosControl(String CCC) {
        
        String DC = CCC.substring(8, 10);
        String DC_Calculado = obtenerDigitosControl(CCC.substring(0, 4),
            CCC.substring(4, 8), CCC.substring(10));
        
        return DC.equals(DC_Calculado);
    }

    public static String obtenerDigitosControl(String entidad, String oficina, String numCuenta) {

        return calculaDigito("00" + entidad + oficina) + calculaDigito(numCuenta);

        }

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
     
    @Override
    public String toString() {
        return  ("Numero de Cuenta: " +numeroCuenta + "\n" +
                 cliente.toString()+ 
                "\nSaldo: " + saldo + " €");
    }

    public double ingresar (double cantidadIngresada){
            
        this.saldo = cantidadIngresada; 
        return saldo;

    }
    
    public double reintegro(double cantidadRetirada) {
        
        disponible -= cantidadRetirada;
        saldo = cantidadRetirada;
        return disponible;

    }   
    
 }
