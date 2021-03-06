package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.JFormattedTextField;  
import javax.swing.text.MaskFormatter;

import negocios.Fachada;

import org.json.JSONException;

import classesBasicas.Aluno;
import classesBasicas.Endereco;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMatricula {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JFormattedTextField textField_1;
	private JTextField textField_2;
	private JFormattedTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JFormattedTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JFormattedTextField textField_14;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JFormattedTextField data;
	private MaskFormatter ftmData;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMatricula window = new TelaMatricula();
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
	public TelaMatricula() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaMatricula.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setSize(1400, 900);
		frmLaluAcademiaDe.setLocation(300, 50);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		//frmLaluAcademiaDe.setExtendedState(JFrame.MAXIMIZED_BOTH);
		 
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblNome.setBounds(139, 163, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(198, 160, 636, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblDataDeNascimento.setBounds(371, 219, 138, 16);
		frmLaluAcademiaDe.getContentPane().add(lblDataDeNascimento);
		
		
		try {
		ftmData = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
		e.printStackTrace(); 
		}
		textField_1 = new JFormattedTextField(ftmData);
		textField_1.setBounds(500, 219, 112, 17);
		frmLaluAcademiaDe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCpf.setBounds(928, 163, 35, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCpf);
		
		
		try {
			ftmData = new MaskFormatter("###.###.###-##");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_5 = new JFormattedTextField(ftmData);
		textField_5.setBounds(973, 160, 148, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEndereo.setBounds(139, 277, 75, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEndereo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(198, 357, 349, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCidade.setBounds(928, 220, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCidade);
		
		textField_7 = new JTextField();
		textField_7.setBounds(211, 274, 623, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCep.setBounds(862, 277, 31, 14);
		frmLaluAcademiaDe.getContentPane().add(lblCep);
		
		textField_8 = new JTextField();
		textField_8.setBounds(903, 274, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblFone = new JLabel("Fone:");
		lblFone.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblFone.setBounds(675, 221, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblFone);
		
		textField_9 = new JTextField();
		textField_9.setBounds(714, 218, 151, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblEmail.setBounds(139, 360, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblEmail);
		
		textField_10 = new JTextField();
		textField_10.setBounds(987, 217, 135, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblRg.setBounds(139, 220, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblRg);
		
		try {
			ftmData = new MaskFormatter("#.###.###");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_11 = new JFormattedTextField(ftmData);
		textField_11.setBounds(198, 217, 148, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Recrea\u00E7\u00E3o", "Teatro", "Dan\u00E7a", "Viol\u00E3o"}));
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBounds(211, 403, 261, 23);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JLabel lblAtividade = new JLabel("Atividade:");
		lblAtividade.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblAtividade.setBounds(139, 388, 75, 50);
		frmLaluAcademiaDe.getContentPane().add(lblAtividade);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Turma 1", "Turma 2", "Turme 3"}));
		comboBox_1.setBounds(581, 401, 261, 24);
		frmLaluAcademiaDe.getContentPane().add(comboBox_1);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblTurma.setBounds(527, 388, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblTurma);
		
		JLabel lblMensalidade = new JLabel("Mensalidade:");
		lblMensalidade.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblMensalidade.setBounds(874, 388, 89, 50);
		frmLaluAcademiaDe.getContentPane().add(lblMensalidade);
		
		textField_12 = new JTextField();
		textField_12.setBounds(965, 404, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto(%):");
		lblDesconto.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDesconto.setBounds(874, 459, 89, 38);
		frmLaluAcademiaDe.getContentPane().add(lblDesconto);
		
		textField_13 = new JTextField();
		textField_13.setBounds(965, 469, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblFimDoContrato = new JLabel("Fim do contrato:");
		lblFimDoContrato.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblFimDoContrato.setBounds(139, 453, 101, 50);
		frmLaluAcademiaDe.getContentPane().add(lblFimDoContrato);
		
		try {
			ftmData = new MaskFormatter("##/##/####");
			} catch (ParseException e) {
			e.printStackTrace(); 
			}
		textField_14 = new JFormattedTextField(ftmData);
		textField_14.setBounds(243, 469, 139, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblCidade_1 = new JLabel("Cidade:");
		lblCidade_1.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblCidade_1.setBounds(139, 297, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblCidade_1);
		
		textField_17 = new JTextField();
		textField_17.setBounds(198, 312, 112, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblBairro.setBounds(324, 297, 46, 50);
		frmLaluAcademiaDe.getContentPane().add(lblBairro);
		
		textField_18 = new JTextField();
		textField_18.setBounds(373, 312, 108, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNmero.setBounds(500, 303, 58, 38);
		frmLaluAcademiaDe.getContentPane().add(lblNmero);
		
		textField_19 = new JTextField();
		textField_19.setBounds(562, 312, 101, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Wasco Sans", Font.PLAIN, 11));
		lblEstado.setBounds(892, 297, 51, 50);
		frmLaluAcademiaDe.getContentPane().add(lblEstado);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap�", "Amazonas", "Bahia", "Cear�", "Distrito Federal", "Esp�rito Santos", "Goi�s", "Maranh�o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par�", "Para�ba", "Paran�", "Pernambuco", "Piau�", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond�nia", "Roraima", "Santa Catarina", "S�o Pualo", "Sergipe", "Tocatins"}));
		comboBox_2.setBounds(956, 312, 165, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox_2);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblComplemento.setBounds(675, 300, 91, 50);
		frmLaluAcademiaDe.getContentPane().add(lblComplemento);
		
		textField_3 = new JTextField();
		textField_3.setBounds(776, 310, 58, 24);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			Aluno aluno = new Aluno(null, null, null, null, null, null, null, null, null, null, null, null, null);
			public void actionPerformed(ActionEvent e) {
				if(textField.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Nome' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_5.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'CPF' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_3.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Complemento' encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_9.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Telefone' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_1.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Data de Nascimento' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_11.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'RG' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_6.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Email' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_7.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Endere�o' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_8.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'CEP' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_17.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Cidade' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_18.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Bairro' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else if (textField_19.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Numero' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else{
					
					Endereco end = new Endereco(null, null, null, null, null, null, null);
					end.setBairro(textField_14.getText());
					end.setCep(textField_12.getText());
					end.setCidade(textField_13.getText());
					end.setEstado(comboBox.getSelectedItem().toString());
					end.setNumero(textField_19.getText());
					end.setComplemento(textField_3.getText());
					Date data = new Date();
					SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
					try {
						data = format.parse(textField_1.getText());
					} catch (ParseException e2) {
						e2.printStackTrace();
					}
					
						aluno.setNome(textField.getText());
						aluno.setTelefone(textField_1.getText());
						aluno.setCPF(textField_3.getText());
						aluno.setDataNascimento(data);
						aluno.setEndereco(end);
						aluno.setEmail(textField_8.getText());
						aluno.setRG(textField_6.getText());
						aluno.setCelular(textField_9.getText());
						
						
						

						Fachada fachada = new Fachada();
						try {
							fachada.cadastrarAluno(aluno);
						} catch (JSONException | IOException e1) {
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Matricula realizada com sucesso!");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_5.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
						textField_10.setText("");
						textField_11.setText("");
						textField_12.setText("");
						textField_13.setText("");
						textField_14.setText("");
						
					}
				
			}
			
		});
		btnConfirmar.setBounds(562, 543, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnConfirmar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMatricula.setVisible(false);
				TelaPrincipalFuncionario.setVisible(true);
			}
		});
		btnVoltar.setBounds(562, 605, 89, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		
	}

	public static void setVisible(boolean opcao) {
		if(opcao == true)
			TelaMatricula.setVisible(true);
		else
			TelaMatricula.setVisible(false);
	}

/*	public void TextFieldComMascara() throws ParseException{  
		  
	      ftmData = new MaskFormatter("##/##/####");  
	          
	      data = new JFormattedTextField(ftmData);  
	   
	      ftmData.setValidCharacters("0123456789");  
	 
	      data.setColumns(6);  
	   
	      add(data);  
	        
	      setLayout(new FlowLayout());  
	      setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
	      setSize(200, 200);  
	      setVisible(true);  
	  } 
	*/
}
