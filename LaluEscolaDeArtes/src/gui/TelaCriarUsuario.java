package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaCriarUsuario {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarUsuario window = new TelaCriarUsuario();
					window.frmLaluAcademiaDe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCriarUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio:");
		lblFuncionrio.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblFuncionrio.setBounds(440, 172, 77, 50);
		frmLaluAcademiaDe.getContentPane().add(lblFuncionrio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(566, 184, 294, 27);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblUsurio.setBounds(440, 260, 64, 50);
		frmLaluAcademiaDe.getContentPane().add(lblUsurio);
		
		textField = new JTextField();
		textField.setBounds(567, 272, 293, 27);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblSenha.setBounds(440, 337, 52, 50);
		frmLaluAcademiaDe.getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(566, 352, 248, 20);
		frmLaluAcademiaDe.getContentPane().add(passwordField);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblSenha_1.setBounds(440, 407, 47, 50);
		frmLaluAcademiaDe.getContentPane().add(lblSenha_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(566, 422, 248, 20);
		frmLaluAcademiaDe.getContentPane().add(passwordField_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(676, 514, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(676, 573, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
	}
}
