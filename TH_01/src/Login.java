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
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

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

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel dfdf = new JLabel("Tên đăng nhập:");
		dfdf.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dfdf.setBounds(27, 34, 125, 39);
		contentPane.add(dfdf);
		
		JLabel sdfsdf = new JLabel("Mật khẩu: ");
		sdfsdf.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		sdfsdf.setBounds(27, 84, 125, 39);
		contentPane.add(sdfsdf);
		
		username = new JTextField();
		username.setBounds(175, 41, 210, 32);
		contentPane.add(username);
		username.setColumns(10);
		
		JButton btnngNhp = new JButton("Đăng nhập");
		btnngNhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnngNhp.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnngNhp.setBounds(93, 155, 262, 82);
		contentPane.add(btnngNhp);
		
		password = new JPasswordField();
		password.setBounds(175, 95, 210, 32);
		contentPane.add(password);
	}
	
	void XuLyDangNhap()
	{
		String UserName = username.getText();
		String PassWord = password.getText();
		
		if (UserName.equals("63CNTT") && PassWord.equals("123"))
		{
			HomeFrame homeFrame = new HomeFrame();
			homeFrame.setVisible(true);
			
			this.setVisible(false);
		}
		else
		{
			username.setText("");
			password.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
