import java.util.ArrayList;

public class Automovil extends Vehiculo{
	
	private String color;
	private Quemacocos accesorio;

	public String getColor(){
		return this.color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public Quemacocos getAccesorio(){
		return this.accesorio;
	}

	public void setAccesorio(Quemacocos accesorio){
		this.accesorio = accesorio;
	}

}
