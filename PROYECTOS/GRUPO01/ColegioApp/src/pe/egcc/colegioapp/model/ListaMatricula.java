/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.colegioapp.model;

import java.sql.Date;
import pe.egcc.colegioapp.util.Formatos;

/**
 *
 * @author EDWARD
 */
public class ListaMatricula {

    private int idmatricula;
    private int idalumno, grado, seccion, periodo;
    private String nombres;
    private Date fechanac;
    private int nivel;

    public ListaMatricula() {
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ListaMatricula(int idmatricula, int idalumno, int grado, int seccion, int periodo, String nombres, Date fechanac, int nivel) {
        this.idmatricula = idmatricula;
        this.idalumno = idalumno;
        this.grado = grado;
        this.seccion = seccion;
        this.periodo = periodo;
        this.nombres = nombres;
        this.fechanac = fechanac;
        this.nivel = nivel;
    }
    
    public String[] DatostoArray() {
        String[] aux = new String[7];
        aux[0] = String.valueOf(idmatricula);
        aux[1] = String.valueOf(idalumno);
        aux[2] = nombres;
        aux[3] = String.valueOf(grado);
        aux[4] = String.valueOf(seccion);
        aux[5] = String.valueOf(periodo);
        aux[5] = String.valueOf(nivel);
        aux[6] = Formatos.sdtfecha.format(fechanac);

        return aux;
    }

}
