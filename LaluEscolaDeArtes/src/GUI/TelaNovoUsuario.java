package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaNovoUsuario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovoUsuario window = new TelaNovoUsuario();
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
	public TelaNovoUsuario() {
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
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 63, 38, 37);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(47, 71, 377, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnVoltar = new JButton(" Voltar");
		btnVoltar.setBounds(124, 227, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(223, 227, 89, 23);
		frame.getContentPane().add(btnConfirmar);
		
		JLabel lblUsernmae = new JLabel("Username:");
		lblUsernmae.setBounds(66, 113, 59, 30);
		frame.getContentPane().add(lblUsernmae);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 118, 200, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(82, 142, 38, 30);
		frame.getContentPane().add(lblSenha);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 147, 200, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setBounds(32, 181, 96, 14);
		frame.getContentPane().add(lblConfirmarSenha);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 178, 200, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
