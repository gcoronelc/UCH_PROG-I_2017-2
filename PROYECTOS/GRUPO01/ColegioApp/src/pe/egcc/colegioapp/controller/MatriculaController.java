/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.colegioapp.controller;

import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.model.MatriculaModel;
import pe.egcc.colegioapp.model.Seccion;
import pe.egcc.colegioapp.service.MatriculaAlumnos;
import pe.egcc.colegioapp.util.UtilView;

/**
 *
 * @author Bengy
 */
public class MatriculaController {
    private MatriculaAlumnos  mA;
    public Estado procesarSeccion(String accion, MatriculaModel mM) {
    Estado estado = null;
    switch (accion) {
        
      case UtilView.CRUD_NUEVO:
        estado = mA.crematricula(mM.getIdmatricula(), mM.getNivel(), mM.getPeriodo(), mM.getSeccion(), mM.getGrado());
        break;
        
      case UtilView.CRUD_EDITAR:
      //  estado = colegioService.modificarSeccion(seccion);
        break;
        
      case UtilView.CRUD_ELIMINAR:
        //estado = colegioService.eliminarSeccion(seccion.getSeccion());
        break;
        
    }
    return estado;
  }
}
