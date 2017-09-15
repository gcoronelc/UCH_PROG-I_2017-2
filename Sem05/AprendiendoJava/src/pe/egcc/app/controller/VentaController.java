package pe.egcc.app.controller;

import pe.egcc.app.service.AbstractVenta;
import pe.egcc.app.service.VentaAmigos;
import pe.egcc.app.service.VentaCredito;
import pe.egcc.app.service.VentaNormal;

public class VentaController {

  public double calcVenta(int tipo, double precio, int cant) {
    
    AbstractVenta venta = obtenerObjVenta(tipo);
    double importe = venta.calcVenta(precio, cant);
    
    return importe;
  }
  
  
  private AbstractVenta obtenerObjVenta(int tipo) {
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
