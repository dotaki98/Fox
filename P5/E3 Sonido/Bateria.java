public class Bateria{//La batería tendrá como carga 0 (como cualquier otro producto en el mercado)
	private int carga;

	public Bateria(){
		this.carga = 0;
	}

	public void cargarBateria(int carga){
	}

	public void energizarComponente(){
	}
/*Getters y Setters de la bateria*/
	public int getCarga(){
		return this.carga;
	}

	public void setCarga(int carga){
		this.carga = carga;
	}
}
