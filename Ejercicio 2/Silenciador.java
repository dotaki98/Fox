import java.util.Scanner;

public class Silenciador
{
	private String marca;

	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public String getMarca()
	{
		return this.marca;
	}
	public void suprimirRuido()
	{
		System.out.println("La clase Silenciador esta ejecutando el método suprimirRuido");
	}
	public Silenciador()
	{
		this.marca="";
	}
	public Silenciador(String marca)
	{
		this.marca = marca;
	}
}
