package pe.egcc.colegioapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.colegioapp.db.AccesoDB;
import pe.egcc.colegioapp.model.Combo;
import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.model.Seccion;

public class ColegioService {

  public Estado eliminarSeccion(int seccion) {
    Estado estado;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      // Inicio de proceso

      String sql = "delete from SECCION "
              + "where seccion = ? and matriculados = 0";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, seccion);
      int filas = pstm.executeUpdate();
      pstm.close();

      if(filas != 1){
          throw new Exception("Error en el proceso.");
      }
      
      // Fin de proceso
      cn.commit();
      estado = new Estado(1, "Proceso ejecutado correctamente.");
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      estado = new Estado(-1, e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return estado;
  }
  
  public Estado modificarSeccion(Seccion seccion) {
    Estado estado;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      // Inicio de proceso

      String sql = "update SECCION "
              + "set nombre = ?, vacantes = ? "
              + "where seccion = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, seccion.getNombre());
      pstm.setInt(2, seccion.getVacantes());
      pstm.setInt(3, seccion.getSeccion());
      int filas = pstm.executeUpdate();
      pstm.close();

      if(filas != 1){
          throw new Exception("Error en el proceso.");
      }
      
      // Fin de proceso
      cn.commit();
      estado = new Estado(1, "Proceso ejecutado correctamente.");
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      estado = new Estado(-1, e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return estado;
  }
  
  public Estado crearSeccion(String nombre, int periodo, int grado, int vacantes) {
    Estado estado;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      // Inicio de proceso

      String sql = "insert into SECCION(periodo,grado,nombre,"
              + "vacantes,matriculados) values(?,?,?,?,0)";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, periodo);
      pstm.setInt(2, grado);
      pstm.setString(3, nombre);
      pstm.setInt(4, vacantes);
      pstm.executeUpdate();
      pstm.close();

      sql = "SELECT LAST_INSERT_ID() id";
      pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      rs.next();
      int id = rs.getInt("id");

      // Fin de proceso
      cn.commit();
      estado = new Estado(1, "Proceso ejecutado correctamente. SECCION = " + id + ".");
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      estado = new Estado(-1, e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return estado;
  }

  public List<Combo> leerPeriodosProgramar() {
    List<Combo> periodos = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select periodo from periodo "
              + "where fase in (1,2)";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        int periodo = rs.getInt("periodo");
        Combo combo = new Combo(periodo, periodo + "");
        periodos.add(combo);
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
    return periodos;
  }

  public List<Combo> leerNiveles() {
    List<Combo> niveles = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select nivel, nombre from nivel";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Combo combo = new Combo();
        combo.setCode(rs.getInt("nivel"));
        combo.setLabel(rs.getInt("nivel") + " - " + rs.getString("nombre"));
        niveles.add(combo);
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
    return niveles;
  }

  public List<Combo> leerGrados(int nivel) {
    List<Combo> grados = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select grado, nombre from grado where nivel = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, nivel);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Combo combo = new Combo();
        combo.setCode(rs.getInt("grado"));
        combo.setLabel(rs.getInt("grado") + " - " + rs.getString("nombre"));
        grados.add(combo);
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
    return grados;
  }

  public List<Seccion> leerSecciones(int periodo, int nivel) {
    List<Seccion> secciones = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select s.seccion, s.periodo, s.grado,"
              + "s.nombre, s.vacantes, s.matriculados "
              + "from seccion s "
              + "join grado g on s.grado = g.grado "
              + "where periodo = ? "
              + "and g.nivel =  ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, periodo);
      pstm.setInt(2, nivel);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Seccion seccion = new Seccion();
        seccion.setSeccion(rs.getInt("seccion"));
        seccion.setPeriodo(rs.getInt("periodo"));
        seccion.setGrado(rs.getInt("grado"));
        seccion.setNombre(rs.getString("nombre"));
        seccion.setVacantes(rs.getInt("vacantes"));
        seccion.setMatriculados(rs.getInt("matriculados"));
        secciones.add(seccion);
      }
      rs.close();
      pstm.close();
    } catch (SQLException e) {
      e.printStackTrace();
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
    return secciones;
  }


  

}
    

 