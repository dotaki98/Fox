public class Silenciador{

	private String marca;

	public String getMarca(){
		return this.marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public void suprimirRuido(){
		System.out.println("La clase Silenciador esta ejecutando el metodo suprimirRuido");
	}

}
