import unam.fi.poo.clases.*;
import unam.fi.poo.comunes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Cad extends JFrame{

	public Cad(){
		super();
	        super.setTitle("Cad - Graficador");
	        super.setSize(600,300);     
	        this.setLayout (new BorderLayout());
	                
	        this.agregarComponenteVentana(new JLabel("Bienvenido al Graficador"), BorderLayout.NORTH);
	        //agregamos el método para dibujar una linea
			try{
			this.agregarComponenteVentana(this.dibujarLinea(), BorderLayout.CENTER );        
			}catch(Exception e){
	        //nuevo código
			this.agregarComponenteVentana(new JLabel("ERROR DIVISION ENTRE CERO!!!!"), BorderLayout.CENTER);
			}
	        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        super.setVisible(true);
	}

	public void agregarComponenteVentana(Component c, String posicion){
		this.add(c, posicion);
	}


	public JPanel dibujarLinea(){
		Linea linea = new Linea(1,0,25,0);
		ArrayList puntosLinea = linea.dibujarFigura();
		JPanel panelPuntos = new JPanel();
		panelPuntos.setLayout(new BoxLayout(panelPuntos, BoxLayout.Y_AXIS));
		for(int i=0; i<puntosLinea.size();i++){
			String p = (puntosLinea).get(i).toString();
			panelPuntos.add( new Label(p) );
		}
		return panelPuntos;
	}


	public static void main(String[] args) {
		new Cad();		
				
	}

}
