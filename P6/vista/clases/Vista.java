package vista.clases;

public class Vista {
	private String mensaje;
	
	public Vista(){
		mensaje = "Hola!, mensaje enviado desde clase: "+this.getClass().getName();
	}

	public String getMensaje(){
		return this.mensaje;
	}

	public void setMensaje(String mensaje){
		this.mensaje = mensaje;
	}

}
