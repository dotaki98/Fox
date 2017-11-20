public abstract class Bicicleta implements Cloneable{
	private String color;
	private int rodada;

	public Bicicleta() {

	}

	public Bicicleta (String color, int rodada) {
		this.color = color;
		this.rodada = rodada;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRodada() {
		return this.rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public Object clone() {
		Object clon = null;
		try {		
			 clon = super.clone();
		} catch(CloneNotSupportedException cnse) {
			System.out.println(cnse.getMessage());
		}
		return clon;
	}	
	public abstract String verBicicleta();


}

