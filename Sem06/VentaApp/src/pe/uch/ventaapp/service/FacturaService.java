package pe.uch.ventaapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.uch.ventaapp.model.Item;

public class FacturaService extends CompAbstract{

    @Override
    public List<Item> procesarVenta(double total) {
        // Variables
        double consumo, impuesto, servicio, totalGeneral;
        // Proceso
        consumo = total / (1 + IGV);
        impuesto = total - consumo;
        servicio = total * SERVICIO;
        totalGeneral = total + servicio;
        // Reporte
        List<Item> repo = new ArrayList<>();
        repo.add(new Item("Consumo", consumo));
        repo.add(new Item("Impuesto", impuesto));
        repo.add(new Item("Total", total));
        repo.add(new Item("Servicio", servicio));
        repo.add(new Item("Total General", totalGeneral));
        return repo;
    }
    
}
