package pe.grupo3.java8.lambda;

/**
 * @author Lunarejo aponte Luis
 * @author Romero Andrade Claudia
 * @author Lasso Amado Misael
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

	public void ordernar() {
		List<String> lista = new ArrayList<>();
		lista.add("Luis");
		lista.add("Claudia");
		lista.add("Misael");

         
		//Lambda
                Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
                
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}
        
	public void calcular(int n1, int n2) {            
		Operacion operacion = ( double x,double y) -> (x+y)/2;
		System.out.println(operacion.calcular(n1, n2));
	}
}
