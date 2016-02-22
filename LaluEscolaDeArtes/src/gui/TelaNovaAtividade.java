package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Window.Type;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import negocios.Fachada;

import org.json.JSONException;

import classesBasicas.Administrador;
import classesBasicas.Atividade;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class TelaNovaAtividade {

	private JFrame frmLaluAcademiaDe;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovaAtividade window = new TelaNovaAtividade();
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
	public TelaNovaAtividade() {
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
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 32));
		lblLaluAcademiaDe.setBounds(458, 11, 458, 100);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblNome.setBounds(256, 144, 48, 50);
		frmLaluAcademiaDe.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(314, 159, 315, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Categoria:");
		lblDescrio.setFont(new Font("Wasco Sans", Font.PLAIN, 12));
		lblDescrio.setBounds(254, 248, 64, 50);
		frmLaluAcademiaDe.getContentPane().add(lblDescrio);
		
		JLabel lblDuraoTotal = new JLabel("Dura\u00E7\u00E3o Total:");
		lblDuraoTotal.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblDuraoTotal.setBounds(869, 144, 99, 50);
		frmLaluAcademiaDe.getContentPane().add(lblDuraoTotal);
		
		textField_2 = new JTextField();
		textField_2.setBounds(978, 159, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblPreo.setBounds(920, 248, 48, 50);
		frmLaluAcademiaDe.getContentPane().add(lblPreo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(978, 263, 86, 20);
		frmLaluAcademiaDe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Recreação", "Oficina de Artes"}));
		comboBox.setBounds(314, 263, 239, 20);
		frmLaluAcademiaDe.getContentPane().add(comboBox);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atividade atividade = new Atividade(null, null, 0, 0, 0);
				if(textField.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Nome' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_2.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Duração' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				} else if (textField_3.equals("")){
					JOptionPane.showMessageDialog(null, "O campo 'Preço' se encontra vazio! ", "Mensagem de alerta", JOptionPane.ERROR_MESSAGE);
				}else{
					double preco = Double.parseDouble(textField_3.getText());
					double duracao = Double.parseDouble(textField_2.getText());
					
					
						atividade.setNome(textField.getText());
						atividade.setPreco(preco);
						atividade.setCategoria(comboBox.getSelectedItem().toString());
						atividade.setDuracao(duracao);

						Fachada fachada = new Fachada();
						try {
							fachada.cadastrarAtividade(atividade);
						} catch (JSONException | IOException e1) {
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Nova atividade cadastrada");
						textField.setText("");
						textField_2.setText("");
						textField_3.setText("");
					}
				}
		});
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnCadastrar.setBounds(666, 547, 99, 23);
		frmLaluAcademiaDe.getContentPane().add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnVoltar.setBounds(666, 604, 99, 23);
		frmLaluAcademiaDe.getContentPane().add(btnVoltar);
		
		
	}

}
