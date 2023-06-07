package java_project;
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
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.border.EtchedBorder;

public class Mainpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(12, 25, 1238, 79);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("대여");
		chckbxNewCheckBox.setSelected(true);
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("굴림", Font.PLAIN, 20));
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(28, 18, 104, 44);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("반납");
		buttonGroup.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setFont(new Font("굴림", Font.PLAIN, 20));
		chckbxNewCheckBox_1.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_1.setBounds(136, 18, 96, 44);
		panel_1.add(chckbxNewCheckBox_1);
		
		textField = new JTextField();
		textField.setBounds(290, 18, 425, 44);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(720, 18, 104, 44);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나가기");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton_1.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(1129, 18, 97, 44);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("도서 추가");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(1020, 18, 97, 44);
		panel_1.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 114, 1238, 685);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 0, 1238, 40);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblQjsgh = new JLabel("번호");
		lblQjsgh.setHorizontalAlignment(SwingConstants.CENTER);
		lblQjsgh.setFont(new Font("굴림", Font.PLAIN, 18));
		panel_3.add(lblQjsgh);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("제목");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 18));
		panel_5.add(lblNewLabel_2_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_4_1 = new JLabel("저자");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_4_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("수량");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 18));
		panel_7.add(lblNewLabel_1_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("비고");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 40, 1238, 645);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
	}
}
