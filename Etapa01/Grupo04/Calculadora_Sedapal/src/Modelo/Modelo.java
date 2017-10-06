package Modelo;

public class Modelo {
    private int tramo;
    private double volumen;
    private double tarifa;
    private double consumo;
    private double importe;

    public Modelo() {
        
    }
    
    public Modelo(int tramo, double volumen, double tarifa) {
        this.tramo = tramo;
        this.volumen = volumen;
        this.tarifa = tarifa;
    }

    public int getTramo() {
        return tramo;
    }

    public void setTramo(int tramo) {
        this.tramo = tramo;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}