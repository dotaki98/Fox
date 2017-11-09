package unam.fi.poo.hilos;

public class Cajero {

	private String nombre;
	
	public Cajero(String nombre){
		this.nombre = nombre;
	}
	
	public void procesarCompra(Cliente cliente, long tiempoInicial){
		sop(this.nombre,"Comienza a cobrar al cliente:"+cliente.getNombre()+" en el tiempo:"+(System.currentTimeMillis()-tiempoInicial)/1000 +" segundos");
		
		for(int i=0;i<cliente.getCarrito().length;i++){
			System.out.println("Procesando Articulo "+(i+1) );
			this.procesaArticulo(cliente.getCarrito()[i]);
			sop(this.nombre,"Procesando Articulo "+(i+1)+" tiempo("+(System.currentTimeMillis()-tiempoInicial)/1000 +") segundos" );		}
		
		sop(this.nombre,"termina el proceso de cobro en el tiempo:"+(System.currentTimeMillis()-tiempoInicial)/1000 +" segundos");
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
