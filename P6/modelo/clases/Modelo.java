package modelo.clases;

public class Modelo {
	private String mensaje;
	
	public Modelo(){
		mensaje = "Hola!, mensaje enviado desde clase: "+this.getClass().getName();
	}

	public String getMensaje(){
		return this.mensaje;
	}

	public void setMensaje(String mensaje){
		this.mensaje = mensaje;
	}

}
