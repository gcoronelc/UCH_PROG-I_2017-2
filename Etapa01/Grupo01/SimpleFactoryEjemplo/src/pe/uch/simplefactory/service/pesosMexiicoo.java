
package pe.uch.simplefactory.service;

import pe.uch.simplefactory.model.cambioModel;

public class pesosMexiicoo implements cambioService{
     
  
     private static final double pesomexico =4.61 ;
    
    @Override
    public cambioModel getCambio(double soles) {
        cambioModel cm = new cambioModel();
        cm.setTipoCambio("PESOSMEXICO");
        cm.setSoles(soles);
        cm.setCambio(soles*pesomexico);
        return cm;
          
    }
}
