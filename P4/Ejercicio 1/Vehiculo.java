import java.util.ArrayList;

public class Vehiculo{
	
	private String marca;
	private String modelo;
	private ArrayList<Llanta> llantas;
	private Motor motor;

	public String getMarca(){
		return this.marca;
	}


	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getModelo(){
		return this.modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public ArrayList<Llanta> getLlantas(){
		return this.llantas;
	}

	public void setLlantas(ArrayList<Llanta> llantas){
		this.llantas = llantas;
	}

	public Motor getMotor(){
		return this.motor;
	}

	public void setMotor(Motor motor){
		this.motor = motor;
	}

	public void acelerar(){
		System.out.println("La clase Vehiculo esta ejecutando el metodo acelerar");
	}

	public void frenar(){
		System.out.println("La clase Vehiculo esta ejecutando el metodo frenar");
	}
}
