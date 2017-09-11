import java.util.Random;
import java.util.ArrayList;

public class Distribuidora{
	private ArrayList vehiculos = new ArrayList(); // ArrayList de vehiculos, ya sean motocicletas o automóviles
	private Fabrica fabrica = new Fabrica("Fabrica de autos", "Av. del IMAN 704"); // Se crea una instancia de la clase fábrica con un nombre y dirección
	Random rnd = new Random(); // Objeto rnd de la clase Random para poder generar aleatoriamente el número de autos y motocicletas
	public static void main(String[] args){
		Distribuidora miDistribuidora = new Distribuidora();
		int numero_de_autos = ((miDistribuidora.rnd.nextInt(5)))+1; // Número de autos entre 1 y 5
		int numero_de_motos = 5 - numero_de_autos; // Número de motocicletas necesario para completar 5 vehículos
		System.out.println(numero_de_autos+" autos y "+numero_de_motos+" motos serán fabricados.");
		for(int i = 1; i<= numero_de_autos; i++) {
			miDistribuidora.vehiculos.add(miDistribuidora.fabrica.fabricarVehiculo(true)); // Se crean los autos llamando al método fabricarVehiculo del objeto fábrica con argumento true,
		}						    // para indicar que se solicita un auto
		for(int i = 1; i<= numero_de_motos; i++) {
			miDistribuidora.vehiculos.add(miDistribuidora.fabrica.fabricarVehiculo(false)); // Cuando se llama al método fabricarVehiculo con argumento false se indica que se requieren motocicletas
		}
		for(int i = 0; i<miDistribuidora.vehiculos.size(); i++) {
			System.out.println(miDistribuidora.vehiculos.get(i).toString()); // Se imprimen las caracteristicas del vehiculo mediante el método toString sobreescrito
		}
		for(int i = 0; i<5; i++) {
			System.out.println("Probando vehículo número "+(i+1));
			String tipo_de_vehiculo = miDistribuidora.vehiculos.get(i).getClass().getName();
			if(tipo_de_vehiculo == "Motocicleta"){
				Motocicleta moto_en_prueba = (Motocicleta) miDistribuidora.vehiculos.get(i);
				Silenciador accesorio = moto_en_prueba.getAccesorio();
				if(accesorio != null){ // En caso de que el vehículo cuente con accesorio, se procede a probarlo
					accesorio.suprimirRuido();
				}
			} else {
				Automovil auto_en_prueba = (Automovil) miDistribuidora.vehiculos.get(i);
				Quemacocos accesorio = auto_en_prueba.getAccesorio();
				if(accesorio != null){// En caso de que el vehículo cuente con accesorio, se procede a probarlo
					accesorio.abrir(); // Como el accesorio es un quemacocos, se procede a ejecutar sus métodos
					accesorio.cerrar();
				}
			}
		}
	}
}
