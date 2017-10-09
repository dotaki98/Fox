public class Zapato {
	private float talla;
	private boolean tieneAgujeta;
	private String color;
	private String material;
	private String suela;

	public Zapato(){
		this.talla = 10;
		this.tieneAgujeta = false;
		this.color = "Negro";
		this.material = "Piel";
		this.suela = "Cuero";
	}

	public Zapato(float talla, boolean tieneAgujeta, String color, String material, String suela){
		this.talla = talla;
		this.tieneAgujeta = tieneAgujeta;
		this.color = color;
		this.material = material;
		this.suela = suela;
	}

	public float getTalla(){
		return this.talla;
	}

	public void setTalla(float talla){
		this.talla = talla;
	}

	public boolean getTieneAgujeta(){
		return this.tieneAgujeta;
	}

	public void setTieneAgujeta(boolean tieneAgujeta){
		this.tieneAgujeta = tieneAgujeta;
	}

	public String getColor(){
		return this.color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getMaterial(){
		return this.material;
	}

	public void setMaterial(String material){
		this.material = material;
	}

	public String getSuela(){
		return this.suela;
	}

	public void setSuela(String suela){
		this.suela = suela;
	}

	public void infoZapato(){
		System.out.println("----------------------");
		System.out.println("Talla: "+this.talla);
		System.out.println("¿Tiene agujeta?: "+this.tieneAgujeta);
		System.out.println("Color: "+this.color);
		System.out.println("Material: "+this.material);
		System.out.println("Suela: "+this.suela);
		System.out.println("----------------------");
	}
}
