package repeticion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Printpares extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnProcesar;
	private JTextField txtInicio;
	private JTextField txtFin;
	private JTextArea txtArea;
	private JLabel inicio;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Printpares frame = new Printpares();
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
	public Printpares() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(283, 31, 89, 23);
		contentPane.add(btnProcesar);
		
		txtInicio = new JTextField();
		txtInicio.setBounds(80, 32, 86, 20);
		contentPane.add(txtInicio);
		txtInicio.setColumns(10);
		
		txtFin = new JTextField();
		txtFin.setBounds(80, 74, 86, 20);
		contentPane.add(txtFin);
		txtFin.setColumns(10);
		
		txtArea = new JTextArea();
		txtArea.setBounds(38, 105, 318, 259);
		contentPane.add(txtArea);
		
		inicio = new JLabel("Inicio");
		inicio.setBounds(10, 35, 46, 14);
		contentPane.add(inicio);
		
		lblNewLabel = new JLabel("Fin");
		lblNewLabel.setBounds(10, 77, 46, 14);
		contentPane.add(lblNewLabel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		
		int inicio;
		int fin;
		
		inicio=Integer.parseInt(txtInicio.getText());
		fin=Integer.parseInt(txtFin.getText());
		int numero=inicio;
		txtArea.setText("");
		while(numero<=fin) {
			if(numero%2==0) {
				//if(numero%2!=0) {
				//}
				txtArea.append(""+numero+"\n");
			}
			numero=numero+1;	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
