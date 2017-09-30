import java.util.Scanner;
import java.util.ArrayList;

public class Automovil1 extends Vehiculo
{
	private String color;
	Scanner scanner=new Scanner(System.in);

	public Automovil1()
	{
		this.color="";
	}
	public Automovil1(String color, String marca, String modelo)
	{
		setMarca(marca);
		setModelo(modelo);
		System.out.println("¿Qué color será tú automovil?");
		this.color=scanner.next();
		System.out.println("El automovil será del color ["+color+"] de la marca ["+marca+"] y modelo ["+modelo+"]");
	}
}
