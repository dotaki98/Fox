import java.util.Random;
import java.util.Date;
import java.util.ArrayList;

public class Alarma{

	private String marca, modelo;

	private Panel panel;

	private Bocina bocina;

	private int codigo, tiempoActivacion;

	private Date hora= new Date(); 
	private Date horaInicio= new Date();
	private Date horaFin=new Date();

	private ArrayList<Sensor> sensores=new ArrayList<Sensor>();

	private Bateria bateria;

	private boolean corrienteElectrica, esActiva;



	public void registrarCodigo(int codigo){



	}

	public void activarBocina(){

	}



	public void cambiarHoraInicio(Date horaInicio){

	}



	public void cambiarHoraFin(Date horaFin){

	}



	public void monitorearSensores(){

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
	Alarma Alarmita = new Alarma();
	Random aleatorio = new Random(System.currentTimeMillis());
	int tiempo=aleatorio.nextInt(10)+1;
	Sensor miSensor= new Sensor();
	boolean activa=true;
	Alarma miAlarma = new Alarma();
	System.out.println("***************SIMULACIÓN ACTIVADA****************\nEsperando a que el sensor se active en:"+tiempo+"segundos");
	Thread.sleep(tiempo*1000);
	Alarmita.setSensores(miSensor.setActiva(activa));
	}
}

