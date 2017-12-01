package pe.egcc.mifinal.prueba;

import pe.egcc.mifinal.model.Usuario;
import pe.egcc.mifinal.service.FinalService;

public class Prueba02 {
   public static void main(String[] args) {
    try {
      // Datos
      String usuario = "eaguero";
      String clave = "cazador";
                                                    
      // Proceso
      FinalService logonService = new FinalService();
      Usuario bean = logonService.validarUsuario(usuario, clave);
      
      // Reporte
      System.out.println("Usuario: " + bean.getUsuario());
      System.out.println("Clave: " + bean.getClave());
      System.out.println("Empleado: " + bean.getIdempleado());
      System.out.println("Activo: " + bean.getActivo());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
