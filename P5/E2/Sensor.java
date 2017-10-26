public class Sensor{
	private String tipo;
	private boolean activa;

	public Sensor(){
		this.tipo = "";
		this.activa = true;
	}

	public boolean enviarEstado(){
		return this.activa;
	}

	public void monitorearAcceso(){
	}

	public String getTipo(){
		return this.tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public boolean getActiva(){
		return this.activa;
	}

	public void setActiva(boolean activa){
		this.activa = activa;
	}
}
