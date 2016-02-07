package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;

public class TelaAbertura {
	private JFrame frame;
	private JFrame frmLaluAcademiaDe;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAbertura window = new TelaAbertura();
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
	public TelaAbertura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaluAcademiaDe = new JFrame();
		frmLaluAcademiaDe.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAbertura.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmLaluAcademiaDe.setType(Type.POPUP);
		frmLaluAcademiaDe.getContentPane().setBackground(new Color(153, 153, 255));
		frmLaluAcademiaDe.setSize(543,595);
		frmLaluAcademiaDe.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		frmLaluAcademiaDe.setTitle("Lalu Academia de Artes");
		frmLaluAcademiaDe.setBounds(100, 100, 450, 300);
		frmLaluAcademiaDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaluAcademiaDe.getContentPane().setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 11));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setBorder(new CompoundBorder());
		btnEntrar.setSelectedIcon(new ImageIcon(TelaAbertura.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/vk-light-pressed.png")));
		btnEntrar.setBounds(162, 171, 107, 23);
		frmLaluAcademiaDe.getContentPane().add(btnEntrar);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setForeground(new Color(0, 0, 0));
		lblUsurio.setFont(new Font("Segoe WP Black", Font.BOLD, 11));
		lblUsurio.setBounds(76, 85, 54, 14);
		frmLaluAcademiaDe.getContentPane().add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Segoe WP Black", Font.BOLD, 11));
		lblSenha.setBounds(84, 124, 46, 14);
		frmLaluAcademiaDe.getContentPane().add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 122, 166, 20);
		frmLaluAcademiaDe.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(144, 82, 166, 20);
		frmLaluAcademiaDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdministrador.setFont(new Font("Century Gothic", Font.BOLD, 11));
		btnAdministrador.setBounds(162, 203, 107, 23);
		frmLaluAcademiaDe.getContentPane().add(btnAdministrador);
		
		JLabel lblLaluAcademiaDe = new JLabel("Lalu Academia de Artes");
		lblLaluAcademiaDe.setFocusable(false);
		lblLaluAcademiaDe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblLaluAcademiaDe.setBounds(123, 11, 202, 33);
		frmLaluAcademiaDe.getContentPane().add(lblLaluAcademiaDe);
		frmLaluAcademiaDe.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmLaluAcademiaDe.getContentPane()}));
	}


		
	}

