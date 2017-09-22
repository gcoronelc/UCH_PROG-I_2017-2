package pe.uch.ventaapp.prueba;

import java.util.List;
import pe.uch.ventaapp.model.Item;
import pe.uch.ventaapp.service.BoletaService;
import pe.uch.ventaapp.service.CompAbstract;

public class Prueba01 {

    public static void main(String[] args) {
        // Dato
        double total = 4567.89;
        
        // Proceso
        CompAbstract comp = new BoletaService();
        List<Item> repo = comp.procesarVenta(total);
        
        // Reporte
        for (Item item : repo) {
            System.out.println(item.getConcepto() + "     " + item.getValor());
        }
    }
    
}
