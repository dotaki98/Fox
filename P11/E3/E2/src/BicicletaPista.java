/**
 * Clase BicicletaPista
 *
 * Simula una bicicleta de pista, extiende a la clase abstracta Bicicleta
 *
 * @author Ulises Landázuri
 * @version 1.0
 */
public class BicicletaPista extends Bicicleta {

	// Constructores
	
	/**
	 * Constructor por defecto: Invoca al constructor de la clase padre (Bicicleta)
	 */
	public BicicletaPista() {
		super();
	}

	/**
	 * Constructor con dos parámetros, permite definir color y rodada de bicicleta al crearla
	 * @param color Color de la bicicleta
	 * @param rodada Rodada de la bicicleta
	 */
	public BicicletaPista(String color, int rodada) {
		super(color, rodada);
	}
	
	// Métodos públicos

	/**
	 * Genera una cadena con una descripción del color y rodada de la bicicleta de pista
	 * @return Cadena con descripción de bicicleta
	 */
	public String verBicicleta() {
		return "Bicicleta de pista de color "+this.getColor()+" y rodada "+this.getRodada();
	}
}
