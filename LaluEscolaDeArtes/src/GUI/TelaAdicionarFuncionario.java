package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class TelaAdicionarFuncionario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdicionarFuncionario window = new TelaAdicionarFuncionario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAdicionarFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNovoFuncionrio = new JLabel("Novo Funcion\u00E1rio");
		lblNovoFuncionrio.setFont(new Font("Gisha", Font.PLAIN, 24));
		lblNovoFuncionrio.setBounds(116, 10, 200, 50);
		frame.getContentPane().add(lblNovoFuncionrio);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(114, 227, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(227, 227, 89, 23);
		frame.getContentPane().add(btnConfirmar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(3, 64, 38, 23);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(45, 64, 379, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(45, 110, 149, 20);
		frame.getContentPane().add(comboBox);
		
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setBounds(3, 109, 52, 23);
		frame.getContentPane().add(lblFuno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(204, 109, 52, 23);
		frame.getContentPane().add(lblIdade);
		
		textField_1 = new JTextField();
		textField_1.setBounds(243, 109, 29, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(282, 106, 29, 28);
		frame.getContentPane().add(lblCpf);
		
		textField_2 = new JTextField();
		textField_2.setBounds(310, 109, 114, 23);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(3, 149, 18, 23);
		frame.getContentPane().add(lblRg);
		
		textField_3 = new JTextField();
		textField_3.setBounds(43, 144, 89, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(142, 141, 57, 28);
		frame.getContentPane().add(lblTelefone);
		
		textField_4 = new JTextField();
		textField_4.setBounds(191, 144, 29, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label = new JLabel("-");
		label.setBounds(227, 143, 18, 14);
		frame.getContentPane().add(label);
		
		textField_5 = new JTextField();
		textField_5.setBounds(239, 143, 136, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(3, 183, 57, 23);
		frame.getContentPane().add(lblEndereo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(53, 180, 371, 23);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
	}
}
