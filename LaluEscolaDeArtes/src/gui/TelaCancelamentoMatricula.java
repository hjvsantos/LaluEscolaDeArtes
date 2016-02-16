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
import java.awt.Cursor;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TelaCancelamentoMatricula {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;

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
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JButton btnCancelar = new JButton("Confirmar");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnCancelar.setBorder(new CompoundBorder());
		btnCancelar.setBounds(730, 570, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCancelar);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(561, 27, 473, 88);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(367, 171, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		JLabel lblValorDoCancelamento = new JLabel("Valor do cancelamento:");
		lblValorDoCancelamento.setBounds(585, 236, 139, 14);
		frmLaluAcademiaDe.getContentPane().add(lblValorDoCancelamento);
		
		JPanel panel = new JPanel();
		panel.setBounds(710, 227, 172, 23);
		frmLaluAcademiaDe.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(448, 162, 645, 23);
		frmLaluAcademiaDe.getContentPane().add(panel_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(730, 629, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JRadioButton rdbtnSemMulta = new JRadioButton("Sem multa");
		rdbtnSemMulta.setBounds(710, 332, 109, 23);
		frmLaluAcademiaDe.getContentPane().add(rdbtnSemMulta);
		
		JLabel lblDesconto = new JLabel("Desconto(%):");
		lblDesconto.setBounds(585, 266, 75, 50);
		frmLaluAcademiaDe.getContentPane().add(lblDesconto);
		
		textField = new JTextField();
		textField.setBounds(710, 280, 46, 23);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
