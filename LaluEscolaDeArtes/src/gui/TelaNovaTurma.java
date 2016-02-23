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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;  

import negocios.Fachada;

import org.json.JSONException;

import classesBasicas.Atividade;
import classesBasicas.Funcionario;
import classesBasicas.Turma;

import java.text.ParseException;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

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
		
		
		
		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblProfessor.setBounds(165, 153, 63, 50);
		frmLaluAcademiaDe.getContentPane().add(lblProfessor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(248, 168, 179, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JLabel lblAtividade = new JLabel("Atividade:");
		lblAtividade.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblAtividade.setBounds(460, 153, 69, 50);
		frmLaluAcademiaDe.getContentPane().add(lblAtividade);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(539, 168, 179, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_1);
		
		JLabel lblHorrio = new JLabel("Hor\u00E1rio In\u00EDcio:");
		lblHorrio.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblHorrio.setBounds(229, 237, 95, 50);
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
		lblHorrioFinal.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblHorrioFinal.setBounds(493, 237, 86, 50);
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
		lblLimMnimo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblLimMnimo.setBounds(753, 153, 89, 50);
		frmLaluAcademiaDe.getContentPane().add(lblLimMnimo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(840, 169, 45, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLimMximo = new JLabel("Lim. M\u00E1ximo:");
		lblLimMximo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblLimMximo.setBounds(918, 154, 89, 50);
		frmLaluAcademiaDe.getContentPane().add(lblLimMximo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(1007, 169, 45, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDia = new JLabel("Dia:");
		lblDia.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDia.setBounds(718, 237, 33, 50);
		frmLaluAcademiaDe.getContentPane().add(lblDia);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Todos"}));
		comboBox_2.setBounds(753, 252, 187, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_2);
		
		JLabel lblDia_1 = new JLabel("Dia:");
		lblDia_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDia_1.setBounds(718, 298, 33, 50);
		frmLaluAcademiaDe.getContentPane().add(lblDia_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Todos"}));
		comboBox_3.setBounds(753, 313, 187, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_3);
		
		JButton btnNovoHorrio = new JButton("Novo Hor\u00E1rio");
		btnNovoHorrio.setBounds(999, 281, 105, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNovoHorrio);
		
		JLabel lblHorrioIncio = new JLabel("Hor\u00E1rio In\u00EDcio:");
		lblHorrioIncio.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblHorrioIncio.setBounds(229, 298, 95, 50);
		frmLaluAcademiaDe.getContentPane().add(lblHorrioIncio);
		
		JLabel lblHorrioFinal_1 = new JLabel("Hor\u00E1rio Final:");
		lblHorrioFinal_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblHorrioFinal_1.setBounds(493, 298, 86, 50);
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
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turma turma = new Turma(null, 0, 0, null, 0);
				if(((String)comboBox.getSelectedItem()).equals("")){
					JOptionPane.showMessageDialog(null, "A turma está sem professor! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (((String)comboBox_1.getSelectedItem()).equals("")){
					JOptionPane.showMessageDialog(null, "A turma está sem atividade! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_2.equals("")){
					JOptionPane.showMessageDialog(null, "Está sem um limite mínimo", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_3.equals("")){
					JOptionPane.showMessageDialog(null, "Está sem um limite máximo", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField.equals("")){
					JOptionPane.showMessageDialog(null, "Está sem horario de inicio ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_4.equals("")){
					JOptionPane.showMessageDialog(null, "Está sem horario de inicio ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_1.equals("")){
					JOptionPane.showMessageDialog(null, "Está sem horario de término ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_5.equals("")){
					JOptionPane.showMessageDialog(null, "Está sem horario de término ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else{
					int jml = Integer.parseInt(textField_3.getText());	
					int jmk = Integer.parseInt(textField_2.getText());
					Funcionario prof = new Funcionario(null, null, null, null, null, null, null, jmk, null, null, null, null, null);
					prof.setNome(comboBox.getSelectedItem().toString());
					Atividade atv = new Atividade(null, null, jmk, jmk, jmk);
					atv.setNome(comboBox_1.getSelectedItem().toString());
					
					turma.setLimiteMax(jml);
					turma.setLimiteMin(jmk);
					turma.setProfessor(prof);
					turma.setAtividade(atv);
					
				}	

						Fachada fachada = new Fachada();
						try {
							fachada.cadastrarTurma(turma);
						} catch (JSONException | IOException e1) {
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Nova turma criada com sucesso");
						textField.setText("");
						textField_2.setText("");
						textField_1.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						
					
				}
			
		});
		btnCriar.setBounds(609, 419, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCriar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(609, 476, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		}
	
	}

