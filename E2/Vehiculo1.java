import java.util.Scanner;
import java.util.ArrayList;

public class Vehiculo1
{
	private String marca;
	private String modelo;
	private ArrayList<Llanta> llantas;
	private Motor motor;
	Scanner scanner = new Scanner(System.in);

	public Vehiculo1()
	{
		this.marca = "";
		this.modelo = "";
		this.llantas = new ArrayList<Llanta>();
	}
	public Vehiculo1(String marca, String modelo)
	{
		System.out.println("Ingresa la marca que deseas para el vehículo: ");
		this.marca = scanner.next();
		System.out.println("Ingresa el nombre del modelo que te gustaría para tu vehículo: ");
		this.modelo = scanner.next();
		System.out.println("EL vehículo es de la marca ["+marca+"] y modelo ["+modelo+"] ");
	}
	public void acelerar()
	{
		System.out.println("La clase Vehiculo esta ejecutando el método acelerar");
	}
	public void frenar()
	{
		System.out.println("La clase Vehiculo esta ejecutando el método frenar");
	}
}

