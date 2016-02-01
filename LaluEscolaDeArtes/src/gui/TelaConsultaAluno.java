package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class TelaConsultaAluno {

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
		
		textField = new JTextField();
		textField.setBounds(61, 68, 212, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(280, 71, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		textField_1 = new JTextField();
		textField_1.setBounds(318, 68, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(38, 226, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnAtualizar.setBounds(169, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnAtualizar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnCancelar.setBounds(291, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCancelar);
		
		JLabel lblFimDoContrato = new JLabel("Fim do Contrato:");
		lblFimDoContrato.setBounds(22, 113, 86, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFimDoContrato);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 110, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAMensalidadeEst = new JLabel("A mensalidade est\u00E1: ");
		lblAMensalidadeEst.setBounds(22, 157, 100, 14);
		frmLaluAcademiaDe.getContentPane().add(lblAMensalidadeEst);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(123, 157, 72, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Notas");
		btnNewButton.setBounds(280, 153, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNewButton);
		
		JLabel lblNDaMatrcula = new JLabel("N\u00BA da matr\u00EDcula:");
		lblNDaMatrcula.setBounds(205, 113, 86, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNDaMatrcula);
		
		textField_3 = new JTextField();
		textField_3.setBounds(290, 110, 110, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		
		
	}
}
