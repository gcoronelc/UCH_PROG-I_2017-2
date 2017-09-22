package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

public class Prueba05 {
    
    public static void main(String[] args) {
        
        Object obj = new Clase2();
        
        System.out.println("Compatible con:");
        System.out.println("Object: " + ((Object.class.isInstance(obj))?"Si":"No"));
        System.out.println("Clase1: " + ((Clase1.class.isInstance(obj))?"Si":"No"));
        System.out.println("Clase2: " + ((Clase2.class.isInstance(obj))?"Si":"No"));
        System.out.println("Clase3: " + ((Clase3.class.isInstance(obj))?"Si":"No"));
        System.out.println("Clase4: " + ((Clase4.class.isInstance(obj))?"Si":"No"));
        
       
    }
}
