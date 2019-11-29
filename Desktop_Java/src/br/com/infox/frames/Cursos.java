package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.infox.dal.ConnectionModule;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Cursos extends JFrame {
	
	Connection con =ConnectionModule.conector();
	PreparedStatement pst = null;
	ResultSet rs = null;

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtNota;
	private JTextField txtID;
	private JTextField txtNome;
	private JButton btnAdicionar;
	private JButton btnPesquisar;
	private JButton btnAtualizar;
	private JButton btnDeletar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cursos frame = new Cursos();
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
	public Cursos() {
		setTitle("Cadastrar Cursos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 745, 576);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setForeground(new Color(64, 224, 208));
		lblNewLabel.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblNewLabel.setBounds(19, 159, 56, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setForeground(new Color(64, 224, 208));
		lblNewLabel_1.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblNewLabel_1.setBounds(19, 196, 128, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Descri\u00E7\u00E3o:");
		lblNewLabel_2.setForeground(new Color(64, 224, 208));
		lblNewLabel_2.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblNewLabel_2.setBounds(19, 251, 154, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota M\u00EDnima:");
		lblNewLabel_3.setForeground(new Color(64, 224, 208));
		lblNewLabel_3.setFont(new Font("News701 BT", Font.BOLD, 27));
		lblNewLabel_3.setBounds(19, 311, 229, 25);
		contentPane.add(lblNewLabel_3);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDescricao.setForeground(SystemColor.desktop);
		txtDescricao.setBackground(new Color(255, 255, 255));
		txtDescricao.setBounds(159, 240, 546, 60);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		txtNota = new JTextField();
		txtNota.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNota.setForeground(SystemColor.desktop);
		txtNota.setBounds(227, 316, 128, 27);
		contentPane.add(txtNota);
		txtNota.setColumns(10);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtID.setForeground(SystemColor.desktop);
		txtID.setBackground(new Color(255, 255, 255));
		txtID.setBounds(85, 161, 71, 27);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNome.setForeground(SystemColor.desktop);
		txtNome.setBackground(new Color(255, 255, 255));
		txtNome.setBounds(131, 205, 574, 27);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		btnAdicionar = new JButton("");
		btnAdicionar.setToolTipText("Adicionar");
		btnAdicionar.setIcon(new ImageIcon(Cursos.class.getResource("/br/com/infox/icons/file (1).png")));
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarCurso();
			}
		});
		btnAdicionar.setBounds(19, 375, 128, 128);
		contentPane.add(btnAdicionar);
		
		btnPesquisar = new JButton("");
		btnPesquisar.setToolTipText("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon(Cursos.class.getResource("/br/com/infox/icons/file.png")));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisarCurso();
			}
		});
		btnPesquisar.setBounds(206, 375, 128, 128);
		contentPane.add(btnPesquisar);
		
		btnAtualizar = new JButton("");
		btnAtualizar.setToolTipText("Atualizar");
		btnAtualizar.setIcon(new ImageIcon(Cursos.class.getResource("/br/com/infox/icons/refresh.png")));
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterarCurso();
			}
		});
		btnAtualizar.setBounds(395, 375, 128, 128);
		contentPane.add(btnAtualizar);
		
		btnDeletar = new JButton("");
		btnDeletar.setToolTipText("Deletar");
		btnDeletar.setIcon(new ImageIcon(Cursos.class.getResource("/br/com/infox/icons/file (5).png")));
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removerCurso();
			}
		});
		btnDeletar.setBounds(577, 375, 128, 128);
		contentPane.add(btnDeletar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Cursos.class.getResource("/br/com/infox/icons/icone.png")));
		label.setBounds(19, -24, 200, 200);
		contentPane.add(label);
		
		JButton btnCadastroAulas = new JButton("");
		btnCadastroAulas.setToolTipText("Adicionar Aula");
		btnCadastroAulas.setIcon(new ImageIcon(Cursos.class.getResource("/br/com/infox/icons/criar.png")));
		btnCadastroAulas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aulas aula = new Aulas();
				aula.setVisible(true);
			}
		});
		btnCadastroAulas.setBounds(601, 32, 93, 86);
		contentPane.add(btnCadastroAulas);
	}
	
	
	

	/**Limpar Campos **/
	private void limpar() {
		txtID.setText(null);
		txtNome.setText(null);
		txtDescricao.setText(null);
		txtNota.setText(null);
		
		
	}
	
	
	
	/** CRUD - CREATE **/
	private void adicionarCurso() {
		String create = "insert into tb_curso(id,nome,descricao,nota_minima) values(?,?,?,?)";
		try {
			pst = con.prepareStatement(create);
			// Passagem de parâmetro
			pst.setString(1, txtID.getText());
			pst.setString(2, txtNome.getText());				
			pst.setString(3, txtDescricao.getText());
			pst.setString(4, txtNota.getText());
			
			

			int r = pst.executeUpdate();
			if (r > 0) {
				JOptionPane.showMessageDialog(null, "Curso Adicionado com Sucessso!");
				limpar();
				
			} else {
				JOptionPane.showMessageDialog(null, "Não foi Possível Adicionar"
						+ "!");

			}
;		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void pesquisarCurso() {
		String read = "select * from tb_curso where id = ?";
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
				txtNota.setText(rs.getString(4));
				
				
			} else {
				JOptionPane.showMessageDialog(null, "Curso Inexistente");	
				limpar();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
	/** CRUD - Update **/
	private void alterarCurso() {
		String update = "update tb_curso set nome=?,descricao=?,nota_minima=? where id=?";
		try {
			pst = con.prepareStatement(update);
			// Passagem de parâmetro
			//ATENÇÂO Id é o quarto parâmetro
			
			pst.setString(1, txtNome.getText());				
			pst.setString(2, txtDescricao.getText());
			pst.setString(3, txtNota.getText());
			pst.setString(4, txtID.getText());
			int r = pst.executeUpdate();
			if (r > 0) {
				JOptionPane.showMessageDialog(null, "Curso Alterado com Sucessso!");
				limpar();
				
			} else {
				JOptionPane.showMessageDialog(null, "Não foi Possível Alterar o Curso!");

			}
;		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/** CRUD Delete **/
	private void removerCurso() {
		// Criar uma caixa de diálogo para confirmar a exclusão
		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a Exclusão Deste Curso?", "Atenção", JOptionPane.YES_NO_OPTION);
		if (confirma == JOptionPane.YES_OPTION) {
			String delete = "delete from tb_curso where id=?";
			try {
				pst = con.prepareStatement(delete);
				pst.setString(1, txtID.getText());
				int r = pst.executeUpdate();
				if (r > 0) {
					JOptionPane.showMessageDialog(null, "Curso removido com Sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Impossível remover o Curso!");
					
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	
	


	
	
	
	
	}
}
