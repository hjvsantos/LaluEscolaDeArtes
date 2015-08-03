package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaPrincipalAdm {

	private JFrame frmAcademiaDeArtes;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalAdm window = new TelaPrincipalAdm();
					window.frmAcademiaDeArtes.setVisible(true);
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
		frmAcademiaDeArtes = new JFrame();
		frmAcademiaDeArtes.setTitle("Academia de Artes Lalu");
		frmAcademiaDeArtes.setBounds(100, 100, 450, 300);
		frmAcademiaDeArtes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAcademiaDeArtes.getContentPane().setLayout(null);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setForeground(Color.BLUE);
		lblSair.setBounds(10, 236, 46, 14);
		frmAcademiaDeArtes.getContentPane().add(lblSair);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(335, 51, 89, 23);
		frmAcademiaDeArtes.getContentPane().add(btnBuscar);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setBounds(10, 55, 46, 14);
		frmAcademiaDeArtes.getContentPane().add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(49, 52, 278, 20);
		frmAcademiaDeArtes.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblbuscaFeitaPela = new JLabel("(Busca feita pela matricula)");
		lblbuscaFeitaPela.setBounds(115, 72, 130, 14);
		frmAcademiaDeArtes.getContentPane().add(lblbuscaFeitaPela);
		
		JButton btnListaDeFuncionrios = new JButton("Lista de Funcion\u00E1rios");
		btnListaDeFuncionrios.setBounds(115, 115, 171, 23);
		frmAcademiaDeArtes.getContentPane().add(btnListaDeFuncionrios);
		
		JButton btnNewButton = new JButton("Adicionar um Funcion\u00E1rio");
		btnNewButton.setBounds(115, 149, 171, 23);
		frmAcademiaDeArtes.getContentPane().add(btnNewButton);
		
		JButton btnCriarUmNovo = new JButton(" Criar um novo usu\u00E1rio");
		btnCriarUmNovo.setBounds(115, 183, 171, 23);
		frmAcademiaDeArtes.getContentPane().add(btnCriarUmNovo);
		
		JButton btnNovaMatrcula = new JButton("Nova Matr\u00EDcula");
		btnNovaMatrcula.setBounds(115, 217, 171, 23);
		frmAcademiaDeArtes.getContentPane().add(btnNovaMatrcula);
	}
}
