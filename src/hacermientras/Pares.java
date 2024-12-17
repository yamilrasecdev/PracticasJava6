package hacermientras;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Pares extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtInicio;
	private JTextField txtFin;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextArea txtArea;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pares frame = new Pares();
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
	public Pares() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtInicio = new JTextField();
		txtInicio.setBounds(83, 11, 86, 20);
		contentPane.add(txtInicio);
		txtInicio.setColumns(10);
		
		txtFin = new JTextField();
		txtFin.setBounds(83, 52, 86, 20);
		contentPane.add(txtFin);
		txtFin.setColumns(10);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(244, 10, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Inicio..");
		lblNewLabel.setBounds(10, 14, 63, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fin..");
		lblNewLabel_1.setBounds(10, 55, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 112, 184, 444);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		btnNewButton_1 = new JButton("Problema 8");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(284, 104, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		//declaracion variables
		int inicio;
		int fin;
		
		int numeroEvaluacion;
		
		inicio=Integer.parseInt(txtInicio.getText());
		fin =Integer.parseInt(txtFin.getText());
		
		
		numeroEvaluacion=inicio;
		txtArea.setText("");
		do {
				if (numeroEvaluacion % 2==0)
					txtArea.append(numeroEvaluacion+"\n");
			
			numeroEvaluacion++;
			
		}while(numeroEvaluacion<=fin);
		
		
	}
	
	
	
	
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		int contadorDivores=0;
		
		int divisor=1;
		
		int numeroEvalua;
		
		numeroEvalua=Integer.parseInt(txtInicio.getText());
		
		
		//buscar divores
		txtArea.setText("");
		do
		{
			if(numeroEvalua % divisor ==0) {
				txtArea.append(divisor +"\n");
				
				contadorDivores++;
			}
				
			divisor++;
			
		} while(divisor<=numeroEvalua);
		
		txtArea.append("cantidad divisores"+ contadorDivores+"\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
