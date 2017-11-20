public class BicicletaPista extends Bicicleta {

	public BicicletaPista() {
		super();
	}

	public BicicletaPista(String color, int rodada) {
		super(color, rodada);
	}

	public String verBicicleta() {
		return "Bicicleta de pista de color "+this.getColor()+" y rodada "+this.getRodada();
	}
}
