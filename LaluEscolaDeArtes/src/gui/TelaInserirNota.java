package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.CompoundBorder;
import java.awt.Cursor;

public class TelaInserirNota {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInserirNota window = new TelaInserirNota();
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
	public TelaInserirNota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaInserirNota.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
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
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 64, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(46, 61, 362, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N\u00BA da Matr\u00EDcula:");
		lblNewLabel.setBounds(10, 98, 89, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 92, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(170, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConcluir.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnConcluir.setBounds(170, 193, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConcluir);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(10, 133, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCdigo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 130, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota:");
		lblNota.setBounds(206, 133, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNota);
		
		textField_3 = new JTextField();
		textField_3.setBounds(251, 130, 68, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(206, 98, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(251, 95, 157, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
	}
}
