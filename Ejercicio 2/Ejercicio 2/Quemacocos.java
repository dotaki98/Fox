public class Quemacocos//nombre de la clase
{
	private boolean electrico;//atributo privado tipo booleano 

	public void setElectrico(boolean electrico)//uso de set
	{
		this.electrico = electrico;
	}
	public boolean getElectrico()//uso de get
	{
		return this.electrico;
	}
	public void abrir()//método abrir
	{
		System.out.println("La clase Quemacocos esta ejecutando el método abrir");
	}
	public void cerrar()//método cerrar
	{
		System.out.println("La clase Quemacocos esta ejecutando el método cerrar");
	}
	public Quemacocos()//constructor vacío
	{
		this.electrico=false;
	}
	public Quemacocos(boolean electrico)//constructor sobrecargado
	{
		this.electrico=electrico;

	}
}

