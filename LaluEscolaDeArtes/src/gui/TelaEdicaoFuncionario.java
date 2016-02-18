package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Cursor;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class TelaEdicaoFuncionario {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField_5;
	private JTextField textField_6;
	private MaskFormatter ftmData;

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
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setBounds(635, 478, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExcluir.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnExcluir.setBounds(635, 534, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnExcluir);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConcluir.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnConcluir.setBounds(635, 585, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConcluir);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblNome.setBounds(288, 125, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		JTextField textField = new JTextField();
		textField.setBounds(344, 122, 609, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCpf.setBounds(1001, 125, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCpf);
		
		try {
			ftmData = new MaskFormatter("###.###.###-##");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		JFormattedTextField textField_1 = new JFormattedTextField(ftmData);
		textField_1.setBounds(1038, 123, 132, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblRg.setBounds(517, 180, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblRg);
		
		try {
			ftmData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(663, 232, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblTelefone.setBounds(663, 180, 61, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTelefone);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(721, 177, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDDeNascimento = new JLabel("D. de nascimento:");
		lblDDeNascimento.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblDDeNascimento.setBounds(269, 180, 120, 14);
		frmLaluAcademiaDe.getContentPane().add(lblDDeNascimento);
		
		try {
			ftmData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		JFormattedTextField textField_4 = new JFormattedTextField(ftmData);
		textField_4.setBounds(393, 177, 75, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTelefone_1 = new JLabel("Telefone 2:");
		lblTelefone_1.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblTelefone_1.setBounds(865, 180, 89, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTelefone_1);
		
		try {
			ftmData = new MaskFormatter("#.###.###");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		JFormattedTextField textField_7 = new JFormattedTextField(ftmData);
		textField_7.setBounds(545, 177, 75, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblEmail.setBounds(344, 235, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEmail);
		
		JTextField textField_8 = new JTextField();
		textField_8.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		textField_8.setBounds(391, 232, 172, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSalrio.setBounds(599, 235, 54, 14);
		frmLaluAcademiaDe.getContentPane().add(lblSalrio);
		
		JTextField textField_9 = new JTextField();
		textField_9.setBounds(939, 178, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblFuno.setBounds(865, 235, 51, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFuno);
		
		JTextField textField_10 = new JTextField();
		textField_10.setBounds(929, 232, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEndereo.setBounds(269, 273, 75, 43);
		frmLaluAcademiaDe.getContentPane().add(lblEndereo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(344, 278, 529, 23);
		frmLaluAcademiaDe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCep.setBounds(906, 277, 37, 34);
		frmLaluAcademiaDe.getContentPane().add(lblCep);
		
		textField_6 = new JTextField();
		textField_6.setBounds(940, 278, 132, 23);
		frmLaluAcademiaDe.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCidade.setBounds(288, 327, 46, 43);
		frmLaluAcademiaDe.getContentPane().add(lblCidade);
		
		JTextField textField_13 = new JTextField();
		textField_13.setBounds(344, 338, 132, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblBairro.setBounds(496, 323, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblBairro);
		
		JTextField textField_14 = new JTextField();
		textField_14.setBounds(540, 338, 113, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNmero.setBounds(663, 323, 54, 50);
		frmLaluAcademiaDe.getContentPane().add(lblNmero);
		
		JTextField textField_15 = new JTextField();
		textField_15.setBounds(721, 339, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblEstado.setBounds(827, 323, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santos", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Pualo", "Sergipe", "Tocatins"}));
		comboBox.setBounds(882, 338, 165, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
	}
}
