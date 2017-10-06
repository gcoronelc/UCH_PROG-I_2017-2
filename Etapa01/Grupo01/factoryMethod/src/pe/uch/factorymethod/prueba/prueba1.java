
package pe.uch.factorymethod.prueba;

import pe.uch.factorymethod.model.trianguloModel;
import pe.uch.factorymethod.service.TrianguloFactoryMelthod;
import pe.uch.factorymethod.service.trianguloFactory;

public class prueba1 {
    
    public static void main(String[] args) {
        TrianguloFactoryMelthod  factory  = new trianguloFactory();
        trianguloModel triangulo = factory.createTriangulo(20, 90, 10);
        System.err.println(triangulo.getDescripcion());
    }
}
