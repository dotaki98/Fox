public class Llanta
{
	private String material;//privado
	private int diametro;
	private int presion;

	public void setMaterial(String material)//uso de set
	{
		this.material = material;
	}
	public String getMaterial()//uso de get
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
	public void aumentarPresion(int cantidad)//método aumentarPresion
	{
		System.out.println("La clase Llanta esta ejecutando el método aumentarPresion");
	}
	public void disminuirPresion(int cantidad)//método disminuirPresion
	{
		System.out.println("La clase Llanta esta ejecutando el método disminuirPresion");
	}
	public Llanta()//Constructor vacío
	{
		this.material="";
		this.diametro=0;
		this.presion=0;
	}
	public Llanta(String material, int diametro, int presion)//Constructor sobrecargado
	{
		this.material=material;
		this.diametro=diametro;
		this.presion=presion;
	}
}
