package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.text.ParseException;

import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;

public class TelaConsultaAluno {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField_3;
	private JFormattedTextField textField_2;
	private MaskFormatter ftmData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaAluno window = new TelaConsultaAluno();
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
	public TelaConsultaAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaConsultaAluno.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(275, 139, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setBounds(870, 139, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(582, 726, 119, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtualizar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnAtualizar.setBounds(582, 656, 119, 23);
		frmLaluAcademiaDe.getContentPane().add(btnAtualizar);
		
		JButton btnCancelar = new JButton("Cancelamento");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnCancelar.setBounds(582, 690, 118, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCancelar);
		
		JLabel lblFimDoContrato = new JLabel("Fim do Contrato:");
		lblFimDoContrato.setBounds(795, 506, 105, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFimDoContrato);
		
		JLabel lblAMensalidadeEst = new JLabel("A mensalidade est\u00E1: ");
		lblAMensalidadeEst.setBounds(259, 506, 118, 14);
		frmLaluAcademiaDe.getContentPane().add(lblAMensalidadeEst);
		
		JButton btnNewButton = new JButton("Notas");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(582, 621, 119, 23);
		frmLaluAcademiaDe.getContentPane().add(btnNewButton);
		
		JLabel lblNDaMatrcula = new JLabel("N\u00BA da matr\u00EDcula:");
		lblNDaMatrcula.setBounds(533, 506, 97, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNDaMatrcula);
		
		textField_3 = new JTextField();
		textField_3.setBounds(615, 503, 89, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(372, 500, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(panel);
		
		try {
			ftmData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_2 = new JFormattedTextField(ftmData);
		textField_2.setBounds(892, 503, 97, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(331, 133, 471, 20);
		frmLaluAcademiaDe.getContentPane().add(panel_1);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(275, 183, 57, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEndereo);
		
		textField = new JTextField();
		textField.setBounds(331, 194, 506, 23);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(867, 188, 33, 40);
		frmLaluAcademiaDe.getContentPane().add(lblCep);
		
		textField_1 = new JTextField();
		textField_1.setBounds(926, 197, 102, 23);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(922, 135, 200, 23);
		frmLaluAcademiaDe.getContentPane().add(comboBox);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(275, 244, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCidade);
		
		JTextField textField_7 = new JTextField();
		textField_7.setBounds(331, 241, 111, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(473, 226, 38, 50);
		frmLaluAcademiaDe.getContentPane().add(lblBairro);
		
		JTextField textField_18 = new JTextField();
		textField_18.setBounds(510, 241, 108, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(638, 232, 58, 38);
		frmLaluAcademiaDe.getContentPane().add(lblNmero);
		
		JTextField textField_19 = new JTextField();
		textField_19.setBounds(693, 241, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(270, 269, 51, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEstado);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santos", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Pualo", "Sergipe", "Tocatins"}));
		comboBox_2.setBounds(331, 287, 165, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_2);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(837, 226, 74, 50);
		frmLaluAcademiaDe.getContentPane().add(lblComplemento);
		
		textField_4 = new JTextField();
		textField_4.setBounds(926, 240, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
	}
}
