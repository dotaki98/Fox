import java.util.Scanner;

public class Quemacocos
{
	private boolean electrico;

	public void setElectrico(boolean electrico)
	{
		this.electrico = electrico;
	}
	public boolean getElectrico()
	{
		return this.electrico;
	}
	public void abrir()
	{
		System.out.println("La clase Quemacocos esta ejecutando el método abrir");
	}
	public void cerrar()
	{
		System.out.println("La clase Quemacocos esta ejecutando el método cerrar");
	}
	public Quemacocos()
	{
		this.electrico=false;
	}
	public Quemacocos(boolean electrico)
	{
		this.electrico = electrico;
	}
}

