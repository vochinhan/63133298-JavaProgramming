import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PhuongTrinhBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextArea res;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhuongTrinhBac2 frame = new PhuongTrinhBac2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PhuongTrinhBac2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X^2 + ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(82, 37, 95, 48);
		contentPane.add(lblNewLabel);
		
		a = new JTextField();
		a.setFont(new Font("Tahoma", Font.PLAIN, 11));
		a.setBounds(18, 42, 54, 48);
		contentPane.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(164, 42, 54, 48);
		contentPane.add(b);
		
		c = new JTextField();
		c.setColumns(10);
		c.setBounds(275, 42, 54, 48);
		contentPane.add(c);
		
		JLabel lblNewLabel_1 = new JLabel("= 0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(339, 37, 95, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("X +");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(228, 37, 71, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JButton solve = new JButton("Giải ");
		solve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Solve();
			}
		});
		solve.setFont(new Font("Tahoma", Font.BOLD, 20));
		solve.setBounds(28, 112, 113, 48);
		contentPane.add(solve);
		
		JButton delete = new JButton("Xóa");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete();
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 20));
		delete.setBounds(28, 185, 113, 48);
		contentPane.add(delete);
		
		res = new JTextArea();
		res.setRows(10);
		res.setEditable(false);
		res.setBounds(174, 109, 223, 124);
		contentPane.add(res);
	}
	
	public void Solve()
	{
		res.setText("");
		double aValue = 0, bValue = 0, cValue = 0;
		if (!a.getText().isEmpty()) aValue = Double.parseDouble(a.getText());
		if (!b.getText().isEmpty()) bValue = Double.parseDouble(b.getText());
		if (!c.getText().isEmpty()) cValue = Double.parseDouble(c.getText());

		if (aValue == 0) {
            if (bValue == 0) {
            	res.append("Phương trình vô nghiệm!");
            } else {
            	res.append("Phương trình có một nghiệm: x = " + (-cValue / bValue));
            }
            return;
        }

        double delta = bValue * bValue - 4 * aValue * cValue;
        double x1;
        double x2;

        if (delta > 0) {
            x1 = (double) ((-bValue + Math.sqrt(delta)) / (2 * aValue));
            x2 = (double) ((-bValue - Math.sqrt(delta)) / (2 * aValue));
            res.append("Phương trình có 2 nghiệm là: \n x1 = " + x1 + " \n x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-bValue / (2 * aValue));
            res.append("Phương trình có nghiệm kép: x1 = x2 = " + x1);
        } else {
        	res.append("Phương trình vô nghiệm!");
        }
        
	}
	
	public void Delete()
	{
		a.setText("");
		b.setText("");
		c.setText("");
		res.setText("");
	}
}
