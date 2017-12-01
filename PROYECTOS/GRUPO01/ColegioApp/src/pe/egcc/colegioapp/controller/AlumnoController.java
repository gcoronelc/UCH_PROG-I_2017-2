/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.colegioapp.controller;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import pe.egcc.colegioapp.model.Alumno;
import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.service.AlumnoService;
import pe.egcc.colegioapp.util.UtilView;

/**
 *
 * @author Bengy
 */
public class AlumnoController {

    private AlumnoService alumnoService;

    public AlumnoController() {
        alumnoService = new AlumnoService();
    }

   
    
    public LinkedList<Alumno> registroAlumno(Alumno p) throws ClassNotFoundException, SQLException 
    {
        return AlumnoService.ListaAlumno(p);
    }
}
