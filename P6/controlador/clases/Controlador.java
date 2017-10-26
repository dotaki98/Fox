package controlador.clases;

public class Controlador {
	private String mensaje;
	
	public Controlador(){
		mensaje = "Hola!, mensaje enviado desde clase: "+this.getClass().getName();
	}

	public String getMensaje(){
		return this.mensaje;
	}

	public void setMensaje(String mensaje){
		this.mensaje = mensaje;
	}

}
