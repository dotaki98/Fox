public class Motocicleta extends Vehiculo{
	private String tipo;
	private Silenciador accesorio;

	public String getTipo(){
		return this.tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public Silenciador getAccesorio(){
		return this.accesorio;
	}

	public void setAccesorio(Silenciador accesorio){
		this.accesorio = accesorio;
	}

}

