package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;

public class TelaPrincipal {

	private JFrame frmLaluEscolaDe;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
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
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluEscolaDe = new JFrame();
		frmLaluEscolaDe.setTitle("Lalu Escola de Artes");
		frmLaluEscolaDe.setBounds(100, 100, 450, 300);
		frmLaluEscolaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluEscolaDe.getContentPane().setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(177, 160, 99, 23);
		frmLaluEscolaDe.getContentPane().add(btnEntrar);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(120, 93, 46, 14);
		frmLaluEscolaDe.getContentPane().add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(120, 132, 34, 14);
		frmLaluEscolaDe.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(167, 90, 117, 20);
		frmLaluEscolaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 129, 117, 20);
		frmLaluEscolaDe.getContentPane().add(passwordField);
		
		JLabel lblNovoCadastro = new JLabel("Novo Cadastro");
		lblNovoCadastro.setForeground(Color.BLUE);
		lblNovoCadastro.setBounds(342, 236, 82, 14);
		frmLaluEscolaDe.getContentPane().add(lblNovoCadastro);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setForeground(Color.BLUE);
		lblSair.setBounds(10, 236, 46, 14);
		frmLaluEscolaDe.getContentPane().add(lblSair);
		
		JLabel lblAcessoAoSistema = new JLabel(" Acesso ao sistema");
		lblAcessoAoSistema.setFont(new Font("Gisha", Font.PLAIN, 19));
		lblAcessoAoSistema.setBounds(135, 23, 171, 37);
		frmLaluEscolaDe.getContentPane().add(lblAcessoAoSistema);
		
		JButton btnAdministardor = new JButton("Administrador");
		btnAdministardor.setBounds(177, 194, 99, 23);
		frmLaluEscolaDe.getContentPane().add(btnAdministardor);
	}
}
