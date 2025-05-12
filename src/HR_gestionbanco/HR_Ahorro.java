package HR_gestionbanco;

/**
 * Esta clase representa una cuenta de ahorro. Hereda de HR_Bancaria, por lo que
 * tiene todas sus propiedades y métodos básicos. Añade funcionalidad específica
 * para manejar el interés de las cuentas de ahorro.
 *
 * @author hruiz
 */
public class HR_Ahorro extends HR_Bancaria {

    float interesCuentaAhorro;

    /**
     * Este es el constructor principal de la clase. Se usa para crear una nueva
     * cuenta de ahorro con todos sus datos iniciales. Recibe información
     * importante como quién es el dueño de la cuenta, cuánto dinero tiene al
     * principio, y qué porcentaje de interés ganará.
     *
     * @param numeroCuenta Es como el "DNI" de la cuenta, un número único que la
     * identifica
     * @param cliente Es la persona dueña de la cuenta, quien puede sacar y
     * meter dinero
     * @param saldo Es la cantidad de dinero inicial que tiene la cuenta
     * @param interesCuentaAhorro Es el porcentaje de interés que el banco
     * pagará al cliente por su dinero
     */
    public HR_Ahorro(String numeroCuenta, HR_Persona cliente, double saldo, float interesCuentaAhorro) {
        super(numeroCuenta, cliente, saldo);
        this.interesCuentaAhorro = interesCuentaAhorro;

    }

    /**
     * Este es un constructor vacío. Se usa cuando queremos crear una cuenta
     * pero todavía no tenemos todos los datos necesarios. Más tarde podemos
     * completar la información usando los métodos "set".
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
     * Este método convierte toda la información de la cuenta en un texto
     * legible para humanos. Es muy útil para mostrar los datos de la cuenta en
     * pantalla o para imprimir. Incluye toda la información básica de la cuenta
     * bancaria (heredada) más el interés específico de esta cuenta de ahorro.
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
