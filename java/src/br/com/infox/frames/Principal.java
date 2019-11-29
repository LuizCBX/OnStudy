package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JLabel lblData;
	//estes objetos serão modificados pelo Jframe login
	public JButton btnUsuarios;
	public JButton btnRelatorios;
	public JPanel panel;
	private JButton btnCadastrar;
	private JButton btnSobre;
	private JButton btnCadastrarCurso;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/br/com/infox/icons/icone.png")));
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				alterarLabel();
			}
		});
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 555);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 457, 903, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblData = new JLabel("New label");
		lblData.setFont(new Font("News701 BT", Font.BOLD, 24));
		lblData.setForeground(new Color(64, 224, 208));
		lblData.setBounds(10, 23, 811, 25);
		panel.add(lblData);
		
		
		
		btnCadastrar = new JButton("");
		btnCadastrar.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/add-group.png")));
		btnCadastrar.setToolTipText("Cadastro Aluno");
		btnCadastrar.setBackground(Color.GRAY);
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alunos cadastrar = new Alunos();
				cadastrar.setVisible(true);
			}
		});
		btnCadastrar.setBounds(563, 270, 128, 128);
		contentPane.add(btnCadastrar);
		
		
		
		btnSobre = new JButton("");
		btnSobre.setToolTipText("Sobre");
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/information.png")));
		btnSobre.setForeground(Color.WHITE);
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setBackground(Color.GRAY);
		btnSobre.setFont(new Font("News701 BT", Font.BOLD, 22));
		btnSobre.setBounds(698, 26, 70, 64);
		contentPane.add(btnSobre);
		
		btnCadastrarCurso = new JButton("");
		btnCadastrarCurso.setToolTipText("Cadastrar Curso");
		btnCadastrarCurso.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/icon_course.png")));
		btnCadastrarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cursos cursos = new Cursos();
				cursos.setVisible(true);
			}
		});
		btnCadastrarCurso.setForeground(Color.WHITE);
		btnCadastrarCurso.setBackground(Color.GRAY);
		btnCadastrarCurso.setBounds(199, 270, 128, 128);
		contentPane.add(btnCadastrarCurso);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/ico.png")));
		label_1.setBounds(26, -12, 256, 212);
		contentPane.add(label_1);
	}
	
	
	private void alterarLabel() {
		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblData.setText(formatador.format(data));
	}
}














