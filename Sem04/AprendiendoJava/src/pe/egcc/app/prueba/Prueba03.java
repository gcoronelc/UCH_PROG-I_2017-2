package pe.egcc.app.prueba;

import javax.swing.JFrame;

public class Prueba03 {

    private static String yo;
    
    static {
        yo = "Gustavo Coronel";
    }
    
    public static void main(String[] args) {
        System.out.println("YO: " + yo);
        System.out.println("MAXIMIZED_BOTH: " + JFrame.MAXIMIZED_BOTH);
    }
    
}
