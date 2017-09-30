import java.util.Scanner;

public class Silenciador1
{
	private String marca;
	Scanner scanner=new Scanner(System.in);

	public Silenciador1()
	{
		this.marca="";
	}
	public Silenciador1(String marca)
	{
		System.out.println("Marca del silenciador: ");
		this.marca=scanner.next();
	}
}
