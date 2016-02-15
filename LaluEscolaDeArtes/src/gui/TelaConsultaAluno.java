package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.text.ParseException;

import javax.swing.JPanel;
import javax.swing.JFormattedTextField;

public class TelaConsultaAluno {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField_3;
	private JFormattedTextField textField_2;
	private MaskFormatter ftmData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaAluno window = new TelaConsultaAluno();
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
	public TelaConsultaAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaConsultaAluno.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
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
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(22, 71, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(280, 71, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(38, 226, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtualizar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnAtualizar.setBounds(169, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnAtualizar);
		
		JButton btnCancelar = new JButton("Cancelamento");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnCancelar.setBounds(291, 227, 118, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCancelar);
		
		JLabel lblFimDoContrato = new JLabel("Fim do Contrato:");
		lblFimDoContrato.setBounds(22, 113, 105, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFimDoContrato);
		
		JLabel lblAMensalidadeEst = new JLabel("A mensalidade est\u00E1: ");
		lblAMensalidadeEst.setBounds(22, 157, 118, 14);
		frmLaluAcademiaDe.getContentPane().add(lblAMensalidadeEst);
		
		JButton btnNewButton = new JButton("Notas");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(169, 193, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNewButton);
		
		JLabel lblNDaMatrcula = new JLabel("N\u00BA da matr\u00EDcula:");
		lblNDaMatrcula.setBounds(241, 157, 97, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNDaMatrcula);
		
		textField_3 = new JTextField();
		textField_3.setBounds(335, 151, 89, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(138, 151, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(panel);
		
		try {
			ftmData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_2 = new JFormattedTextField(ftmData);
		textField_2.setBounds(111, 110, 97, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(66, 65, 185, 20);
		frmLaluAcademiaDe.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(322, 62, 102, 23);
		frmLaluAcademiaDe.getContentPane().add(panel_2);

		
		
	}
}
