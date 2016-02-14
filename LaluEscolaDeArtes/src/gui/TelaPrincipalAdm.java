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
import javax.swing.JScrollPane;

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
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
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
		btnSair.setBounds(48, 819, 60, 23);
		frmLaluAcademiaDe.getContentPane().add(btnSair);
		
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setSelectedIcon(new ImageIcon(TelaPrincipalFuncionario.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/vk-light-pressed.png")));
		btnPesquisar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.setBorder(new CompoundBorder());
		btnPesquisar.setBounds(1101, 177, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnPesquisar);
		
		JButton btnMatricular = new JButton("Matricular");
		btnMatricular.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnMatricular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMatricular.setBorder(new CompoundBorder());
		btnMatricular.setBounds(916, 271, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnMatricular);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JButton btnTurmas = new JButton("Turmas");
		btnTurmas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTurmas.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnTurmas.setBorder(new CompoundBorder());
		btnTurmas.setBounds(638, 271, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnTurmas);
		
		JButton btnNewButton = new JButton("Notas");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(new CompoundBorder());
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(322, 271, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(285, 179, 787, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnFuncionrio = new JButton("Funcion\u00E1rio");
		btnFuncionrio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFuncionrio.setBorder(new CompoundBorder());
		btnFuncionrio.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnFuncionrio.setBounds(638, 342, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnFuncionrio);
		
		JButton btnFinanceiro = new JButton("Financeiro");
		btnFinanceiro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFinanceiro.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnFinanceiro.setBorder(new CompoundBorder());
		btnFinanceiro.setBounds(322, 342, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnFinanceiro);
		
		JLabel lblBuscarAluno = new JLabel("Buscar Aluno:");
		lblBuscarAluno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBuscarAluno.setBounds(184, 162, 104, 50);
		frmLaluAcademiaDe.getContentPane().add(lblBuscarAluno);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(241, 400, 949, 369);
		frmLaluAcademiaDe.getContentPane().add(scrollPane);
		
		JLabel lblAppUniverse = new JLabel("App Universe");
		lblAppUniverse.setBounds(1284, 813, 78, 37);
		frmLaluAcademiaDe.getContentPane().add(lblAppUniverse);
		
		JButton btnNovaTurma = new JButton("Nova Turma");
		btnNovaTurma.setBounds(916, 343, 104, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNovaTurma);
	}
}
