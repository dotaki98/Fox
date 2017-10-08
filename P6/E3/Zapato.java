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