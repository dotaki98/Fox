/* Elaborado por: Álvaro Ulises Landázuri Brambila
 * Programación Orientada a Objetos
 * Grupo 7
 * Prof: Ing. Ricardo Martínez Moreno
 * Martes 31 de octubre de 2017 
 */


import java.io.*; // En este paquete se encuentran los métodos para lectura/escritura de archivos
import java.util.Scanner;

public class LectorEscritor{
	// La ruta del archivo sólo puede indicarse a través de código duro
	private final String ruta = "./archivo_prueba.txt";

	// Getter de ruta
	public String getRuta(){
		return this.ruta;
	}

	public void escribirArchivo(String ruta) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		/* Se crea un objeto de tipo File para verificar la existencia del archivo,
		 * en caso de que no exista se crea al momento */
		File archivo = new File(ruta);
		if(!archivo.exists()){
			archivo.createNewFile();
		}

		/* El constructor de FileWriter puede recibir un objeto File como parámetro.
		 * Esta clase nos permite escribir caracteres a un archivo */
		FileWriter fw = new FileWriter(archivo);

		/* Se emplea la clase BufferedWriter para evitar escribir caracter por caracter
		 * y así reducir el número de accesos al disco duro */
		BufferedWriter bw = new BufferedWriter(fw);

		String textoParaInsertar = new String();
		int opcion = 1;
		System.out.println("Escribiendo a "+ruta);

		while(true){
			System.out.println("Introduzca texto para escribir en archivo");
			textoParaInsertar = sc.nextLine();

			/* Cada que se desea escribir una nueva línea al archivo se concatena
			 * la secuencia de escape "\n", que indica un retorno de carro, a la cadena
			 * con el texto ingresado por el usuario */
			bw.write(textoParaInsertar+"\n");
			System.out.println("¿Desea agregar otra línea de texto? (1 = Sí; Cualquier otro número = No):");
			opcion = sc.nextInt();
			sc.nextLine();

			// Se verifica la decisión del usuario
			if(opcion != 1){
				break;
			}
		}

		/* Se cierran el escáner y los objetos escritores para permitir
		 * que otros procesos puedan tener acceso al archivo empleado */
		sc.close();
		bw.close();
		fw.close();
	}

	public void leerArchivo(String ruta) throws IOException{
		/* Creación de objeto lector de archivo, a partir de una ruta dada.
		 * No se verifica la existencia del archivo, puesto que el método
		 * escribirArchivo es invocado antes, y ahí se crea el fichero
		 * si es que no existe aún */
		FileReader fr = new FileReader(ruta);

		/* Se utiliza un BufferedReader para permitir leer de línea en línea
		 * y no caracter por caracter */
		BufferedReader br = new BufferedReader(fr); 

		System.out.println("Leyendo de "+ruta);
		String line = new String(br.readLine());
		
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
		
		/* Se cierran los lectores para permitir que otros procesos tengan
		 * acceso al archivo */
		br.close();
		fr.close();
	}

	/* Cuando el método main no atrapa las excepciones que pueden enviarle
	 * los métodos que se invocan dentro de él y simplemente las lanza,
	 * la ejecución se detendrá en caso de presentarse alguna excepción,
	 * sólo se mostrará el stack trace y el hilo de la JVM desde el que
	 * fue invocado el método main se detendrá, puesto que se usará el
	 * manejador de excepciones predeterminado de la JVM. */
	public static void main(String[] args) throws Exception{
		LectorEscritor ReaderWriter = new LectorEscritor();
		ReaderWriter.escribirArchivo(ReaderWriter.getRuta());
		ReaderWriter.leerArchivo(ReaderWriter.getRuta());
	}

}
