import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaiPTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { GiaiPTB2 frame = new GiaiPTB2();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public GiaiPTB2() {
		setTitle("CH\u01AF\u01A0NG TR\u00CCNH T\u00CDNH PH\u01AF\u01A0NG TR\u00CCNH B\u1EACC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập vào phần tử (a):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(62, 29, 206, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpVoPhn = new JLabel("Nh\u1EADp v\u00E0o ph\u1EA7n t\u1EED (b):");
		lblNhpVoPhn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpVoPhn.setBounds(62, 95, 206, 41);
		contentPane.add(lblNhpVoPhn);
		
		JLabel lblNhpVoPhn_1 = new JLabel("Nh\u1EADp v\u00E0o ph\u1EA7n t\u1EED (c):");
		lblNhpVoPhn_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpVoPhn_1.setBounds(62, 155, 206, 41);
		contentPane.add(lblNhpVoPhn_1);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(334, 39, 101, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(334, 105, 101, 20);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(334, 165, 101, 20);
		contentPane.add(txtC);
		
		JButton btnKetQua = new JButton("T\u00EDnh Nghi\u1EC7m");
		btnKetQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thuatToan();
			}
		});
		btnKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnKetQua.setBounds(282, 295, 153, 41);
		contentPane.add(btnKetQua);
	}
		void thuatToan() {
			String str_A = txtA.getText();
			String str_B = txtB.getText();
			String str_C = txtC.getText();
			
			double A = Double.parseDouble(str_A);
			double B = Double.parseDouble(str_B);
			double C = Double.parseDouble(str_C);
			JOptionPane hopThoai = new JOptionPane();
			if(A == 0) {
				if(B == 0) {
					
					hopThoai.showMessageDialog(this,"Phương trình vô số nghiệm","Thông báo", getDefaultCloseOperation() );
				}else {
					hopThoai.showMessageDialog(this,"Phương trình vô nghiệm","Thông báo", getDefaultCloseOperation() );
				}
			}else {
				double delta = (double)Math.pow(B, 2) - 4*A*C;
				if(delta < 0) {
					hopThoai.showMessageDialog(this,"Phương trình vô nghiệm! ","Thông báo", getDefaultCloseOperation() );
					
				}else if(delta == 0) {
					hopThoai.showMessageDialog(this,"Phương trình có nghiệm kép: " + -B/(2*A),"Thông báo", getDefaultCloseOperation() );
				}else if(delta > 0) {
					hopThoai.showMessageDialog(this,"Phương trình có 2 nghiệm phân biệt: " + ((-B+ Math.sqrt(delta))/(2*A))+  "va " + ((-B - Math.sqrt(delta))/(2*A)),"Thông báo", getDefaultCloseOperation() );
				}
			}
		}
}
