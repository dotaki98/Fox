import java.util.Scanner;

public class Fabrica1
	{
		private String nombre;
		private String direccion;
		Scanner scanner= new Scanner(System.in);

		public Fabrica1()
		{	
			this.nombre = "";
			this.direccion = "";
		}
	
		public Fabrica1(String nombre, String direccion)
		{
			System.out.println("Ingrese el nombre que se le dará a la fábrica: ");
	 		this.nombre = scanner.next();
			System.out.println("Ingrese la dirección que se le asignará a la fábrica: ");
			this.direccion = scanner.next();
			System.out.println("La fabrica  ["+nombre+"] se encuentra en  ["+direccion+"]");
		}
	}


