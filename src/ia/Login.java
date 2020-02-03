package ia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userfield;
	private JButton close;
	private JLabel lblNewLabel;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userfield = new JTextField();
		userfield.setBounds(141, 151, 484, 34);
		contentPane.add(userfield);
		userfield.setColumns(10);
		
		JButton login = new JButton("LOGIN");
		login.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		login.setForeground(new Color(0, 0, 139));
		login.setBackground(new Color(255, 255, 255));
		login.setFont(new Font("Tahoma", Font.PLAIN, 14));
		login.setBounds(141, 264, 141, 40);
		contentPane.add(login);
		
		close = new JButton("CLOSE");
		close.setForeground(new Color(128, 0, 128));
		close.setBackground(new Color(255, 255, 255));
		close.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		close.setFont(new Font("Tahoma", Font.PLAIN, 14));
		close.setBounds(470, 264, 155, 40);
		contentPane.add(close);
		
		JLabel pass = new JLabel("");
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setIcon(new ImageIcon(Login.class.getResource("/lock.png")));
		pass.setBounds(86, 202, 52, 41);
		contentPane.add(pass);
		
		JLabel Login = new JLabel("LOGIN");
		Login.setIcon(new ImageIcon(Login.class.getResource("/profile.png")));
		Login.setForeground(new Color(255, 255, 255));
		Login.setHorizontalAlignment(SwingConstants.CENTER);
		Login.setFont(new Font("Tahoma", Font.BOLD, 25));
		Login.setBounds(235, 92, 259, 48);
		contentPane.add(Login);
		
		JLabel user = new JLabel("");
		user.setIcon(new ImageIcon(Login.class.getResource("/user.png")));
		user.setHorizontalAlignment(SwingConstants.CENTER);
		user.setBounds(92, 151, 46, 35);
		contentPane.add(user);
		
		lblNewLabel = new JLabel("x");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(724, 0, 40, 14);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 206, 484, 34);
		contentPane.add(passwordField);
		
		setUndecorated(true);
	}
}
