package unam.fi.poo.graficos;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import unam.fi.poo.excepciones.miExcepcion;

@SuppressWarnings("serial")

public class VentanaPrincipal extends JFrame implements ActionListener{

	// Paneles auxiliares
	JPanel panelPrincipal;
	JPanel panelCaptura;
	JPanel panelSuperior;
	JPanel panelCentro;
	JPanel panelInferior;
	JPanel panelInferiorSuperior;
	JPanel panelInferiorInferior;
	// Etiqueta donde se imprime el estado actual del programa
	JLabel etiquetaEstadoActual;
	// Campos de texto
	JTextField cajaNombre;
	JTextField cajaApellidoPaterno;
	JTextField cajaApellidoMaterno;
	JTextField cajaEdad;
	// Creación del layout
	GridBagLayout layout = new GridBagLayout();
	GridBagConstraints constraints = new GridBagConstraints();
	// Opcion predeterminada
	String opcion = "Alta";


	public VentanaPrincipal() {

		super();
		this.crearVentanaPrincipal();
		this.crearPanelPrincipal();
		this.crearPanelCaptura();
		this.setContentPane(this.panelPrincipal);
		this.setVisible(true);

	}



	public void crearVentanaPrincipal() {

		this.setTitle("Sistema de Captura de Datos");
		this.setSize(400, 350);
		this.setResizable(false);
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}



	public void crearPanelPrincipal(){

		panelPrincipal = new JPanel(new FlowLayout());
		panelPrincipal.setLayout(layout);

		JRadioButton alta = new JRadioButton("Alta");
		alta.setSelected(true);
		JRadioButton baja = new JRadioButton("Baja");
		JRadioButton cambio = new JRadioButton("Cambio");
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(alta);
		grupo.add(baja);
		grupo.add(cambio);
		constraints.weighty = 0.5;
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.gridx = 0;
		constraints.gridy = 0;

		alta.addActionListener(this);
		baja.addActionListener(this);
		cambio.addActionListener(this);

		panelPrincipal.add(alta, constraints);
		constraints.gridy = 1;
		panelPrincipal.add(baja, constraints);
		constraints.gridy = 2;
		panelPrincipal.add(cambio, constraints);

		JButton continuar = new JButton("Continuar");
		constraints.gridx = 3;
		constraints.gridy = 3;
		constraints.weighty = 1;
		constraints.anchor = GridBagConstraints.LINE_END;
		continuar.addActionListener(this);

		this.panelPrincipal.add(continuar, constraints);

	}



	public void crearPanelCaptura(){

		panelCaptura = new JPanel(new FlowLayout());
		panelCaptura.setLayout(new BorderLayout());

		panelSuperior = new JPanel(new FlowLayout());
		panelSuperior.setLayout(layout);

		JLabel etiquetaSuperior = new JLabel("Sistema de Captura de Datos");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weighty = 0;
		constraints.anchor = GridBagConstraints.PAGE_START;

		panelSuperior.add(etiquetaSuperior, constraints);
		panelCaptura.add(panelSuperior, BorderLayout.NORTH);

		panelCentro = new JPanel(new FlowLayout());
		panelCentro.setLayout(layout);
		JLabel etiquetaNombre = new JLabel("Nombre:", SwingConstants.CENTER);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaNombre, constraints);

		cajaNombre = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.CENTER;

		panelCentro.add(cajaNombre, constraints);

		JLabel etiquetaApellidoPaterno = new JLabel("Apellido Paterno:");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.LINE_END;
		panelCentro.add(etiquetaApellidoPaterno, constraints);

		cajaApellidoPaterno = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.CENTER;

		panelCentro.add(cajaApellidoPaterno, constraints);

