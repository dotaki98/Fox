import java.util.Scanner;

public class Quemacocos
{
	private boolean electrico;
	private int quemacoco;
	Scanner scanner=new Scanner(System.in);

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
		System.out.println("Ingresa 1 si deseas que el automovil lleve Quemacocos, si no lo deseas, ingresa 0");
		this.quemacoco=scanner.nextInt();
		this.electrico=true;

		if (quemacoco==1)
		{
			this.electrico=true;
			System.out.println("El automovil llevará Quemacocos");
		}
		if (quemacoco==0)
		{
			this.electrico=false;
			System.out.println("El automovil no llevará Quemacocos");
		}
		else
		{
			System.out.println("Número inválido");
		}
	}
}

