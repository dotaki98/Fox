import java.util.Scanner;

public class Motor1
{
	private String marca;
	private String modelo;
	private int potencia;
	Scanner scanner=new Scanner(System.in);

	public Motor1()
	{
		this.marca = "";
		this.modelo = "";
		this.potencia=0;
	}
	public Motor1(String marca, String modelo, int potencia)
	{
		System.out.println("Marca del motor: ");
		this.marca=scanner.next();
		System.out.println("Modelo del motor; ");
		this.modelo=scanner.next();
		System.out.println("Potencia del motor: ");
		this.potencia=scanner.nextInt();
		System.out.println("La Marca del motor es: ["+marca+"], el Modelo es ["+modelo+"] y la potencia es de ["+potencia+"]");
	}
}

