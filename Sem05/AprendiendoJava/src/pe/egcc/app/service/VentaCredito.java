
package pe.egcc.app.service;


public class VentaCredito extends AbstractVenta{

  @Override
  public double calcVenta(double precio, int cant) {
    double importe, incremento;
    
    importe = precio*cant;
    incremento= importe*0.05;
    
    return(importe + incremento);
  }
  
}
