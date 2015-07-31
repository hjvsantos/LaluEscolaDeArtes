package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class TelaPrincipalFuncionario {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;

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
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setBounds(100, 100, 450, 300);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setBounds(25, 75, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(66, 72, 249, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(325, 71, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnBuscar);
		
		JLabel lblbuscaFeitaPela = new JLabel("(busca feita pela matricula)");
		lblbuscaFeitaPela.setBounds(116, 91, 130, 14);
		frmLaluAcademiaDe.getContentPane().add(lblbuscaFeitaPela);
		
		JButton btnMatrcula = new JButton("Nova Matr\u00EDcula");
		btnMatrcula.setBounds(122, 133, 140, 23);
		frmLaluAcademiaDe.getContentPane().add(btnMatrcula);
		
		JButton btnCancelarMatrcula = new JButton("Cancelar Matr\u00EDcula");
		btnCancelarMatrcula.setBounds(122, 168, 140, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCancelarMatrcula);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setForeground(Color.BLUE);
		lblSair.setBounds(10, 236, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblSair);
	}

}
