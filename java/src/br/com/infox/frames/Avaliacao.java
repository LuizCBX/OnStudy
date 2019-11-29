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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Avaliacao extends JFrame {
	
	
	Connection con =ConnectionModule.conector();
	PreparedStatement pst = null;
	ResultSet rs = null;

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtDescricao;
	private JTextField txtCurso;
	private JTextField txtAlternativaA;
	private JTextField txtAlternativaB;
	private JTextField txtAlternativaC;
	private JTextField txtAlternativaD;
	private JTextField txtAlternativaE;
	private JTextField txtCorreta;
	private JButton btnPesquisar;
	private JButton ADICIONAR;
	private JButton btnNewButton;
	private JLabel lblConsultarIdQuesto;
	private JLabel lblConsultaIdCurso;
	private JLabel lblDescrioDaQuesto;
	private JLabel lblNecessrio;
	private JLabel lblAltera;
	private JLabel lblAlterb;
	private JLabel lblAlterc;
	private JLabel lblAlterd;
	private JLabel lblAltere;
	private JLabel lblAltercorreta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Avaliacao frame = new Avaliacao();
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
	public Avaliacao() {
		setTitle("Cadastro de quest\u00F5es");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 660, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtID = new JTextField();
		txtID.setBounds(52, 82, 41, 39);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtDescricao.setBounds(52, 162, 550, 39);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(367, 82, 41, 39);
		contentPane.add(txtCurso);
		txtCurso.setColumns(10);
		
		txtAlternativaA = new JTextField();
		txtAlternativaA.setBounds(138, 225, 464, 21);
		contentPane.add(txtAlternativaA);
		txtAlternativaA.setColumns(10);
		
		txtAlternativaB = new JTextField();
		txtAlternativaB.setBounds(138, 257, 464, 20);
		contentPane.add(txtAlternativaB);
		txtAlternativaB.setColumns(10);
		
		txtAlternativaC = new JTextField();
		txtAlternativaC.setBounds(138, 288, 464, 20);
		contentPane.add(txtAlternativaC);
		txtAlternativaC.setColumns(10);
		
		txtAlternativaD = new JTextField();
		txtAlternativaD.setBounds(138, 319, 464, 20);
		contentPane.add(txtAlternativaD);
		txtAlternativaD.setColumns(10);
		
		txtAlternativaE = new JTextField();
		txtAlternativaE.setBounds(138, 350, 464, 20);
		contentPane.add(txtAlternativaE);
		txtAlternativaE.setColumns(10);
		
		txtCorreta = new JTextField();
		txtCorreta.setBounds(191, 381, 76, 20);
		contentPane.add(txtCorreta);
		txtCorreta.setColumns(10);
		
		btnPesquisar = new JButton("");
		btnPesquisar.setToolTipText("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon(Avaliacao.class.getResource("/br/com/infox/icons/file.png")));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisarQuestao();
			}
		});
		btnPesquisar.setBounds(134, 425, 133, 125);
		contentPane.add(btnPesquisar);
		
		ADICIONAR = new JButton("");
		ADICIONAR.setToolTipText("ADICIONAR");
		ADICIONAR.setIcon(new ImageIcon(Avaliacao.class.getResource("/br/com/infox/icons/file (1).png")));
		ADICIONAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarQuestao();
			}
		});
		ADICIONAR.setBounds(294, 425, 114, 125);
		contentPane.add(ADICIONAR);
		
		btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Atualizar");
		btnNewButton.setIcon(new ImageIcon(Avaliacao.class.getResource("/br/com/infox/icons/refresh.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarQuestao();
			}
		});
		btnNewButton.setBounds(440, 425, 106, 125);
		contentPane.add(btnNewButton);
		
		lblConsultarIdQuesto = new JLabel("CONSULTAR ID QUEST\u00C3O");
		lblConsultarIdQuesto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConsultarIdQuesto.setBounds(52, 67, 215, 14);
		contentPane.add(lblConsultarIdQuesto);
		
		lblConsultaIdCurso = new JLabel("CONSULTA ID CURSO");
		lblConsultaIdCurso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConsultaIdCurso.setBounds(367, 67, 204, 14);
		contentPane.add(lblConsultaIdCurso);
		
		lblDescrioDaQuesto = new JLabel("DESCRI\u00C7\u00C3O DA QUEST\u00C3O");
		lblDescrioDaQuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescrioDaQuesto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescrioDaQuesto.setBounds(161, 137, 356, 14);
		contentPane.add(lblDescrioDaQuesto);
		
		lblNecessrio = new JLabel("\u00C9 NECESS\u00C1RIO 10 QUEST\u00D5ES POR AVALIA\u00C7\u00C3O");
		lblNecessrio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNecessrio.setBounds(80, 11, 484, 30);
		contentPane.add(lblNecessrio);
		
		lblAltera = new JLabel("Alter_A:");
		lblAltera.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltera.setBounds(52, 228, 76, 14);
		contentPane.add(lblAltera);
		
		lblAlterb = new JLabel("Alter_B:");
		lblAlterb.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlterb.setBounds(52, 263, 76, 14);
		contentPane.add(lblAlterb);
		
		lblAlterc = new JLabel("Alter_C:");
		lblAlterc.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlterc.setBounds(52, 291, 76, 14);
		contentPane.add(lblAlterc);
		
		lblAlterd = new JLabel("Alter_D:");
		lblAlterd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlterd.setBounds(52, 322, 76, 14);
		contentPane.add(lblAlterd);
		
		lblAltere = new JLabel("Alter_E:");
		lblAltere.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltere.setBounds(52, 353, 76, 14);
		contentPane.add(lblAltere);
		
		lblAltercorreta = new JLabel("Alter_Correta:");
		lblAltercorreta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltercorreta.setBounds(52, 384, 133, 14);
		contentPane.add(lblAltercorreta);
	}
	
	
	/**Limpar Campos **/
	private void limpar() {
		txtID.setText(null);
		txtDescricao.setText(null);
		txtCurso.setText(null);
		txtAlternativaA.setText(null);
		txtAlternativaB.setText(null);
		txtAlternativaC.setText(null);
		txtAlternativaD.setText(null);
		txtAlternativaE.setText(null);
		txtCorreta.setText(null);
		
	}
	
	private void adicionarQuestao() {
		String create = "insert into tb_questao(id, descricao, id_curso, alternativa_a, alternativa_b, alternativa_c,"
				+ "alternativa_d, alternativa_e, alternativa_correta) values(?,?,?,?,?,?,?,?,?)";
		try {
			pst = con.prepareStatement(create);
			// Passagem de parâmetro
			pst.setString(1, txtID.getText());
			pst.setString(2, txtDescricao.getText());				
			pst.setString(3, txtCurso.getText());
			pst.setString(4, txtAlternativaA.getText());
			pst.setString(5, txtAlternativaB.getText());
			pst.setString(6, txtAlternativaC.getText());
			pst.setString(7, txtAlternativaD.getText());
			pst.setString(8, txtAlternativaE.getText());
			pst.setString(9, txtCorreta.getText());
			
			

			int r = pst.executeUpdate();
			if (r > 0 && r <= 10) {
				JOptionPane.showMessageDialog(null, "Questão adicionada com Sucessso!");
				limpar();
				
			} else {
				JOptionPane.showMessageDialog(null, "Não foi Possível Adicionar/Só é possível adicionar 10 questões por curso"
						+ "!");

			}
;		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	private void pesquisarQuestao() {
		String read = "select * from tb_questao where id = ?";
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
				txtDescricao.setText(rs.getString(2));
				txtCurso.setText(rs.getString(3));
				txtAlternativaA.setText(rs.getString(4));
				txtAlternativaB.setText(rs.getString(5));
				txtAlternativaC.setText(rs.getString(6));
				txtAlternativaD.setText(rs.getString(7));
				txtAlternativaE.setText(rs.getString(8));
				txtCorreta.setText(rs.getString(9));

			} else {
				JOptionPane.showMessageDialog(null, "Questão Inexistente");	
				limpar();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void atualizarQuestao() {
		String alterar = "UPDATE tb_questao set descricao=?, id_curso=?, alternativa_a=?, alternativa_b=?, alternativa_c=?, alternativa_d, "
				+ "alternativa_e, alternativa_correta where id=?";
		try {
			pst = (PreparedStatement) con.prepareStatement(alterar);
			// passagem de parametros

			pst.setString(1, txtDescricao.getText());				
			pst.setString(2, txtCurso.getText());
			pst.setString(3, txtAlternativaA.getText());
			pst.setString(4, txtAlternativaB.getText());
			pst.setString(5, txtAlternativaC.getText());
			pst.setString(6, txtAlternativaD.getText());
			pst.setString(7, txtAlternativaE.getText());
			pst.setString(8, txtCorreta.getText());
			pst.setString(9, txtID.getText());
			
			int r = pst.executeUpdate();
			if (r > 0) {
				JOptionPane.showMessageDialog(null, "Questão alterada com Sucessso!");
				limpar();	
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possivel alterar");
				

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
