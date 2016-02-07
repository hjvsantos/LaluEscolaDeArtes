package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import javax.swing.JComboBox;

public class TelaPagamentoMensalidade {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPagamentoMensalidade window = new TelaPagamentoMensalidade();
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
	public TelaPagamentoMensalidade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPagamentoMensalidade.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
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
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(170, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnConfirmar.setBounds(170, 186, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConfirmar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 62, 37, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(45, 59, 241, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(290, 62, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		JLabel lblMensalidade = new JLabel("Mensalidade:");
		lblMensalidade.setBounds(10, 105, 79, 14);
		frmLaluAcademiaDe.getContentPane().add(lblMensalidade);
		
		JRadioButton rdbtnPaga = new JRadioButton("Paga");
		rdbtnPaga.setBounds(95, 101, 109, 23);
		frmLaluAcademiaDe.getContentPane().add(rdbtnPaga);
		
		JRadioButton rdbtnEmDbito = new JRadioButton("Em d\u00E9bito");
		rdbtnEmDbito.setBounds(222, 101, 109, 23);
		frmLaluAcademiaDe.getContentPane().add(rdbtnEmDbito);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(333, 59, 91, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
	}
}