		JLabel etiquetaApellidoMaterno = new JLabel("Apellido Materno:");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaApellidoMaterno, constraints);

		cajaApellidoMaterno = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.CENTER;

		panelCentro.add(cajaApellidoMaterno, constraints);

		JLabel etiquetaEdad = new JLabel("Edad:");
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaEdad, constraints);
		cajaEdad = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.CENTER;
		panelCentro.add(cajaEdad, constraints);
		panelCaptura.add(panelCentro, BorderLayout.CENTER);

		panelInferior = new JPanel(new FlowLayout());
		panelInferior.setLayout(layout);

		panelInferiorSuperior = new JPanel(new FlowLayout());
		panelInferiorSuperior.setBackground(Color.gray);
		panelInferiorSuperior.setLayout(layout);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 2;
		constraints.weighty = 0;

		JButton botonCancelar = new JButton("Cancelar");
		constraints.gridx = 0;
		constraints.gridy = 0;

		panelInferiorSuperior.add(botonCancelar, constraints);

		JButton botonBorrar = new JButton("Borrar");
		constraints.gridx = 1;
		constraints.gridy = 0;

		panelInferiorSuperior.add(botonBorrar, constraints);
		
		JButton botonAceptar = new JButton("Aceptar");
		constraints.gridx = 2;
		constraints.gridy = 0;

		panelInferiorSuperior.add(botonAceptar, constraints);

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weighty = 0;
		constraints.gridwidth = 3;
		constraints.ipady = -2;
		panelInferior.add(panelInferiorSuperior, constraints);
		panelInferiorInferior = new JPanel(new FlowLayout());
		panelInferiorInferior.setLayout(layout);
		etiquetaEstadoActual = new JLabel("¡Bienvenido al Sistema!", SwingConstants.CENTER);

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 3;
		constraints.gridheight = 3;
		constraints.weighty = 1;
		constraints.weightx = 1;
		constraints.anchor = GridBagConstraints.PAGE_END;
		constraints.fill = GridBagConstraints.BOTH;
		panelInferiorInferior.add(etiquetaEstadoActual, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.ipady = 40;
		panelInferior.add(panelInferiorInferior, constraints);

		// Agregar listeners a botones
		botonCancelar.addActionListener(this);
		botonBorrar.addActionListener(this);
		botonAceptar.addActionListener(this);
		this.panelCaptura.add(panelInferior, BorderLayout.SOUTH);
	}

	public boolean verificarValidezDatos() throws miExcepcion{

		System.out.println("Validando información");
		String mensaje = new String("");
		
		if(cajaNombre.getText().isEmpty()) {
			System.out.println("Nombre vacío");
			mensaje += "El nombre está vacío<br>";
		}
		else if(!cajaNombre.getText().matches("[a-zA-Z]+")) {
			mensaje += "El nombre contiene caracteres inválidos<br>";
		}
		if(cajaApellidoPaterno.getText().isEmpty()) {
			mensaje += "El apellido paterno está vacío<br>";
		}
		else if(!cajaApellidoPaterno.getText().matches("[a-zA-Z]+")) {
			mensaje += "El apellido paterno contiene caracteres inválidos<br>";
		}
		if(cajaApellidoMaterno.getText().isEmpty()) {
			mensaje += "El apellido materno está vacío<br>";
		}
		else if(!cajaApellidoMaterno.getText().matches("[a-zA-Z]+")) {
			mensaje += "El apellido materno contiene caracteres inválidos<br>";
		}
		if(cajaEdad.getText().isEmpty()) {
			mensaje += "La edad está vacía<br>";
		}
		else if(!cajaEdad.getText().matches("[0-9]+")) {
			mensaje += "La edad contiene caracteres inválidos<br>";
		}
		else {

			int edad = Integer.parseInt(cajaEdad.getText());
			if(!(edad >= 18 && edad < 75)) {
				mensaje += "La edad no está en el rango permitido<br>";
			}
		}
		if(mensaje.isEmpty()) {
			String info = cajaNombre.getText() + " " + cajaApellidoPaterno.getText();
			info = info + " " + cajaApellidoMaterno.getText() + " (" + cajaEdad.getText() + ")";
			this.etiquetaEstadoActual.setText(info);
			return true;
		} else {
			mensaje = "<html>" + mensaje;
			mensaje += "</html>";
			this.etiquetaEstadoActual.setText(mensaje);
			//return false;
			throw new miExcepcion("No se puede llenar de ésta manera");

		}

	}

	public void escribirInformacion() {

		System.out.println("Escribiendo información");
		String ruta="./datos.txt";
		String N, AP, AM, E;
		N=this.cajaNombre.getText();
		AP=this.cajaApellidoPaterno.getText();
		AM=this.cajaApellidoMaterno.getText();
		E=this.cajaEdad.getText();
		try{
			Escribir(ruta, N,AP,AM,E);
		}catch(Exception IOException){
			System.out.println("No se pudo registrar");
		}
	}



	public void actionPerformed(ActionEvent e){

		System.out.println("Evento: "+e.getActionCommand());

		switch(e.getActionCommand()) {
			case "Continuar":
				System.out.println("La opcion está marcada como "+opcion);
				switch(opcion) {
					case "Alta":
						this.remove(panelPrincipal);
						this.validate();
						this.repaint();
						System.out.println("Se removió el panel principal");
						this.setContentPane(panelCaptura);
						this.validate();
						this.repaint();
						System.out.println("Se agregaron componentes de captura");
						break;
					case "Baja":
						System.out.println("En construcción");
						break;
					case "Cambio":
						System.out.println("En construcción");
						break;
					default:
						System.out.println("En construcción");
				}
				break;

			case "Cancelar":
				System.out.println("Datos escritos:");
				try{
					leer("./datos.txt");
				}catch(Exception IOException){
					System.out.println("No se pudieron leer los datos");
				}
				this.remove(panelCaptura);
				this.validate();
				this.repaint();
				this.setContentPane(panelPrincipal);
				this.validate();
				this.repaint();
				break;
			case "Borrar":
				this.cajaNombre.setText("");
				this.cajaApellidoPaterno.setText("");
				this.cajaApellidoMaterno.setText("");
				this.cajaEdad.setText("");
				break;
			case "Alta":
				System.out.println("Cambiando opción a Alta");
				opcion = "Alta";
				break;
			case "Baja":
				System.out.println("Cambiando opción a Baja");
				opcion = "Baja";
				break;
			case "Cambio":
				System.out.println("Cambiando opción a Cambio");
				opcion = "Cambio";
				break;
			case "Aceptar":
				try{
					if(this.verificarValidezDatos()) {
					this.escribirInformacion();
					}
				}catch(Exception miExcepcion){
					System.out.println("No se pudo verificar");
				}
				break;
			default:
				System.out.println("Evento no reconocido");
		}
	}

	public void Escribir(String ruta, String Nombre,String apellidoPaterno,String apellidoMaterno,String Edad) throws IOException{
	
		File archivo = new File(ruta);
			if(!archivo.exists()){
				archivo.createNewFile();
			}
		FileWriter fw = new FileWriter(archivo,true);
		BufferedWriter bw = new BufferedWriter(fw);
		String textoParaInsertar = new String();
		textoParaInsertar=apellidoPaterno+','+apellidoMaterno+','+Nombre+','+Edad;
		bw.write(textoParaInsertar+"\n");
		bw.close();
		fw.close();
	}
	
	public void leer(String ruta) throws IOException{
		FileReader fr = new FileReader(ruta);
		BufferedReader br = new BufferedReader(fr); 
		System.out.println("Leyendo de "+ruta);
		String line = new String(br.readLine());
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		fr.close();

	}
}