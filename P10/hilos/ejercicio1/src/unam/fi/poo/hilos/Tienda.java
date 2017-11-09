package unam.fi.poo.hilos;

public class Tienda {
	
	public static void main(String[] args){

		Cliente client1 = new Cliente("Cliente 1", new int[]{1,2,3,3,4,4,7});
		Cliente client2 = new Cliente("Cliente 2", new int[]{30,1,3});
		Cliente client3 = new Cliente("Cliente 3", new int[]{30,1,3,5,8,9,10});
		
		Cajero cajero = new Cajero("Cajero 1");
		long tiempoInicial = System.currentTimeMillis();

		
		cajero.procesarCompra(client1, tiempoInicial);
		cajero.procesarCompra(client2, tiempoInicial);
		cajero.procesarCompra(client3, tiempoInicial);
		

	}

	
}
