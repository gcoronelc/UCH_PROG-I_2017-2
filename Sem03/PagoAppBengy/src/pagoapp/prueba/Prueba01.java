package pagoapp.prueba;

import pagoapp.model.PagoModel;
import pagoapp.service.PagoService;

public class Prueba01 {
    
  public static void main(String[] args){
  //DATO
     PagoModel model= new PagoModel(6, 20, 120.0);
      //PROCESO
      PagoService service =new PagoService();
      model=service.procesar(model);
      
      //reporte
      System.out.println("Ingresos: "+ model.getIngresos());
      System.out.println("renta: "+ model.getRenta());
      System.out.println("neto: "+ model.getNeto());
      
  }
  
    
}
