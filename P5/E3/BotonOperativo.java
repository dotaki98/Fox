public class BotonOperativo extends Boton{//El boton operativo igualmente hereda los atributos de activo y tipo de la clase Boton y se le asigna en éste caso el nombre de enter
	private String accion;

	public BotonOperativo(){//Inicializamos el BotonOperativo con la etiqueta de enter
		super("Operativo");
		this.accion = "Enter";
	}
/*Getters y Setters de boton operativo*/
	public String getAccion(){
		return this.accion;
	}

	public void setAccion(String accion){
		this.accion = accion;
	}
}
