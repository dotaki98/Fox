package unam.fi.poo.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class VentanaCaptura extends JFrame implements ActionListener{
	// Paneles auxiliares
	JPanel panelSuperior;
	JPanel panelCentro;	
	JPanel panelInferior;
	JPanel panelInferiorSuperior;
	JPanel panelInferiorInferior;
	// Creación del layout
	GridBagLayout layout = new GridBagLayout();
	GridBagConstraints constraints = new GridBagConstraints();

	



	public VentanaCaptura() {
		super();		
		this.crearVentanaCaptura();	
		this.agregarComponentes();
		this.setVisible(true);
	}

	public void crearVentanaCaptura() {
		this.setTitle("SCD");
		this.setSize(400, 350);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void agregarComponentes(){

		panelSuperior = new JPanel(new FlowLayout());
		panelSuperior.setLayout(layout);

		JLabel etiquetaSuperior = new JLabel("Sistema de Captura de Datos");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.PAGE_START;

		panelSuperior.add(etiquetaSuperior, constraints);
		this.add(panelSuperior, BorderLayout.NORTH);

		panelCentro = new JPanel(new FlowLayout());
		panelCentro.setLayout(layout);
		JLabel etiquetaNombre = new JLabel("Nombre:", SwingConstants.CENTER);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaNombre, constraints);

		JTextField cajaNombre = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.CENTER;
		
		panelCentro.add(cajaNombre, constraints);

		JLabel etiquetaApellidoPaterno = new JLabel("Apellido Paterno:");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.LINE_END;
		panelCentro.add(etiquetaApellidoPaterno, constraints);

		JTextField cajaApellidoPaterno = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.CENTER;

		panelCentro.add(cajaApellidoPaterno, constraints);

		JLabel etiquetaApellidoMaterno = new JLabel("Apellido Materno:");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaApellidoMaterno, constraints);

		JTextField cajaApellidoMaterno = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.CENTER;

		panelCentro.add(cajaApellidoMaterno, constraints);

		JLabel etiquetaEdad = new JLabel("Edad:");
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaEdad, constraints);

		JTextField cajaEdad = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.CENTER;
		panelCentro.add(cajaEdad, constraints);

		this.add(panelCentro, BorderLayout.CENTER);

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

		JLabel etiquetaEstadoActual = new JLabel("¡Bienvenido al Sistema!", SwingConstants.CENTER);

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

		this.add(panelInferior, BorderLayout.SOUTH);
		// Agregar listeners a botones
		botonCancelar.addActionListener(this);
		botonBorrar.addActionListener(this);
		botonAceptar.addActionListener(this);
	}	
	
	public void actionPerformed(ActionEvent e){
		System.out.println("Evento: "+e.getActionCommand());
	}
}
