import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

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
					color = "Café";
					break;
				case 2:
					color = "Azul";
					break;
			}
			
			String material = "";
			if(rnd.nextBoolean()){
				material = "Piel";
			} else {
				material = "Sintético";
			}
			
			String suela = "";
			if(rnd.nextBoolean()){
				suela = "Cuero";
			} else {
				suela = "Plástico";
			}
			
			Zapato newZapato = new Zapato(talla, tieneAgujeta, color, material, suela);
			stock.add(newZapato);
			newZapato.infoZapato();
		}
	}

	public ArrayList<Zapato> getStock(){
		return this.stock;
	}

	public void setStock(ArrayList<Zapato> stock){
		this.stock = stock;
	}

	public Zapato fabricarZapato(){
		Random rnd = new Random();	
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
				color = "Café";
				break;
			case 2:
				color = "Azul";
				break;
		}
		
		String material = "";
		if(rnd.nextBoolean()){
			material = "Piel";
		} else {
			material = "Sintético";
		}
		
		String suela = "";
		if(rnd.nextBoolean()){
			suela = "Cuero";
		} else {
			suela = "Plástico";
		}
		
		Zapato newZapato = new Zapato(talla, tieneAgujeta, color, material, suela);
		return newZapato;
	}
	
	public Zapato fabricarZapatoConCaracteristicas(float talla, boolean tieneAgujeta, String color, String material, String suela){
		Zapato newZapato = new Zapato(talla, tieneAgujeta, color, material, suela);
		return newZapato;
	}

	public boolean checarEquivalenciaModelo(Zapato zapatoIndice, Zapato zapatoRequerido){
		if(zapatoIndice.getTalla() == zapatoRequerido.getTalla() && zapatoIndice.getTieneAgujeta() == zapatoRequerido.getTieneAgujeta() && zapatoIndice.getColor().equals(zapatoRequerido.getColor()) && zapatoIndice.getMaterial().equals(zapatoRequerido.getMaterial()) && zapatoIndice.getSuela().equals(zapatoRequerido.getSuela())){
			return true;
		}
		else {
			return  false;
		}
	}
	
	/* El método "mostrarMenu" muestra la bienvenida en caso de que el parámetro "acabaDeArrancar" es verdadero */
	public void levantarPedido(boolean acabaDeArrancar, ArrayList<Zapato> pedido, Scanner sc){

		if(acabaDeArrancar){
			System.out.println("––––––––––––––––––––––––––––––––––––––––––");
			System.out.println("  EL CALCETIN FELIZ - FABRICA DE ZAPATOS  ");
			System.out.println("––––––––––––––––––––––––––––––––––––––––––");
			System.out.println("   BIENVENIDO A MENU PARA LEVANTAR PEDIDO ");
			System.out.println("––––––––––––––––––––––––––––––––––––––––––");
		}

		int numeroDeZapatos, residuoDecimal;
		float talla;
		boolean tieneAgujeta;
		String color = "", material = "", suela = "";

		boolean volverASolicitar = false;

		do{
			System.out.println("Ingrese talla (desde 10 hasta 42, y sus números medios): ");
			talla = sc.nextFloat();
			talla = (float) (Math.floor(talla * 10) / 10);
			System.out.println("Talla ingresada: "+talla);
			residuoDecimal = (int) ((talla - Math.floor(talla)) * 10);
			volverASolicitar = false;
			if(!((residuoDecimal == 0 || residuoDecimal == 5) && (talla >= 10 && talla<=42.5))){
				volverASolicitar = true;
				System.out.println("Opción incorrecta. Vuelva a intentarlo");
			}
		} while(volverASolicitar);
		String opcion;

		do{
			System.out.println("Ingrese si desea agujetas o no (s: Sí. n: No): ");
			opcion = sc.next();
			tieneAgujeta = opcion.equalsIgnoreCase("s");
			volverASolicitar = false;
			if(!tieneAgujeta && !opcion.equalsIgnoreCase("n")){
				volverASolicitar = true;
				System.out.println("Opción incorrecta. Vuelva a intentarlo");
			}
		} while(volverASolicitar);
		
		do{
			System.out.println("Ingrese el color (1: Negro. 2: Café. 3: Azul): ");
			int opcionDiscreta = sc.nextInt();
			volverASolicitar = false;
			switch(opcionDiscreta){
				case 1:
					color = "Negro";
					break;
				case 2:
					color = "Café";
					break;
				case 3:
					color = "Azul";
					break; 
				default:
					volverASolicitar = true;
					System.out.println("Opción incorrecta. Vuelva a intentarlo");
			}
		} while(volverASolicitar);
		

		do{
			System.out.println("Ingrese el material (1: Piel. 2: Sintético.): ");
			int opcionDiscreta = sc.nextInt();
			volverASolicitar = false;
			switch(opcionDiscreta){
				case 1:
					material = "Piel";
					break;
				case 2:
					material = "Sintético";
					break;
				default:
					volverASolicitar = true;
					System.out.println("Opción incorrecta. Vuelva a intentarlo");
			}
		} while(volverASolicitar);

	
		do{
			System.out.println("Ingrese el tipo de suela (1: Cuero. 2: Plástico.): ");
			int opcionDiscreta = sc.nextInt();
			volverASolicitar = false;
			switch(opcionDiscreta){
				case 1:
					suela = "Cuero";
					break;
				case 2:
					suela = "Plástico";
					break;
				default:
					volverASolicitar = true;
					System.out.println("Opción incorrecta. Vuelva a intentarlo");
			}
		} while(volverASolicitar);
		
		do{
			System.out.println("Introduzca el número de zapatos requeridos: ");
			numeroDeZapatos = sc.nextInt();
			if(numeroDeZapatos < 1){
				volverASolicitar = true;
				System.out.println("Opción incorrecta. Vuelva a intentarlo");
			}
		}while(volverASolicitar);
		
		for(int i=1; i<=numeroDeZapatos; i++){
			pedido.add(new Zapato(talla, tieneAgujeta, color, material, suela));
		}
		
		boolean masZapatos = false;
		do{
			System.out.println("Ingrese si desea agregar más zapatos al pedido (s: Sí. n: No): ");
			opcion = sc.next();
			masZapatos = opcion.equalsIgnoreCase("s");		
		} while(!masZapatos && !opcion.equalsIgnoreCase("n"));
		
		if(masZapatos){
			this.levantarPedido(false, pedido, sc);
		} else {
			System.out.println("––––––––––––––––––––––––––––––––––––––––––");
			System.out.println("             PEDIDO REALIZADO");
			System.out.println("––––––––––––––––––––––––––––––––––––––––––");
			for(int i = 0; i<pedido.size(); i++){
				Zapato zapato = pedido.get(i);
				int cantidad = 1;
				while(i < (pedido.size() -1) && this.checarEquivalenciaModelo(zapato, pedido.get(i+1))){
					cantidad++;
					i++;
				}
				zapato.infoZapato();
				System.out.println("CANTIDAD: "+cantidad);
			}
			System.out.println("----------------------");	
		}
				

	}	
	
	public ArrayList<Zapato> checarExistencias(ArrayList<Zapato> pedido){
		ArrayList<Zapato> paqueteDeZapatos = new ArrayList<Zapato>();

		System.out.println("\n––––––––––––––––––––––––––––––––––––––––––");
		System.out.println("          REVISANDO EXISTENCIAS");
		System.out.println("––––––––––––––––––––––––––––––––––––––––––\n");

		for(int i = pedido.size() - 1; i>=0; i--){
			for(int j = this.stock.size() - 1; j>=0; j--){
				if(checarEquivalenciaModelo(pedido.get(i), stock.get(j))){
					paqueteDeZapatos.add(stock.remove(j));
					System.out.println("El modelo: ");
					pedido.get(i).infoZapato();
					System.out.println("se obtuvo desde el stock.");
					pedido.remove(i);
					stock.add(this.fabricarZapato());
					break;
				}
			}
		}
		for(int i = pedido.size() - 1; i>=0; i--){
			float talla = pedido.get(i).getTalla();
			boolean tieneAgujeta = pedido.get(i).getTieneAgujeta();
			String color = pedido.get(i).getColor();
			String material = pedido.get(i).getMaterial();
			String suela = pedido.get(i).getSuela();
			Zapato zapatoNuevo = this.fabricarZapatoConCaracteristicas(talla, tieneAgujeta, color, material, suela);
			paqueteDeZapatos.add(zapatoNuevo);
			pedido.remove(i);
			System.out.println("\nEl modelo: ");
			zapatoNuevo.infoZapato();
			System.out.println("tuvo que ser fabricado al momento de acuerdo a las especificaciones.\n");
		}
		return paqueteDeZapatos;
	}
			
		
	public static void main(String[] args){
		Fabrica miFabrica = new Fabrica();
		ArrayList<Zapato> pedido = new ArrayList<Zapato>();
		Scanner sc = new Scanner(System.in);
		miFabrica.levantarPedido(true, pedido, sc);
		ArrayList<Zapato> paqueteConPedido = miFabrica.checarExistencias(pedido);
		sc.close();		
	}
	
	
}
