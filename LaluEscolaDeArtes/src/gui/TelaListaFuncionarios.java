package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;

public class TelaListaFuncionarios {

	private JFrame frmLaluAcademiaDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaListaFuncionarios window = new TelaListaFuncionarios();
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
	public TelaListaFuncionarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaListaFuncionarios.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
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
		btnVoltar.setBounds(41, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnEditar.setBorder(new CompoundBorder());
		btnEditar.setBounds(165, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnEditar);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(298, 227, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnAdicionar);
		
		JLabel lblListaDeFuncionrios = new JLabel("Lista de Funcion\u00E1rios:");
		lblListaDeFuncionrios.setBounds(10, 51, 104, 14);
		frmLaluAcademiaDe.getContentPane().add(lblListaDeFuncionrios);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 71, 382, 145);
		frmLaluAcademiaDe.getContentPane().add(panel);
	}

}
