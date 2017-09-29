package pe.uch.billetesapp.prueba;

import pe.uch.billetesapp.model.Item;
import pe.uch.billetesapp.service.BilleteService;

public class Prueba01 {

    public static void main(String[] args) {
        // Dato
        int importe = 879;
        // Proceso
        BilleteService service = new BilleteService();
        Item[] repo = service.distribuirDinero(importe);
        // Reporte
        System.out.println("Importe: " + importe);
        for (Item item : repo) {
            System.out.println(item.getTipo() 
                    + "\t\t" + item.getValor()
                    + "\t" + item.getCant()
                    + "\t" + item.getImporte());
        }
    }
}
