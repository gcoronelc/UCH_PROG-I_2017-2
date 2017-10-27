package pe.egcc.colegioapp.prueba;

import java.sql.Connection;
import pe.egcc.colegioapp.db.AccesoDB;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
   
    try {
      Connection cn = AccesoDB.getConnection();
      System.out.println("ok");
      cn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }

  
}
