import java.util.Scanner;

public class Silenciador
{
	private String marca;
	Scanner scanner=new Scanner(System.in);

	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public String getMarca()
	{
		return this.marca;
	}
	public void suprimirRuido()
	{
		System.out.println("La clase Silenciador esta ejecutando el método suprimirRuido");
	}
	public Silenciador()
	{
		this.marca="";
	}
	public Silenciador(String marca)
	{
		System.out.println("Marca del silenciador: ");
		this.marca=scanner.next();
	}
}
