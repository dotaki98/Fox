public class Bocina{
	private int volumen;
	
	public Bocina(){
		this.volumen = 10;
	}

	public void emitirSonido(){
		for(int i = 0; i<10; i++) {
			System.out.println("BEEP BEEP BEEP --- SE HA DETECTADO APERTURA DE ACCESO --- BEEP BEEP BEEP");
			try {
				Thread.sleep(250);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public int getVolumen(){
		return this.volumen;
	}

	public void setVolumen(int volumen){
		this.volumen = volumen;
	}
}
