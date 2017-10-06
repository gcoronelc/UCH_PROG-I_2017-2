package Prueba01;

import Controller.Controller;
import Modelo.Modelo;
import Service.Service;

public class Prueba {
    
    public static void main(String[] args) {
        double volumenTotal = 26;
        double importeTotal = 0;
        Controller controlador = new Controller();
        Modelo[] model = controlador.procesar(volumenTotal);
        importeTotal = controlador.calcularMonto(volumenTotal);
        System.out.println("Volumen: "+volumenTotal+"\n");
        System.out.println("TRAMO\tCONSUMO\tTARIFA\tIMPORTE");
        for (Modelo modelo : model) {            
            System.out.println(modelo.getTramo()+"\t"+
                    modelo.getConsumo()+"\t"+
                    modelo.getTarifa()+"\t"+
                    modelo.getImporte()+"\n");
        }
        System.out.println("Importe a Pagar: "+"\t"+importeTotal);
    }    
}