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
import javax.swing.JPanel;

public class TelaInserirNota {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;

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
		lblNome.setBounds(261, 164, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(324, 161, 760, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N\u00BA da Matr\u00EDcula:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(765, 661, 101, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(876, 658, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(403, 797, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConcluir.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnConcluir.setBounds(900, 797, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConcluir);
		
		JLabel lblNota = new JLabel("Nota:");
		lblNota.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblNota.setBounds(295, 661, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNota);
		
		textField_3 = new JTextField();
		textField_3.setBounds(338, 658, 68, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblTurma.setBounds(486, 661, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(542, 658, 157, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInserir.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnInserir.setBounds(653, 798, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnInserir);
		
		JPanel panel = new JPanel();
		panel.setBounds(261, 250, 860, 363);
		frmLaluAcademiaDe.getContentPane().add(panel);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(1132, 160, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnBuscar);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCdigo.setBounds(1026, 657, 53, 23);
		frmLaluAcademiaDe.getContentPane().add(lblCdigo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(1089, 658, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
