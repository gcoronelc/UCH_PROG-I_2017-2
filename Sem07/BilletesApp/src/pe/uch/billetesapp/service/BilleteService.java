package pe.uch.billetesapp.service;

import pe.uch.billetesapp.model.Item;

public class BilleteService {

    public Item[] distribuirDinero(int total){
        // Variable
        Item[] repo;
        // Preperar la variable repo
        repo = prepararVariable();
        // Procesar el importe
        for (Item item : repo) {
            if(total <= 0){
                break;
            }
            // Datos del item
            int cant = total / item.getValor();
            int importe = item.getValor() * cant;
            item.setCant(cant);
            item.setImporte(importe);
            // Actualizar el total
            total = total % item.getValor();
        }
        // Retorno
        return repo;
    }

    private Item[] prepararVariable() {
        Item[] repo = {
            new Item("BILLETE", 200),
            new Item("BILLETE", 100),
            new Item("BILLETE", 50),
            new Item("BILLETE", 20),
            new Item("BILLETE", 10),
            new Item("MONEDA", 5),
            new Item("MONEDA", 2),
            new Item("MONEDA", 1),
        };
        return repo;
    }
}
