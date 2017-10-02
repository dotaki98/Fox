import java.util.Date;
import java.util.ArrayList;
import java.util.Random;

public class Alarma{
	private String marca, modelo;
	private Panel panel;
	private Bocina bocina;
	private int codigo, tiempoActivacion;
	private Date hora, horaInicio, horaFin;
	private ArrayList<Sensor> sensores;
	private Bateria bateria;
	private boolean corrienteElectrica, esActiva;

	public Alarma(){
		this.marca = "Sony";
		this.modelo = "T500";
		this.panel = new Panel();
		this.bocina = new Bocina();
		this.codigo = 1234;
		this.tiempoActivacion = 10;
		this.hora = new Date();
		this.horaInicio = new Date();
		this.horaFin = new Date();
		Sensor miSensor = new Sensor();
		this.sensores = new ArrayList<Sensor>();
		this.sensores.add(miSensor);
		this.bateria = new Bateria();
		this.corrienteElectrica = true;
		this.esActiva = true;
	}
	
	public void registrarCodigo(int codigo){

	}
	public void activarBocina(){
		this.bocina.emitirSonido();
	}

	public void cambiarHoraInicio(Date horaInicio){
	}

	public void cambiarHoraFin(Date horaFin){
	}

	public void monitorearSensores(){
		for(int i = 0; i < sensores.size(); i++) {
			Sensor sensorEnMonitoreo = sensores.get(i);
			if(sensorEnMonitoreo.enviarEstado() == true) {
				this.activarBocina();
			}
		}
	}

	public void monitorearCorrienteElectrica(){
	}

	public void activarAlarma(){
	}

	public void desactivarAlarma(){
	}

	public void configurarAlarma(){
	}

	public void configurarTiempoActivacion(int tiempoActivacion){
	}

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

	public Panel getPanel(){
		return this.panel;
	}

	public void setPanel(Panel panel){
		this.panel = panel;
	}

	public Bocina getBocina(){
		return this.bocina;
	}

	public void setBocina(Bocina bocina){
		this.bocina = bocina;
	}

	public int getCodigo(){
		return this.codigo;
	}

	public void setCodigo(int codigo){
		this.codigo = codigo;
	}

	public int getTiempoActivacion(){
		return this.tiempoActivacion;
	}

	public void setTiempoActivacion(int tiempoActivacion){
		this.tiempoActivacion = tiempoActivacion;
	}

	public Date getHora(){
		return this.hora;
	}

	public void setHora(Date hora){
		this.hora = hora;
	}

	public Date getHoraInicio(){
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio){
		this.horaInicio = horaInicio;
	}

	public Date getHoraFin(){
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin){
		this.horaFin = horaFin;
	}

	public ArrayList<Sensor> getSensores(){
		return this.sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores){
		this.sensores = sensores;
	}

	public Bateria getBateria(){
		return this.bateria;
	}

	public void setBateria(Bateria bateria){
		this.bateria = bateria;
	}

	public boolean getCorrienteElectrica(){
		return this.corrienteElectrica;
	}

	public void setCorrienteElectrica(boolean corrienteElec){
		this.corrienteElectrica = corrienteElectrica;
	}

	public boolean getEsActiva(){
		return this.esActiva;
	}

	public void setEsActiva(boolean esActiva){
		this.esActiva = esActiva;
	}

	public static void main(String[] args){
		Alarma miAlarma = new Alarma();
		Sensor sensorActivado = miAlarma.sensores.get(0);
		sensorActivado.setTipo("Acceso");
		Random aleatorio = new Random(System.currentTimeMillis());
		int tiempoSimularAperturaAcceso = aleatorio.nextInt(10)+1;
		System.out.println("----- Simulación ha comenzado ----- El sensor detectará una apertura de acceso en "+tiempoSimularAperturaAcceso+" segundos.");
		try {
			Thread.sleep(tiempoSimularAperturaAcceso*1000);
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		sensorActivado.setActiva(true);
		miAlarma.monitorearSensores();
	}

}
