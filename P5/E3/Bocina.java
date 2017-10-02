public class Bocina{
	private int volumen;
	
	public Bocina(){//El valor predeterminado del volumen será 10, donde 10 es el valor máximo
		this.volumen = 10;
	}

	public void emitirSonido(){ // Se emite el sonido cuando la alarma le indique que se haga
		for(int i = 0; i<10; i++) {
			System.out.println("BEEP BEEP BEEP --- SE HA DETECTADO APERTURA DE ACCESO --- BEEP BEEP BEEP");
			try {
				Thread.sleep(250);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
/*Getters y Setters de la Bocina*/
	public int getVolumen(){
		return this.volumen;
	}

	public void setVolumen(int volumen){
		this.volumen = volumen;
	}
}
