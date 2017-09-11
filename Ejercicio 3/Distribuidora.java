import java.util.Random;
import java.util.ArrayList;

public class Distribuidora{
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private Fabrica fabrica = new Fabrica("Fabrica de autos", "Av. del IMAN 704");
	Random rnd = new Random();
	public static void main(String[] args){
		int numero_de_autos = ((rnd.nextInt()) % 4)+1;
		int numero_de_motos = 5 - numero_de_autos;
		for(int i = 1; i<= numero_de_autos; i++) {
			vehiculos.add(fabrica.fabricarVehiculo(1));
			
		}
		for(int i = 1; i<= numero_de_motos; i++) {
			vehiculos.add(fabrica.fabricarVehiculo(0));
		}
		for(int i = 0; i<vehiculos.size(); i++) {
			Vehiculo indice = vehiculos.get(i);
			System.out.println(indice);
		}
		for(int i = 0; i<vehiculos.size(); i++) {
			Vehiculo vehiculo_en_prueba = vehiculos.get(i);
			vehiculo_en_prueba.acelerar();
			vehiculo_en_prueba.frenar();
			if(vehiculo_en_prueba.accesorio != null){
				String tipo_de_accesorio = vehiculo_en_prueba.accesorio.getClass().getName();
				if(tipo_de_accesorio == "Quemacocos"){
					vehiculo_en_prueba.accesorio.abrir();
					vehiculo_en_prueba.accesorio.cerrar();
				} else {
					vehiculo_en_prueba.accesorio.suprimirRuido();
				}
			}
		}
	}
}
