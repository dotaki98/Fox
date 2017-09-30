import java.util.ArrayList;
public class Vehiculo
{
	protected String marca;
	protected String modelo;
	private ArrayList<Llanta> llantas;
	private Motor motor;

	public void setMarca(String marca)//uso de set 
	{
		this.marca = marca;
	}
	public String getMarca()//uso de get
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
		System.out.println("La clase Vehiculo esta ejecutando el método acelerar");//método acelerar
	}
	public void frenar()
	{
		System.out.println("La clase Vehiculo esta ejecutando el método frenar");//método frenar
	}
	public Vehiculo()//Constructor vacío
	{
		this.marca = "";
		this.modelo = "";
		this.llantas = new ArrayList<Llanta>(2);
	}
	public Vehiculo(String marca, String modelo)//constructor sobrecargado 
	{
		this.marca =marca;
		this.modelo =modelo;
	}
}
