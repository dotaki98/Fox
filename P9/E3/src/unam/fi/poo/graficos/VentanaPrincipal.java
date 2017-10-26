package unam.fi.poo.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class VentanaPrincipal extends JFrame implements ActionListener{
	// Paneles auxiliares
	JPanel panelNorte;	
	JPanel panelSur;	
	JPanel panelCentro;	
	JPanel panelEste;	
	JPanel panelOeste;	

	BorderLayout layout = new BorderLayout();

	public VentanaPrincipal() {
		super();		
		this.crearVentanaPrincipal();	
		this.agregarComponentes();
		this.setVisible(true);
	}

	public void crearVentanaPrincipal(){
		this.setTitle("SCD");
		this.setSize(500, 400);
		this.setLayout(layout);
		this.layout.setVgap(20);
		this.layout.setHgap(20);
		this.setResizable(false);
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// Crear paneles
		this.panelNorte = new JPanel(new FlowLayout());
		this.panelSur = new JPanel(new FlowLayout());
		this.panelCentro = new JPanel(new FlowLayout());
		this.panelEste = new JPanel(new FlowLayout());
		this.panelOeste = new JPanel(new FlowLayout());

		// Colorear cada panel
		//this.panelNorte.setBackground(Color.red);
		//this.panelCentro.setBackground(Color.cyan);
		//this.panelSur.setBackground(Color.green);
		//this.panelEste.setBackground(Color.blue);
		//this.panelOeste.setBackground(Color.yellow);
		
		// Agregar paneles a la panel principal
		this.add(this.panelNorte, BorderLayout.NORTH);
		this.add(this.panelCentro, BorderLayout.CENTER);
		this.add(this.panelSur, BorderLayout.SOUTH);
		this.add(this.panelEste, BorderLayout.EAST);
		this.add(this.panelOeste, BorderLayout.WEST);
	}

	public void agregarComponentes(){
		JLabel etiquetaSuperior = new JLabel("Sistema de Captura de Datos");
		JLabel etiquetaNombre = new JLabel("Nombre: ");
		JLabel etiquetaApellidoPaterno = new JLabel("Apellido Paterno: ");
		JLabel etiquetaApellidoMaterno = new JLabel("Apellido Materno: ");
		JLabel etiquetaEdad = new JLabel("Edad: ");
		JLabel etiquetaEstadoActual = new JLabel("¡Bienvenido al Sistema!");
		JTextField cajaNombre = new JTextField(10);
		JTextField cajaApellidoPaterno = new JTextField(10);
		JTextField cajaApellidoMaterno = new JTextField(10);
		JTextField cajaEdad = new JTextField(10);
		JButton botonCancelar = new JButton("Cancelar");
		JButton botonBorrar = new JButton("Borrar");
		JButton botonAceptar = new JButton("Aceptar");

		// Agregar listeners a botones
		botonCancelar.addActionListener(this);
		botonBorrar.addActionListener(this);
		botonAceptar.addActionListener(this);

		// Agregar componentes a panel principal
		this.panelNorte.add(etiquetaSuperior);
		this.panelCentro.add(etiquetaNombre);
		this.panelCentro.add(cajaNombre);

				
	}	
	
	public void actionPerformed(ActionEvent e){
		System.out.println("Evento: "+e.getActionCommand());
	}
}
