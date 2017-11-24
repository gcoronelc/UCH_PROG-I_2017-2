package pe.egcc.colegioapp.prueba;

import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.service.ColegioService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {

    public static void main(String[] args) {
        try {
            
            // Datos
            int periodo = 2019;
            int grado = 1022;
            String nombre = "Los Cocodrilos";
            int vacantes = 25;

            // Proceso
            ColegioService colegioService;
            colegioService = new ColegioService();
            Estado estado = colegioService.crearSeccion(nombre, periodo, grado, vacantes);
            // Reporte
            System.out.println("Code: " + estado.getCode());
            System.out.println("Mensaje: " + estado.getTexto());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
