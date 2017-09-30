import java.util.Scanner;
import java.util.ArrayList;

class PersonaU{
	private String nombre;
	private int edad;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setEdad (int edad){
		this.edad=edad;
	}
	
	PersonaU(){}
	
	PersonaU(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public String toString(){
		return"Nombre: " + this.nombre + "\nEdad: "+ this.edad;
	}
}

class TestPersonaU{
	public static void main(String[] args){
		if(args.length >= 2){
			int i, age;
			String name;
			ArrayList<PersonaU> personas = new ArrayList<PersonaU>();
			personas.add(new PersonaU(args[0],Integer.parseInt(args[1])));
			
			System.out.println("Cuantas personas mas deseas guardar: ");
			Scanner sc = new Scanner(System.in);

			int cant = sc.nextInt ();

			for (i=0; i<cant; i++){

				System.out.println("Nombre Persona" + (i+1));
				name=sc.next();

				System.out.println("Edad Persona" + (i+1));
				age=sc.nextInt();
				personas.add(new PersonaU(name, age));
			}
			
			System.out.println("-----------");
				for (PersonaU pers : personas){
					System.out.println(pers);
				}
		}

	}
}