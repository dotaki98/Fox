import controlador.clases.*; 
import modelo.clases.*; 
import vista.clases.*; 

public class ClasePrincipal {
	
	public static void main(String[] args){
		Vista vista = new Vista();
		Controlador controlador = new Controlador();
		Modelo modelo = new Modelo();

		System.out.println("Valor vista.mensaje: "+vista.getMensaje());
		System.out.println("Valor controlador.mensaje: "+controlador.getMensaje());
		System.out.println("Valor modelo.mensaje: "+modelo.getMensaje());
	}

}
