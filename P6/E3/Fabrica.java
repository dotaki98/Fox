import java.util.Random;
import java.util.ArrayList;

public class Fabrica{
	private ArrayList<Zapato> stock;
	
	public Fabrica(){
		stock = new ArrayList<Zapato>(100);
		Random rnd = new Random();
		for(int i=0; i<100; i++){
			float talla = (rnd.nextInt(33)) + 10;
			if(rnd.nextBoolean()){
				talla += 0.5;
			}
			boolean tieneAgujeta = rnd.nextBoolean();
			
			String color = "";
			switch(rnd.nextInt(3)){
				case 0:
					color = "Negro";
					break;
				case 1:
					color = "Cafe";
					break;
				case 2:
					color = "Azul";
					break;
			}
			
			String material = "";
			if(rnd.nextBoolean()){
				material = "Piel";
			} else {
				material = "Sintetico";
			}
			
			String suela = "";
			if(rnd.nextBoolean()){
				suela = "Cuero";
			} else {
				suela = "Plastico";
			}
			
			Zapato newZapato = new Zapato(talla, tieneAgujeta, color, material, suela);
			stock.add(newZapato);
			newZapato.infoZapato();
		}
	}

	public static void main(String[] args){
		Fabrica miFabrica = new Fabrica();
		
	}
	
	
}
