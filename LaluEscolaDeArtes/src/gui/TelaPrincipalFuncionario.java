package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class TelaPrincipalFuncionario {

	private JFrame frmLaluAcademiaDe;
	private JTextField txtPesquisarUmAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalFuncionario window = new TelaPrincipalFuncionario();
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
	public TelaPrincipalFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipalFuncionario.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setBounds(100, 100, 450, 300);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBorder(new CompoundBorder());
		btnSair.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnSair.setBounds(22, 227, 60, 23);
		frmLaluAcademiaDe.getContentPane().add(btnSair);
		
		txtPesquisarUmAluno = new JTextField();
		txtPesquisarUmAluno.setBounds(22, 66, 296, 20);
		frmLaluAcademiaDe.getContentPane().add(txtPesquisarUmAluno);
		txtPesquisarUmAluno.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setSelectedIcon(new ImageIcon(TelaPrincipalFuncionario.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/vk-light-pressed.png")));
		btnPesquisar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.setBorder(new CompoundBorder());
		btnPesquisar.setBounds(335, 65, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnPesquisar);
		
		JButton btnMatricular = new JButton("Matricular");
		btnMatricular.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnMatricular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMatricular.setBorder(new CompoundBorder());
		btnMatricular.setBounds(22, 118, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnMatricular);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblLaluAcademiaDe.setBounds(126, 11, 202, 33);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnTurmas.setBorder(new CompoundBorder());
		btnTurmas.setBounds(178, 118, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnTurmas);
		
		JButton btnNewButton = new JButton("Notas");
		btnNewButton.setBorder(new CompoundBorder());
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnNewButton.setBounds(335, 119, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNewButton);
	}

}
