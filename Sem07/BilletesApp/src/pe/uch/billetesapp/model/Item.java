package pe.uch.billetesapp.model;

public class Item {

    private String tipo;
    private int valor;
    private int cant;
    private int importe;

    public Item() {
    }

    public Item(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.cant = 0;
        this.importe = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

}
