import java.util.Scanner;
import java.util.ArrayList;

public class Motocicleta1 extends Vehiculo
{
	private String tipo;
	Scanner scanner=new Scanner(System.in);

	public Motocicleta1()
	{
		this.tipo="";
	}
	public Motocicleta1(String tipo, String marca, String modelo)
	{
		setMarca(marca);
		setModelo(modelo);
		System.out.println("Ingrese el tipo de Motocicleta que desea: ");
		this.tipo=scanner.next();
		System.out.println("El tipo de Motocicleta es ["+tipo+"] con Marca ["+marca+"] y Modelo ["+modelo+"]");
	}
}
