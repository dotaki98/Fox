public class Silenciador//nombre de la clase
{
	private String marca;//atributo privado

	public void setMarca(String marca)//uso de set
	{
		this.marca = marca;
	}
	public String getMarca()//uso de get
	{
		return this.marca;
	}
	public void suprimirRuido()//método suprimirRuido
	{
		System.out.println("La clase Silenciador esta ejecutando el método suprimirRuido");
	}
	public Silenciador()//constructor vacío
	{
		this.marca="";
	}
	public Silenciador(String marca)//constructor sobrecargado
	{
		this.marca=marca;
	}
}
