package pe.egcc.colegioapp.model;

import java.sql.Date;
import pe.egcc.colegioapp.util.Formatos;

public class Alumno {

    private int estudiante;
    private String apellido;
    private String nombre;
    private String email;
    private String telefono;
    private String sexo;
    private Date fechaRegistro;

    public Alumno() {
    }

    public int getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(int estudiante) {
        this.estudiante = estudiante;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Alumno(int estudiante, String apellido, String nombre, String email, String telefono, String sexo, Date fechaRegistro) {
        this.estudiante = estudiante;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.sexo = sexo;
        this.fechaRegistro = fechaRegistro;
    }

    public String[] DatostoArray()
    {
        String[] lista= new String[8];
        lista[0]=String.valueOf(estudiante);
        lista[1]=nombre;
        lista[2]=apellido;
        lista[3]=email;
        lista[4]=telefono;
        lista[5]=sexo;
        lista[6]=Formatos.sdtfecha.format(fechaRegistro);
       
        return lista;
    }
}
