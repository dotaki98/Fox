public class BicicletaMontana extends Bicicleta {
	
	public BicicletaMontana() {
		super();
	}

	public BicicletaMontana(String color, int rodada) {
		super(color, rodada);
	}
	
	public String verBicicleta() {
		return "Bicicleta de montaña de color "+this.getColor()+" y rodada "+this.getRodada();
	}
}
