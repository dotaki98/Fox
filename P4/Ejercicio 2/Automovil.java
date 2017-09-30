import java.util.ArrayList;

public class Automovil extends Vehiculo//herencia de la clase Vehiculo
{
	private String color;//privado

	public void setColor(String color)//uso de set
	{
		this.color = color;
	}
	public String getColor()//uso de get
	{
		return this.color;
	}


	public Automovil()//constructor vacío
	{
		this.color="";
		super.marca="";//uso de los atributos de la clase padre
		super.modelo="";
	}
	public Automovil(String color, String marca, String modelo)//constructor sobrecargado 
	{
		super.marca=marca;
		super.modelo=modelo;
		this.color=color;
	}

}
