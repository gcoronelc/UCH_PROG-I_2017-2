package pe.egcc.app.prueba;

import pe.egcc.app.service.AbstractVenta;
import pe.egcc.app.service.VentaAmigos;
import pe.egcc.app.service.VentaCredito;
import pe.egcc.app.service.VentaNormal;

public class Prueba03 {
  
  public static void main(String[] args) {
    
    // Datos
    double precio = 450.0;
    int cant = 10;
    int tipo = 3; // 1: Normal, 2: Amigo, 3: Credito
    
    // Proceso
    AbstractVenta venta = obtenerObjVenta(tipo);
    double importe = venta.calcVenta(precio, cant);
    
    // Reporte
    System.out.println("Clase: " 
            + venta.getClass().getName());
    System.out.println("Precio: " + precio);
    System.out.println("Cantidad: " + cant);
    System.out.println("Importe: " + importe);
    
    
  }

  private static AbstractVenta obtenerObjVenta(int tipo) {
    // Variable
    AbstractVenta venta = null;
    // Proceso
    switch(tipo){
      case 1:
        venta = new VentaNormal();
        break;
      case 2:
        venta = new VentaAmigos();
        break;
      case 3:
        venta = new VentaCredito();
        break;
    }
    // Retorno
    return venta;
  }
  
  
}
