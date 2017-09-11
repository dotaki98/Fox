import java.util.Random;
import java.util.ArrayList;

public class Distribuidora{
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>(); // ArrayList de vehiculos, ya sean motocicletas o automóviles
	private Fabrica fabrica = new Fabrica("Fabrica de autos", "Av. del IMAN 704"); // Se crea una instancia de la clase fábrica con un nombre y dirección
	Random rnd = new Random(); // Objeto rnd de la clase Random para poder generar aleatoriamente el número de autos y motocicletas
	public static void main(String[] args){
		int numero_de_autos = ((rnd.nextInt()) % 4)+1; // Número de autos entre 1 y 5
		int numero_de_motos = 5 - numero_de_autos; // Número de motocicletas necesario para completar 5 vehículos
		for(int i = 1; i<= numero_de_autos; i++) {
			vehiculos.add(fabrica.fabricarVehiculo(1)); // Se crean los autos llamando al método fabricarVehiculo del objeto fábrica con argumento 1,
		}						    // para indicar que se solicita un auto
		for(int i = 1; i<= numero_de_motos; i++) {
			vehiculos.add(fabrica.fabricarVehiculo(0)); // Cuando se llama al método fabricarVehiculo con argumento 0 se indica que se requieren motocicletas
		}
		for(int i = 0; i<vehiculos.size(); i++) {
			Vehiculo indice = vehiculos.get(i); // Se obtiene el vehiculo almacenado en la posicion i
			System.out.println(indice.toString()); // Se imprimen las caracteristicas del vehiculo mediante el método toString sobreescrito
		}
		for(int i = 0; i<vehiculos.size(); i++) {
			Vehiculo vehiculo_en_prueba = vehiculos.get(i); // Se selecciona vehículo por vehículo para relaizar las pruebas.
			vehiculo_en_prueba.acelerar();
			vehiculo_en_prueba.frenar();
			if(vehiculo_en_prueba.accesorio != null){ // En caso de que el vehículo cuente con un accesorio, se procede a realizar sus pruebas
				String tipo_de_accesorio = vehiculo_en_prueba.accesorio.getClass().getName(); // Mediante los métodos .getClass().getName()
				if(tipo_de_accesorio == "Quemacocos"){					      // podemos obtener la clase del objeto convertida a String
					vehiculo_en_prueba.getAccesorio().abrir(); // Si el accesorio es un quemacocos, se procede a ejecutar sus métodos
					vehiculo_en_prueba.getAccesorio().cerrar();
				} else {
					vehiculo_en_prueba.getAccesorio().suprimirRuido(); // Si el accesorio no es un quemacocos, entonces es un silenciador, por lo que se prueba
				}
			}
		}
	}
}
