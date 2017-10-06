
package pe.uch.simplefactory.service;

import pe.uch.simplefactory.model.cambioModel;

public class cambioFactory {
   
    public static cambioModel getCambio(double soles , String tipo){
        if(tipo.equals("Dolar")){
            return new Dolar().getCambio(soles);
        }
         if(tipo.equals("Euro")){
            return new Euro().getCambio(soles);
        }
          if(tipo.equals("Peso")){
            return new Pesos().getCambio(soles);
        }
           if(tipo.equals("Pesomexicano")){
            return new pesosMexiicoo().getCambio(soles);
        }
          return null;
    }
}
