package Service;

import Modelo.Modelo;
import jdk.management.resource.internal.TotalResourceContext;

public class Service {
    
    public Modelo[] procesar(double volumen) {
        Modelo[] modelos;
        modelos = prepararReporte();
        for(Modelo model : modelos) {
            if(volumen <= 0) {
                break;
            }
            double consumo = model.getVolumen();
            if(volumen <= consumo) {
                consumo = volumen;
            }
            double importe = consumo * model.getTarifa();
            model.setImporte(importe);
            model.setConsumo(consumo);
            volumen = volumen - consumo;
            
        }  
        return modelos;        
    }
    
    public double calcularMonto(double volumen) {
        double totalMonto = 0;
        Modelo[] modelos = procesar(volumen);
        for (Modelo modelo : modelos) {
            totalMonto = totalMonto + modelo.getImporte();
        }
        return Math.round(totalMonto);
    }
    
    public Modelo[] prepararReporte() {
        Modelo[] model = {
            new Modelo(1, 10, 1.116),
            new Modelo(2, 15, 1.295),
            new Modelo(3, 25, 2.865),
            new Modelo(4, 1000, 4.858)
        };
    return model;
    }
}