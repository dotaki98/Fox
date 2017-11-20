/**
 * Clase VentanaPrincipal
 *
 * Prueba el funcionamiento del patrón de diseño singleton
 *
 * @author Ulises Landázuri
 * @version 1.0
 */
public class VentanaPrincipal {

	// Atributos
	
	/**
	 * VentanaAyuda que implementa el patrón de diseño singleton
	 */
	private VentanaAyuda ventanaAyuda;

	// Constructor
	
	/**
	 * Constructor por defecto: asigna a ventanaAyuda una instancia de la clase VentanaAyuda
	 */
	public VentanaPrincipal() {
		this.ventanaAyuda = VentanaAyuda.getInstance();
	}
	
	// Métodos setters/getters
	
	/**
	 * Método getter para ventanaAyuda
	 * @return La instancia de VentanaAyuda en uso
	 */
	public VentanaAyuda getVentanaAyuda() {
		return this.ventanaAyuda;
	}

	/**
	 * Método setter para ventanaAyuda
	 * @param ventanaAyuda Instancia de VentanaAyuda a utilizar
	 */
	public void setVentanaAyuda(VentanaAyuda ventanaAyuda) {
		this.ventanaAyuda = ventanaAyuda;
	}

	// Métodos públicos
	
	/**
	 * Utiliza los hashcodes de ventanaAyuda antes y después de usar el método getInstance de VentanaAyuda
	 * para verificar el funcionamiento correcto de la implementación del patrón de diseño singleton
	 */
	public void probarSingleton() {
		int hashcode1 = this.ventanaAyuda.hashCode();
		System.out.println("Hashcode de ventanaAyuda: "+hashcode1);
		// Se vuelve a llamar al método getInstance() de la clase VentanaAyuda
		this.ventanaAyuda = VentanaAyuda.getInstance();
		// Se imprime otra vez el hashcode del objeto ventanaAyuda para
		// verificar que se trata del mismo objeto
		int hashcode2 = this.ventanaAyuda.hashCode();
		System.out.println("Hashcode de ventanaAyuda tras volver a invocar método getInstance: "+hashcode2);
		if(hashcode1 == hashcode2) {
			System.out.println("Se trata del mismo objeto dado que los hashcode son iguales.");
		} else {
			System.out.println("Son objetos distintos dado que los hashcodes no coinciden.");
		}

	}
	

	/**
	 * Crea una instancia de la clase VentanaPrincipal y ejecuta su método probarSingleton
	 * @param args No empleado
	 */
	public static void main(String[] args) {
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.probarSingleton();
	}
}
