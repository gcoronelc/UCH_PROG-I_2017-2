
package pe.uch.factorymethod.service;

import pe.uch.factorymethod.model.trianguloModel;

public class trianguloFactory implements TrianguloFactoryMelthod{

    @Override
    public trianguloModel createTriangulo(int ladoA, int ladoB, int ladoC) {
        
        if ((ladoA == ladoB)&& (ladoA == ladoC)){
            return new Equilatero(ladoA, ladoB, ladoC);
        } 
        else if ((ladoA != ladoB)&& (ladoA != ladoC)&& (ladoB != ladoC)) {
            return new Escaleno(ladoA, ladoB, ladoC);
        } else {
            return new Isosceles(ladoA, ladoB, ladoC);
        }
    }
  
    
}
