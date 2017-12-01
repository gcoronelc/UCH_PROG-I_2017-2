package pe.egcc.mifinal.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.egcc.mifinal.db.AccesoDB;
import pe.egcc.mifinal.model.Combo;
import pe.egcc.mifinal.model.Usuario;

public class FinalService {

  public List<Combo> leerTipos() {
    List<Combo> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select idtipo, descripcion from tipo ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        String code = rs.getString("idtipo");
        String label = rs.getString("descripcion");
        Combo combo = new Combo(code, label);
        lista.add(combo);
      }
      rs.close();
      pstm.close();
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
    return lista;
  }

  public List<Combo> leerPublicaciones(String tipo) {
    List<Combo> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select idpublicacion, titulo "
              + "from publicacion "
              + "where idtipo = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, tipo);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        String code = rs.getString("idpublicacion");
        String label = rs.getString("titulo");
        Combo combo = new Combo(code, label);
        lista.add(combo);
      }
      rs.close();
      pstm.close();
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
    return lista;
  }

  public List<Map<String, Object>> leerVentas(String publicacion) {
    List<Map<String, Object>> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select idventa, cliente, fecha, "
              + "idempleado, idpublicacion, cantidad, "
              + "precio, dcto, subtotal, impuesto, total "
              + "from venta  "
              + "where idpublicacion = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, publicacion);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Map<String,Object> rec = new HashMap<>();
        rec.put("idventa", rs.getInt("idventa"));
        rec.put("cliente", rs.getString("cliente"));
        rec.put("total", rs.getDouble("total"));
        lista.add(rec);
      }
      rs.close();
      pstm.close();
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
    return lista;
  }

  public Usuario validarUsuario(String usuario, String clave) {
    Usuario bean = null;
    // Inicio del proceso
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select idempleado, usuario,"
              + "'no se' clave, activo "
              + "from usuario "
              + "where usuario = ? and clave = SHA(?) "
              + "and  activo = 1";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
        bean = new Usuario();
        bean.setIdempleado(rs.getInt("idempleado"));
        bean.setUsuario(rs.getString("usuario"));
        bean.setActivo(rs.getInt("activo"));
        bean.setClave(rs.getString("clave"));
      }
      rs.close();
      pstm.close();
      if (bean == null) {
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
