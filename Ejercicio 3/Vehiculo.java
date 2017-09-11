import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo
{
	protected String marca;
	protected String modelo;
	private ArrayList<Llanta> llantas;
	private Motor motor;
	Scanner scanner = new Scanner(System.in);

	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public String getMarca()
	{
		return this.marca;
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	public String modelo()
	{
		return this.modelo;
	}
	public void acelerar()
	{
		System.out.println("La clase Vehiculo esta ejecutando el método acelerar");
	}
	public void frenar()
	{
		System.out.println("La clase Vehiculo esta ejecutando el método frenar");
	}
	public Vehiculo()
	{
		this.marca = "";
		this.modelo = "";
		this.llantas = new ArrayList<Llanta>(2);
	}
	public Vehiculo(String marca, String modelo)
	{
		this.marca = marca;
		this.modelo = modelo;
	}
}
