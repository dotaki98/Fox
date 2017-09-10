import java.util.Scanner;

public class Llanta1
{
	private String material;
	private int diametro;
	private int presion;
	Scanner scanner=new Scanner(System.in);

	public Llanta1()
	{
		this.material="";
		this.diametro=0;
		this.presion=0;
	}
	public Llanta1(String material, int diametro, int presion)
	{
		System.out.println("¿Qué material deseas que se utilice para el material de la llanta? ");
		this.material = scanner.next();
		System.out.println("Ingresa el diámetro que deseas que tenga la llanta: ");
		this.diametro = scanner.nextInt();
		System.out.println("Ingresa la Presion que deseas que lleve: ");
		this.presion = scanner.nextInt();
	}
	public void aumentarPresion(int cantidad)
	{
		System.out.println("La clase Llanta esta ejecutando el método aumentarPresion");
	}
	public void disminuirPresion(int cantidad)
	{
		System.out.println("La clase Llanta esta ejecutando el método disminuirPresion");
	}
}
