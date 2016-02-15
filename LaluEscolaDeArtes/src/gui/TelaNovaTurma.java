package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Window.Type;
import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;  

import java.text.ParseException;
import java.awt.FlowLayout;

public class TelaNovaTurma {

	private JFrame frmLaluAcademiaDe;
	private JFormattedTextField textField;
	private MaskFormatter ftmData;
	private JFormattedTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JFormattedTextField textField_5;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovaTurma window = new TelaNovaTurma();
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
	public TelaNovaTurma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipalFuncionario.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(458, 809, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(840, 809, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConfirmar);
		
		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setBounds(165, 153, 63, 50);
		frmLaluAcademiaDe.getContentPane().add(lblProfessor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(248, 168, 179, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JLabel lblAtividade = new JLabel("Atividade:");
		lblAtividade.setBounds(472, 153, 57, 50);
		frmLaluAcademiaDe.getContentPane().add(lblAtividade);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(539, 168, 179, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_1);
		
		JLabel lblHorrio = new JLabel("Hor\u00E1rio In\u00EDcio:");
		lblHorrio.setBounds(248, 237, 76, 50);
		frmLaluAcademiaDe.getContentPane().add(lblHorrio);
		
		try {
		ftmData = new MaskFormatter("##:##");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField = new JFormattedTextField(ftmData);
		textField.setBounds(334, 252, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblHorrioFinal = new JLabel("Hor\u00E1rio final:");
		lblHorrioFinal.setBounds(510, 237, 69, 50);
		frmLaluAcademiaDe.getContentPane().add(lblHorrioFinal);
		
		try {
			ftmData = new MaskFormatter("##:##");
				} catch (ParseException e) {
				e.printStackTrace(); 
				}
		textField_1 = new JFormattedTextField(ftmData);
		textField_1.setBounds(583, 252, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLimMnimo = new JLabel("Lim. M\u00EDnimo:");
		lblLimMnimo.setBounds(753, 153, 63, 50);
		frmLaluAcademiaDe.getContentPane().add(lblLimMnimo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(818, 168, 45, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLimMximo = new JLabel("Lim. M\u00E1ximo:");
		lblLimMximo.setBounds(906, 153, 76, 50);
		frmLaluAcademiaDe.getContentPane().add(lblLimMximo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(980, 168, 45, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDia = new JLabel("Dia:");
		lblDia.setBounds(718, 237, 33, 50);
		frmLaluAcademiaDe.getContentPane().add(lblDia);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Todos"}));
		comboBox_2.setBounds(753, 252, 187, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_2);
		
		JLabel lblDia_1 = new JLabel("Dia:");
		lblDia_1.setBounds(718, 298, 33, 50);
		frmLaluAcademiaDe.getContentPane().add(lblDia_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Todos"}));
		comboBox_3.setBounds(753, 313, 187, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_3);
		
		JButton btnNovoHorrio = new JButton("Novo Hor\u00E1rio");
		btnNovoHorrio.setBounds(999, 281, 95, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNovoHorrio);
		
		JLabel lblHorrioIncio = new JLabel("Hor\u00E1rio In\u00EDcio:");
		lblHorrioIncio.setBounds(248, 298, 76, 50);
		frmLaluAcademiaDe.getContentPane().add(lblHorrioIncio);
		
		JLabel lblHorrioFinal_1 = new JLabel("Hor\u00E1rio Final:");
		lblHorrioFinal_1.setBounds(510, 298, 69, 50);
		frmLaluAcademiaDe.getContentPane().add(lblHorrioFinal_1);
		
		try {
			ftmData = new MaskFormatter("##:##");
				} catch (ParseException e) {
				e.printStackTrace(); 
				}
		textField_4 = new JFormattedTextField(ftmData);
		textField_4.setBounds(334, 313, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		try {
			ftmData = new MaskFormatter("##:##");
				} catch (ParseException e) {
				e.printStackTrace(); 
				}
		textField_5 = new JFormattedTextField(ftmData);
		textField_5.setBounds(583, 313, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}
}
