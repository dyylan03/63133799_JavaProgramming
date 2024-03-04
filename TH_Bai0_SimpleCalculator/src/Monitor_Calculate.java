import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Monitor_Calculate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField kq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		 * EventQueue.invokeLater(new Runnable() { public void run() { try {
		 * Monitor_Calculate frame = new Monitor_Calculate(); frame.setVisible(true); }
		 * catch (Exception e) { e.printStackTrace(); } } });
		 */
	}

	/**
	 * Create the frame.
	 */
	public Monitor_Calculate() {
		setFont(new Font("Calibri", Font.PLAIN, 16));
		setTitle("Simple_Calculator_Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp s\u1ED1 th\u1EE9 nh\u1EA5t (a):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(37, 56, 177, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nh\u1EADp s\u1ED1 th\u1EE9 hai (b):");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(37, 117, 177, 28);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(195, 62, 222, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(195, 121, 222, 20);
		contentPane.add(txtB);
		
		JLabel lblHyLaChn = new JLabel("H\u00E3y l\u1EF1a ch\u1ECDn ph\u00E9p to\u00E1n:");
		lblHyLaChn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHyLaChn.setBounds(37, 167, 196, 28);
		contentPane.add(lblHyLaChn);
		
		JButton btnCong = new JButton("C\u1ED9ng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Phep tinh Cong
				Cong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(37, 206, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Tr\u1EEB");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Phep tinh Tru
				Tru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(37, 240, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nh\u00E2n");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Phep tinh Nhan
				Nhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(37, 274, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Phep tinh Chia
				Chia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(37, 308, 89, 23);
		contentPane.add(btnChia);
		
		JLabel lblpn = new JLabel("\u0110\u00E1p \u00E1n:");
		lblpn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblpn.setBounds(265, 167, 68, 28);
		contentPane.add(lblpn);
		
		kq = new JTextField();
		kq.setEditable(false);
		kq.setFont(new Font("Tahoma", Font.PLAIN, 16));
		kq.setColumns(10);
		kq.setBounds(328, 171, 89, 20);
		contentPane.add(kq);
	}
	void Cong(){
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		double A = Double.parseDouble(str_A);
		double B = Double.parseDouble(str_B);
		double tong = A+B;
		kq.setText(String.valueOf(tong));
	}
	
	void Tru(){
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		double A = Double.parseDouble(str_A);
		double B = Double.parseDouble(str_B);
		double hieu = A-B;
		kq.setText(String.valueOf(hieu));
	}
	
	void Nhan(){
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		double A = Double.parseDouble(str_A);
		double B = Double.parseDouble(str_B);
		double tich = A*B;
		kq.setText(String.valueOf(tich));
	}
	
	void Chia(){
		String str_A = txtA.getText();
		String str_B = txtB.getText();
		double A = Double.parseDouble(str_A);
		double B = Double.parseDouble(str_B);
		double thuong = A/B;
		kq.setText(String.valueOf(thuong));
	}
}
