package Friendship_calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Friend {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Friend window = new Friend();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Friend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 515, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FRIENDSHIP CALCULATOR");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(10, 54, 504, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Your Name");
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(34, 159, 123, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		tb1.setBounds(212, 160, 191, 28);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Friend's Name");
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(34, 232, 155, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb2 = new JTextField();
		tb2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		tb2.setBounds(212, 233, 191, 28);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		JLabel lb = new JLabel("");
		lb.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 15));
		lb.setBounds(60, 369, 353, 46);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1=tb1.getText();
				String n2=tb2.getText();
				Random r=new Random();
				int i=r.nextInt(1,100);
				lb.setText("Hey Your LOVE% is :"+i);
				
			}
		});
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		btnNewButton.setBounds(124, 295, 155, 36);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\FRIENDSHIP.png"));
		lblNewLabel_1.setBounds(20, 74, 425, 307);
		frame.getContentPane().add(lblNewLabel_1);
		
		
	}

}
