package unam.fi.poo.archivos;

import java.util.Date;
import java.io.*;

public class Log {
  private final String ruta = "./log.txt";

	// Getter de ruta
	public String getRuta(){
		return this.ruta;
	}

	public void nuevaEntradaLog(String mensajeError) {
    Date momentoError = new Date();
		/* Se crea un objeto de tipo File para verificar la existencia del archivo,
		 * en caso de que no exista se crea al momento */
    try{
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

      mensajeError = mensajeError.replaceAll("\\<.*?\\>", "\n");
  		String entradaLog = "---------------\n" + momentoError.toString() + mensajeError + "\n\n\n";
  		bw.write(entradaLog);

      System.out.println("Se añadió entrada de log en: "+ruta);

  		/* Se cierran los objetos escritores para permitir
  		 * que otros procesos puedan tener acceso al archivo empleado */
  		bw.close();
  		fw.close();
    } catch (IOException excepcion) {
      System.out.println(excepcion.getMessage());
    }

	}

}
