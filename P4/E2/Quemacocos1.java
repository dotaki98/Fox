import java.util.Scanner;

public class Quemacocos1
{
	private boolean electrico;
	private int quemacoco;
	Scanner scanner=new Scanner(System.in);

	public Quemacocos1()
	{
		this.electrico=false;
	}
	public Quemacocos1(boolean electrico)
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

