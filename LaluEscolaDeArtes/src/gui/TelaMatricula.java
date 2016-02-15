package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.JFormattedTextField;  
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.awt.FlowLayout;

import java.awt.Cursor;

public class TelaMatricula {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JFormattedTextField textField_1;
	private JTextField textField_2;
	private JFormattedTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JFormattedTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JFormattedTextField data;
	private MaskFormatter ftmData;
	

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
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		//frmLaluAcademiaDe.setExtendedState(JFrame.MAXIMIZED_BOTH);
		 
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(139, 163, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(198, 160, 636, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setBounds(382, 220, 99, 14);
		frmLaluAcademiaDe.getContentPane().add(lblDataDeNascimento);
		
		
		try {
		ftmData = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
		e.printStackTrace(); 
		}
		textField_1 = new JFormattedTextField(ftmData);
		textField_1.setBounds(500, 218, 112, 17);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(928, 163, 35, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCpf);
		
		
		try {
			ftmData = new MaskFormatter("###.###.###-##");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_5 = new JFormattedTextField(ftmData);
		textField_5.setBounds(973, 160, 148, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(139, 277, 58, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEndereo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(198, 357, 349, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(928, 220, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCidade);
		
		textField_7 = new JTextField();
		textField_7.setBounds(198, 274, 636, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(862, 277, 31, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCep);
		
		textField_8 = new JTextField();
		textField_8.setBounds(903, 274, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblFone = new JLabel("Fone:");
		lblFone.setBounds(694, 220, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFone);
		
		textField_9 = new JTextField();
		textField_9.setBounds(742, 217, 151, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(139, 360, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEmail);
		
		textField_10 = new JTextField();
		textField_10.setBounds(987, 217, 135, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(139, 220, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblRg);
		
		try {
			ftmData = new MaskFormatter("#.###.###");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_11 = new JFormattedTextField(ftmData);
		textField_11.setBounds(198, 217, 148, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(458, 812, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnPrximo = new JButton("Confirmar");
		btnPrximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPrximo.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnPrximo.setBorder(new CompoundBorder());
		btnPrximo.setBounds(824, 812, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnPrximo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Recrea\u00E7\u00E3o", "Teatro", "Dan\u00E7a", "Viol\u00E3o"}));
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBounds(198, 402, 261, 23);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JLabel lblAtividade = new JLabel("Atividade:");
		lblAtividade.setBounds(139, 388, 58, 50);
		frmLaluAcademiaDe.getContentPane().add(lblAtividade);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Turma 1", "Turma 2", "Turme 3"}));
		comboBox_1.setBounds(581, 401, 261, 24);
		frmLaluAcademiaDe.getContentPane().add(comboBox_1);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(527, 388, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		JLabel lblMensalidade = new JLabel("Mensalidade:");
		lblMensalidade.setBounds(874, 388, 89, 50);
		frmLaluAcademiaDe.getContentPane().add(lblMensalidade);
		
		textField_12 = new JTextField();
		textField_12.setBounds(950, 403, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto(%):");
		lblDesconto.setBounds(874, 459, 89, 38);
		frmLaluAcademiaDe.getContentPane().add(lblDesconto);
		
		textField_13 = new JTextField();
		textField_13.setBounds(950, 468, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblFimDoContrato = new JLabel("Fim do contrato:");
		lblFimDoContrato.setBounds(139, 453, 89, 50);
		frmLaluAcademiaDe.getContentPane().add(lblFimDoContrato);
		
		textField_14 = new JTextField();
		textField_14.setBounds(231, 468, 38, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel label_2 = new JLabel("/");
		label_2.setBounds(272, 453, 10, 50);
		frmLaluAcademiaDe.getContentPane().add(label_2);
		
		textField_15 = new JTextField();
		textField_15.setBounds(284, 468, 38, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel label_3 = new JLabel("/");
		label_3.setBounds(324, 459, 10, 38);
		frmLaluAcademiaDe.getContentPane().add(label_3);
		
		textField_16 = new JTextField();
		textField_16.setBounds(332, 468, 38, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setBounds(139, 297, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblCidade_1);
		
		textField_17 = new JTextField();
		textField_17.setBounds(198, 312, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(324, 297, 38, 50);
		frmLaluAcademiaDe.getContentPane().add(lblBairro);
		
		textField_18 = new JTextField();
		textField_18.setBounds(373, 312, 108, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(500, 303, 58, 38);
		frmLaluAcademiaDe.getContentPane().add(lblNmero);
		
		textField_19 = new JTextField();
		textField_19.setBounds(551, 312, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(681, 300, 51, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEstado);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santos", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Pualo", "Sergipe", "Tocatins"}));
		comboBox_2.setBounds(728, 312, 165, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_2);
		
		
	}

/*	public void TextFieldComMascara() throws ParseException{  
		  
	      ftmData = new MaskFormatter("##/##/####");  
	          
	      data = new JFormattedTextField(ftmData);  
	   
	      ftmData.setValidCharacters("0123456789");  
	 
	      data.setColumns(6);  
	   
	      add(data);  
	        
	      setLayout(new FlowLayout());  
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
	      setSize(200, 200);  
	      setVisible(true);  
	  } 
	*/
}
