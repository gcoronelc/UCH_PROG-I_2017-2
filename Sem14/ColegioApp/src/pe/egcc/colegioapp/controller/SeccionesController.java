package pe.egcc.colegioapp.controller;

import java.util.List;
import pe.egcc.colegioapp.model.Combo;
import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.model.Seccion;
import pe.egcc.colegioapp.service.ColegioService;
import pe.egcc.colegioapp.util.UtilView;

public class SeccionesController {

  private ColegioService colegioService;

  public SeccionesController() {
    colegioService = new ColegioService();
  }

  public List<Combo> leerPeriodosProgramar() {
    return colegioService.leerPeriodosProgramar();
  }

  public List<Combo> leerNiveles() {
    return colegioService.leerNiveles();
  }

  public List<Combo> leerGrados(int nivel) {
    return colegioService.leerGrados(nivel);
  }

  public List<Seccion> leerSecciones(int periodo, int nivel) {
    return colegioService.leerSecciones(periodo, nivel);
  }

  public Estado procesarSeccion(String accion, Seccion seccion) {
    Estado estado = null;
    switch (accion) {
      case UtilView.CRUD_NUEVO:
        estado = colegioService.crearSeccion(seccion.getNombre(),
                seccion.getPeriodo(), seccion.getGrado(), 1);
        break;
    }
    return estado;
  }
  
}
