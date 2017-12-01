package pe.egcc.mifinal.controller;

import java.util.List;
import java.util.Map;
import pe.egcc.mifinal.model.Combo;
import pe.egcc.mifinal.model.Usuario;
import pe.egcc.mifinal.service.FinalService;
import pe.egcc.mifinal.util.Memoria;

public class FinalController {

  private FinalService finalService;

  public FinalController() {
    finalService = new FinalService();
  }

  public void validarUsuario(String usuario, String clave) {
    Usuario bean;
    bean = finalService.validarUsuario(usuario, clave);
    Memoria.put("usuario", bean);
  }

  public List<Combo> leerTipos() {
    return finalService.leerTipos();
  }

  public List<Combo> leerPublicaciones(String tipo) {
    return finalService.leerPublicaciones(tipo);
  }

  public List<Map<String, Object>> leerVentas(String publicacion) {
    return finalService.leerVentas(publicacion);
  }
}
