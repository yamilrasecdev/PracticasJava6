package repeticion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class serie1 extends JFrame implements ActionListener {

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
					serie1 frame = new serie1();
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
	public serie1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 58, 383, 318);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(447, 59, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Suma2");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(447, 121, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Suma 3");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(447, 187, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Suma 4");
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBounds(447, 261, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Funcion");
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setBounds(447, 310, 89, 23);
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
		int termino=1;
		int suma =0;
		txtArea.setText("");
		while(termino<=100) {
			txtArea.append(termino+"\n");
			suma=suma+termino;
			termino=termino+1;
		}
		txtArea.append("Suma total :"+suma+"\n");
		
	}
	
	
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		int termino=3;
		int suma=0;
		while(termino<=94) {
			txtArea.append(termino+"\n");
			suma=suma+termino;
			termino=termino+7;
		}
		
		txtArea.append("Suma total :"+suma+"\n");
		
	}
	
	
	protected void actionPerformedBtnNewButton_2(ActionEvent e) {
		
		int termino=5;
		int suma=0;
		int contarVeces=1;
		
		
		
		while(contarVeces<=50) {
			txtArea.append(termino+"\n");
			//acumular
			suma=suma+termino;
			//aumenta el valor de termino de la siguiente valor de la serie
			termino=termino+6;
			// Cuenta la cantidad veces
			contarVeces=contarVeces+1;
		}
		txtArea.append("Suma total :"+suma+"\n");
		

	}
	
	
	
	protected void actionPerformedBtnNewButton_3(ActionEvent e) {
		
		int numerador=2;
		int denominador=5;
		int cantidadVeces=0;
		double suma=0;
		txtArea.setText("");
		while(cantidadVeces<75) {
			//imprimes valor serie
			txtArea.append(numerador+"/"+denominador+"\n");
			//acumulas suma
			suma=suma+(numerador*1.0/denominador);
			//calculamos el sgte valor serie
			numerador=numerador+3;
			denominador=denominador+4;
			
			cantidadVeces=cantidadVeces+1;
		}
		txtArea.append("Suma total :"+suma+"\n");
		
		
	}
	
	
	
	
	
	protected void actionPerformedBtnNewButton_4(ActionEvent e) {
		
		
		double x=0;
		double y;
		txtArea.append(String.format(Locale.US, "%-15.2s%-15.2s\n", "x", "y"));
		while(x<=2.75) {
			y= ((x*x*x)+3*x+1)/((x*x)+2);
			
			// Imprime la pareja de valores x e y 
			txtArea.append(String.format(Locale.US, "%-15.2f%-15.2f\n", x, y));
			
			x=x+0.25;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
