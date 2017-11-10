package pe.egcc.colegioapp.model;

public class Seccion {

    private int seccion;
    private int periodo;
    private int nivel;
    private String nomnivel;
    private int grado;
    private String nomgrado;
    private String nombre;
    private int vacantes;
    private int matriculados;

    public Seccion() {
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNomnivel() {
        return nomnivel;
    }

    public void setNomnivel(String nomnivel) {
        this.nomnivel = nomnivel;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getNomgrado() {
        return nomgrado;
    }

    public void setNomgrado(String nomgrado) {
        this.nomgrado = nomgrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public int getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(int matriculados) {
        this.matriculados = matriculados;
    }

}
