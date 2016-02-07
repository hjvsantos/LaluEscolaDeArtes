package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Cursor;

public class TelaEdicaoFuncionario {

	private JFrame frmLaluAcademiaDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEdicaoFuncionario window = new TelaEdicaoFuncionario();
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
	public TelaEdicaoFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaEdicaoFuncionario.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.setBounds(100, 100, 450, 300);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblLaluAcademiaDe.setBounds(123, 11, 202, 33);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setBounds(37, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExcluir.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnExcluir.setBounds(162, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnExcluir);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConcluir.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnConcluir.setBounds(288, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConcluir);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 57, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		JTextField textField = new JTextField();
		textField.setBounds(50, 55, 352, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 94, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCpf);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(50, 91, 132, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(239, 94, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblRg);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(289, 91, 113, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 162, 61, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTelefone);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(65, 159, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDDeNascimento = new JLabel("D. de nascimento:");
		lblDDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDDeNascimento.setBounds(10, 131, 101, 14);
		frmLaluAcademiaDe.getContentPane().add(lblDDeNascimento);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(107, 128, 32, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBounds(149, 128, 32, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(189, 128, 33, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTelefone_1 = new JLabel("Telefone 2:");
		lblTelefone_1.setBounds(226, 162, 89, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTelefone_1);
		
		JTextField textField_7 = new JTextField();
		textField_7.setBounds(301, 159, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 198, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEmail);
		
		JTextField textField_8 = new JTextField();
		textField_8.setBounds(50, 195, 172, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setBounds(239, 131, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblSalrio);
		
		JTextField textField_9 = new JTextField();
		textField_9.setBounds(282, 128, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setBounds(239, 198, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFuno);
		
		JTextField textField_10 = new JTextField();
		textField_10.setBounds(282, 195, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_10);
		textField_10.setColumns(10);
	}

}
