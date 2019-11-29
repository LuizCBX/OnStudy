package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.infox.dal.ConnectionModule;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Aulas extends JFrame {
	
	Connection con =ConnectionModule.conector();
	PreparedStatement pst = null;
	ResultSet rs = null;


	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtVideo;
	private JTextField txtPdf;
	private JTextField txtID;
	private JLabel lblAula;
	private JLabel lblDescrio;
	private JLabel lblUrlVideo;
	private JLabel lblUrlPdf;
	private JLabel lblConsultarIdCurso;
	private JTextField txtCurso;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aulas frame = new Aulas();
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
	public Aulas() {
		setTitle("Cadastro de Aula");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 788, 577);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(59, 115, 672, 42);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(59, 194, 672, 44);
		contentPane.add(txtDescricao);
		
		txtVideo = new JTextField();
		txtVideo.setColumns(10);
		txtVideo.setBounds(59, 274, 672, 42);
		contentPane.add(txtVideo);
		
		txtPdf = new JTextField();
		txtPdf.setColumns(10);
		txtPdf.setBounds(59, 349, 672, 42);
		contentPane.add(txtPdf);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtID.setBounds(59, 40, 38, 26);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblID = new JLabel("Consultar ID Aula:");
		lblID.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblID.setBounds(59, 11, 197, 26);
		contentPane.add(lblID);
		
		JButton btnPesquisar = new JButton("PESQUISAR");
		btnPesquisar.setToolTipText("PESQUISAR");
		btnPesquisar.setIcon(new ImageIcon(Aulas.class.getResource("/br/com/infox/icons/file.png")));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisarAula();
			}
		});
		btnPesquisar.setBounds(127, 402, 129, 125);
		contentPane.add(btnPesquisar);
		
		JButton btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setToolTipText("ADICIONAR");
		btnAdicionar.setIcon(new ImageIcon(Aulas.class.getResource("/br/com/infox/icons/file (1).png")));
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarAula();
			}
		});
		btnAdicionar.setBounds(333, 402, 126, 125);
		contentPane.add(btnAdicionar);
		
		JButton btnAtualizar = new JButton("ATUALIZAR");
		btnAtualizar.setToolTipText("ATUALIZAR");
		btnAtualizar.setIcon(new ImageIcon(Aulas.class.getResource("/br/com/infox/icons/refresh.png")));
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarAula();
			}
		});
		btnAtualizar.setBounds(552, 402, 121, 125);
		contentPane.add(btnAtualizar);
		
		lblAula = new JLabel("Aula:");
		lblAula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAula.setBounds(59, 88, 197, 26);
		contentPane.add(lblAula);
		
		lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescrio.setBounds(59, 168, 197, 26);
		contentPane.add(lblDescrio);
		
		lblUrlVideo = new JLabel("URL v\u00EDdeo:");
		lblUrlVideo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUrlVideo.setBounds(59, 249, 197, 26);
		contentPane.add(lblUrlVideo);
		
		lblUrlPdf = new JLabel("URL PDF:");
		lblUrlPdf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUrlPdf.setBounds(59, 324, 197, 26);
		contentPane.add(lblUrlPdf);
		
		lblConsultarIdCurso = new JLabel("Consulta ID Curso:");
		lblConsultarIdCurso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConsultarIdCurso.setBounds(333, 11, 197, 26);
		contentPane.add(lblConsultarIdCurso);
		
		txtCurso = new JTextField();
		txtCurso.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCurso.setColumns(10);
		txtCurso.setBounds(333, 43, 38, 26);
		contentPane.add(txtCurso);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avaliacao avaliacao = new Avaliacao();
				avaliacao.setVisible(true);
			}
		
		});
		btnNewButton.setToolTipText("Adicionar quest\u00F5es");
		btnNewButton.setIcon(new ImageIcon(Aulas.class.getResource("/br/com/infox/icons/criar.png")));
		btnNewButton.setBounds(602, 11, 104, 81);
		contentPane.add(btnNewButton);
	}
	
	/**Limpar Campos **/
	private void limpar() {
		txtID.setText(null);
		txtNome.setText(null);
		txtDescricao.setText(null);
		txtVideo.setText(null);
		txtPdf.setText(null);
		txtCurso.setText(null);
		
	}
	
	private void adicionarAula() {
		String create = "insert into tb_aula(id, nome, descricao, url_pdf, url_video, id_curso) values(?,?,?,?,?,?)";
		try {
			pst = con.prepareStatement(create);
			// Passagem de parâmetro
			pst.setString(1, txtID.getText());
			pst.setString(2, txtNome.getText());				
			pst.setString(3, txtDescricao.getText());
			pst.setString(4, txtPdf.getText());
			pst.setString(5, txtVideo.getText());
			pst.setString(6, txtCurso.getText());
			
			

			int r = pst.executeUpdate();
			if (r > 0) {
				JOptionPane.showMessageDialog(null, "Aula adicionada com Sucessso!");
				limpar();
				
			} else {
				JOptionPane.showMessageDialog(null, "Não foi Possível Adicionar"
						+ "!");

			}
;		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	private void pesquisarAula() {
		String read = "select * from tb_aula where id = ?";
		//usamos o try catch para tratar exceções
		try {
			pst=con.prepareStatement(read);
			//passagem do parâmetro
			pst.setString(1, txtID.getText());
			//atribuios a variável rs o retorno do comando
			rs = pst.executeQuery();//executar a query(sql)
			//usando o retorno para preencher o Jframe
			if (rs.next()) {
				txtID.setText(rs.getString(1));
				txtNome.setText(rs.getString(2));
				txtDescricao.setText(rs.getString(3));
				txtPdf.setText(rs.getString(4));
				txtVideo.setText(rs.getString(5));
				txtCurso.setText(rs.getString(6));

				
			} else {
				JOptionPane.showMessageDialog(null, "Aula Inexistente");	
				limpar();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void atualizarAula() {
		String alterar = "UPDATE tb_aula set nome=?, descricao=?, url_video=?, url_pdf=?, id_curso=? where id=?";
		try {
			pst = (PreparedStatement) con.prepareStatement(alterar);
			// passagem de parametros

			pst.setString(1, txtNome.getText());				
			pst.setString(2, txtDescricao.getText());
			pst.setString(3, txtVideo.getText());
			pst.setString(4, txtPdf.getText());
			pst.setString(5, txtCurso.getText());
			pst.setString(6, txtID.getText());
			
			int r = pst.executeUpdate();
			if (r > 0) {
				JOptionPane.showMessageDialog(null, "Aula alterada com Sucessso!");
				limpar();	
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possivel alterar o aula");
				

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
