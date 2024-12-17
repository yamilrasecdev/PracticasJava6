package hacermientras;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class problema001 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JTextArea txtArea;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
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
					problema001 frame = new problema001();
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
	public problema001() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar001");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(463, 11, 102, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 53, 436, 519);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		btnNewButton = new JButton("Procesar2");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(473, 55, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Procesar 3");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(476, 103, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Procesar 4");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(476, 160, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Procesar 6");
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBounds(473, 216, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Procesar 9");
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setBounds(491, 280, 89, 23);
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
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {

		//declaramos variable
		int termino=1;
		int suma=0;
		
		
		
		txtArea.setText("");
		do {
			txtArea.append(termino+"\n");
			suma=suma+termino;
		
			termino=termino+1;		
		}while(termino<=100);
		
		txtArea.append("SUMA :" + suma);
		
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		
		//declaro
		int termino=3;
		int suma =0;
		
		
		txtArea.setText("");
		do {
			txtArea.append(termino+"\n");
			suma=suma+termino;
			
			termino=termino+7;
			
		}while(termino<=94);
		
		txtArea.append("SUMA :" + suma);
		
		
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		int termino=5;
		int suma=0;
		int contadorSerie=0;
		
		txtArea.setText("");
		do {
			txtArea.append(termino+"\n");
			//sumo acumulo
			suma=suma+termino;
			//genero siguiente termino serie
			termino=termino+6;
			//termino+=6;
			//aumento contador 
			contadorSerie=contadorSerie+1;
			
		}while (contadorSerie<5);
		
		
		txtArea.append("SUMA :" + suma);
		
		
	}
	protected void actionPerformedBtnNewButton_2(ActionEvent e) {
		
		int numerador=2;
		int denominador=5;
		
		double suma=0;
		int contadorIteracciones=0;
		
		
		txtArea.setText("");
		do {
			//imprimir
			txtArea.append(numerador+"/"+denominador +"\n");
			//acumular total
			suma=suma+ numerador*1.0/denominador;
			//genero el termino siguiente
			numerador=numerador+3;
			denominador=denominador+4;
			
			//contadorIteracciones=contadorIteracciones+1;
			contadorIteracciones++;
			
		} while(contadorIteracciones<75);
		
		txtArea.append("SUMA :" + suma);
		
	}
	protected void actionPerformedBtnNewButton_3(ActionEvent e) {
		
		int terminoA=7;
		int terminoB=12;
		int terminoC=18;
		
		txtArea.setText("");
		
		do {
			txtArea.append(terminoA +"\t"+terminoB+"\t"+terminoC+"\n");
			terminoA=terminoA-1;
			terminoB=terminoB-2;
			terminoC=terminoC-3;
			
			
		} while(terminoA>=1);
			
		
	}
	protected void actionPerformedBtnNewButton_4(ActionEvent e) {
		//declarar variables
		int sumatotal=0;
		int cantidadPares=0;
		int sumaPares=0;
		int cantidadImpares=0;
		int sumaImpares=0;
		
		
		int numeroAleatorio;
		
		txtArea.setText("");
		
		do {
			numeroAleatorio= (int) ((999-100+1)*Math.random()+100);
			txtArea.append(numeroAleatorio+ "\n");
			sumatotal=sumatotal+numeroAleatorio;
			
			if (numeroAleatorio%2 ==0) {
				cantidadPares=cantidadPares+1;
				sumaPares=sumaPares+numeroAleatorio;
				}
			else {
				cantidadImpares=cantidadImpares+1;//cantidadImpares++;
				sumaImpares=sumaImpares+numeroAleatorio;
			}
			
		} while(	!(numeroAleatorio %2==0 && numeroAleatorio>=500)	);
		
		txtArea.append("suma : "+ sumatotal+"\n");
		txtArea.append("suma pares : "+ sumaPares+"\n");
		txtArea.append("cantidad pares :"+ cantidadPares+ "\n");
		
		txtArea.append("suma impares : "+ sumaImpares+"\n");
		txtArea.append("cantidad impares :"+ cantidadImpares+ "\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
