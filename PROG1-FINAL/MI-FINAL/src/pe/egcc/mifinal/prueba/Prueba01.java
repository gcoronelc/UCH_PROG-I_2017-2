package pe.egcc.mifinal.prueba;

import java.sql.Connection;
import pe.egcc.mifinal.db.AccesoDB;

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
