package HR_gestionbanco;

import java.util.ArrayList;

/**
 * Clase que representa una cuenta bancaria para empresas. Extiende la
 * funcionalidad b�sica de HR_Bancaria con caracter�sticas espec�ficas para
 * cuentas empresariales.
 *
 * @author hruiz
 */
public class HR_Empresa extends HR_Bancaria {

    protected double descubierto;
    protected double interesDescubierto;
    protected double comisionDescubierto;
    protected double mantenimiento;
    protected double maximoDescubierto;
    ArrayList entidadesPropias = new ArrayList();

    /**
     * Constructor principal que inicializa una cuenta empresarial. Configura
     * todos los par�metros espec�ficos para cuentas de empresa, como el
     * descubierto m�ximo permitido y las entidades autorizadas.
     *
     * @param numeroCuenta Identificador �nico de la cuenta bancaria
     * @param cliente Propietario o titular de la cuenta
     * @param saldo Cantidad inicial de dinero en la cuenta
     * @param maximoDescubierto Cantidad m�xima que puede estar en negativo la
     * cuenta
     * @param interesDescubierto Porcentaje de inter�s que se aplica al
     * descubierto
     * @param comisionDescubierto Comisi�n fija que se aplica al usar el
     * descubierto
     * @param entidadesPropias Lista de entidades autorizadas para operar con la
     * cuenta
     */
    public HR_Empresa(String numeroCuenta, HR_Persona cliente, double saldo, double maximoDescubierto, double interesDescubierto, double comisionDescubierto, ArrayList entidadesPropias) {
        super(numeroCuenta, cliente, saldo);
        this.maximoDescubierto = maximoDescubierto;
        this.interesDescubierto = interesDescubierto;
        this.comisionDescubierto = comisionDescubierto;
        this.entidadesPropias = entidadesPropias;
    }

    /**
     * Constructor vac�o para inicializaci�n posterior. Permite crear una cuenta
     * sin datos iniciales.
     */
    public HR_Empresa() {
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }

    public double getInteresDescubierto() {
        return interesDescubierto;
    }

    public void setInteresDescubierto(double interesDescubierto) {
        this.interesDescubierto = interesDescubierto;
    }

    public double getComisionDescubierto() {
        return comisionDescubierto;
    }

    public void setComisionDescubierto(double comisionDescubierto) {
        this.comisionDescubierto = comisionDescubierto;
    }

    public double getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public void setMaximoDescubierto(double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    /**
     * Sobrescribe el m�todo getDisponible para incluir el descubierto. En
     * cuentas de empresa, el disponible incluye tanto el saldo como el m�ximo
     * descubierto permitido.
     *
     * @return Cantidad total disponible incluyendo el descubierto
     */
    @Override
    public double getDisponible() {
        return saldo + maximoDescubierto;
    }

    @Override
    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    /**
     * A�ade una nueva entidad autorizada a la lista de entidades propias.
     * Almacena el c�digo de la entidad junto con el m�ximo permitido.
     *
     * @param cod C�digo identificador de la entidad
     * @param maxPer Cantidad m�xima permitida para esa entidad
     */
    public void almacenarEntidadesPropias(String cod, double maxPer) {
        String entidad = cod + ": " + maxPer + " �";
        entidadesPropias.add(entidad);
    }

    /**
     * Genera una representaci�n en texto de la cuenta empresarial. Incluye la
     * informaci�n b�sica de la cuenta bancaria m�s los detalles espec�ficos de
     * las cuentas de empresa.
     *
     * @return Cadena con toda la informaci�n de la cuenta empresarial
     */
    @Override
    public String toString() {

        return "CUENTA CORRIENTE EMPRESA\n"
                + super.toString()
                + "\nM�ximo descubierto: " + maximoDescubierto + "�"
                + "\nTipo inter�s descubierto: " + interesDescubierto + "%"
                + "\nComisi�n descubierto: " + comisionDescubierto + "�"
                + "\nEntidades autorizadas: " + entidadesPropias.toString()
                + "\n_______________________________________________\n";

    }
}
