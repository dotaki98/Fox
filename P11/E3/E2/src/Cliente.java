/**
 * Clase Cliente
 *
 * Simula un cliente con una bicicleta<br>
 * Prueba el funcionamiento del patrón de diseño prototype
 *
 * @author Ulises Landázuri
 * @version 1.0
 */
public class Cliente {

	// Atributos

	/**
	 * Bicicleta del cliente
	 */
	private Bicicleta bicicleta;

	// Métodos setters/getters

	/**
	 * Método getter para bicicleta
	 * @return Bicicleta actual
	 */
	public Bicicleta getBicicleta() {
		return this.bicicleta;
	}

	/**
	 * Método setter para bicicleta
	 * @param bicicleta Bicicleta a asignarle al cliente
	 */
	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	
	// Métodos públicos

	/**
	 * Basándose en los hashcodes de las distintos clones de bicicleta creados y sus atributos, permite probar el funcionamiento 
	 * del patrón de diseño prototype
	 */
	public void probarPrototype() {
		this.bicicleta = new BicicletaMontana("Azul", 29);
		int hashcode1 = this.bicicleta.hashCode();
		System.out.println(this.bicicleta.verBicicleta()+" con hashcode "+hashcode1);
		this.bicicleta = (Bicicleta) this.bicicleta.clone();
		int hashcode2 = this.bicicleta.hashCode();		
		System.out.println("Se ha invocado método clone de objeto bicicleta");
		System.out.println(this.bicicleta.verBicicleta()+" con hashcode "+hashcode2);
		if(hashcode1 != hashcode2) {
			System.out.println("Como los hashcodes difieren, bicicleta antes de invocar");
			System.out.println("su método clone y bicicleta después de invocarlo son dos");
			System.out.println("objetos distintos, y con mismos atributos puesto que son clones");
		}
		System.out.println("\nAhora se probará con la clase BicicletaPista\n");
		this.bicicleta = new BicicletaPista("Roja", 26);
		int hashcode3 = this.bicicleta.hashCode();
		System.out.println(this.bicicleta.verBicicleta()+" con hashcode "+hashcode3);
		this.bicicleta = (Bicicleta) this.bicicleta.clone();
		int hashcode4 = this.bicicleta.hashCode();		
		System.out.println("Se ha invocado método clone de objeto bicicleta");
		System.out.println(this.bicicleta.verBicicleta()+" con hashcode "+hashcode4);
		if(hashcode3 != hashcode4) {
			System.out.println("Como los hashcodes difieren, bicicleta antes de invocar");
			System.out.println("su método clone y bicicleta después de invocarlo son dos");
			System.out.println("objetos distintos, y con mismos atributos puesto que son clones");
		}
	}

	/**
	 * Crea una instancia de la clase Cliente y ejecuta su método probarPrototype
	 * @param args No empleado
	 */
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.probarPrototype();
	}
}
