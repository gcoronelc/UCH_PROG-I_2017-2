package pe.uch.simplefactory.prueba;

import pe.uch.simplefactory.model.cambioModel;
import pe.uch.simplefactory.service.cambioFactory;

public class prueba1 {
  
    public static void main(String[] args) {
        cambioModel cm = cambioFactory.getCambio(1, "Pesomexicano");
        System.out.println("usted a cambiado soles a " + cm.getTipoCambio());
        System.out.println("valor en soles: "+ cm.getSoles());
        System.out.println("Usted tiene "+ cm.getCambio()+ " " + cm.getTipoCambio());
    }
}
