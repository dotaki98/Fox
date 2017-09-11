import java.util.Scanner;
import java.util.ArrayList;

public class Automovil extends Vehiculo
{
	private String color;
	Scanner scanner=new Scanner(System.in);

	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}


	public Automovil()
	{
		this.color="";
	}
	public Automovil(String color, String marca, String modelo)
	{
		setMarca(marca);
		setModelo(modelo);
		System.out.println("¿Qué color será tú automovil?");
		this.color=scanner.next();
		System.out.println("El automovil será del color ["+color+"] de la marca ["+marca+"] y modelo ["+modelo+"]");
	}

}
