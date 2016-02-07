package gui;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipalAdm {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalAdm window = new TelaPrincipalAdm();
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
	public TelaPrincipalAdm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipalAdm.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setBounds(100, 100, 450, 300);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBorder(new CompoundBorder());
		btnSair.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnSair.setBounds(22, 227, 60, 23);
		frmLaluAcademiaDe.getContentPane().add(btnSair);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setSelectedIcon(new ImageIcon(TelaPrincipalFuncionario.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/vk-light-pressed.png")));
		btnPesquisar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.setBorder(new CompoundBorder());
		btnPesquisar.setBounds(335, 65, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnPesquisar);
		
		JButton btnMatricular = new JButton("Matricular");
		btnMatricular.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnMatricular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMatricular.setBorder(new CompoundBorder());
		btnMatricular.setBounds(22, 118, 95, 23);
		frmLaluAcademiaDe.getContentPane().add(btnMatricular);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblLaluAcademiaDe.setBounds(126, 11, 202, 33);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTurmas.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnTurmas.setBorder(new CompoundBorder());
		btnTurmas.setBounds(178, 118, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnTurmas);
		
		JButton btnNewButton = new JButton("Notas");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(new CompoundBorder());
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(335, 119, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(22, 67, 303, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnFuncionrio = new JButton("Funcion\u00E1rio");
		btnFuncionrio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFuncionrio.setBorder(new CompoundBorder());
		btnFuncionrio.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnFuncionrio.setBounds(22, 169, 95, 23);
		frmLaluAcademiaDe.getContentPane().add(btnFuncionrio);
		
		JButton btnFinanceiro = new JButton("Financeiro");
		btnFinanceiro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFinanceiro.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnFinanceiro.setBorder(new CompoundBorder());
		btnFinanceiro.setBounds(178, 169, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnFinanceiro);
	}

}
