public class BotonNumerico extends Boton{
	private int valor;
	
	public BotonNumerico(){
		super("Numerico");
		this.valor = 0;
	}

	public int getValor(){
		return this.valor;
	}

	public void setValor(int valor){
		this.valor = valor;
	}
}
