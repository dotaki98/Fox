package unam.fi.poo.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class VentanaPrincipal extends JFrame implements ActionListener{
	// Ventanas auxiliares
	JPanel ventanaNorte;	
	JPanel ventanaSur;	
	JPanel ventanaCentro;	
	JPanel ventanaEste;	
	JPanel ventanaOeste;	

	public VentanaPrincipal() {
		super();		
		this.crearVentanaPrincipal();	
		this.agregarComponentes();
		this.setVisible(true);
	}

	public void crearVentanaPrincipal(){
		this.setTitle("Práctica 9");
		this.setSize(500, 400);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// Crear paneles
		this.ventanaNorte = new JPanel(new FlowLayout());
		this.ventanaSur = new JPanel(new FlowLayout());
		this.ventanaCentro = new JPanel(new FlowLayout());
		this.ventanaEste = new JPanel(new FlowLayout());
		this.ventanaOeste = new JPanel(new FlowLayout());

		// Colorear cada panel
		this.ventanaNorte.setBackground(Color.red);
		this.ventanaCentro.setBackground(Color.cyan);
		this.ventanaSur.setBackground(Color.green);
		this.ventanaEste.setBackground(Color.blue);
		this.ventanaOeste.setBackground(Color.yellow);
		
		// Agregar paneles a la ventana principal
		this.add(this.ventanaNorte, BorderLayout.NORTH);
		this.add(this.ventanaCentro, BorderLayout.CENTER);
		this.add(this.ventanaSur, BorderLayout.SOUTH);
		this.add(this.ventanaEste, BorderLayout.EAST);
		this.add(this.ventanaOeste, BorderLayout.WEST);
	}

	public void agregarComponentes(){
		JLabel etiqueta = new JLabel("Insertar información:");
		JTextField cajaTexto = new JTextField(10);
		JButton boton = new JButton("Aceptar");
		JButton botonBorrar = new JButton("Borrar");

		// Agregar listeners a botones
		boton.addActionListener(this);
		botonBorrar.addActionListener(this);

		// Agregar componentes a ventana principal
		this.ventanaCentro.add(etiqueta);
		this.ventanaCentro.add(cajaTexto);
		this.ventanaCentro.add(boton);
		this.ventanaCentro.add(botonBorrar);

				
	}	
	
	public void actionPerformed(ActionEvent e){
		System.out.println("Evento: "+e.getActionCommand());
	}
}
