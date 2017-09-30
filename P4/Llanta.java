import java.util.Scanner;
public class Llanta{
	public String material;
	public int diametro;
	public int presion;
	
	Scanner sc =new Scanner(System.in);
	
	public String getMaterial(){
		return this.material;
	}

	public void setMaterial(String material){
		this.material = material;
	}

	public int getDiametro(){
		return this.diametro;
	}

	public void setDiametro(int diametro){
		this.diametro = diametro;
	}

	public int getPresion(){
		return this.presion;
	}

	public void setPresion(int presion){
		this.presion = presion;
	}

	
		
	public void aumentarPresion(int cantidad){
		public int incremento;
		System.out.println("La cantidad actual de la presion de las llantas es de"+cantidad);
		System.out.println("Por favor ingrese la presión que deseas aumentar");
		incremento=sc.nextInt();
		cantidad=cantidad+incremento;
		System.out.println("El incremento se ha aplicado, la presión actual es de:"+cantidad);
	}
	
	public void disminuirPresion(int cantida){
		public int decremento;
		System.out.println("La cantidad actual de la presion de las llantas es de"+cantidad);
		System.out.println("Por favor ingrese la presión que deseas disminuir");
		decremento=sc.nextInt();
		cantidad=cantidad+decremento;
		System.out.println("El incremento se ha aplicado, la presión actual es de:"+cantidad);
	}
}

