package unam.fi.poo.hilos;

public class Tienda {
	
	public static void main(String[] args){

		Cliente client1 = new Cliente("Cliente 1", new int[]{1,2,3,});
		Cliente client2 = new Cliente("Cliente 2", new int[]{5,6,9});
		Cliente client3 = new Cliente("Cliente 3", new int[]{7,8,4});
		
		long tiempoInicial = System.currentTimeMillis();
		Cajero cajero1 = new Cajero("Cajero 1", client1, tiempoInicial);
		Cajero cajero2 = new Cajero("Cajero 2", client2, tiempoInicial);
		Cajero cajero3 = new Cajero("Cajero 3", client3, tiempoInicial);

		
		cajero1.start();
		cajero2.start();
		cajero3.start();
		

	}

	
}
