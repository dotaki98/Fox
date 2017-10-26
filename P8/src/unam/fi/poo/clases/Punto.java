package unam.fi.poo.clases;
import java.util.*;
import unam.fi.poo.comunes.*;
public class Punto{

	private Coordenada x;
	private Coordenada y;

	private ArrayList<Coordenada> coordenadas;

	public Punto(){
		this.x = new Coordenada(0);
		this.y = new Coordenada(0);
		coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(this.x);
		coordenadas.add(this.y);
	}


	public Punto(int x, int y){
		this.x = new Coordenada(x);
		this.y = new Coordenada(y);
		coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(this.x);
		coordenadas.add(this.y);
	}
	
	public Coordenada getCoordenadaX(){
		return this.x;
	}

	public Coordenada getCoordenadaY(){
		return this.y;
	}

	public ArrayList<Coordenada> obtenerCoordenadas(){
		return coordenadas;
	} 
	
	public String toString(){
		return "("+x+","+y+") ";
	}
}

