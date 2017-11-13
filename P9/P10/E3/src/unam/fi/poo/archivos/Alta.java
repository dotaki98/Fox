package unam.fi.poo.archivos;

import java.io.*;

public class Alta {
  private final String ruta = "./usuarios.txt";

	// Getter de ruta
	public String getRuta(){
		return this.ruta;
	}

	public void darDeAlta(String nombre, String apellidoPaterno, String apellidoMaterno, String edad) throws IOException{
		/* Se crea un objeto de tipo File para verificar la existencia del archivo,
		 * en caso de que no exista se crea al momento */
		File archivo = new File(this.ruta);
		if(!archivo.exists()){
			archivo.createNewFile();
		}

		/* El constructor de FileWriter puede recibir un objeto File como parámetro.
		 * Esta clase nos permite escribir caracteres a un archivo */
		FileWriter fw = new FileWriter(archivo, true);

		/* Se emplea la clase BufferedWriter para evitar escribir caracter por caracter
		 * y así reducir el número de accesos al disco duro */
		BufferedWriter bw = new BufferedWriter(fw);

    String nuevoUsuario = nombre + "," + apellidoPaterno + "," + apellidoMaterno + "," + edad + "\n";
    bw.write(nuevoUsuario);

    System.out.println("Nuevo usuario añadido a: "+ruta);

		/* Se cierran los objetos escritores para permitir
		 * que otros procesos puedan tener acceso al archivo empleado */
		bw.close();
		fw.close();
	}

}
