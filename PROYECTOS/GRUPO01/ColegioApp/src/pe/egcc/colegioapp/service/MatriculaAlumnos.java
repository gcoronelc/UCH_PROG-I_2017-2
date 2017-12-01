/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.colegioapp.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
import pe.egcc.colegioapp.db.AccesoDB;
import pe.egcc.colegioapp.model.Alumno;
import pe.egcc.colegioapp.model.Combo;
import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.model.ListaMatricula;
import pe.egcc.colegioapp.model.MatriculaModel;


/**
 *
 * @author Bengy
 */
public class MatriculaAlumnos {

    public Estado crematricula(int estudiante, int nivel,
            int periodo, int seccion, int grado) {
        Estado estado;
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            // Inicio de proceso
            String sql = "insert into matricula2(estudiante,"
                    + "nivel,periodo,seccion,grado) values(?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, estudiante);
            pstm.setInt(2, nivel);
            pstm.setInt(3, periodo);
            pstm.setInt(4, seccion);
            pstm.setInt(5, grado);
            pstm.executeUpdate();
            pstm.close();

            sql = "SELECT LAST_INSERT_ID() id";
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            int id = rs.getInt("id");

            // Fin de proceso
            cn.commit();
            estado = new Estado(1, "Proceso ejecutado correctamente. matricula = " + id + ".");
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

    /*
    private static boolean Nuevo(MatriculaModel p) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "insert into matricula values(null,?,?,?,?,?,?)";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, p.getEstudiante());
            ps.setInt(2, p.getNivel());
            ps.setString(3, p.getPeriodo());
            ps.setString(4, p.getSeccion());
             ps.setInt(5, p.getGrado());
            ps.setString(6, p.getFecha());
            r = ps.executeUpdate();
        }
        return r == 1;
    }
    
    private static boolean ActualizaMatri(MatriculaModel p) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "update matricula set estudiante=?,nivel=?,periodo=?,seccion=?,grado=?,fecha=?"
                + " where matricula=?";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, p.getEstudiante());
            ps.setInt(2, p.getNivel());
            ps.setString(3, p.getPeriodo());
            ps.setString(4, p.getSeccion());
            ps.setInt(5, p.getGrado());
            ps.setString(6, p.getFecha());
            ps.setInt(7, p.getIdmatricula());
            r = ps.executeUpdate();
        }
        return r == 1;
    }
     */
    private static LinkedList<ListaMatricula> Lista(int periodo, int nivel) throws ClassNotFoundException, SQLException {
        int r = 0;
        LinkedList<ListaMatricula> Lista = new LinkedList<>();
        String sql = "select m.matricula,a.estudiante,concat(a.nombre,' ',a.apellido),"
                + "concat(m.periodo),m.seccion,a.fechaRegistro from matricula m"
                + " inner join estudiante a on a.estudiante=m.estudiante"
                + " inner join nivel n on n.nivel=m.nivel"
                + " where n.nivel=?";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, periodo);
            ps.setInt(2, nivel);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Lista.add(new ListaMatricula(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                            rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getDate(7), rs.getInt(8)));
                }
            }
            return Lista;
        }
    }

    private static LinkedList<Combo> Combo2() throws ClassNotFoundException, SQLException {
        int r = 0;
        LinkedList<Combo> Lista = new LinkedList<>();
        String sql = "select nivel,concat(nombre)  from nivel";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Lista.add(new Combo(rs.getInt(1), rs.getString(2)));
                }
            }
        }
        return Lista;
    }

    private static boolean Existe(MatriculaModel p) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "select ifnull(count(matricula),0) from matricula2 where matricula=?";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, p.getIdmatricula());
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                r = rs.getInt(1);
            }
        }
        return r > 0;
    }

    public static LinkedList<Combo> CargarCombo() throws ClassNotFoundException, SQLException {
        return Combo2();
    }

    public static LinkedList<ListaMatricula> ListaMatriculas(int idperiodo, int idnivel) throws ClassNotFoundException, SQLException {
        return Lista(idperiodo, idnivel);
    }
    
    
    private static LinkedList<Alumno> Lista2(Alumno p) throws ClassNotFoundException, SQLException {
        int r = 0;
        LinkedList<Alumno> Lista = new LinkedList<>();
        String sql = "select * from estudiante where apellido like concat(?,'%') and idestudiante not in (select idestudiante from matricula2)";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, p.getApellido());

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Lista.add(new Alumno(rs.getInt(1), rs.getString(2), rs.getString(3),
                            rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7)));
                    }
            }
        }
        return Lista;
    }

    public static LinkedList<Alumno> ListaAlumnoNoMatriculados(Alumno p) throws ClassNotFoundException, SQLException {
        return Lista2(p);
    }
}
