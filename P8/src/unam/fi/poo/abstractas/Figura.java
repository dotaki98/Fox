package unam.fi.poo.abstractas;

import unam.fi.poo.comunes.Coordenada;
import java.util.*;

public abstract class Figura{
	private	Coordenada posx;
	private Coordenada posy;

	public Figura(){
		this.posx = new Coordenada(0);
		this.posy = new Coordenada(0);
	}

	public Figura(int x, int y){
		this.posx = new Coordenada(x);
		this.posy = new Coordenada(y);
	}

	//metodos abstractos
	public abstract double calcularArea();
	public abstract double calcularPerimetro(); 
	public abstract ArrayList dibujarFigura();

	//metodos comunes a todas las subclases
	public String toString(){
		return "Posicion x:"+this.posx.obtenerValorPrimitivo()+" Posicion y:"+this.posy.obtenerValorPrimitivo();	
	}
	
	public Coordenada getCoordenadaX(){
		return this.posx;
	}

	public Coordenada getCoordenadaY(){
		return this.posy;
	}
}
