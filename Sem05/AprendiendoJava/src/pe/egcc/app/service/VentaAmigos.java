
package pe.egcc.app.service;


public class VentaAmigos extends AbstractVenta{

  @Override
  public double calcVenta(double precio, int cant) {
    //variable
    double importe;
    //proceso
    importe =  (precio * cant )*0.95;
    
    //Salida
    return importe;
    
  }
  
  
  
}
