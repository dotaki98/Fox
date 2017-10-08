import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Fabrica{

	//private ArrayList<Zapato> stock=new ArrayList<Zapato>();

	public static void main(String[] args){
		ArrayList<Zapato> stock=new ArrayList<Zapato>();
		//Fabrica miFabrica = new Fabrica();
		//menu(stock);
		Scanner n=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		String color,material, suela,agujeta;
		float talla;
		int op;
		boolean bien=false;
		boolean	Agujeta;
		do{
			System.out.println("********************Bienvenido a la fabrica de zapatos 'El calcetin feliz'*************************");
			System.out.println("Por favor ingrese la opcion que prefiera\n");
			System.out.println("1)Fabricar 100 zapatos aleatoriamente\n");
			System.out.println("2)Fabricar un pedido especifico de zapato\n");
			System.out.println("3)Mostrar los zapatos en stock");
			op=n.nextInt();
			switch(op){
				case 1:
					fabrica100Zapatos(stock);
					bien=true;
					break;
				case 2:
					System.out.println("Ud. selecciono hacer un pedido especifico, a continuación le pediremos los requerimientos");
					System.out.println("Por favor ingrese la talla");
					talla=n.nextFloat();
					System.out.println("Desea que su zapato tenga agujeta: s/n");
					//agujeta=sc.next().charAt(0);
					agujeta=sc.nextLine();
					if(agujeta=="s"||agujeta=="S"){
						Agujeta=true;
					}else{
						Agujeta=false;
					}
					System.out.println("Por favor ingrese el color");
					color=sc.nextLine();
					System.out.println("Por favor ingrese el material");
					material=sc.nextLine();
					System.out.println("Por favor ingrese la suela");
					suela=sc.nextLine();
					Zapato newZapato=new Zapato(talla,Agujeta,color,material,suela);
					newZapato.infoZapato();
					stock.add(newZapato);
					bien=true;
					break;
				case 3:
					for(int i=0;i>stock.size();i++){
						System.out.println(stock.get(i));
					}
					bien=true;
					break;
				default:
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nOpcion incorrecta, empezaremos de nuevo");
					break;
			}
		}while(bien==false);
	}
	

	public static void fabrica100Zapatos(ArrayList<Zapato> stock){

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

}