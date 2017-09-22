package pe.uch.ventaapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.uch.ventaapp.model.Item;

public class BoletaService extends CompAbstract{

    @Override
    public List<Item> procesarVenta(double total) {
        // Variables
        double servicio, totalGeneral;
        // Proceso
        servicio = total * SERVICIO;
        totalGeneral = total + servicio;
        // Reporte
        List<Item> repo = new ArrayList<>();
        repo.add(new Item("Total", total));
        repo.add(new Item("Servicio", servicio));
        repo.add(new Item("Total General", totalGeneral));
        return repo;
    }
    
}
