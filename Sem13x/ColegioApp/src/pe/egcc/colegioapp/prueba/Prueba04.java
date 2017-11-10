package pe.egcc.colegioapp.prueba;

import java.util.Random;

public class Prueba04 {

  public static void main(String[] args) {
    Random random = new Random();
    int cont = 1000;
    while(cont > 0){
      System.out.println(cont);
      int num = random.nextInt(5);
      cont--;
      if(cont == 0){
        System.out.println(num);
      }
    }
  }
  
}
