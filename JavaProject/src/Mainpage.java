import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Mainpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage frame = new Mainpage();
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
	public Mainpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1278, 848);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 10, 210, 131);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setBounds(85, 7, 36, 15);
		panel.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(61, 30, 133, 21);
		panel.add(txtId);
		txtId.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("\r\n");
		passwordField.setBounds(61, 61, 133, 21);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(109, 90, 85, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signup a1 = new Signup();
		        a1.setVisible(true);
		        a1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_1.setBounds(12, 90, 85, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setBounds(19, 33, 30, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PW:");
		lblNewLabel_2_1.setBounds(19, 64, 30, 15);
		panel.add(lblNewLabel_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(234, 42, 704, 79);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("대여");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(36, 29, 70, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("반납");
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_1.setBounds(128, 29, 70, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(234, 177, 1016, 622);
		contentPane.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(12, 151, 210, 648);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 10, 186, 256);
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("이미지");
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 276, 186, 362);
		panel_2.add(panel_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("책정보");
		panel_4.add(textPane);
		
		JTextPane txtpnAsd = new JTextPane();
		txtpnAsd.setBounds(234, 151, 1016, 648);
		contentPane.add(txtpnAsd);
		txtpnAsd.setText("asd");
	}
}
