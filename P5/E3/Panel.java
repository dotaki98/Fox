import java.util.ArrayList;
/*Panel será quien contenga a los botones y por así decirlo, la interfaz*/
public class Panel{
	private ArrayList<Boton> digitos;
	private Boton entrada;

	public Panel(){
		Boton miBoton = new Boton();
		this.digitos = new ArrayList<Boton>();
		this.digitos.add(miBoton);
		this.entrada = new Boton();
	}

	/* Parámetros de los siguientes dos métodos son
	indicados en el diagrama como de tipo "boton",
	sin embargo deberían ser "Boton" */

	public void mostrarValorPantalla(Boton boton){
	}

	public void ejecutarAccion(Boton boton){
	}

	public ArrayList<Boton> getDigitos(){
		return this.digitos;
	}

	public void setDigitos(ArrayList<Boton> digitos){
		this.digitos = digitos;
	}

	public Boton getEntrada(){
		return this.entrada;
	}

	public void setEntrada(Boton entrada){
		this.entrada = entrada;
	}
}
