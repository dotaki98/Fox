public class BotonOperativo extends Boton{
	private String accion;

	public BotonOperativo(){
		super("Operativo");
		this.accion = "Enter";
	}

	public String getAccion(){
		return this.accion;
	}

	public void setAccion(String accion){
		this.accion = accion;
	}
}
