package unam.fi.poo.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class VentanaPrincipal extends JFrame implements ActionListener{
	// Paneles auxiliares
	JPanel panelSuperior;
	JPanel panelCentro;	
	JPanel panelInferior;
	// Creación del layout
	GridBagLayout layout = new GridBagLayout();
	GridBagConstraints constraints = new GridBagConstraints();

	public VentanaPrincipal() {
		super();		
		this.crearVentanaPrincipal();	
		this.agregarComponentes();
		this.setVisible(true);
	}

	public void crearVentanaPrincipal(){
		this.setTitle("SCD");
		this.setSize(350, 300);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void agregarComponentes(){
		JLabel etiquetaSuperior = new JLabel("Sistema de Captura de Datos");
		//constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.PAGE_START;
		constraints.gridwidth = 6;
		constraints.weighty = 1;
		panelSuperior = new JPanel(new FlowLayout());
		panelSuperior.setBackground(Color.white);
		panelSuperior.setLayout(layout);
		panelSuperior.add(etiquetaSuperior, constraints);
		constraints.gridwidth = 1;
		constraints.weighty = 0;
		constraints.anchor = GridBagConstraints.CENTER;

		JLabel etiquetaNombre = new JLabel("Nombre:", SwingConstants.CENTER);
		//constraints.fill = GridBagConstraints.NONE;
		//constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.weightx = 1;
		constraints.weightx = 0;
		constraints.gridwidth = 3;
		panelSuperior.add(etiquetaNombre, constraints);
		constraints.fill = GridBagConstraints.NONE;

		JTextField cajaNombre = new JTextField(10);
		//constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 3;
		constraints.gridy = 3;
		//constraints.weightx = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		panelSuperior.add(cajaNombre, constraints);

		JLabel etiquetaApellidoPaterno = new JLabel("Apellido Paterno:");
		//constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.anchor = GridBagConstraints.LINE_END;
		//constraints.gridwidth = 2;
		panelSuperior.add(etiquetaApellidoPaterno, constraints);

		JTextField cajaApellidoPaterno = new JTextField(10);
		//constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 3;
		constraints.gridy = 4;
		constraints.anchor = GridBagConstraints.CENTER;
		panelSuperior.add(cajaApellidoPaterno, constraints);

		JLabel etiquetaApellidoMaterno = new JLabel("Apellido Materno:");
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.anchor = GridBagConstraints.LINE_END;
		panelSuperior.add(etiquetaApellidoMaterno, constraints);

		JTextField cajaApellidoMaterno = new JTextField(10);
		constraints.gridx = 3;
		constraints.gridy = 5;
		constraints.anchor = GridBagConstraints.CENTER;
		panelSuperior.add(cajaApellidoMaterno, constraints);

		JLabel etiquetaEdad = new JLabel("Edad:");
		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.anchor = GridBagConstraints.LINE_END;
		panelSuperior.add(etiquetaEdad, constraints);

		JTextField cajaEdad = new JTextField(10);
		constraints.gridx = 3;
		constraints.gridy = 6;
		constraints.anchor = GridBagConstraints.CENTER;
		panelSuperior.add(cajaEdad, constraints);
		this.add(panelSuperior, BorderLayout.NORTH);

		panelCentro = new JPanel(new FlowLayout());
		panelCentro.setBackground(Color.gray);
		constraints.weighty = 1;

		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.PAGE_END;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		JButton botonCancelar = new JButton("Cancelar");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weightx = 1;
		panelCentro.add(botonCancelar, constraints);

		JButton botonBorrar = new JButton("Borrar");
		constraints.gridwidth = 2;
		constraints.gridx = 2;
		constraints.gridy = 0;
		panelCentro.add(botonBorrar, constraints);

		JButton botonAceptar = new JButton("Aceptar");
		constraints.gridx = 4;
		constraints.gridy = 0;
		panelCentro.add(botonAceptar, constraints);
		this.add(panelCentro, BorderLayout.CENTER);

		panelInferior = new JPanel(new FlowLayout());
		panelInferior.setBackground(Color.white);
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.CENTER;
		JLabel etiquetaEstadoActual = new JLabel("¡Bienvenido al Sistema!");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 6;
		constraints.gridheight = 3;
		constraints.weighty = 1;
		panelInferior.add(etiquetaEstadoActual, constraints);
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
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
