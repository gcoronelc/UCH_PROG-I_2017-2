package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

public class Prueba03 {

    public static void main(String[] args) {
        
        Producto p1 = new Producto();
        
        p1.setNombre("Auto");
        p1.setPrecio(33000.00);
        
        mostrar( p1 );
        
    }

    private static void mostrar(Producto p1) {
        System.out.println("================================");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Precio: " + p1.getPrecio());
    }
    
}
