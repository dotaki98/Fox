import java.util.logging.Level;
import java.util.logging.Logger;
public class Saludo { 
	public Saludo(){
		
	}
	public synchronized void saludoEmpleado(String nombre){
		try {
			wait();
			System.out.println("\n"+nombre.toUpperCase() + "-: Buenos días jefe.");
		} catch (InterruptedException ex) {
				Logger.getLogger(Saludo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	public synchronized void saludoJefe(String nombre){
		System.out.println("\n****** "+nombre + "-: Buenos días empleados. ******");
		notifyAll();
	}
}