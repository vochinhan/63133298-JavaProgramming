import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField res;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhTinhToan frame = new ManHinhTinhToan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ManHinhTinhToan() {
		setTitle("Tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a):");
		lblNewLabel.setBounds(21, 34, 127, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b):");
		lblNhpSTh.setBounds(21, 91, 127, 34);
		contentPane.add(lblNhpSTh);
		
		a = new JTextField();
		lblNewLabel.setLabelFor(a);
		a.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a.setBounds(158, 37, 224, 28);
		contentPane.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		lblNhpSTh.setLabelFor(b);
		b.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b.setBounds(158, 95, 224, 27);
		contentPane.add(b);
		b.setColumns(10);
		
		JButton cong = new JButton("Cộng");
		cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		cong.setBounds(21, 176, 89, 23);
		contentPane.add(cong);
		
		JButton tru = new JButton("Trừ");
		tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		tru.setBounds(120, 176, 89, 23);
		contentPane.add(tru);
		
		JButton nhan = new JButton("Nhân");
		nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		nhan.setBounds(219, 176, 89, 23);
		contentPane.add(nhan);
		
		JButton chia = new JButton("Chia");
		chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		chia.setBounds(318, 176, 89, 23);
		contentPane.add(chia);
		
		res = new JTextField();
		res.setEditable(false);
		res.setFont(new Font("Tahoma", Font.PLAIN, 16));
		res.setColumns(10);
		res.setBounds(158, 222, 224, 27);
		contentPane.add(res);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán: ");
		lblKtQuTnh.setBounds(31, 218, 127, 34);
		contentPane.add(lblKtQuTnh);
	}
	
	void HamXuLyCong()
	{
		double aValue = Double.parseDouble(a.getText());
		double bValue = Double.parseDouble(b.getText());
		double resValue = aValue + bValue;
		
		res.setText(String.valueOf(resValue));
	}
	
	void HamXuLyTru()
	{
		double aValue = Double.parseDouble(a.getText());
		double bValue = Double.parseDouble(b.getText());
		double resValue = aValue - bValue;
		
		res.setText(String.valueOf(resValue));
	}
	
	void HamXuLyNhan()
	{
		double aValue = Double.parseDouble(a.getText());
		double bValue = Double.parseDouble(b.getText());
		double resValue = aValue * bValue;
		
		res.setText(String.valueOf(resValue));
	}
	
	void HamXuLyChia()
	{
		double aValue = Double.parseDouble(a.getText());
		double bValue = Double.parseDouble(b.getText());
		double resValue = aValue / bValue;
		
		res.setText(String.valueOf(resValue));
	}
}
