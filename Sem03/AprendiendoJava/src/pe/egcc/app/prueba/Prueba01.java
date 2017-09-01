package pe.egcc.app.prueba;

import pe.egcc.app.service.MateService;

public class Prueba01 {

    public static void main(String[] args) {
        
        // Objeto
        MateService service = new MateService();
        
        // Reporte
        System.out.println("Suma: " + service.sumar(3.0, 4));
        
    }
    
}
