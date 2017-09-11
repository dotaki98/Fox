import java.util.Scanner;

public class Fabrica
{
	private String nombre;
	private String direccion;
	Scanner scanner= new Scanner(System.in);

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	public String getDireccion()
	{
		return this.direccion;
	}
	public Fabrica()
	{	
		this.nombre = "";
		this.direccion = "";
	}
	
	public Fabrica(String nombre, String direccion)
	{
		System.out.println("Ingrese el nombre que se le dará a la fábrica: ");
		this.nombre = scanner.next();
		System.out.println("Ingrese la dirección que se le asignará a la fábrica: ");
		this.direccion = scanner.next();
		System.out.println("La fabrica  ["+nombre+"] se encuentra en  ["+direccion+"]");
	}
	public Vehiculo fabricarVehiculo()
	{
		Vehiculo nuevoVehiculo = new Vehiculo();
		System.out.println("La clase Fabrica esta ejecutando el método fabricarVehiculo");
		return nuevoVehiculo;
	}
}
