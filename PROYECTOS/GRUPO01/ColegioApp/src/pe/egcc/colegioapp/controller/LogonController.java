package pe.egcc.colegioapp.controller;

import pe.egcc.colegioapp.model.Usuario;
import pe.egcc.colegioapp.service.LogonService;
import pe.egcc.colegioapp.util.Memoria;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @email gcoronelc@gmail.com
 */
public class LogonController {

  public void validar(String usuario, String clave) {
    LogonService logonService = new LogonService();
    Usuario bean = logonService.validarUsuario(usuario, clave);
    Memoria.put("usuario", bean);
  }
  
}
