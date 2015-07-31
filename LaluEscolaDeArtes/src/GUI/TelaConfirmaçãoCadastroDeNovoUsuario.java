package GUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaConfirmaçãoCadastroDeNovoUsuario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfirmaçãoCadastroDeNovoUsuario window = new TelaConfirmaçãoCadastroDeNovoUsuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaConfirmaçãoCadastroDeNovoUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNovoUsurio = new JLabel("Novo Usu\u00E1rio");
		lblNovoUsurio.setFont(new Font("Gisha", Font.PLAIN, 22));
		lblNovoUsurio.setBounds(138, 11, 164, 37);
		frame.getContentPane().add(lblNovoUsurio);
		
		JLabel lblAdm = new JLabel("Adm:");
		lblAdm.setBounds(85, 81, 32, 37);
		frame.getContentPane().add(lblAdm);
		
		textField = new JTextField();
		textField.setBounds(127, 89, 200, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(85, 120, 39, 28);
		frame.getContentPane().add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 120, 200, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(170, 162, 89, 23);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(170, 196, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}

}
