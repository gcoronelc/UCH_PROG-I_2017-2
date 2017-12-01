package pe.egcc.mifinal.model;

public class Usuario {

  private Integer idempleado;
  private String usuario;
  private String clave;
  private Integer activo;

  public Usuario() {
  }

  public Integer getIdempleado() {
    return idempleado;
  }

  public void setIdempleado(Integer idempleado) {
    this.idempleado = idempleado;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  public Integer getActivo() {
    return activo;
  }

  public void setActivo(Integer activo) {
    this.activo = activo;
  }

}
