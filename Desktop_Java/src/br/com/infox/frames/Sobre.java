package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class Sobre extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/br/com/infox/icons/icon.png")));
		setTitle("Sobre");
		setBounds(100, 100, 505, 355);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.DARK_GRAY);
		contentPanel.setForeground(Color.DARK_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Projeto Integrador EAD");
		lblNewLabel.setFont(new Font("News701 BT", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(32, 11, 375, 30);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Desenvolvido por:");
		lblNewLabel_1.setFont(new Font("News701 BT", Font.BOLD, 22));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(32, 68, 294, 28);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblVerso = new JLabel("Vers\u00E3o 1.0");
		lblVerso.setFont(new Font("News701 BT", Font.BOLD, 18));
		lblVerso.setForeground(new Color(255, 255, 255));
		lblVerso.setBounds(10, 225, 133, 14);
		contentPanel.add(lblVerso);
		
		
		JLabel lblSobALicena = new JLabel("Sob a Licen\u00E7a GPL");
		lblSobALicena.setFont(new Font("News701 BT", Font.BOLD, 18));
		lblSobALicena.setForeground(new Color(255, 255, 255));
		lblSobALicena.setBounds(10, 250, 206, 14);
		contentPanel.add(lblSobALicena);
		
		JLabel lblNewLabel_2 = new JLabel("Leandro Augusto;");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("News701 BT", Font.BOLD, 22));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(61, 108, 231, 30);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Luiz Henrique; ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("News701 BT", Font.BOLD, 22));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(61, 149, 231, 20);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Murillo.\r\n");
		lblNewLabel_4.setFont(new Font("News701 BT", Font.BOLD, 22));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(87, 180, 174, 28);
		contentPanel.add(lblNewLabel_4);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(64, 224, 208));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBackground(Color.LIGHT_GRAY);
				okButton.setFont(new Font("News701 BT", Font.BOLD, 18));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
