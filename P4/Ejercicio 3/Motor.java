import java.util.Scanner;

public class Motor
{
	private String marca;
	private String modelo;
	private int potencia;

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
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}
}

