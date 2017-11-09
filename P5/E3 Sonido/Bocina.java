import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Bocina implements LineListener{
	private int volumen;
	
	/* terminoReproduccion es necesario para poder reproducir el sonido de alarma */
	boolean terminoReproduccion = false;

	public Bocina(){//El valor predeterminado del volumen será 10, donde 10 es el valor máximo
		this.volumen = 10;
	}

	public void emitirSonido(){ // Se emite el sonido cuando la alarma le indique que se haga
		String direccionArchivoSonido = "./Alarma.wav";
		File archivoSonido = new File(direccionArchivoSonido);
        try {
            AudioInputStream flujoAudio = AudioSystem.getAudioInputStream(archivoSonido);
 
            AudioFormat formato = flujoAudio.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, formato);
 
            Clip audioClip = (Clip) AudioSystem.getLine(info);
 
            audioClip.addLineListener(this);
 
            audioClip.open(flujoAudio);
             
            audioClip.start();
             
            while (!terminoReproduccion) {
                // wait for the playback completes
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             
            audioClip.close();
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("Archivo de audio no soportado");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Linea de reproduccion de audio no disponible");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error de archivo de audio");
            ex.printStackTrace();
        }	
	}

	public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
         
        if (type == LineEvent.Type.START) {
            System.out.println("Se ha detectado apertura de acceso");
             
        } else if (type == LineEvent.Type.STOP) {
            terminoReproduccion = true;
            System.out.println("----- Simulación ha terminado -----");
        }
 
    }
/*Getters y Setters de la Bocina*/
	public int getVolumen(){
		return this.volumen;
	}

	public void setVolumen(int volumen){
		this.volumen = volumen;
	}
}
