package HR_gestionbanco;

import java.util.ArrayList;

/**
 * Clase que representa una cuenta bancaria para empresas. Extiende la
 * funcionalidad básica de HR_Bancaria con características específicas para
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
     * todos los parámetros específicos para cuentas de empresa, como el
     * descubierto máximo permitido y las entidades autorizadas.
     *
     * @param numeroCuenta Identificador único de la cuenta bancaria
     * @param cliente Propietario o titular de la cuenta
     * @param saldo Cantidad inicial de dinero en la cuenta
     * @param maximoDescubierto Cantidad máxima que puede estar en negativo la
     * cuenta
     * @param interesDescubierto Porcentaje de interés que se aplica al
     * descubierto
     * @param comisionDescubierto Comisión fija que se aplica al usar el
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
     * Constructor vacío para inicialización posterior. Permite crear una cuenta
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
     * Sobrescribe el método getDisponible para incluir el descubierto. En
     * cuentas de empresa, el disponible incluye tanto el saldo como el máximo
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
     * Añade una nueva entidad autorizada a la lista de entidades propias.
     * Almacena el código de la entidad junto con el máximo permitido.
     *
     * @param cod Código identificador de la entidad
     * @param maxPer Cantidad máxima permitida para esa entidad
     */
    public void almacenarEntidadesPropias(String cod, double maxPer) {
        String entidad = cod + ": " + maxPer + " €";
        entidadesPropias.add(entidad);
    }

    /**
     * Genera una representación en texto de la cuenta empresarial. Incluye la
     * información básica de la cuenta bancaria más los detalles específicos de
     * las cuentas de empresa.
     *
     * @return Cadena con toda la información de la cuenta empresarial
     */
    @Override
    public String toString() {

        return "CUENTA CORRIENTE EMPRESA\n"
                + super.toString()
                + "\nMáximo descubierto: " + maximoDescubierto + "€"
                + "\nTipo interés descubierto: " + interesDescubierto + "%"
                + "\nComisión descubierto: " + comisionDescubierto + "€"
                + "\nEntidades autorizadas: " + entidadesPropias.toString()
                + "\n_______________________________________________\n";

    }
}
