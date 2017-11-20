/**
 * Clase abstracta Bicicleta
 *
 * Clase que implementa el patrón de diseño prototype
 *
 * @author Ulises Landázuri
 * @version 1.0
 */
public abstract class Bicicleta implements Cloneable{
	// Atributos
	
	/**
	 * Color de la bicicleta
	 */
	private String color;
	/**
	 * Rodada de la bicicleta
	 */
	private int rodada;

	// Constructores
	
	/**
	 * Constructor por defecto (vacío)
	 */
	public Bicicleta() {

	}

	/**
	 * Constructor con dos parámetros: permite definir color y rodada de la bicicleta al momento de crearla
	 * @param color Color de la bicicleta
	 * @param rodada Rodada de la bicicleta
	 */
	public Bicicleta (String color, int rodada) {
		this.color = color;
		this.rodada = rodada;
	}

	// Métodos setters/getters
	
	/**
	 * Método getter para color
	 * @return Color actual
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Método setter para color
	 * @param color Color nuevo
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Método getter para rodada
	 * @return Rodada actual
	 */
	public int getRodada() {
		return this.rodada;
	}

	/**
	 * Método setter para rodada
	 * @param rodada Rodada nueva
	 */
	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	// Métodos públicos
	
	/**
	 * Crea un clon de un objeto de la clase Bicicleta, gracias a que implementa la interfaz Cloneable
	 * @return Clon de objeto desde el cual se invoca el método
	 */
	public Object clone() {
		Object clon = null;
		try {		
			 clon = super.clone();
		} catch(CloneNotSupportedException cnse) {
			System.out.println(cnse.getMessage());
		}
		return clon;
	}

	// Métodos abstractos

	/**
	 * Genera una cadena con un mensaje que describe el tipo, color y rodada de un objeto Bicicleta
	 * @return Cadena con mensaje descriptivo de la bicicleta
	 */
	public abstract String verBicicleta();

}

