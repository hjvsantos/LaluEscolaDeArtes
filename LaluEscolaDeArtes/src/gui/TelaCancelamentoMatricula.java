package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCancelamentoMatricula {

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
					TelaCancelamentoMatricula window = new TelaCancelamentoMatricula();
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
	public TelaCancelamentoMatricula() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCancelamentoMatricula.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.setBounds(100, 100, 450, 300);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnCancelar.setBorder(new CompoundBorder());
		btnCancelar.setBounds(179, 180, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCancelar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(179, 214, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblLaluAcademiaDe.setBounds(123, 11, 202, 33);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 64, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(49, 61, 338, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblValorDoCancelamento = new JLabel("Valor do cancelamento:");
		lblValorDoCancelamento.setBounds(10, 102, 112, 14);
		frmLaluAcademiaDe.getContentPane().add(lblValorDoCancelamento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 99, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

}
