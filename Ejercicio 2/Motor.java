import java.util.Scanner;

public class Motor
{
	private String marca;
	private String modelo;
	private int potencia;
	Scanner scanner=new Scanner(System.in);

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
	public String getModelo()
	{
		return this.modelo;
	}
	public void setPotencia(int potencia)
	{
		this.potencia = potencia;
	}
	public int getPotencia()
	{
		return this.potencia;
	}
	public Motor()
	{
		this.marca = "";
		this.modelo = "";
		this.potencia=0;
	}
	public Motor(String marca, String modelo, int potencia)
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

