package pe.uch.ventaapp.controller;

import java.util.List;
import pe.uch.ventaapp.model.Item;
import pe.uch.ventaapp.service.CompFactory;


public class VentaController {

    public String[] obtenerTipos() {
        return CompFactory.obtenerTipos();
    }

    public List<Item> procesarVenta(String tipo, double total) {
        return CompFactory.obtenerComp(tipo).procesarVenta(total);
    }
    
}
