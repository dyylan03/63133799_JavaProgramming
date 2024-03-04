package duynd.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLoginName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Login frame = new Login();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("\u0110\u0102NG NH\u1EACP H\u1EC6 TH\u1ED0NG QU\u1EA2N L\u00CD B\u00C1N H\u00C0NG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EAn \u0110\u0103ng Nh\u1EADp:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(126, 76, 125, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("M\u1EADt Kh\u1EA9u: ");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(126, 130, 125, 43);
		contentPane.add(lblMtKhu);
		
		txtLoginName = new JTextField();
		txtLoginName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLoginName.setBounds(249, 87, 275, 20);
		contentPane.add(txtLoginName);
		txtLoginName.setColumns(10);
		
		JButton btnLogin = new JButton("\u0110\u0102NG NH\u1EACP");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginBtn();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(249, 210, 125, 36);
		contentPane.add(btnLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPassword.setBounds(249, 138, 275, 20);
		contentPane.add(txtPassword);
	}
	
	void LoginBtn() {
		String str_ten = txtLoginName.getText();
		String str_matkhau = txtPassword.getText();
		if (str_ten.equals("63CNTT") && str_matkhau.equals("123")) {
			MainFrame Home = new MainFrame();
			Home.setVisible(true);
			this.setVisible(false);
		}else {
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this,"Dang nhap that bai","Erros", getDefaultCloseOperation() );
		}
	}
}
