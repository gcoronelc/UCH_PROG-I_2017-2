package pe.uch.ventaapp.service;

import java.util.List;
import pe.uch.ventaapp.model.Item;

public abstract class CompAbstract {
    
    protected final double IGV = 0.18;
    protected final double SERVICIO = 0.10;
    
    public abstract List<Item> procesarVenta(double total);
        
}
