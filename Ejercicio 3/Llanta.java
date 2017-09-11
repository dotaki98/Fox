import java.util.Scanner;

public class Llanta
{
	private String material;
	private int diametro;
	private int presion;

	public void setMaterial(String material)
	{
		this.material = material;
	}
	public String getMaterial()
	{
		return this.material;
	}
	public void setDiametro(int diametro)
	{
		this.diametro = diametro;
	}
	public int diametro()
	{
		return this.diametro;
	}
	public void setPresion(int presion)
	{
		this.presion = presion;
	}
	public int getDiametro()
	{
		return this.diametro;
	}
	public void aumentarPresion(int cantidad)
	{
		System.out.println("La clase Llanta esta ejecutando el método aumentarPresion");
	}
	public void disminuirPresion(int cantidad) 
	{
		System.out.println("La clase Llanta esta ejecutando el método disminuirPresion");
	}

	public Llanta()
	{
		this.material="";
		this.diametro=0;
		this.presion=0;
	}
	public Llanta(String material, int diametro, int presion)
	{
		this.material = material;
		this.diametro = diametro;
		this.presion = presion;
	}
}
