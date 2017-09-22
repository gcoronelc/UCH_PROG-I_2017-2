package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase4;

public class Prueba02 {

    public static void main(String[] args) {
        // Caso 1
        Clase1 o1 = new Clase4();
        System.out.println("Caso 1: " + o1.sumar(5, 2));
        
        // Caso 2
        Clase2 o2 = new Clase4();
        System.out.println("Caso 2: " + o2.sumar(5, 2));
        
        // Caso 3
        Clase1 o3 = new Clase2();
        System.out.println("Caso 3: " + o3.sumar(5, 2));
        
        
    }
}
