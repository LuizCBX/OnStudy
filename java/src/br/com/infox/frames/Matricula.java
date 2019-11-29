package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.infox.dal.ConnectionModule;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Matricula extends JFrame {
	
	Connection con =ConnectionModule.conector();
	PreparedStatement pst = null;
	ResultSet rs = null;

	private JPanel contentPane;
	private JTextField txtRA;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JButton btnNewButton;
	private JLabel lblId;
	private JTextField txtPesquisar;
	private JTextField txtData;
	private JTextField txtDescricao;
	private int idCurso;
	private int idMatricula;
	private int idAluno;
	private JButton btnAdicionar;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField txtIdCurso;
	private JLabel lblIdCurso;
	private JTextField txtCurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Matricula frame = new Matricula();
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
	public Matricula() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Matricula.class.getResource("/br/com/infox/icons/icone.png")));
		setTitle("Matricula");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 537);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Pesquisar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisarAluno();
				pesquisarCurso();
				pesquisarMatricula();
			}
		});
		btnNewButton.setBounds(170, 452, 138, 27);
		contentPane.add(btnNewButton);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPesquisar.setBounds(135, 122, 96, 27);
		contentPane.add(txtPesquisar);
		txtPesquisar.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarMatricula();
			}
		});
		btnAdicionar.setBounds(405, 452, 138, 27);
		contentPane.add(btnAdicionar);
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 281, 698, 160);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNomeCurso = new JLabel("Curso:");
		lblNomeCurso.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblNomeCurso.setBounds(10, 55, 109, 34);
		panel.add(lblNomeCurso);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblDescrio.setBounds(10, 108, 141, 27);
		panel.add(lblDescrio);
		
		txtIdCurso = new JTextField();
		txtIdCurso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtIdCurso.setBounds(150, 17, 96, 27);
		panel.add(txtIdCurso);
		txtIdCurso.setColumns(10);
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDescricao.setBounds(161, 108, 382, 41);
		panel.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		lblIdCurso = new JLabel("ID Curso:");
		lblIdCurso.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblIdCurso.setBounds(10, 14, 182, 23);
		panel.add(lblIdCurso);
		
		txtCurso = new JTextField();
		txtCurso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCurso.setBounds(108, 65, 242, 27);
		panel.add(txtCurso);
		txtCurso.setColumns(10);
		
		
		
		
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 168, 698, 102);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome Aluno:");
		lblNome.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblNome.setBounds(10, 48, 180, 43);
		panel_1.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNome.setBounds(187, 58, 501, 27);
		panel_1.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCPF.setBounds(455, 11, 221, 27);
		panel_1.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtRA = new JTextField();
		txtRA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtRA.setBounds(177, 11, 114, 27);
		panel_1.add(txtRA);
		txtRA.setColumns(10);
		
		JLabel lblIdAluno = new JLabel("R.A Aluno:");
		lblIdAluno.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblIdAluno.setBounds(10, 11, 180, 26);
		panel_1.add(lblIdAluno);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblCpf.setBounds(375, 6, 84, 33);
		panel_1.add(lblCpf);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(227, 227, 227));
		panel_2.setBounds(10, 110, 698, 47);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(41, 11, 48, 23);
		panel_2.add(lblId);
		lblId.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		txtData = new JTextField();
		txtData.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtData.setBounds(525, 11, 96, 27);
		panel_2.add(txtData);
		txtData.setColumns(10);
		txtData.setText(String.valueOf(2138-new Date().getYear()+"/"+new Date().getMonth()+"/"+new Date()+new Date()));                             
		
		JLabel lblDataMatricula = new JLabel("Data Matricula:");
		lblDataMatricula.setBounds(288, 9, 214, 27);
		panel_2.add(lblDataMatricula);
		lblDataMatricula.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Matricula.class.getResource("/br/com/infox/icons/i.png")));
		label.setBounds(27, -2, 188, 112);
		contentPane.add(label);
	}
	
	
	/**Limpar Campos **/
	private void limpar() {
		txtPesquisar.setText(null);
		txtNome.setText(null);
		txtRA.setText(null);
		txtCPF.setText(null);
		txtIdCurso.setText(null);
		txtCurso.setText(null);
		txtDescricao.setText(null);
		
		
	}
	
	
	private void pesquisarAluno() {
		String read = "select * from tb_aluno where id=?";
		// Usamos o try catch para tratar exceção
		try {
			pst = (PreparedStatement) con.prepareStatement(read);
			// passagem do parâmetro
			pst.setString(1, txtPesquisar.getText());
			
			idAluno = Integer.parseInt(txtPesquisar.getText());
			
			// atribuimos a variavel rs retorno do comando
			rs = pst.executeQuery();// Executar a query(sql)
			//
			if (rs.next()) {
				txtPesquisar.setText(rs.getString(1));
				txtRA.setText(rs.getString(2));
				txtNome.setText(rs.getString(3));
				txtCPF.setText(rs.getString(4));
		        			

			} else {
				JOptionPane.showMessageDialog(null, "Aluno inexistente");
				limpar();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}// fim do construtor

	private void pesquisarCurso() {
		String read = "select * from tb_curso where id=?";
		// Usamos o try catch para tratar exceção
		try {
			pst = (PreparedStatement) con.prepareStatement(read);
			// passagem do parâmetro
			pst.setString(1, txtIdCurso.getText());
			idCurso = Integer.parseInt(txtIdCurso.getText());
			// atribuimos a variavel rs retorno do comando
			rs = pst.executeQuery();// Executar a query(sql)
			//
			if (rs.next()) {
				
				txtCurso.setText(rs.getString(2));
				txtDescricao.setText(rs.getString(3));
				idMatricula = (rs.getInt(4));
				
			

			} else {
				JOptionPane.showMessageDialog(null, "Curso inexistente");
				limpar();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}// fim do construtor
	
	
	
	
	
	private void AdicionarMatricula() {
		String create = "insert into tb_matricula(data_matricula, id_aluno,id_curso) values(?,?,?)";
		try {
			pst = con.prepareStatement(create);
			// Passagem de parâmetro
			pst.setString(1, txtData.getText());
			 pst.setInt(2, idAluno);
		     pst.setInt(3, idCurso);
			
			
			
			int r = pst.executeUpdate();
			if (r > 0) {
				JOptionPane.showMessageDialog(null, "Matricula Realizada com Sucessso!");
				limpar();
				
				
			} else {
				JOptionPane.showMessageDialog(null, "Não foi Possível Matricular"
						+ "!");

			}
;		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	private void pesquisarMatricula() {
		String read = "select * from tb_matricula where id=?";
		// Usamos o try catch para tratar exceção
		try {
			pst = (PreparedStatement) con.prepareStatement(read);
			// passagem do parâmetro
			pst.setInt(1, idMatricula);
			// atribuimos a variavel rs retorno do comando
			rs = pst.executeQuery();// Executar a query(sql)
			//
			if (rs.next()) {
				txtData.setText(rs.getString(2));
				
				
			

			} else {
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
