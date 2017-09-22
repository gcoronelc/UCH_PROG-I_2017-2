package pe.uch.ventaapp.prueba;

import java.util.List;
import pe.uch.ventaapp.model.Item;
import pe.uch.ventaapp.service.CompAbstract;
import pe.uch.ventaapp.service.CompFactory;

public class Prueba02 {

    public static void main(String[] args) {
        // Dato
        double total = 4567.89;
        
        // Proceso
        CompAbstract comp = CompFactory.obtenerComp(CompFactory.BOLETA);
        List<Item> repo = comp.procesarVenta(total);
        
        // Reporte
        repo.stream().forEach((item) -> {
            System.out.println(item.getConcepto() + "     " + item.getValor());
        });
    }
    
}
