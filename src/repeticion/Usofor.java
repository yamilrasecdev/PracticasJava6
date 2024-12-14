package repeticion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Usofor extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextArea txtArea;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usofor frame = new Usofor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Usofor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 41, 384, 608);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		btnNewButton = new JButton("Ejercicio1");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(517, 69, 114, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Ejercicio 2");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(517, 126, 114, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Ejercicio");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(517, 198, 114, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Procesar");
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBounds(517, 268, 102, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Problema 9");
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setBounds(528, 338, 89, 23);
		contentPane.add(btnNewButton_4);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_4) {
			actionPerformedBtnNewButton_4(e);
		}
		if (e.getSource() == btnNewButton_3) {
			actionPerformedBtnNewButton_3(e);
		}
		if (e.getSource() == btnNewButton_2) {
			actionPerformedBtnNewButton_2(e);
		}
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		int suma=0;
		txtArea.setText("");
		for(int termino=1;termino<=100;termino++) {
			txtArea.append(termino+"\n");
			suma=suma+termino;
		}
		
		txtArea.append("Suma total: "+ suma);
		

	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
	
	int suma =0;
	txtArea.setText("");
	//termino=termino+7
	for(int termino=3;termino<=94;termino+=7) {
		txtArea.append(termino+"\n");
		suma=suma+termino;
	}
	
	txtArea.append("Suma total: "+ suma);
	}
		
	
	protected void actionPerformedBtnNewButton_2(ActionEvent e) {
		
		//declaro 
		int numerador=2;
		int denominador=5;
		double suma=0;
		txtArea.setText("");
		for(int contador=0;contador<75;contador++) {
			txtArea.append(numerador+"/"+denominador+"\n");
			suma=suma+(numerador*1.0/denominador);
			
			numerador=numerador+3;
			denominador=denominador+4;
		}
		
		txtArea.append("Suma total: "+ suma);

		
	}
	protected void actionPerformedBtnNewButton_3(ActionEvent e) {
		
		int columna1=5;
		int columna2=12;
		int columna3=18;
		txtArea.setText("");
		for(int cantidadVeces=0;cantidadVeces<7;cantidadVeces++) {
			txtArea.append(columna1+"\t"+columna2+"\t"+columna3+"\n");
				columna1=columna1+5;
				columna2=columna2-2;
				columna3=columna3-3;
		}
		
	}
	protected void actionPerformedBtnNewButton_4(ActionEvent e) {
		
		
		int notaAleatoria;
		int cantidadNotasAprobada=0;
		int cantidadNotasDesaprobadas=0;
		int suma=0;
		double promedio;
		
		txtArea.setText("");

		for(int contador=1;contador<=40;contador++) {
			
			//genera nota 
			notaAleatoria=(int)(21*Math.random());
			txtArea.append(" "+ notaAleatoria+"\n");
			//totalizo
			suma=suma+notaAleatoria;
			
			
			if(notaAleatoria>=13)
				cantidadNotasAprobada=cantidadNotasAprobada+1;
			else 
				cantidadNotasDesaprobadas=cantidadNotasDesaprobadas+1;
			
		}
		
		
		promedio=suma*1.0/40;
		
		txtArea.append(" Nota promedio : "+ promedio+"\n");
		txtArea.append(" Aprobados : "+ cantidadNotasAprobada+"\n");
		txtArea.append(" desaprobados : "+ cantidadNotasDesaprobadas+"\n");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
