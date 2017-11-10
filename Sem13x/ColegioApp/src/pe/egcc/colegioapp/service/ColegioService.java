package pe.egcc.colegioapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.egcc.colegioapp.db.AccesoDB;
import pe.egcc.colegioapp.model.Estado;

public class ColegioService {
    
    public  Estado crearSeccion(String nombre, int periodo, int grado, int vacantes){
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
        } finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return estado;
    }
}
