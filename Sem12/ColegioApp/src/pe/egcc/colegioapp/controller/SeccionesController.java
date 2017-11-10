package pe.egcc.colegioapp.controller;

import java.util.List;
import pe.egcc.colegioapp.model.Combo;
import pe.egcc.colegioapp.model.Seccion;
import pe.egcc.colegioapp.service.ColegioService;

public class SeccionesController {

    private ColegioService colegioService;

    public SeccionesController() {
        colegioService = new ColegioService();
    }
    
    public List<Combo> leerPeriodosProgramar(){
        return colegioService.leerPeriodosProgramar();
    }
    
    public List<Combo> leerNiveles(){
        return colegioService.leerNiveles();
    }
    
    public List<Seccion> leerSecciones(int periodo, int nivel){
        return colegioService.leerSecciones(periodo, nivel);
    }
}
