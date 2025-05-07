
package gestionbanco;

import java.util.ArrayList;


public class Empresa extends Bancaria{
    
    protected double descubierto;
    protected double interesDescubierto;
    protected double comisionDescubierto;
    protected double mantenimiento;
    protected double maximoDescubierto;
    ArrayList entidadesPropias = new ArrayList ();

    public Empresa(String numeroCuenta, Persona cliente, double saldo, double maximoDescubierto, double interesDescubierto, double comisionDescubierto, ArrayList entidadesPropias) {
        super(numeroCuenta, cliente, saldo);
        this.maximoDescubierto = maximoDescubierto;
        this.interesDescubierto = interesDescubierto;
        this.comisionDescubierto = comisionDescubierto;
        this.entidadesPropias = entidadesPropias;
    }


    public Empresa() {
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

    @Override
    public double getDisponible() {
        return saldo + maximoDescubierto;
    }

    @Override
    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    
    public void almacenarEntidadesPropias (String cod, double maxPer){
        String entidad = cod + ": " + maxPer + " €";
        entidadesPropias.add(entidad);
    }


    @Override
    public String toString() {
               
        return "CUENTA CORRIENTE EMPRESA\n"+
                super.toString() +
                "\nMáximo descubierto: " + maximoDescubierto + "€" +
                "\nTipo interés descubierto: " + interesDescubierto + "%" +
                "\nComisión descubierto: " + comisionDescubierto + "€" +
                "\nEntidades autorizadas: " + entidadesPropias.toString()+
                "\n_______________________________________________\n";
        
    }
}
