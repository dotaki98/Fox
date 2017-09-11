import java.util.ArrayList;
import java.util.Scanner;

public class Motocicleta extends Vehiculo
{
	private String tipo;
	Scanner scanner=new Scanner(System.in);

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	public String getTipo()
	{
		return this.tipo;
	}
	public Motocicleta()
	{
		this.tipo="";
	}
	public Motocicleta(String tipo, String marca, String modelo)
	{
		setMarca(marca);
		setModelo(modelo);
		System.out.println("Ingrese el tipo de Motocicleta que desea: ");
		this.tipo=scanner.next();
		System.out.println("El tipo de Motocicleta es ["+tipo+"] con Marca ["+marca+"] y Modelo ["+modelo+"]");
	}

}
