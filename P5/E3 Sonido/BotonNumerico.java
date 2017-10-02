public class BotonNumerico extends Boton{//Los botones serán numéricos que heredan los atributos tipo y activo de la clase Boton
	private int valor;
	
	public BotonNumerico(){//Inicializamos el BotonNumerico con el valor de cero y la etiqueta de "numerico"
		super("Numerico");
		this.valor = 0;
	}
/*Getters y Setters del boton numerico*/
	public int getValor(){
		return this.valor;
	}

	public void setValor(int valor){
		this.valor = valor;
	}
}
