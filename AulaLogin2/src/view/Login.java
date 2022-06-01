package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import PassWord.pASSwORD;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField JPassword;
	private JPasswordField JConfPass;
	public pASSwORD Box;
	private JTextField txtSurche;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 417);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		pASSwORD S1 = new pASSwORD();
		
		txtUser = new JTextField();
		
		txtUser.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				LimiteCaracter();
			}
			
		});
		
		txtUser.setColumns(10);
		
		JLabel lbUser = new JLabel("Usu\u00E1rio:");
		lbUser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lbPassword = new JLabel("Senha:");
		lbPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lnConPassword = new JLabel("Confirmar Senha:");
		lnConPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton btnINSERT = new JButton("INSERIR");
		
		btnINSERT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Box = Insert(S1);
				
			}
		});
		btnINSERT.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPassword = new JPasswordField();	
	
		
		JConfPass = new JPasswordField();
		
		JButton btnSurche = new JButton("Pesquisar");
		btnSurche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Surche(Box);
			}
		});
		btnSurche.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtSurche = new JTextField();
		txtSurche.setColumns(10);
		
		JButton btnAtua = new JButton("Atualizar");
		btnAtua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update(Box);
			}
		});
		
		btnAtua.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnDelete = new JButton("Excluir");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete(Box);
			}
			
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAtua))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(txtSurche, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSurche, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
							.addComponent(btnINSERT, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lbPassword, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
										.addComponent(lbUser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(JPassword)
										.addComponent(txtUser, GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lnConPassword, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(JConfPass, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)))))
					.addGap(34))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbUser, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbPassword)
						.addComponent(JPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lnConPassword)
						.addComponent(JConfPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(98)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSurche, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSurche, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAtua, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addComponent(btnINSERT, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
					
		
	}
	public pASSwORD Insert(pASSwORD s) 
	{
		s.setUser(txtUser.getText());
		s.setPassword(new String(JPassword.getPassword()));
		s.setConfPassword(new String(JConfPass.getPassword()));
		
		if(s.getPassword().equals(s.getConfPassword())) 
		{
			JOptionPane.showMessageDialog(this, "Usuario Registrado Com Sucesso");
		}else
		{
			JOptionPane.showMessageDialog(this, "Usuario não registrado, Confira os campos");
		}
		
		txtUser.setText("");
		JPassword.setText("");
		JConfPass.setText("");
		
		return s;
	}
	
	
	public void LimiteCaracter() {
		String usuario = txtUser.getText();
		
		if(usuario.length() < 3 || Character.isUpperCase(usuario.charAt(0))!= true) {
			JOptionPane.showMessageDialog(this, "O Usuario de ter mais de 3 caracteres.");
		}
	}
	
	public void Update(pASSwORD s)
	{
		s.setUser(txtUser.getText());
		s.setPassword(new String(JPassword.getPassword()));
		s.setConfPassword(new String(JConfPass.getPassword()));
		
			JOptionPane.showMessageDialog(this, "Usuario Atualizado Com Sucesso");
				
	}
	
	public void Surche(pASSwORD s) 
	{
		if(txtSurche.getText().equals(s.getUser()))
		{
			txtUser.setText(s.getUser());
			JPassword.setText(s.getPassword());
			JConfPass.setText(s.getConfPassword());
						
		}else 
		{
			JOptionPane.showMessageDialog(this, "Esse Usuario Não existe");
		}
		
	}
	
	public void Delete(pASSwORD s) 
	{
		Box = null;
		
		JOptionPane.showMessageDialog(this, " Usuario Deletado");
		
		txtUser.setText("");
		JPassword.setText("");
		JConfPass.setText(""); 
	}
}

