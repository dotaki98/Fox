package unam.fi.poo.comunes;
public class Coordenada{
	private Integer valor;
	
	public Coordenada(){
		this.valor = new Integer(1);
	}

	public Coordenada(int d){
		this.valor = new Integer(d);
	}

	public void setValor(int v){
		this.valor = new Integer(v);
	}

	public Integer getValor(){
		return this.valor;
	}


	public int obtenerValorPrimitivo(){
		return this.valor.intValue();
	}

	public String toString(){
		return valor.intValue()+"";	
	}	

}
