package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollPane;

public class TelaPrincipalFuncionario {

	private static JFrame frame;
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
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipalFuncionario.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		btnSair.setBorder(new CompoundBorder());
		btnSair.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnSair.setBounds(48, 819, 60, 23);
		frmLaluAcademiaDe.getContentPane().add(btnSair);
		
		txtPesquisarUmAluno = new JTextField();
		txtPesquisarUmAluno.setBounds(298, 179, 771, 20);
		frmLaluAcademiaDe.getContentPane().add(txtPesquisarUmAluno);
		txtPesquisarUmAluno.setColumns(10);
		
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
		
		JLabel lblBuscarAluno = new JLabel("Buscar Aluno:");
		lblBuscarAluno.setFont(new Font("Wasco Sans", Font.PLAIN, 15));
		lblBuscarAluno.setBounds(184, 162, 104, 50);
		frmLaluAcademiaDe.getContentPane().add(lblBuscarAluno);
		
		JLabel lblAppUniverse = new JLabel("App Universe");
		lblAppUniverse.setBounds(1284, 813, 78, 37);
		frmLaluAcademiaDe.getContentPane().add(lblAppUniverse);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(241, 324, 949, 445);
		frmLaluAcademiaDe.getContentPane().add(scrollPane);
	}
	}


