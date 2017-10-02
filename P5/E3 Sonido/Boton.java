public class Boton{//Los botones de la alarma no estarán activos hasta que se indique
	private String tipo;
	private boolean activo;

	public Boton(){//Inicializamos el Boton listo para su clasificación, su etiqueta no tiene caracter y está inicialmente desactivado
		this.tipo = "";
		this.activo = false;
	}

	public Boton(String tipo){
		this.tipo = tipo;
		this.activo = false;
	}

	public void cambiarEstado(boolean nuevoEstado){
	}
/*Getters y Setters de Boton*/
	public String getTipo(){
		return this.tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public boolean getActivo(){
		return this.activo;
	}

	public void setActivo(boolean activo){
		this.activo = activo;
	}
}
