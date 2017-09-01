package pe.egcc.promedioapp.controller;

import pe.egcc.mate.service.MateService;

public class PromedioController {

  private final MateService mateService;

  public PromedioController() {
    mateService = new MateService();
  }
  
  public int promediar(int num1, int num2) {
    return mateService.promediar(num1, num2);
  }
  
}
