package pe.uch.factorymethod.service;

import pe.uch.factorymethod.model.trianguloModel;

public class Escaleno extends trianguloModel {

    public Escaleno(int anguloA, int anguloB, int anguloC) {
        super(anguloA, anguloB, anguloC);
    }

    @Override
    public String getDescripcion() {
 return "soy un triangulo Escaleno" ;
    }


}
