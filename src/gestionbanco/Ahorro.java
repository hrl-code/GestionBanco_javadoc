
package gestionbanco;

/**
 *
 * @author rmunoz
 */
public class Ahorro extends Bancaria{
    
    float interesCuentaAhorro;

    public Ahorro(String numeroCuenta, Persona cliente, double saldo, float interesCuentaAhorro ) {
        super(numeroCuenta, cliente, saldo);
        this.interesCuentaAhorro = interesCuentaAhorro;
       
    }

    public Ahorro() {
    }

    public double getDisponible() {
        return saldo;
    }

    public void setDisponible(double disponible) {
        this.disponible = saldo;
    }
    
    

    public void setInteresCuentaAhorro(float interesCuentaAhorro) {
        this.interesCuentaAhorro = interesCuentaAhorro;
    }

    public float getInteresCuentaAhorro() {
        return interesCuentaAhorro;
    }

     @Override
    public String toString(){
        return "CUENTA AHRORO\n"+
                super.toString()+
                "\nSaldo: " + interesCuentaAhorro + "%" +
                "\n_______________________________________________\n";
    }
}
