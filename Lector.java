import java.io.*;

public class Lector{
	public void leerArchivo(String ruta) throws IOException{
		InputStream fis = new FileInputStream(ruta);
		InputStreamReader isr = new InputStreamReader(fis);
		int car = isr.read();
		while(car != -1)
		{
			System.out.print((char)car);
			car = isr.read();
		}
		isr.close();
	}

	public static void main(String[] args) throws IOException{
		Lector l = new Lector();
		l.leerArchivo("./archivo_prueba.txt");
	}

}
