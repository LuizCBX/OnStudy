package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import br.com.infox.cep.CepWebService;
import br.com.infox.dal.ConnectionModule;
import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import java.awt.Toolkit;

public class Alunos extends JFrame {
	
	Connection con =ConnectionModule.conector();
	PreparedStatement pst = null;
	ResultSet rs = null;

	private JPanel Pesquisar;
	private JTextField txtPesquisar;
	private JTextField txtNome;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtCelular;
	private JTextField txtEmail;
	private JTextField txtCPF;
	private JTextField txtCep;
	private JComboBox coUf;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private JTextField txtRA;
	private int idCon;
	private int idUsuario;
	private int idEnd;
	private int idAluno;
	private JTextField txtDatadeNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alunos frame = new Alunos();
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
	public Alunos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Alunos.class.getResource("/br/com/infox/icons/icon.png")));
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setTitle("Cadastro Alunos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 972, 817);
		Pesquisar = new JPanel();
		Pesquisar.setBackground(Color.LIGHT_GRAY);
		Pesquisar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(Pesquisar);
		Pesquisar.setLayout(null);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPesquisar.setBounds(331, 102, 104, 27);
		Pesquisar.add(txtPesquisar);
		txtPesquisar.setColumns(10);
		
		JButton btnCreate = new JButton("");
		btnCreate.setIcon(new ImageIcon(Alunos.class.getResource("/br/com/infox/icons/file (1).png")));
		btnCreate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnCreate.setForeground(new Color(0, 0, 0));
		btnCreate.setBackground(Color.WHITE);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdicionarUsr();
				AdicionarEnd();
				AdicionarCt();
				cadastrar();
			}
		});
		
		btnCreate.setToolTipText("Adicionar");
		btnCreate.setBounds(70, 623, 128, 128);
		Pesquisar.add(btnCreate);
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setToolTipText("Atualizar");
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				alterarAluno();
				alterarEndereco();
				alterarContato();
				alterarUsuario();

			}
		});
		btnAlterar.setIcon(new ImageIcon(Alunos.class.getResource("/br/com/infox/icons/refresh.png")));
		btnAlterar.setBounds(578, 623, 128, 128);
		Pesquisar.add(btnAlterar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 158, 936, 64);
		Pesquisar.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblUsuario.setBounds(10, 24, 132, 23);
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsuario.setBounds(138, 24, 210, 27);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblSenha.setBounds(456, 24, 123, 23);
		panel.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSenha.setBounds(568, 24, 164, 27);
		panel.add(txtSenha);
		txtSenha.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 233, 936, 144);
		Pesquisar.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 43, 145, 23);
		panel_1.add(lblNome);
		lblNome.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNome.setBounds(109, 43, 533, 27);
		panel_1.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCPF.setBounds(82, 76, 216, 27);
		panel_1.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 77, 115, 20);
		panel_1.add(lblCpf);
		lblCpf.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		JLabel lblRa = new JLabel("R.A:");
		lblRa.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblRa.setBounds(10, 11, 88, 23);
		panel_1.add(lblRa);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblDataDeNascimento.setBounds(10, 105, 341, 23);
		panel_1.add(lblDataDeNascimento);
		
		txtRA = new JTextField();
		txtRA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtRA.setBounds(82, 11, 167, 27);
		panel_1.add(txtRA);
		txtRA.setColumns(10);
		
		txtDatadeNascimento = new JTextField();
		txtDatadeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDatadeNascimento.setBounds(288, 105, 157, 27);
		panel_1.add(txtDatadeNascimento);
		txtDatadeNascimento.setColumns(10);
		
		
		MaskFormatter msk11 = null;
		try {
			msk11 = new MaskFormatter("##/##/####");
		}
		catch(Exception e) {e.printStackTrace();}
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 388, 936, 167);
		Pesquisar.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, 11, 83, 20);
		panel_2.add(lblCep);
		lblCep.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		txtCep = new JTextField();
		txtCep.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCep.setBounds(103, 11, 143, 27);
		panel_2.add(txtCep);
		txtCep.setColumns(10);
		
		JButton btnBuscarCep = new JButton("Buscar CEP");
		btnBuscarCep.setFont(new Font("News701 BT", Font.BOLD, 20));
		btnBuscarCep.setBounds(273, 8, 176, 27);
		panel_2.add(btnBuscarCep);
		btnBuscarCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCep();
			}
		});
		btnBuscarCep.setBackground(Color.LIGHT_GRAY);
		btnBuscarCep.setForeground(Color.DARK_GRAY);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtLogradouro.setBounds(185, 53, 429, 27);
		panel_2.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Logradouro:");
		lblEndereo.setBounds(10, 42, 176, 30);
		panel_2.add(lblEndereo);
		lblEndereo.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtBairro.setBounds(590, 97, 302, 27);
		panel_2.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(497, 98, 117, 19);
		panel_2.add(lblBairro);
		lblBairro.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(631, 54, 130, 19);
		panel_2.add(lblNmero);
		lblNmero.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNumero.setBounds(756, 53, 122, 27);
		panel_2.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(10, 84, 217, 33);
		panel_2.add(lblComplemento);
		lblComplemento.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		txtComplemento = new JTextField();
		txtComplemento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtComplemento.setBounds(208, 91, 244, 27);
		panel_2.add(txtComplemento);
		txtComplemento.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCidade.setBounds(116, 128, 276, 27);
		panel_2.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 128, 176, 20);
		panel_2.add(lblCidade);
		lblCidade.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(460, 129, 58, 19);
		panel_2.add(lblUf);
		lblUf.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		coUf = new JComboBox();
		coUf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		coUf.setBounds(528, 127, 86, 27);
		panel_2.add(coUf);
		coUf.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO", ""}));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 566, 936, 46);
		Pesquisar.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblFone = new JLabel("Celular:");
		lblFone.setBounds(10, 11, 145, 23);
		panel_3.add(lblFone);
		lblFone.setFont(new Font("News701 BT", Font.BOLD, 25));
		
		txtCelular = new JTextField();
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCelular.setBounds(133, 11, 199, 27);
		panel_3.add(txtCelular);
		txtCelular.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(413, 15, 134, 19);
		panel_3.add(lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setBounds(523, 11, 387, 27);
		panel_3.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnPesquisar = new JButton("New button");
		btnPesquisar.setToolTipText("Pesquisar");
		btnPesquisar.setBackground(Color.WHITE);
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesquisarAluno();
				pesquisarContato();
				pesquisarEndereco();	
				pesquisarUsuario();	

				
			}
		});
		btnPesquisar.setIcon(new ImageIcon(Alunos.class.getResource("/br/com/infox/icons/file.png")));
		btnPesquisar.setBounds(326, 623, 128, 128);
		Pesquisar.add(btnPesquisar);
		
		JButton btnMatricular = new JButton("Matricular");
		btnMatricular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Matricula cadastrar = new Matricula();
				cadastrar.setVisible(true);
			}
			
		});
		btnMatricular.setFont(new Font("Swis721 LtEx BT", Font.BOLD, 20));
		btnMatricular.setBounds(751, 679, 162, 37);
		Pesquisar.add(btnMatricular);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Alunos.class.getResource("/br/com/infox/icons/icone.png")));
		lblNewLabel.setBounds(10, -18, 200, 200);
		Pesquisar.add(lblNewLabel);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblId.setBounds(273, 100, 64, 27);
		Pesquisar.add(lblId);
	}
	
	private void buscarCep() {
		try {
			String cep = txtCep.getText();
			CepWebService cepWebService = new CepWebService(cep);
			if (cepWebService.getResultado() == 1) {
				txtLogradouro.setText(cepWebService.getTipo_logradouro() + " " + cepWebService.getLogradouro());
				txtBairro.setText(cepWebService.getBairro());
				txtCidade.setText(cepWebService.getCidade());
				coUf.setSelectedItem(cepWebService.getUf());
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possível obter o CEP");
			
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	private void AdicionarUsr() {
		String create = "insert into tb_usuario(usuario, senha) values(?,?)";
		try {
			pst = (PreparedStatement) con.prepareStatement(create, Statement.RETURN_GENERATED_KEYS);
			// passagem de parâmetros
			pst.setString(1, txtUsuario.getText());	
			pst.setString(2, txtSenha.getText());	
			int r = pst.executeUpdate();
			if (r > 0) {
				 try (ResultSet rs = pst.getGeneratedKeys()) {
				        if (rs.next()) {
				            System.out.println(rs.getInt(1));
				            idUsuario = (rs.getInt(1));
				        }
				        rs.close();

				    }
				
				JOptionPane.showMessageDialog(null, "Usuario adicionado com sucesso");
				} // fim do if  
			else {
				JOptionPane.showMessageDialog(null, "Não foi possivel adicionar");
				  
			} // fim do else
		} // fim do try
		catch (Exception e) {
			System.out.println(e);
		} // fim do catch
	}
	
	
	private void AdicionarEnd() {
		String create = "insert into tb_endereco (logradouro,numero,complemento,cep,bairro,cidade,uf) values(?,?,?,?,?,?,?)";
		try {
			pst = (PreparedStatement) con.prepareStatement(create, Statement.RETURN_GENERATED_KEYS);
			// passagem de parâmetros
			pst.setString(1, txtLogradouro.getText());
			pst.setString(2, txtNumero.getText());
			pst.setString(3, txtComplemento.getText());
			pst.setString(4, txtBairro.getText());
			pst.setString(5, txtCep.getText());
			pst.setString(6, txtCidade.getText());
			pst.setString(7, coUf.getSelectedItem().toString());
			int r = pst.executeUpdate();
			if (r > 0) {
				
				try (ResultSet rs = pst.getGeneratedKeys()) {
			        if (rs.next()) {
			            System.out.println(rs.getInt(1));
			            idEnd = (rs.getInt(1));
			        }
			        rs.close();
				}
				JOptionPane.showMessageDialog(null, "Endereço adicionado com sucesso");
				} // fim do if
			else {
				JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar");
			} // fim do else
		} // fim do try
		catch (Exception e) {
			System.out.println(e);
		} // fim do catch
	}
	
	private void AdicionarCt() {
		String create = "insert into tb_contato (celular,email) values(?,?)";
		try {
			pst = (PreparedStatement) con.prepareStatement(create, Statement.RETURN_GENERATED_KEYS);
			// passagem de parâmetros
			pst.setString(1, txtEmail.getText());
			pst.setString(2, txtCelular.getText());
			int r = pst.executeUpdate();
			if (r > 0) {
				 try (ResultSet rs = pst.getGeneratedKeys()) {
				        if (rs.next()) {
				            System.out.println(rs.getInt(1));
				            idCon = (rs.getInt(1));
				        }
				        rs.close();

				    }
				
				JOptionPane.showMessageDialog(null, "Contato adicionado com sucesso");
				
			} // fim do if
			else {
				JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar");
				  
			} // fim do else
		} // fim do try
		catch (Exception e) {
			System.out.println(e);
		} // fim do catch
	}
	
	
	
	
	
	
	public boolean cadastrar() {
		boolean retorno =true;
		try {
		String pstAluno ="insert into tb_aluno(ra,nome,cpf,dt_nasc, id_usuario, id_end, id_contato) values(?,?,?,?,?,?,?)";
		 pst = con.prepareStatement(pstAluno);
		
		pst.setString(1, txtRA.getText());
		pst.setString(2, txtNome.getText());
		pst.setString(3, txtCPF.getText());
		pst.setString(4, txtDatadeNascimento.getText());
		pst.setInt(5, idUsuario);
		pst.setInt(6, idEnd);
		pst.setInt(7, idCon);
		
		
		
		
		
		int x = pst.executeUpdate();
		
		if(x < 1)
			retorno = false;
		}
		
	
	
	catch(Exception ex) {
		ex.printStackTrace();
		retorno =false;
	}
	
	finally {
		try {con.close();
		idUsuario = 0;
		idEnd = 0;
		idCon = 0;
		}
		catch(Exception e) {e.printStackTrace();}
		
	}
	return retorno;
	
	}



private void pesquisarAluno() {
	String read = "select * from tb_aluno where id=?";
	// Usamos o try catch para tratar exceção
	try {
		pst = (PreparedStatement) con.prepareStatement(read);
		// passagem do parâmetro
		pst.setString(1, txtPesquisar.getText());
		// atribuimos a variavel rs retorno do comando
		rs = pst.executeQuery();// Executar a query(sql)
		//
		if (rs.next()) {
			txtPesquisar.setText(rs.getString(1));
			txtRA.setText(rs.getString(2));
			txtNome.setText(rs.getString(3));
			txtCPF.setText(rs.getString(4));
			txtDatadeNascimento.setText(rs.getString(5));
			idUsuario = (rs.getInt(6));
	        idEnd = (rs.getInt(7));
			idCon = (rs.getInt(8));
			
		

		} else {
			JOptionPane.showMessageDialog(null, "Aluno inexistente");
			
		}
	} catch (Exception e) {
		System.out.println(e);
	}
}// fim do construtor

private void pesquisarEndereco() {
	String read = "select * from tb_endereco where id=?";
	// Usamos o try catch para tratar exceção
	try {
		pst = (PreparedStatement) con.prepareStatement(read);
		// passagem do parâmetro
		pst.setInt(1, idEnd);
		// atribuimos a variavel rs retorno do comando
		rs = pst.executeQuery();// Executar a query(sql)
		//
		if (rs.next()) {
			
			txtLogradouro.setText(rs.getString(2));
			txtNumero.setText(rs.getString(3));
			txtComplemento.setText(rs.getString(4));
			txtCep.setText(rs.getString(5));
			txtBairro.setText(rs.getString(6));
			txtCidade.setText(rs.getString(7));
			//cbUf1.setSelectedItem(rs.getString(8));
			coUf.addItem(rs.getString(9));
			idUsuario = (rs.getInt(10));
			idCon = (rs.getInt(11));
			
			carregaEstados();
			
		

		} else {
			JOptionPane.showMessageDialog(null, "Endereço inexistente");
			
		}
	} catch (Exception e) {
		System.out.println(e);
	}
}// fim do construtor
private void pesquisarContato() {
	String read = "select * from tb_contato where id=?";
	// Usamos o try catch para tratar exceção
	try {
		pst = (PreparedStatement) con.prepareStatement(read);
		// passagem do parâmetro
		pst.setInt(1, idCon);
		// atribuimos a variavel rs retorno do comando
		rs = pst.executeQuery();// Executar a query(sql)
		//
		if (rs.next()) {
			txtCelular.setText(rs.getString(2));
			txtEmail.setText(rs.getString(3));
			
		

		} else {
			JOptionPane.showMessageDialog(null, "Contato inexistente");
			
		}
	} catch (Exception e) {
		System.out.println(e);
	}
}

private void pesquisarUsuario() {
	String read = "select * from tb_usuario where id=?";
	// Usamos o try catch para tratar exceção
	try {
		pst = (PreparedStatement) con.prepareStatement(read);
		// passagem do parâmetro
		pst.setInt(1, idUsuario);
		// atribuimos a variavel rs retorno do comando
		rs = pst.executeQuery();// Executar a query(sql)
		//
		if (rs.next()) {
			
			txtUsuario.setText(rs.getString(2));
			txtSenha.setText(rs.getString(3));
			
		

		} else {
			JOptionPane.showMessageDialog(null, "Usuario inexistente");
		}
	} catch (Exception e) {
		System.out.println(e);
	}
}

private void alterarAluno() {
	String alterar = "update tb_aluno set ra=?,nome=?,cpf=?,dt_nasc=? where id=?";
	try {
		pst = (PreparedStatement) con.prepareStatement(alterar);
		// passagem de parametros
		pst.setString(1, txtRA.getText());
		pst.setString(2, txtNome.getText());
		pst.setString(3, txtCPF.getText());
		pst.setString(4, txtDatadeNascimento.getText());
		pst.setString(5, txtPesquisar.getText());
		int r = pst.executeUpdate();
		if (r > 0) {

			
			JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso");
			
		
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Aluno");

		}
	} catch (Exception e) {
		System.out.println(e);
	}

}
private void alterarEndereco() {
	String alterar = "UPDATE tb_endereco set logradouro=?,numero=?,complemento=?,cep=?,bairro=?,cidade=?,estado=? where id=?";
	try {
		pst = (PreparedStatement) con.prepareStatement(alterar);
		// passagem de parametros
		pst.setString(1, txtLogradouro.getText());
		pst.setString(2, txtNumero.getText());
		pst.setString(3, txtComplemento.getText());
		pst.setString(4, txtCep.getText());
		pst.setString(5, txtBairro.getText());
		pst.setString(6, txtCidade.getText());
	    pst.setString(7, coUf.getSelectedItem().toString());
		pst.setInt(8, idEnd);
		int r = pst.executeUpdate();
		if (r > 0) {

		} else {
			JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Endereco");
	

		}
	} catch (Exception e) {
		System.out.println(e);
	}

}
private void alterarContato() {
	String alterar = "UPDATE tb_contato set celular=?,email=? where id=?";
	try {
		pst = (PreparedStatement) con.prepareStatement(alterar);
		// passagem de parametros
		pst.setString(1, txtCelular.getText());
		pst.setString(2, txtEmail.getText());
		pst.setInt(3, idCon);
		int r = pst.executeUpdate();
		if (r > 0) {
			
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Contato");
			

		}
	} catch (Exception e) {
		System.out.println(e);
	}

}

private void alterarUsuario() {
	String alterar = "UPDATE tb_usuario set usuario=?,senha=? where id=?";
	try {
		pst = (PreparedStatement) con.prepareStatement(alterar);
		// passagem de parametros
		pst.setString(1, txtUsuario.getText());
		pst.setString(2, txtSenha.getText());
		pst.setInt(3, idUsuario);
		int r = pst.executeUpdate();
		if (r > 0) {
			
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Usuário");
			

		}
	} catch (Exception e) {
		System.out.println(e);
	}

}

private void carregaEstados() {
	coUf.addItem("AC");
	coUf.addItem("AL");
	coUf.addItem("AM");
	coUf.addItem("BA");
	coUf.addItem("CE");
	coUf.addItem("DF");
	coUf.addItem("ES");
	coUf.addItem("GO");

	coUf.addItem("MA");
	coUf.addItem("MG");
	coUf.addItem("MS");
	coUf.addItem("MT");

	coUf.addItem("PA");
	coUf.addItem("PB");
	coUf.addItem("PE");
	coUf.addItem("PI");
	coUf.addItem("PR");
	coUf.addItem("RJ");
	coUf.addItem("RN");
	coUf.addItem("RO");
	
	coUf.addItem("RR");
	coUf.addItem("RS");
	coUf.addItem("SC");
	coUf.addItem("SE");
	coUf.addItem("SP");
	coUf.addItem("TO");


}
}



	

