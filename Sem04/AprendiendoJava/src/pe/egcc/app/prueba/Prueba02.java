package pe.egcc.app.prueba;

public class Prueba02 {
    
    public String dios = "Esta en todas partes.";
        
    public static void main(String[] args) {
        
        String s = String.valueOf(3456.78);
        
        String nombre = new String("Gustavo");
        
        System.out.println(nombre + "\t" + s);
        
        Prueba02 o = new Prueba02();
        System.out.println("Dios: " + o.dios);
        
    }
    
}
