package pe.egcc.colegioapp.prueba;

import pe.egcc.colegioapp.model.Usuario;
import pe.egcc.colegioapp.service.LogonService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    try {
      // Datos
      String usuario = "anita";
      String clave = "anita";
      
      // Proceso
      LogonService logonService = new LogonService();
      Usuario bean = logonService.validarUsuario(usuario, clave);
      
      // Reporte
      System.out.println("Usuario: " + bean.getUsuario());
      System.out.println("Clave: " + bean.getClave());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
