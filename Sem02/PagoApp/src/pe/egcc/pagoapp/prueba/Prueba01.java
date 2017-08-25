package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.model.PagoModel;
import pe.egcc.pagoapp.service.PagoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    PagoModel model = new PagoModel(6, 20, 120.0);
    
    // Proceso
    PagoService service = new PagoService();
    model = service.procesar(model);
    
    // Reporte
    System.out.println("Ingresos: " + model.getIngresos());
    System.out.println("Renta: " + model.getRenta());
    System.out.println("Neto: " + model.getNeto());
  }
  
}
