package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.CompoundBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;
import javax.swing.JTable;

import java.awt.Rectangle;
import javax.swing.JComboBox;
import java.awt.Cursor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class TelaMatriculaFinal {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMatriculaFinal window = new TelaMatriculaFinal();
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
	public TelaMatriculaFinal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaMatriculaFinal.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setBounds(100, 100, 450, 300);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblLaluAcademiaDe.setBounds(123, 11, 202, 33);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(77, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConfirmar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnConfirmar.setBounds(292, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConfirmar);
		
		JLabel lblAtividade = new JLabel("Atividade:");
		lblAtividade.setBounds(29, 59, 54, 14);
		frmLaluAcademiaDe.getContentPane().add(lblAtividade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Recrea\u00E7\u00E3o", "Teatro", "Dan\u00E7a", "Viol\u00E3o"}));
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBounds(89, 55, 261, 23);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(29, 98, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Turma 1", "Turma 2", "Turme 3"}));
		comboBox_1.setBounds(89, 93, 261, 24);
		frmLaluAcademiaDe.getContentPane().add(comboBox_1);
		
		JLabel lblMensalidade = new JLabel("Mensalidade:");
		lblMensalidade.setBounds(10, 141, 70, 14);
		frmLaluAcademiaDe.getContentPane().add(lblMensalidade);
		
		textField = new JTextField();
		textField.setBounds(77, 137, 78, 23);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto:");
		lblDesconto.setBounds(159, 141, 54, 14);
		frmLaluAcademiaDe.getContentPane().add(lblDesconto);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 137, 64, 23);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnBolsista = new JRadioButton("Bolsista");
		rdbtnBolsista.setBounds(292, 137, 109, 23);
		frmLaluAcademiaDe.getContentPane().add(rdbtnBolsista);
		
		

	}
}
