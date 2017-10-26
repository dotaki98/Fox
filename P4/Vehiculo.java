public class Vehiculo{
	private String marca;
	private String modelo;
	private ArrayList<Llanta> Llantas;
	private Motor motor;
	//private Llanta[2];
	public Vehiculo(){
		this.marca="";
		this.modelo="";
		this.motor=new Motor();
		this.Llanta=new ArrayList<Llanta>(); 
	}
	
	public Vehiculo(String marca String modelo){
		this.marca=marca;
		this.modelo=modelo;
	}
	
	public Vehiculo(String marca, String modelo, int llantas){
		this.marca=marca;
		this.modelo=modelo;
		
		if (llantas>=2 && llantas<=4){
			
		}else{
			
		}
	}
	
	public void acelerar(){
		System.out.println("RUM RUM");
	}
	
	public void frenar(){
		this.marca.length();
		System.out.println("Frenando");
	}
	
	public String getMarca()[
		return this.marca;
	]
	 
}