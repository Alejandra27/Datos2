package InterfazWB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("hola");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(32, 207, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(210, 21, 171, 20);
		contentPane.add(textPane);
		
		JEditorPane dtrpnDo = new JEditorPane();
		dtrpnDo.setEditable(false);
		dtrpnDo.setText("Cedula");
		dtrpnDo.setBounds(58, 21, 106, 20);
		contentPane.add(dtrpnDo);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBounds(131, 207, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Actualizar");
		btnNewButton_2.setBounds(230, 207, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Consultar");
		btnNewButton_3.setBounds(329, 207, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(210, 52, 171, 20);
		contentPane.add(textPane_1);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setEditable(false);
		txtpnNombre.setText("Nombre");
		txtpnNombre.setBounds(58, 52, 106, 20);
		contentPane.add(txtpnNombre);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBounds(210, 83, 171, 20);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setBounds(210, 114, 171, 20);
		contentPane.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setBounds(210, 145, 171, 20);
		contentPane.add(textPane_5);
		
		JTextPane txtpnSilla = new JTextPane();
		txtpnSilla.setEditable(false);
		txtpnSilla.setText("Silla");
		txtpnSilla.setBounds(58, 83, 106, 20);
		contentPane.add(txtpnSilla);
		
		JTextPane txtpnGenero = new JTextPane();
		txtpnGenero.setEditable(false);
		txtpnGenero.setText("Genero");
		txtpnGenero.setBounds(58, 114, 106, 20);
		contentPane.add(txtpnGenero);
		
		JTextPane txtpnEdad = new JTextPane();
		txtpnEdad.setEditable(false);
		txtpnEdad.setText("Edad");
		txtpnEdad.setBounds(58, 145, 106, 20);
		contentPane.add(txtpnEdad);
	}
}
