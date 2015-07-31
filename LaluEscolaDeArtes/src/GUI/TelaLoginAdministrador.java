package GUI;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaLoginAdministrador {

	private JFrame frmLaluEscolaDe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginAdministrador window = new TelaLoginAdministrador();
					window.frmLaluEscolaDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLoginAdministrador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluEscolaDe = new JFrame();
		frmLaluEscolaDe.setTitle("Lalu Academia de Artes");
		frmLaluEscolaDe.setBounds(100, 100, 450, 300);
		frmLaluEscolaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluEscolaDe.getContentPane().setLayout(null);
		
		JLabel lblAcessoAoSistema = new JLabel(" Acesso ao sistema");
		lblAcessoAoSistema.setFont(new Font("Gisha", Font.PLAIN, 19));
		lblAcessoAoSistema.setBounds(135, 23, 171, 37);
		frmLaluEscolaDe.getContentPane().add(lblAcessoAoSistema);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(167, 186, 89, 23);
		frmLaluEscolaDe.getContentPane().add(btnVoltar);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(167, 152, 89, 23);
		frmLaluEscolaDe.getContentPane().add(btnEntrar);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(91, 79, 46, 14);
		frmLaluEscolaDe.getContentPane().add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(91, 112, 46, 14);
		frmLaluEscolaDe.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(147, 76, 132, 20);
		frmLaluEscolaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 109, 132, 20);
		frmLaluEscolaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

}
