
package pe.uch.simplefactory.service;

import pe.uch.simplefactory.model.cambioModel;

public class Pesos implements cambioService {
  
     private static final double peso =5.61 ;
    
    @Override
    public cambioModel getCambio(double soles) {
        cambioModel cm = new cambioModel();
        cm.setTipoCambio("PESOS");
        cm.setSoles(soles);
        cm.setCambio(soles*peso);
        return cm;
          
    }
}
