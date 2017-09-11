import java.util.Scanner;

public class Llanta
{
	private String material;
	private int diametro;
	private int presion;
	Scanner scanner=new Scanner(System.in);

	public void setMaterial(String material)
	{
		this.material = material;
	}
	public String getMaterial()
	{
		return this.material;
	}
	public void setDiametro(int diametro)
	{
		this.diametro = diametro;
	}
	public int diametro()
	{
		return this.diametro;
	}
	public void setPresion(int presion)
	{
		this.presion = presion;
	}
	public int getDiametro()
	{
		return this.diametro;
	}
	public void aumentarPresion(int cantidad)
	{
		System.out.println("La clase Llanta esta ejecutando el método aumentarPresion");
	}
	public void disminuirPresion(int cantidad) 
	{
		System.out.println("La clase Llanta esta ejecutando el método disminuirPresion");
	}

	public Llanta()
	{
		this.material="";
		this.diametro=0;
		this.presion=0;
	}
	public Llanta(String material, int diametro, int presion)
	{
		System.out.println("¿Qué material deseas que se utilice para el material de la llanta? ");
		this.material = scanner.next();
		System.out.println("Ingresa el diámetro que deseas que tenga la llanta: ");
		this.diametro = scanner.nextInt();
		System.out.println("Ingresa la Presion que deseas que lleve: ");
		this.presion = scanner.nextInt();
	}
}
