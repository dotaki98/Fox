import java.util.ArrayList;

public class Motocicleta extends Vehiculo{
	
	private String tipo;
	ArrayList<Silenciador> accesorio;

	public String getTipo(){
		return this.tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

}
