package Account_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registration_data {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_data window = new Registration_data();
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
	public Registration_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 723, 472);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBounds(210, 11, 251, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_1.setBounds(92, 99, 94, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2.setBounds(92, 159, 108, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_3.setBounds(92, 212, 128, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Programming");
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_4.setBounds(92, 275, 175, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb = new JTextField();
		tb.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		tb.setBounds(297, 109, 164, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		r1.setBounds(297, 161, 76, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		r2.setBounds(390, 161, 94, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Aiml", "Ds", "Cs", "Iot", "Cse", "Eee", "Ece"}));
		c1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		c1.setBounds(302, 221, 108, 22);
		frame.getContentPane().add(c1);
		
		JCheckBox ch1 = new JCheckBox("Java");
		ch1.setBackground(Color.PINK);
		ch1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		ch1.setBounds(297, 281, 76, 23);
		frame.getContentPane().add(ch1);
		
		JCheckBox ch2 = new JCheckBox("C");
		ch2.setBackground(Color.PINK);
		ch2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		ch2.setBounds(375, 281, 45, 23);
		frame.getContentPane().add(ch2);
		
		JCheckBox ch4 = new JCheckBox("Python\r\n");
		ch4.setBackground(Color.PINK);
		ch4.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		ch4.setBounds(524, 281, 87, 23);
		frame.getContentPane().add(ch4);
		
		JCheckBox ch3 = new JCheckBox("Ruby");
		ch3.setBackground(Color.PINK);
		ch3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 17));
		ch3.setBounds(437, 281, 67, 23);
		frame.getContentPane().add(ch3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb.getText();
				String gender;
				if(r1.isSelected())
				{
					gender="Male";
				}
				else if(r2.isSelected())
				{
					gender="Female";
				}
				else
				{
					gender="Invalid";
				}
				String branch=(String) c1.getSelectedItem();
				String p=" ";
				if(ch1.isSelected()) {
					p=p+" Java";
				}
				if(ch2.isSelected()) {
					p=p+" C";
				}
				if(ch3.isSelected()) {
					p=p+" Python";
				}
				if(ch4.isSelected()) {
					p=p+" Ruby";
				}
				
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aiml","root","mrec");
					String q="insert into Reg values('"+name+"','"+gender+"','"+branch+"','"+p+"')";
					Statement sta=con.createStatement();
					sta.execute(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "registration done");
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(236, 346, 122, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
