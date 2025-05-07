
package gestionbanco;

import java.util.ArrayList;


public class Personal extends Bancaria {
   
       
    double comisionMantenimiento;
    String codigoEnt;
    double maxPermitido;
    ArrayList entidadesPropias = new ArrayList ();

        
    public Personal(String numeroCuenta, Persona cliente, double saldo, 
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

    public Personal() {
    }
    
    @Override
     public double getDisponible() {
        return saldo;
    }

    @Override
    public void setDisponible(double disponible) {
        this.disponible = saldo;
    }

    public void almacenarEntidadesPropias (String cod, double maxPer){
        String entidad = cod + " " + maxPer + " €";
        entidadesPropias.add(entidad);
    }
     
    @Override
    public String toString() {
        
        return "CUENTA CORRIENTE PERSONAL\n"+
                super.toString()+
                "\nTipo de interés de mantenimiento: " + comisionMantenimiento + "€" +
                "\nEntidades autorizadas: " + entidadesPropias.toString()+
                "\n_______________________________________________\n";
    }
    
}