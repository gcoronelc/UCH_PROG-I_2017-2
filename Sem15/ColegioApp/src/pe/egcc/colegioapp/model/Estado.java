package pe.egcc.colegioapp.model;

public class Estado {

    private int code;
    private String texto;

    public Estado() {
    }

    public Estado(int code, String texto) {
        this.code = code;
        this.texto = texto;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
