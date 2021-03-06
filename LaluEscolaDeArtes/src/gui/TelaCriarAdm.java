package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Window.Type;
import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;	

import org.json.JSONException;

import classesBasicas.Administrador;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import negocios.Fachada;

public class TelaCriarAdm {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarAdm window = new TelaCriarAdm();
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
	public TelaCriarAdm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCriarAdm.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblNome.setBounds(146, 170, 64, 50);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(199, 182, 570, 26);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCpf.setBounds(927, 170, 45, 50);
		frmLaluAcademiaDe.getContentPane().add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(971, 182, 143, 26);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNovoLogin = new JLabel("Novo Login:");
		lblNovoLogin.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblNovoLogin.setBounds(460, 278, 76, 50);
		frmLaluAcademiaDe.getContentPane().add(lblNovoLogin);
		
		textField_2 = new JTextField();
		textField_2.setBounds(546, 294, 326, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblSenha.setBounds(479, 335, 50, 50);
		frmLaluAcademiaDe.getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(546, 350, 248, 20);
		frmLaluAcademiaDe.getContentPane().add(passwordField);
		
		JLabel lblSenha_1 = new JLabel("Senha:");
		lblSenha_1.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblSenha_1.setBounds(479, 392, 45, 50);
		frmLaluAcademiaDe.getContentPane().add(lblSenha_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(546, 407, 248, 20);
		frmLaluAcademiaDe.getContentPane().add(passwordField_1);
		
		/*Administrador administrador = new Administrador(null, null, null, null);
		EventoBotaoCadastrarAdm acaoBtnCadastrar = new EventoBotaoCadastrarAdm();*/
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrador administrador = new Administrador(null, null, null);
				if(textField.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Nome' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_2.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Login' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (passwordField.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Senha' encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);

				} else if (passwordField_1.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Confirmar senha' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_1.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'CPF' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else{
					String senha = new String(passwordField.getPassword());
					String senhaConfirma = new String(passwordField_1.getPassword());
					if(senha.equals(senhaConfirma)) {
						administrador.setNome(textField.getText());
						administrador.setSenha(senha);
						administrador.setCPF(textField_1.getText());

						Fachada fachada = new Fachada();
						try {
							fachada.cadastrarAdministrador(administrador);
						} catch (JSONException | IOException e1) {
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Novo Administrador criado com sucesso");
						textField.setText("");
						textField_2.setText("");
						passwordField.setText("");
						//TelaCriarAdm.setVisible(false);
						TelaAbertura telaAbertura = new TelaAbertura();
						telaAbertura.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "As senhas precisam ser iguais!");
						passwordField.setText("");
						passwordField_1.setText("");
					}
				}
			}
		});
		btnConfirmar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmar.setBounds(623, 479, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConfirmar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(623, 539, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		

	}
}
