package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.service.VentaService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    double precio = 550.0;
    int cant = 10;
    
    // Proceso
    VentaService service = new VentaService();
    double total = service.calcTotal(precio, cant);
    double importe = service.calcImporte(total);
    double impuesto = service.calcImpuesto(total);
    
    // Reporte
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
  }

  
}
