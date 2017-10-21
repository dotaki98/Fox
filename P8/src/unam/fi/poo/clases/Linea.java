package unam.fi.poo.clases;

import unam.fi.poo.abstractas.Figura;
import unam.fi.poo.comunes.Coordenada;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Linea extends Figura{
	private Coordenada finalx;
	private Coordenada finaly;

	public Linea(int inix,int iniy, int finx, int finy ){
		super(inix,iniy);
		this.finalx = new Coordenada(finx);
		this.finaly = new Coordenada(finy);
	}
	
	public double calcularArea(){
		return new Integer(0).intValue();
	}

	public double calcularPerimetro(){
		return new Integer(0).intValue();
	}

	public ArrayList dibujarFigura(){
		//ecuacion general de la recta: Ax+By+C=0
		//ecuacion con pendiente y punto conocido: y=mx + n;
		//ecuacion con dos puntos conocidos
		//
		//   y - y1 = (x - x1)*(y2 -y1 / x2 - x1 )
		//
		//
		//		
		int x=0;
		int y=0;
		int x1= super.getCoordenadaX().obtenerValorPrimitivo();
		int y1= super.getCoordenadaY().obtenerValorPrimitivo();
		int x2= this.finalx.obtenerValorPrimitivo();
		int y2= this.finaly.obtenerValorPrimitivo();

		ArrayList<Punto> puntosLinea = new ArrayList<Punto>();

		//aplicamos la formula dando valores en el eje de las x's empezando
		//por el valor inicia x1
		//try{
		int pendiente =(int)((y2-y1)/(x2-x1));
		//}catch(Exception e){
		for(x=x1;x<=x2;x++){
			y =  (x - x1)*pendiente+y1;
			puntosLinea.add(new Punto(x,y) );
		}
		//}catch(Exception e){
		//	this.agregarComponenteVentana(new JLabel("La cag´usted"), BorderLayout.NORTH);
		//}
		return puntosLinea; 
	}

	/*public void agregarComponenteVentana(Component c, String posicion){
		this.add(c, posicion);
	}*/
	
	public String toString(){
		return super.toString()+ " Posicion final x:"+finalx+" Posicion final y:"+finaly;
	}
	

}
