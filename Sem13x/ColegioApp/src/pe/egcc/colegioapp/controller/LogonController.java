package pe.egcc.colegioapp.controller;

import pe.egcc.colegioapp.service.LogonService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @email gcoronelc@gmail.com
 */
public class LogonController {

  public void validar(String usuario, String clave) {
    LogonService logonService = new LogonService();
    logonService.validarUsuario(usuario, clave);
  }
  
}
