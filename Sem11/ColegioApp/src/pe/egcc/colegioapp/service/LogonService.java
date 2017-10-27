package pe.egcc.colegioapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.egcc.colegioapp.db.AccesoDB;
import pe.egcc.colegioapp.model.Usuario;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @email gcoronelc@gmail.com
 */
public class LogonService {

  public Usuario validarUsuario(String usuario, String clave) {
    Usuario bean = null;
    // Inicio del proceso
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select idempleado, idrol,"
              + "usuario, estado, 'no se' clave "
              + "from usuario "
              + "where usuario = ? "
              + "and clave = SHA(?) ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if( rs.next() ){
        bean = new Usuario();
        bean.setIdempleado(rs.getInt("idempleado"));
        bean.setIdrol(rs.getInt("idrol"));
        bean.setEstado(rs.getInt("estado"));
        bean.setUsuario(rs.getString("usuario"));
        bean.setClave(rs.getString("clave"));
      }
      rs.close();
      pstm.close();
      if(bean == null){
        throw new SQLException("Datos incorrectos.");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      String msg = "No se tiene acceso a la BD.";
      throw new RuntimeException(msg);
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    // Fin del proceso
    return bean;
  }

}
