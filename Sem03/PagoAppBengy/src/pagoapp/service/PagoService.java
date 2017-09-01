package pagoapp.service;

import pagoapp.model.PagoModel;

public class PagoService {

  public PagoModel procesar(PagoModel model) {

    double ingresos, renta, neto;
    //proceso
    ingresos = model.getHorasDia() * model.getDias() * model.getPagoHora();
    renta = 0.0;
    if (ingresos > 1500.0) {
      renta = ingresos * 0.08;
    }
    neto = ingresos - renta;
    //reporte
    model.setIngresos(ingresos);
    model.setRenta(renta);
    model.setNeto(neto);
    return model;
  }
}
