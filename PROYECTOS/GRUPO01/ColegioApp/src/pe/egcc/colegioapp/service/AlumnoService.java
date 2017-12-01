package pe.egcc.colegioapp.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import pe.egcc.colegioapp.db.AccesoDB;
import pe.egcc.colegioapp.model.Alumno;
import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.model.Seccion;
import pe.egcc.colegioapp.view.RegistrarAlumno;

public class AlumnoService {
/*
    public Estado registrarAlumno(String apellido, String nombre, String dni,
            String email, String telefono, String sexo, String fechaRegistro) {
        Estado estado;
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            // Inicio de proceso

            String sql = "insert into ESTUDIANTE(apellido,nombre,"
                    + "dni,email,telefono,sexo,fecha) values(?,?,?,?,?,?,?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, apellido);
            pstm.setString(2, nombre);
            pstm.setString(3, dni);
            pstm.setString(4, email);
            pstm.setString(5, telefono);
            pstm.setString(6, sexo);
            pstm.setString(7, fechaRegistro);
            pstm.executeUpdate();
            pstm.close();

            sql = "SELECT LAST_INSERT_ID() id";
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            int id = rs.getInt("id");

            // Fin de proceso
            cn.commit();
            estado = new Estado(1, "Proceso ejecutado correctamente - ID de estudiante = " + id + ".");
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
    }*/

    private static boolean Nuevo(Alumno p) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "insert into estudiante values(null,?,?,?,?,?,?);";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, p.getApellido());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getTelefono());
            ps.setString(5, p.getSexo());
            ps.setDate(6, (Date) p.getFechaRegistro());
            r = ps.executeUpdate();
        }
        return r == 1;
    }

    private static boolean Actualizar(Alumno p) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "update estudiante set apellido=?,nombre=?,dni=?,telefono=?,sexo=?,"
                + "fechaRegistro=?"
                + " where estudiante=?";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getTelefono());
            ps.setString(5, p.getSexo());
            ps.setDate(6, (Date) p.getFechaRegistro());
            r = ps.executeUpdate();
        }
        return r == 1;
    }

    private static LinkedList<Alumno> lista(Alumno p) throws ClassNotFoundException, SQLException {

        LinkedList<Alumno> Lista = new LinkedList<>();
        String sql = "select * from estudiante where apellido like concat(?,'%')";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, p.getApellido());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Lista.add(new Alumno(rs.getInt(1),
                            rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getString(5), rs.getString(6), rs.getDate(7)));
                }
            }
        }
        return Lista;
    }

    //Eliminar Alumno
    private static boolean eliminarAlumno(Alumno p) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "delete from estudiante where estudiante=?";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, p.getEstudiante());
            r = ps.executeUpdate();
        }
        return r == 1;
    }

    private static boolean Existe(Alumno p) throws ClassNotFoundException, SQLException {
        int r = 0;
        //aca habia un problema
        String sql = "select ifnull(count(idestudiante),0) from estudiante where idestudiante=?";
        try (Connection cn = AccesoDB.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, p.getEstudiante());
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                r = rs.getInt(1);
            }
        }

        return r > 0;
    }

    public static boolean Guardar(Alumno p) throws ClassNotFoundException, SQLException {
        if (Existe(p)) {
            return Actualizar(p);
        } else {
            return Nuevo(p);
        }
    }

    public static LinkedList<Alumno> ListaAlumno(Alumno p) throws ClassNotFoundException, SQLException {
        return lista(p);
    }

    public static boolean Eliminar(Alumno p) throws ClassNotFoundException, SQLException {
        return eliminarAlumno(p);
    }

}
