import java.util.ArrayList;
import java.util.Scanner;

public class Motocicleta extends Vehiculo
{
	private String tipo;

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
		super.marca = "";
		super.modelo = "";
		this.tipo="";
	}
	public Motocicleta(String tipo, String marca, String modelo)
	{
		this.tipo = tipo;
		super.marca = marca;
		super.modelo = modelo;
	}

}
