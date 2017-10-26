public class Sensor{//El sensor es una de las clases de mayor jerarquía en conjunto con alarma puesto que la alarma necesita de él para activarse
	private String tipo;
	private boolean activa;

	public Sensor(){//Inicializamos los valores del sensor en falso y sin noticias para que la alarma no se active
		this.tipo = "";
		this.activa = false;
	}

	public boolean enviarEstado(){
		return this.activa;
	}

	public void monitorearAcceso(){
	}
/*Getters y Setters del sensor*/
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
