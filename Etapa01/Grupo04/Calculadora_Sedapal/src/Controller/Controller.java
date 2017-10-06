package Controller;

import Modelo.Modelo;
import Service.Service;

public class Controller {
    private final Service servicios;
    
    public Controller() {
        servicios = new Service();
    }
    
    public Modelo[] procesar(double volumen) {
        return servicios.procesar(volumen);
    }
    
    public double calcularMonto(double volumenTotal) {
        return servicios.calcularMonto(volumenTotal);
    }
}