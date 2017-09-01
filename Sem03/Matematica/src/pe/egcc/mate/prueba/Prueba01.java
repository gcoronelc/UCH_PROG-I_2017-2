package pe.egcc.mate.prueba;

import pe.egcc.mate.service.MateService;

public class Prueba01 {


    public static void main(String[] args) {
        // Dato
        int n1 = 13, n2 = 15;
        // Proceso
        MateService service = new MateService();
        int pr = service.promediar(n1, n2);
        // Reporte
        System.out.println("PR = " + pr);
    }
}
