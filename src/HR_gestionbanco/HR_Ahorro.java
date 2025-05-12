package HR_gestionbanco;

/**
 * Esta clase representa una cuenta de ahorro. Hereda de HR_Bancaria, por lo que
 * tiene todas sus propiedades y m�todos b�sicos. A�ade funcionalidad espec�fica
 * para manejar el inter�s de las cuentas de ahorro.
 *
 * @author hruiz
 */
public class HR_Ahorro extends HR_Bancaria {

    float interesCuentaAhorro;

    /**
     * Este es el constructor principal de la clase. Se usa para crear una nueva
     * cuenta de ahorro con todos sus datos iniciales. Recibe informaci�n
     * importante como qui�n es el due�o de la cuenta, cu�nto dinero tiene al
     * principio, y qu� porcentaje de inter�s ganar�.
     *
     * @param numeroCuenta Es como el "DNI" de la cuenta, un n�mero �nico que la
     * identifica
     * @param cliente Es la persona due�a de la cuenta, quien puede sacar y
     * meter dinero
     * @param saldo Es la cantidad de dinero inicial que tiene la cuenta
     * @param interesCuentaAhorro Es el porcentaje de inter�s que el banco
     * pagar� al cliente por su dinero
     */
    public HR_Ahorro(String numeroCuenta, HR_Persona cliente, double saldo, float interesCuentaAhorro) {
        super(numeroCuenta, cliente, saldo);
        this.interesCuentaAhorro = interesCuentaAhorro;

    }

    /**
     * Este es un constructor vac�o. Se usa cuando queremos crear una cuenta
     * pero todav�a no tenemos todos los datos necesarios. M�s tarde podemos
     * completar la informaci�n usando los m�todos "set".
     */
    public HR_Ahorro() {
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

    /**
     * Este m�todo convierte toda la informaci�n de la cuenta en un texto
     * legible para humanos. Es muy �til para mostrar los datos de la cuenta en
     * pantalla o para imprimir. Incluye toda la informaci�n b�sica de la cuenta
     * bancaria (heredada) m�s el inter�s espec�fico de esta cuenta de ahorro.
     *
     * @return Un texto bonito y formateado con todos los datos importantes de
     * la cuenta
     */
    @Override
    public String toString() {
        return "CUENTA AHRORO\n"
                + super.toString()
                + "\nSaldo: " + interesCuentaAhorro + "%"
                + "\n_______________________________________________\n";
    }
}
