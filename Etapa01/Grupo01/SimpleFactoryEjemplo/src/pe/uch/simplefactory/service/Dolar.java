
package pe.uch.simplefactory.service;

import pe.uch.simplefactory.model.cambioModel;

public class Dolar implements cambioService {

    private static final double dolar =3 ;
    
    @Override
    public cambioModel getCambio(double soles) {
        cambioModel cm = new cambioModel();
        cm.setTipoCambio("DOLARES");
        cm.setSoles(soles);
        cm.setCambio(soles/dolar);
        return cm;
          
    }
}
