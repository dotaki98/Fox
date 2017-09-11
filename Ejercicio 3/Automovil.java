import java.util.Scanner;
import java.util.ArrayList;

public class Automovil extends Vehiculo
{
	private String color;
	private Quemacocos accesorio;

	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	
	public void setAccesorio(Quemacocos quemacocos){
		this.accesorio = quemacocos;
	}



	public Automovil()
	{
		super.marca = "";
		super.modelo = "";
		this.color="";
	}
	public Automovil(String color, String marca, String modelo)
	{
		super.marca = marca;
		super.modelo = modelo;
		this.color = color;
	}

}
