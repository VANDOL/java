package java_project;

import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_login extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JPasswordField pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_login frame = new Main_login();
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
	public Main_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(0, 0, 480, 373);
		contentPane.add(panel_1);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(186, 133, 156, 21);
		panel_1.add(id);
		
		pw = new JPasswordField();
		pw.setToolTipText("\r\n");
		pw.setBounds(186, 164, 156, 21);
		panel_1.add(pw);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				String uid = id.getText();
				String upass = "";
				for(int i=0; i<pw.getPassword().length; i++) {
					upass = upass + pw.getPassword()[i];
				}
				UserDAO s=new UserDAO();
					
				boolean login_success = s.logincheck(uid, upass);
				
				if(login_success) {
					Mainpage p =new Mainpage();
			        p.setVisible(true);
			        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			        setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "로그인 실패!");
				}
			}
		});
		btnNewButton.setFont(new Font("Gulim", Font.PLAIN, 12));
		btnNewButton.setBounds(239, 211, 103, 34);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signup a1 = new Signup();
		        a1.setVisible(true);
		        a1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_1.setBounds(129, 211, 98, 34);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setBounds(144, 136, 30, 15);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PW:");
		lblNewLabel_2_1.setBounds(144, 167, 30, 15);
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(200, 10, 78, 34);
		panel_1.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("로그인");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 24));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book_list p = new Book_list();
				String[][] s;
				s=p.Update_book();
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_2.setBounds(193, 298, 97, 23);
		panel_1.add(btnNewButton_2);
	}
}
