package pe.uch.factorymethod.service;

import pe.uch.factorymethod.model.trianguloModel;

public class Isosceles extends trianguloModel {

    public Isosceles(int anguloA, int anguloB, int anguloC) {
        super(anguloA, anguloB, anguloC);
    }

    @Override
    public String getDescripcion() {
 return "soy un triangulo Isosceles " ;
    }

 

}
