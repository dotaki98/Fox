import java.util.Scanner;

public class Fabrica//nombre de la clase que llevará acabo la creación de Vehículos
{
	private String nombre;//atributo nombre privado
	private String direccion;//atributo direccion privado
	Scanner scanner= new Scanner(System.in);// creación de un objeto tipo Scanner

	public void setNombre(String nombre)//utilización de set para establecer un valor al atributo nombre, de carácter privado
	{
		this.nombre = nombre;
	}
	public String getNombre()//utilización de set para obtener el valor de nombre
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
	public Fabrica()//constructor vacío para que los atributos dejen de ser nulos
	{	
		this.nombre = "";
		this.direccion = "";
	}
	
	public Fabrica(String nombre, String direccion)//constructor sobrecargado
	{
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public Vehiculo fabricarVehiculo(boolean automovil)//método para la fabricación de Vehículos
	{
		if(automovil){
			Automovil nuevo_auto = new Automovil();//creación de un objeto tipo Automovil
			System.out.println("Introduzca marca de automóvil: ");//marca que se le asignará a el automóvil
			nuevo_auto.marca = sc.next();//marca asignada al automóvil
			System.out.println("Introduzca modelo de automóvil: ");//modelo que se le asignará a el automóvil
			nuevo_auto.modelo = sc.next();//modelo asignado a el automóvil
			System.out.println("Introduzca color de automóvil: ");//color que se le asignará a el automóvil
			nuevo_auto.color = sc.next();//color asignado a automóvil
			int quemacocos;
			do {
				System.out.println("¿Desea que el automóvil tenga quemacocos? (Introduzca 1 si desea quemacocos o 0 si no lo desea)");//el 1 será el Sí, y el 0 será el No
				quemacocos = sc.nextInt;
				if(quemacocos != 1 && quemacocos != 0)//validará que el usuario introduzca 1 ó 0
					System.out.println("Opción incorrecta. Vuelva a intentarlo.");
			} while(quemacocos != 1 && quemacocos != 0);
			if(quemacocos == 1){//entrará al ciclo en cuanto el entero quemacocos, sea igual a 1
				do{
					System.out.println("Si desea que el quemacocos sea electrico, introduzca 1, en caso contrario, introduzca 0");//1 es Sí, 0 es No
					quemacocos = sc.nextInt();
					if(quemacocos != 1 && quemacocos != 0)//valida si la variable quemacocos es diferente de 1 y 0
						System.out.println("Opción incorrecta. Vuelva a intentarlo.");//mensaje a mostrar en caso de que no introduzca 1 ó 0
				}while(quemacocos != 1 && quemacocos != 0);
				if(quemacocos == 1){//variable quemacocos igual a 1, es decir, que si lleva quemacocos
					nuevo_auto.accesorio = new Quemacocos(true);//variable tipo booleana será true, ya que llevará quemacocos eléctrico
				} else {
					nuevo_auto.accesorio = new Quemacocos(false);//variable tipo booleana será false, ya que no llevará quemacocos eléctrico
				}
			}
			return nuevo_auto;
		} else {
			Motocicleta nueva_moto = new Motocicleta();//creación de un objeto tipo Motocicleta
			System.out.println("Introduzca marca de motocicleta: ");//marca que se le asignará a Motocicleta
			nueva_moto.marca = sc.next();//marca asignada
			System.out.println("Introduzca modelo de motocicleta: ");//modelo que se le asignará a Motocicleta
			nueva_moto.modelo = sc.next();//modelo asignado
			System.out.println("Introduzca tipo de motocicleta: ");//tipo que se le asignará a la Motocicleta
			nueva_moto.tipo = sc.next();//tipo de Motocicleta asignado
			int silenciador;
			do {
				System.out.println("¿Desea que la moto tenga silenciador? (Introduzca 1 si desea silenciador o 0 si no lo desea)");//1 es Sí, 0 es No
				silenciador = sc.nextInt;
				if(silenciador != 1 && silenciador != 0)//valida que la variable silenciador sea diferente de 1 y 0
					System.out.println("Opción incorrecta. Vuelva a intentarlo.");//mensaje a mostrar en caso de ser así
			} while(silenciador != 1 && silenciador != 0);
			if(silenciador == 1){//variable silenciador igual a 1, es decir, que sí lleva silenciador la Motocicleta
				System.out.println("Introduzca marca de silenciador: ");//marca que se le asignará al silenciador
				String marca = sc.next();//marca asignada 
				nueva_moto.accesorio = new Silenciador(marca);//creación de un nuevo objeto tipo Silenciador que llevará la marca asignada
			}
			return nueva_moto;
				
			
	}
}
