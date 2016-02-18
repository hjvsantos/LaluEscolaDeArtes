package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Window;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Cursor;
import java.text.ParseException;

import javax.swing.JFormattedTextField;  
import javax.swing.text.MaskFormatter;

import java.text.ParseException;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroFuncionario {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JFormattedTextField textField_3;
	private JFormattedTextField textField_5;
	private JFormattedTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblEndereo;
	private JTextField textField_11;
	private JLabel lblCep;
	private JTextField textField_12;
	private JLabel lblCidade;
	private JTextField textField_13;
	private JLabel lblBairro;
	private JTextField textField_14;
	private JLabel lblNmero;
	private JTextField textField_15;
	private JLabel lblEstado;
	private MaskFormatter ftmData;
	private JLabel lblComplemento;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFuncionario window = new TelaCadastroFuncionario();
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
	public TelaCadastroFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.getContentPane().setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastroFuncionario.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblNome.setBounds(218, 134, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(261, 131, 595, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCpf.setBounds(885, 134, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(277, 237, 132, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblRg.setBounds(218, 184, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblRg);
		
		textField_2 = new JTextField();
		textField_2.setBounds(493, 293, 113, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblTelefone.setBounds(218, 240, 64, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTelefone);
		
		try {
			ftmData = new MaskFormatter("###.###.###-##");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_3 = new JFormattedTextField(ftmData);
		textField_3.setBounds(925, 131, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDDeNascimento = new JLabel("D. de nascimento:");
		lblDDeNascimento.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblDDeNascimento.setBounds(392, 184, 116, 14);
		frmLaluAcademiaDe.getContentPane().add(lblDDeNascimento);
		
		MaskFormatter ftmData = null;
		try {
			ftmData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_5 = new JFormattedTextField(ftmData);
		textField_5.setBounds(518, 182, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTelefone_1 = new JLabel("Telefone 2:");
		lblTelefone_1.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblTelefone_1.setBounds(458, 240, 71, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTelefone_1);
		
		
		try {
			ftmData = new MaskFormatter("#.###.###");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_7 = new JFormattedTextField(ftmData);
		textField_7.setBounds(261, 181, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblEmail.setBounds(681, 240, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEmail);
		
		textField_8 = new JTextField();
		textField_8.setBounds(723, 237, 303, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSalrio.setBounds(218, 295, 64, 14);
		frmLaluAcademiaDe.getContentPane().add(lblSalrio);
		
		textField_9 = new JTextField();
		textField_9.setBounds(539, 237, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblFuno.setBounds(439, 295, 56, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFuno);
		
		textField_10 = new JTextField();
		textField_10.setBounds(289, 292, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(509, 786, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnCadastrar.setBorder(new CompoundBorder());
		btnCadastrar.setBounds(867, 786, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCadastrar);
		
		lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEndereo.setBounds(218, 327, 64, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEndereo);
		
		textField_11 = new JTextField();
		textField_11.setBounds(296, 343, 431, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCep.setBounds(736, 327, 33, 50);
		frmLaluAcademiaDe.getContentPane().add(lblCep);
		
		textField_12 = new JTextField();
		textField_12.setBounds(766, 342, 126, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCidade.setBounds(218, 383, 200, 50);
		frmLaluAcademiaDe.getContentPane().add(lblCidade);
		
		textField_13 = new JTextField();
		textField_13.setBounds(277, 398, 132, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblBairro.setBounds(902, 327, 56, 50);
		frmLaluAcademiaDe.getContentPane().add(lblBairro);
		
		textField_14 = new JTextField();
		textField_14.setBounds(944, 342, 113, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNmero.setBounds(419, 383, 55, 50);
		frmLaluAcademiaDe.getContentPane().add(lblNmero);
		
		textField_15 = new JTextField();
		textField_15.setBounds(484, 398, 71, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblEstado.setBounds(790, 383, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santos", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Pualo", "Sergipe", "Tocatins"}));
		comboBox.setBounds(838, 398, 165, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblComplemento.setBounds(579, 390, 86, 37);
		frmLaluAcademiaDe.getContentPane().add(lblComplemento);
		
		textField_4 = new JTextField();
		textField_4.setBounds(665, 397, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
	}

}
