package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Window;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Cursor;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JFormattedTextField;  
import javax.swing.text.MaskFormatter;

import java.text.ParseException;
import java.util.Date;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import org.json.JSONException;

import classesBasicas.Administrador;
import classesBasicas.Endereco;
import classesBasicas.Funcionario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import negocios.Fachada;

public class TelaCadastroFuncionario {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JFormattedTextField textField_3;
	private JFormattedTextField textField_5;
	private JFormattedTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblEndereo;
	private JTextField textField_11;
	private JLabel lblCep;
	private JTextField textField_12;
	private JLabel lblCidade;
	private JTextField textField_13;
	private JLabel lblBairro;
	private JTextField textField_14;
	private JLabel lblNmero;
	private JTextField textField_15;
	private JLabel lblEstado;
	private MaskFormatter ftmData;
	private JLabel lblComplemento;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFuncionario window = new TelaCadastroFuncionario();
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
	public TelaCadastroFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.getContentPane().setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastroFuncionario.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
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
		lblNome.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblNome.setBounds(218, 134, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(261, 131, 595, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCpf.setBounds(885, 134, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(277, 237, 132, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblRg.setBounds(218, 184, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblRg);
		
		textField_2 = new JTextField();
		textField_2.setBounds(493, 293, 113, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblTelefone.setBounds(218, 240, 64, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTelefone);
		
		try {
			ftmData = new MaskFormatter("###.###.###-##");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_3 = new JFormattedTextField(ftmData);
		textField_3.setBounds(925, 131, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDDeNascimento = new JLabel("D. de nascimento:");
		lblDDeNascimento.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblDDeNascimento.setBounds(392, 184, 116, 14);
		frmLaluAcademiaDe.getContentPane().add(lblDDeNascimento);
		
		MaskFormatter ftmData = null;
		try {
			ftmData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_5 = new JFormattedTextField(ftmData);
		textField_5.setBounds(518, 182, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTelefone_1 = new JLabel("Telefone 2:");
		lblTelefone_1.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblTelefone_1.setBounds(458, 240, 71, 14);
		frmLaluAcademiaDe.getContentPane().add(lblTelefone_1);
		
		
		try {
			ftmData = new MaskFormatter("#.###.###");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_7 = new JFormattedTextField(ftmData);
		textField_7.setBounds(261, 181, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblEmail.setBounds(681, 240, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEmail);
		
		textField_8 = new JTextField();
		textField_8.setBounds(723, 237, 303, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblSalrio.setBounds(218, 295, 64, 14);
		frmLaluAcademiaDe.getContentPane().add(lblSalrio);
		
		textField_9 = new JTextField();
		textField_9.setBounds(539, 237, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o:");
		lblFuno.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblFuno.setBounds(439, 295, 56, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFuno);
		
		textField_10 = new JTextField();
		textField_10.setBounds(289, 292, 120, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnVoltar.setBorder(new CompoundBorder());
		btnVoltar.setBounds(509, 786, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santos", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Pualo", "Sergipe", "Tocatins"}));
		comboBox.setBounds(838, 398, 165, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario funcionario = new Funcionario(null, null, null, null, null, null, null, 0, null, null, null, null, null);
				if(textField.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Nome' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_3.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'CPF' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_4.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Complemento' encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);

				} else if (textField_2.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Função' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_1.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Telefone' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_5.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Data de Nascimento' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_7.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'RG' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_8.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Email' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_9.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Telefone 2' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_10.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Salário' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_11.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Endereço' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_12.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'CEP' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_13.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Cidade' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_14.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Bairro' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_15.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Numero' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else{
						//String endereço = new String(textField_11.getName() + textField_12.getName() + textField_13.getName() + textField_14.getName() + textField_15.getName() + textField_14.getName()); pode concatenar assim os componentes e gerar um so endereço?
					Endereco end = new Endereco(null, null, null, null, null, null, null);
					end.setBairro(textField_14.getText());
					end.setCep(textField_12.getText());
					end.setCidade(textField_13.getText());
					end.setEstado(comboBox.getSelectedItem().toString());
					end.setNumero(textField_15.getText());
					end.setComplemento(textField_4.getText());
					double salario = Double.parseDouble(textField_10.getText());
					Date data = new Date();
					SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
					try {
						data = format.parse(textField_5.getText());
					} catch (ParseException e2) {
						e2.printStackTrace();
					}
					
					
						funcionario.setNome(textField.getText());
						funcionario.setFuncao(textField_2.getText());
						funcionario.setTelefone(textField_1.getText());
						funcionario.setCPF(textField_3.getText());
						funcionario.setDataNascimento(data);
						funcionario.setEndereco(end);
						funcionario.setSalario(salario);
						funcionario.setEmail(textField_8.getText());
						funcionario.setRg(textField_7.getText());
						funcionario.setCelular(textField_9.getText());
						
						
						

						Fachada fachada = new Fachada();
						try {
							fachada.cadastrarFuncionario(funcionario);
						} catch (JSONException | IOException e1) {
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Novo Funcionario criado com sucesso");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						textField_5.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						textField_10.setText("");
						textField_11.setText("");
						textField_12.setText("");
						textField_13.setText("");
						textField_14.setText("");
						textField_15.setText("");
						//TelaCriarAdm.setVisible(false);
						TelaPrincipalAdm telaAdm = new TelaPrincipalAdm();
						//telaAdm.setVisible(true);
					}
				
			}
		});
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnCadastrar.setBorder(new CompoundBorder());
		btnCadastrar.setBounds(867, 786, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCadastrar);
		
		lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEndereo.setBounds(218, 327, 64, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEndereo);
		
		textField_11 = new JTextField();
		textField_11.setBounds(296, 343, 431, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCep.setBounds(736, 327, 33, 50);
		frmLaluAcademiaDe.getContentPane().add(lblCep);
		
		textField_12 = new JTextField();
		textField_12.setBounds(766, 342, 126, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCidade.setBounds(218, 383, 56, 50);
		frmLaluAcademiaDe.getContentPane().add(lblCidade);
		
		textField_13 = new JTextField();
		textField_13.setBounds(277, 398, 132, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblBairro.setBounds(902, 327, 56, 50);
		frmLaluAcademiaDe.getContentPane().add(lblBairro);
		
		textField_14 = new JTextField();
		textField_14.setBounds(944, 342, 113, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNmero.setBounds(419, 383, 55, 50);
		frmLaluAcademiaDe.getContentPane().add(lblNmero);
		
		textField_15 = new JTextField();
		textField_15.setBounds(484, 398, 71, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblEstado.setBounds(790, 383, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEstado);
		
		
		lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblComplemento.setBounds(579, 390, 86, 37);
		frmLaluAcademiaDe.getContentPane().add(lblComplemento);
		
		textField_4 = new JTextField();
		textField_4.setBounds(665, 397, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
	}

}
