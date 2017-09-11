import java.util.Scanner;
import java.util.ArrayList;

public class Automovil extends Vehiculo//palabra reservada para poder denotar 
					//la herencia de la clase Vehiculo a Automovil y así poder
					//utilizar los atributos y operaciones de la Clase Padre
{
	private String color;
	private Quemacocos accesorio;

	public void setColor(String color)//utilización del set para asignar un valor al atributo privado color
	{
		this.color = color;
	}
	public String getColor()//utilización de get para obtener el color
	{
		return this.color;
	}
	
	public void setAccesorio(Quemacocos quemacocos){
		this.accesorio = quemacocos;
	}



	public Automovil()//constructor vacío que inicializa los valores para que no sean null
	{
		super.marca = "";//indica que el atributo marca se heredó de Vehiculo
		super.modelo = "";//el atributo modelo se heredó de Vehiculo
		this.color="";
	}
	public Automovil(String color, String marca, String modelo)//Constructor sobrecargado
	{
		super.marca = marca;
		super.modelo = modelo;
		this.color = color;
	}

}
