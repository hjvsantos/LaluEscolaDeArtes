package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.JPanel;

public class TelaConsultaTurmas {

	private JFrame frmLaluAcademiaDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaTurmas window = new TelaConsultaTurmas();
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
	public TelaConsultaTurmas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaConsultaTurmas.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
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
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(166, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 50, 358, 144);
		frmLaluAcademiaDe.getContentPane().add(panel);
	}
}
