
package pe.uch.simplefactory.service;

import pe.uch.simplefactory.model.cambioModel;

public class Euro implements cambioService {
     private static final double euro = 3.81 ;
    
    @Override
    public cambioModel getCambio(double soles) {
        cambioModel cm = new cambioModel();
        cm.setTipoCambio("EUROS");
        cm.setSoles(soles);
        cm.setCambio(soles*euro);
        return cm;
          
    }
}
