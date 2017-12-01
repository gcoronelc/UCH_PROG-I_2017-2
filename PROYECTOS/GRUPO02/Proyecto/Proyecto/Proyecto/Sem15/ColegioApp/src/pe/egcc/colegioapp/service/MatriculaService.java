
package pe.egcc.colegioapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.colegioapp.db.AccesoDB;
import pe.egcc.colegioapp.model.Combo;
import pe.egcc.colegioapp.model.Matriculas;


public class MatriculaService {
    
     public List<Matriculas> leerMatriculados(int grado,int seccion,int periodo, int nivel) {
    List<Matriculas> matriculas = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select s.estudiante,"          
              + " s.apellido ,s.nombre,s.dni ,s.email, s.telefono "             
              + "from estudiante s " 
              + "where periodo = ? "
              + "and nivel =  ?"
              + " and  grado = ?"
              + " and seccion =  ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setInt(1, periodo);
      pstm.setInt(2, nivel);
      pstm.setInt(3, grado);
      pstm.setInt(4, seccion);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
      Matriculas matricula = new Matriculas(); 
      
       matricula.setEstudiante(rs.getInt("estudiante"));
        matricula.setApellido(rs.getString("apellido"));
        matricula.setNombre(rs.getString("nombre"));
        matricula.setDni(rs.getInt("dni"));
      matricula.setEmail(rs.getString("email"));
        matricula.setTelefono(rs.getInt("telefono"));
        matriculas.add(matricula);
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
    return matriculas;
  }

 
  
    
    public List<Combo> leerPeriodos() {
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

  public List<Combo> leerNivel() {
    List<Combo> nivel = new ArrayList<>();
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
        nivel.add(combo);
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
    return nivel;
  }

    public List<Combo> leerSeccion() {
          List<Combo> seccion = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select seccion, nombre from seccion";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Combo combo = new Combo();
        combo.setCode(rs.getInt("seccion"));
        combo.setLabel(rs.getInt("seccion") + " - " + rs.getString("nombre"));
        seccion.add(combo);
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
    return seccion;
  }
  
    

    public List<Combo> leerGrado() {
        List<Combo> grado = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select grado, nombre from grado";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        Combo combo = new Combo();
        combo.setCode(rs.getInt("grado"));
        combo.setLabel(rs.getInt("grado") + " - " + rs.getString("nombre"));
        grado.add(combo);
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
    return grado;
  }

}
    

