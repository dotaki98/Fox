public class VentanaAyuda {
	private String nombre;
	private static VentanaAyuda instancia;

	private VentanaAyuda() {

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public static VentanaAyuda getInstance() {
		if(instancia == null) {
			instancia = new VentanaAyuda();
		}
		return instancia;
	}
}
