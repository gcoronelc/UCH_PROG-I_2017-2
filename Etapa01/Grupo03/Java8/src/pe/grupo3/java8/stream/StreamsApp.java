package pe.grupo3.java8.stream;

/**
 * @author Lunarejo aponte Luis
 * @author Romero Andrade Claudia
 * @author Lasso Amado Misael
 */

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

    private final List<String> lista;
    private final List<String> numeros;

    public StreamsApp() {
        lista = new ArrayList<>();
        lista.add("Luis");
        lista.add("claudia");
        lista.add("Misael");
       // son 6

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
    }

    public void filtrar(String letra) {
        lista.stream().filter(x -> x.startsWith(letra)).forEach(System.out::println);
    }

    public void ordenar() {
        lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
        
    }

    public void transformarString_Entero() {
        numeros.stream().map(x -> Integer.parseInt(x)).forEach(System.out::println);
    }
    
    public void transformarMayusculas() {
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public void limitar(int r1) {
        lista.stream().limit(r1).forEach(System.out::println);
    }

    public void contar() {
        System.out.println(lista.size());
        
        long x = lista.stream().count();
        System.out.println(x);
    }

 
}
