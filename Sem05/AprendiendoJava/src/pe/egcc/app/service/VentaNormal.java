package pe.egcc.app.service;

public class VentaNormal extends AbstractVenta{

  @Override
  public double calcVenta(double precio, int cant) {
    // Variable
    double importe;
    // Proceso
    importe = precio * cant;
    // Retorno
    return importe;
  }
  
}
