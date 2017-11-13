package unam.fi.poo.hilos;

public class Cajero extends Thread{

	private String nombre;
	private Cliente cliente;
	private long tiempoInicial;
	
	public Cajero(String nombre, Cliente cliente, long tiempoInicial){
		this.nombre = nombre;
		this.cliente = cliente;
		this.tiempoInicial = tiempoInicial;
	}
	
	public void run(){
		sop(this.nombre,"Comienza a cobrar al cliente:"+this.cliente.getNombre()+" en el tiempo:"+(System.currentTimeMillis()-this.tiempoInicial)/1000 +" segundos");
		
		for(int i=0;i<this.cliente.getCarrito().length;i++){
			System.out.println("Procesando Articulo "+(i+1) );
			this.procesaArticulo(this.cliente.getCarrito()[i]);
			sop(this.nombre,"Procesando Articulo "+(i+1)+" tiempo("+(System.currentTimeMillis()-this.tiempoInicial)/1000 +") segundos" );		}
		
		sop(this.nombre,"termina el proceso de cobro en el tiempo:"+(System.currentTimeMillis()-this.tiempoInicial)/1000 +" segundos");
	}
	
	public void procesaArticulo(int tiempoArticulo){
		try {
			Thread.sleep(tiempoArticulo*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sop(String cajero,String mensaje){
		System.out.println("Proceso("+cajero+")>>Mensaje:"+mensaje);
	}
}
