import java.util.ArrayList;
public class Motocicleta extends Vehiculo//herencia de la clase Vehiculo
{
	private String tipo;//atributo privado

	public void setTipo(String tipo)//uso de set
	{
		this.tipo = tipo;
	}
	public String getTipo()//uso de get
	{
		return this.tipo;
	}
	public Motocicleta()//constructor vacío
	{
		this.tipo="";
		super.marca="";
		super.modelo="";
	}
	public Motocicleta(String tipo, String marca, String modelo)//Constructor sobrecargado
	{
		this.tipo=tipo;
		super.marca=marca;
		super.modelo=modelo;
	}

}
