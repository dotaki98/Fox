/**
 * Clase VentanaAyuda
 *
 * Clase basada en el patrón de diseño singleton
 *
 * @author Ulises Landázuri
 * @version 1.0
 */
public class VentanaAyuda {

	// Atributos

	/**
	 * Nombre de la ventana
	 */
	private String nombre;
	/**
	 * Instancia única de la clase (estática)
	 */
	private static VentanaAyuda instancia;

	// Constructores	

	/**
	 * Constructor por defecto
	 */
	private VentanaAyuda() {

	}


	// Métodos setters/getters
	
	/**
	 * Método setter para nombre
	 * @param nombre Nombre a asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método getter para nombre
	 * @return Cadena con el nombre actualmente guardado
	 */
	public String getNombre() {
		return this.nombre;
	}

	// Métodos públicos
	
	/**
	 * Crea una instancia de VentanaAyuda, en caso de no existir, y la regresa.
	 * @return Instancia única de VentanaAyuda
	 */
	public static VentanaAyuda getInstance() {
		if(instancia == null) {
			instancia = new VentanaAyuda();
		}
		return instancia;
	}
}
