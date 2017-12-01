
package pe.egcc.colegioapp.controller;
import java.util.List;
import pe.egcc.colegioapp.model.Combo;
import pe.egcc.colegioapp.model.Estado;
import pe.egcc.colegioapp.service.MatriculaService;
import pe.egcc.colegioapp.util.UtilView;
import pe.egcc.colegioapp.model.Combo;
import pe.egcc.colegioapp.model.Matriculas;


public class MatriculaController {
     private MatriculaService matriculaService;
     
     
public List<Matriculas> leerMatriculados(int grado,int seccion,int periodo, int nivel) {
    return matriculaService.leerMatriculados(grado,seccion,periodo, nivel);
  }
  public MatriculaController() {
         matriculaService = new MatriculaService();
    }
  public List<Combo> leerPeriodos() {
    return matriculaService.leerPeriodos();
  }

  public List<Combo> leerNivel() {
    return matriculaService.leerNivel();
  }
    
       public List<Combo> leerSeccion() {
      return matriculaService.leerSeccion();
    }

    public List<Combo> leerGrado() {
        return matriculaService.leerGrado();
        
    }

   
    }




    

