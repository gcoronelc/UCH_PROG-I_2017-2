package pe.egcc.ventaapp.service;

public class VentaService {

  public double calcTotal(double precio, int cant) {
    // Variable d control
    double total;
    // Proceso
    total = precio * cant;
    // Reporte
    return total;
  }

  public double calcImporte(double total) {
    // Variable d control
    double importe;
    // Proceso
    importe = total / 1.18;
    // Reporte
    return importe;
  }

  public double calcImpuesto(double total) {
    // Variable d control
    double impuesto;
    // Proceso
    impuesto = total - calcImporte(total);
    // Reporte
    return impuesto;
  }

}
