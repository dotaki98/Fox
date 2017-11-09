import java.io.*;

public class Lector2{
	public void leerArchivo(String ruta) throws IOException{
		//InputStream fis = new FileInputStream(ruta);
		//InputStreamReader isr = new InputStreamReader(fis);
		FileReader fr = new FileReader(ruta);
		int car = fr.read();
		while(car != -1)
		{
			System.out.print(fr.read());
			//car = fr.read();
		}
		fr.close();
	}

	public static void main(String[] args) throws IOException{
		Lector l = new Lector();
		l.leerArchivo("./archivo_prueba.txt");
	}

}
