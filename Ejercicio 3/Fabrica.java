import java.util.Scanner;

public class Fabrica
{
	private String nombre;
	private String direccion;
	Scanner scanner= new Scanner(System.in);

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	public String getDireccion()
	{
		return this.direccion;
	}
	public Fabrica()
	{	
		this.nombre = "";
		this.direccion = "";
	}
	
	public Fabrica(String nombre, String direccion)
	{
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public Vehiculo fabricarVehiculo(boolean automovil)
	{
		if(automovil){
			Automovil nuevo_auto = new Automovil();
			System.out.println("Introduzca marca de automóvil: ");
			nuevo_auto.marca = sc.next();
			System.out.println("Introduzca modelo de automóvil: ");
			nuevo_auto.modelo = sc.next();
			System.out.println("Introduzca color de automóvil: ");
			nuevo_auto.color = sc.next();
			int quemacocos;;
			do {
				System.out.println("¿Desea que el automóvil tenga quemacocos? (Introduzca 1 si desea quemacocos o 0 si no lo desea)");
				quemacocos = sc.nextInt;
				if(quemacocos != 1 && quemacocos != 0)
					System.out.println("Opción incorrecta. Vuelva a intentarlo.");
			} while(quemacocos != 1 && quemacocos != 0);
			if(quemacocos == 1){
				do{
					System.out.println("Si desea que el quemacocos sea electrico, introduzca 1, en caso contrario, introduzca 0");
					quemacocos = sc.nextInt();
					if(quemacocos != 1 && quemacocos != 0)
						System.out.println("Opción incorrecta. Vuelva a intentarlo.");
				}while(quemacocos != 1 && quemacocos != 0);
				if(quemacocos == 1){
					nuevo_auto.accesorio = new Quemacocos(true);
				} else {
					nuevo_auto.accesorio = new Quemacocos(false);
				}
			}
			return nuevo_auto;
		} else {
			Motocicleta nueva_moto = new Motocicleta();
			System.out.println("Introduzca marca de motocicleta: ");
			nueva_moto.marca = sc.next();
			System.out.println("Introduzca modelo de motocicleta: ");
			nueva_moto.modelo = sc.next();
			System.out.println("Introduzca tipo de motocicleta: ");
			nueva_moto.tipo = sc.next();
			int silenciador;
			do {
				System.out.println("¿Desea que la moto tenga silenciador? (Introduzca 1 si desea silenciador o 0 si no lo desea)");
				silenciador = sc.nextInt;
				if(silenciador != 1 && silenciador != 0)
					System.out.println("Opción incorrecta. Vuelva a intentarlo.");
			} while(silenciador != 1 && silenciador != 0);
			if(silenciador == 1){
				System.out.println("Introduzca marca de silenciador: ");
				String marca = sc.next();
				nueva_moto.accesorio = new Silenciador(marca);
			}
			return nueva_moto;
				
			
	}
}
