
package pe.egcc.colegioapp.model;


public class Matriculas {
    private int matricula;
    private int seccion;
    private int periodo;
    private int nivel;
    private int grado;
    private int estudiante;
    private String apellido;
     private String nombre;
    private int dni;
   private String email;
   private int telefono;
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudiante(int Estudiante) {
        this.estudiante = Estudiante;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getSeccion() {
        return seccion;
    }

    public int getPeriodo() {
        return periodo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getGrado() {
        return grado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstudiante() {
        return estudiante;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }
}
  
   
    

    