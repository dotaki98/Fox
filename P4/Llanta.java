public class Llanta{
	
	private String material;
	private int diametro;
	private int presion;
	
	public String getMaterial(){
		return this.material;
	}

	public void setMaterial(String material){
		this.material = material;
	}

	public int getDiametro(){
		return this.diametro;
	}

	public void setDiametro(int diametro){
		this.diametro = diametro;
	}

	public int getPresion(){
		return this.presion;
	}

	public void setPresion(int presion){
		this.presion = presion;
	}

	public void aumentarPresion(int cantidad){
		System.out.println("La clase Llanta esta ejecutando el metodo aumentarPresion");
	}

	public void disminuirPresion(int cantida){
		System.out.println("La clase Llanta esta ejecutando el metodo disminuirPresion");
	}

}
