package pe.egcc.colegioapp.prueba;

import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.service.ColegioService;
import pe.egcc.colegioapp.service.MatriculaAlumnos;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @email gcoronelc@gmail.com
 */
public class Prueba04 {

    public static void main(String[] args) {
        try {
            
            // Datos
            int idmatricula;
int estudiante=01;
int nivel=101;
int periodo=2018;
int seccion=111;
int grado=10;

            // Proceso
            MatriculaAlumnos matriculaAlumnos;
            matriculaAlumnos = new MatriculaAlumnos();
            Estado estado = matriculaAlumnos.crematricula(estudiante, nivel, periodo, seccion, grado);
            // Reporte
            System.out.println("Code: " + estado.getCode());
            System.out.println("Mensaje: " + estado.getTexto());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
