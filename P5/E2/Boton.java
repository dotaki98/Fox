public class Boton{
	private String tipo;
	private boolean activo;

	public Boton(){
		this.tipo = "";
		this.activo = false;
	}

	public Boton(String tipo){
		this.tipo = tipo;
		this.activo = false;
	}

	public void cambiarEstado(boolean nuevoEstado){
	}

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
