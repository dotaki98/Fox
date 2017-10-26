public class Fabrica//nombre de la clase
{
	private String nombre;
	private String direccion;

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
	public Fabrica()//constructor vacio
	{	
		this.nombre = "";
		this.direccion = "";
	}
	public Fabrica(String nombre, String direccion)//constructor sobrecargado
	{
		this.nombre=nombre;
		this.direccion=direccion;
	}
	public Vehiculo fabricarVehiculo()
	{
		Vehiculo nuevoVehiculo = new Vehiculo();
		System.out.println("La clase Fabrica esta ejecutando el método fabricarVehiculo");
		return nuevoVehiculo;
	}
}
