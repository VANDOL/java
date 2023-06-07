package java_project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Signup extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JTextField id;
	private JPasswordField pw;
	private JPasswordField pw_r;
	private JTextField name;
	private JTextField birth;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 284);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(null);
		getContentPane().add(panel, BorderLayout.CENTER);

		JPanel contentPane = new JPanel();
		panel.add(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 130, 100, 70, 70, 95, 0 };
		gbl_contentPane.rowHeights = new int[] { 25, 25, 0, 25, 25, 24, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel_1 = new JLabel("아이디:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		id = new JTextField();
		id.setColumns(10);
		GridBagConstraints gbc_id = new GridBagConstraints();
		gbc_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_id.insets = new Insets(0, 0, 5, 5);
		gbc_id.gridx = 2;
		gbc_id.gridy = 0;
		contentPane.add(id, gbc_id);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호:");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 1;
		gbc_lblNewLabel_1_1.gridy = 1;
		contentPane.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);

		pw = new JPasswordField();
		GridBagConstraints gbc_pw = new GridBagConstraints();
		gbc_pw.fill = GridBagConstraints.HORIZONTAL;
		gbc_pw.insets = new Insets(0, 0, 5, 5);
		gbc_pw.gridx = 2;
		gbc_pw.gridy = 1;
		contentPane.add(pw, gbc_pw);

		JLabel lblNewLabel_2 = new JLabel("비밀번호 확인:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);

		pw_r = new JPasswordField();
		GridBagConstraints gbc_pw_r = new GridBagConstraints();
		gbc_pw_r.fill = GridBagConstraints.HORIZONTAL;
		gbc_pw_r.insets = new Insets(0, 0, 5, 5);
		gbc_pw_r.gridx = 2;
		gbc_pw_r.gridy = 2;
		contentPane.add(pw_r, gbc_pw_r);

		JLabel lblNewLabel_3 = new JLabel("이름:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);

		name = new JTextField();
		GridBagConstraints gbc_name = new GridBagConstraints();
		gbc_name.insets = new Insets(0, 0, 5, 5);
		gbc_name.fill = GridBagConstraints.HORIZONTAL;
		gbc_name.gridx = 2;
		gbc_name.gridy = 3;
		contentPane.add(name, gbc_name);
		name.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("생년월일:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);

		birth = new JTextField();
		GridBagConstraints gbc_birth = new GridBagConstraints();
		gbc_birth.anchor = GridBagConstraints.NORTHEAST;
		gbc_birth.insets = new Insets(0, 0, 5, 5);
		gbc_birth.gridx = 2;
		gbc_birth.gridy = 4;
		contentPane.add(birth, gbc_birth);
		birth.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("성별:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 5;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);

		JRadioButton male = new JRadioButton("남자");
		buttonGroup.add(male);
		GridBagConstraints gbc_male = new GridBagConstraints();
		gbc_male.fill = GridBagConstraints.HORIZONTAL;
		gbc_male.insets = new Insets(0, 0, 0, 5);
		gbc_male.gridx = 2;
		gbc_male.gridy = 5;
		contentPane.add(male, gbc_male);

		JRadioButton female = new JRadioButton("여자");
		buttonGroup.add(female);
		GridBagConstraints gbc_female = new GridBagConstraints();
		gbc_female.insets = new Insets(0, 0, 0, 5);
		gbc_female.gridx = 3;
		gbc_female.gridy = 5;
		contentPane.add(female, gbc_female);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 32));
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);


		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = id.getText();
				String upw = pw.getText();
				String upw_r = pw_r.getText();
				String uname = name.getText();
				int ubrith = Integer.parseInt(birth.getText());

				int sex;
				if (male.isSelected()) {
					sex = 0;
				} else {
					sex = 1;
				}
				
				System.out.println(upw);
				System.out.println(upw_r);
				if(upw != upw_r) {
					JOptionPane.showMessageDialog(null, "비밀번호가 다릅니다!");
				}
				else if(uid.isEmpty()) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요!");
				}
				else if(upw.isEmpty()) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요!");
				}
				else if(uname.isEmpty()) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요!");
				}
				else if(ubrith==0) {
					JOptionPane.showMessageDialog(null, "생년월일을 입력하세요!");
				}
				else {
					JOptionPane.showMessageDialog(null, "회원가입 성공!");
					Update_user p = new Update_user();
					p.Update(uid, upw, uname, ubrith, sex);
					setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			}
		});
		panel_2.add(btnNewButton);
	}
}
