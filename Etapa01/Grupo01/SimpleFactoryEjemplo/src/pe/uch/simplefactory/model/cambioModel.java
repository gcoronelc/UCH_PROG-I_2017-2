
package pe.uch.simplefactory.model;


public class cambioModel {
     //INPUT
    private String tipoCambio;
    private double soles;
    // OUTPUT
    private double cambio;

    public cambioModel() {
    }

    public cambioModel(String tipoCambio, double soles) {
        this.tipoCambio = tipoCambio;
        this.soles = soles;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double getSoles() {
        return soles;
    }

    public void setSoles(double soles) {
        this.soles = soles;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }
    
}
