package interfaces;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPG {

	private JFrame frame;
	private JTextField User_Account;
	private JLabel Password_Labal;
	private JPasswordField User_Password;
	private ChefPG chefPG = new ChefPG();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPG window = new LoginPG();
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
	public LoginPG() {

		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPG.class.getResource("/images/table.png")));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(150, 450, 300, 175);
		panel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Restauant_System = new JLabel("Restauant System");
		Restauant_System.setBounds(232, 33, 117, 34);
		panel.add(Restauant_System);
		
		JLabel AccountLabal = new JLabel("Account");
		AccountLabal.setBounds(183, 80, 57, 15);
		panel.add(AccountLabal);
		
		User_Account = new JTextField();
		User_Account.setBounds(250, 77, 96, 21);
		panel.add(User_Account);
		User_Account.setColumns(10);
		
		Password_Labal = new JLabel("Password");
		Password_Labal.setBounds(183, 122, 57, 15);
		panel.add(Password_Labal);
		
		User_Password = new JPasswordField();
		User_Password.setBounds(250, 119, 96, 21);
		panel.add(User_Password);
		User_Password.setColumns(10);
		
		JButton LoginBtn = new JButton("Login");
		LoginBtn.setIcon(null);
		LoginBtn.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		LoginBtn.setBackground(new Color(72, 209, 204));
		LoginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chefPG.setVisible(true);
				
			}
		});
		LoginBtn.setBounds(232, 180, 87, 23);
		panel.add(LoginBtn);
		
		
		
	}
}
