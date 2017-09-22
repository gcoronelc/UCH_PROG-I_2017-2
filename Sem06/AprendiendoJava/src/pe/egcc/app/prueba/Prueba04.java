package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

public class Prueba04 {
    
    public static void main(String[] args) {
        
        Object obj = new Clase2();
        
        System.out.println("Compatible con:");
        System.out.println("Object: " + ((obj instanceof Object)?"Si":"No"));
        System.out.println("Clase1: " + ((obj instanceof Clase1)?"Si":"No"));
        System.out.println("Clase2: " + ((obj instanceof Clase2)?"Si":"No"));
        System.out.println("Clase3: " + ((obj instanceof Clase3)?"Si":"No"));
        System.out.println("Clase4: " + ((obj instanceof Clase4)?"Si":"No"));
        
        int n = 7;
        String repo = (n % 2 == 0)?"PAR":((n%7 == 0)?"Multiplo de 7":"Que se yo");
        Object obj2 = (n % 2 == 0)?"PAR":((n%7 == 0)?"Multiplo de 7":new Clase2());
        
        System.out.println(repo);
        System.out.println(obj2);
    }
}
