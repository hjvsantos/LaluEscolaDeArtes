package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;

public class TelaMatricula {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMatricula window = new TelaMatricula();
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
	public TelaMatricula() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaMatricula.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setBounds(100, 100, 450, 300);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblLaluAcademiaDe.setBounds(126, 11, 202, 33);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 53, 31, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(51, 50, 373, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setBounds(10, 85, 99, 14);
		frmLaluAcademiaDe.getContentPane().add(lblDataDeNascimento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 82, 24, 17);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setBounds(139, 85, 10, 14);
		frmLaluAcademiaDe.getContentPane().add(label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(147, 82, 24, 17);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_1 = new JLabel("/");
		label_1.setBounds(175, 85, 4, 14);
		frmLaluAcademiaDe.getContentPane().add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(181, 81, 38, 17);
		frmLaluAcademiaDe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(241, 81, 24, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCpf);
		
		textField_5 = new JTextField();
		textField_5.setBounds(268, 78, 156, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 151, 58, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEndereo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(61, 148, 363, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 179, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCidade);
		
		textField_7 = new JTextField();
		textField_7.setBounds(51, 117, 225, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(160, 179, 31, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCep);
		
		textField_8 = new JTextField();
		textField_8.setBounds(190, 176, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblFone = new JLabel("Fone:");
		lblFone.setBounds(282, 179, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFone);
		
		textField_9 = new JTextField();
		textField_9.setBounds(317, 176, 107, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 120, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEmail);
		
		textField_10 = new JTextField();
		textField_10.setBounds(54, 176, 95, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(294, 120, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblRg);
		
		textField_11 = new JTextField();
		textField_11.setBounds(317, 117, 107, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(102, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnPrximo.setBorder(new CompoundBorder());
		btnPrximo.setBounds(241, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnPrximo);
		
		
	}

}
