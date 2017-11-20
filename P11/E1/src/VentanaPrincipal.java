public class VentanaPrincipal {
	private VentanaAyuda ventanaAyuda;

	public VentanaAyuda getVentanaAyuda() {
		return this.ventanaAyuda;
	}

	public void setVentanaAyuda(VentanaAyuda ventanaAyuda) {
		this.ventanaAyuda = ventanaAyuda;
	}

	public VentanaPrincipal() {
		this.setVentanaAyuda(VentanaAyuda.getInstance());
	}
	
	public void probarSingleton() {
		int hashcode1 = this.ventanaAyuda.hashCode();
		System.out.println("Hashcode de ventanaAyuda: "+hashcode1);
		// Se vuelve a llamar al método getInstance() de la clase VentanaAyuda
		this.ventanaAyuda = VentanaAyuda.getInstance();
		// Se imprime otra vez el hashcode del objeto ventanaAyuda para
		// verificar que se trata del mismo objeto
		int hashcode2 = this.ventanaAyuda.hashCode();
		System.out.println("Hashcode de ventanaAyuda tras volver a invocar método getInstance: "+hashcode2);
		if(hashcode1 == hashcode2) {
			System.out.println("Se trata del mismo objeto dado que los hashcode son iguales.");
		} else {
			System.out.println("Son objetos distintos dado que los hashcodes no coinciden.");
		}

	}
	
	public static void main(String[] args) {
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.probarSingleton();
	}
}
