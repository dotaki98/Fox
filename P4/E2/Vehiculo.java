import java.util.ArrayList;
public class Vehiculo
{
	private String marca;
	private String modelo;
	private ArrayList<Llanta> llantas = new ArrayList<Llanta>(2);
	private Motor motor;

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
}
