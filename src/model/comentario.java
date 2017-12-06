package model;
public class comentario {
  protected boolean comentario_privado;
  public String texto;
  private String data;
  public String usuario;
  
  
  

public String comentar(){
  return "UAU";
}
public boolean isComentario_privado() {
	return comentario_privado;
}
public void setComentario_privado(boolean comentario_privado) {
	this.comentario_privado = comentario_privado;
}
public String getTexto() {
	return texto;
}
public void setTexto(String texto) {
	this.texto = texto;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public void excluirComentario(){
  
}
}