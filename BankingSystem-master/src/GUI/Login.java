package GUI;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Login {

	public JFrame frame;
	private JTextField textField , textField_2;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
//	 */

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(-10, 0, 1650, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.getContentPane().setLayout(null);
		ImageIcon backgroundImage = new ImageIcon("C:\\MinGW\\bin\\bank-1\\BankingSystem-master\\src\\GUI\\image.jpg");
		Image img = backgroundImage.getImage().getScaledInstance(1650, 1080, Image.SCALE_SMOOTH);
		backgroundImage = new ImageIcon(img);
		frame.setContentPane(new JLabel(backgroundImage));

		
		frame.setTitle("    Banking System    ");
		ImageIcon icon=new ImageIcon("1.PNG");
		frame.setIconImage(icon.getImage());


		JLabel lblLoginScreen = new JLabel("Login Screen");
		lblLoginScreen.setFont(new Font("Arial", Font.BOLD, 13));
		lblLoginScreen.setBounds(600, 63, 121, 23);
		frame.getContentPane().add(lblLoginScreen);

		
		JLabel label = new JLabel("Welcome to People's Bank");
		label.setFont(new Font("Itallic", (Font.BOLD), 30));
		label.setBounds(460, 100, 400, 41);
		frame.getContentPane().add(label);
		
		
		JLabel lblAdminname = new JLabel("Admin Username :");
		lblAdminname.setFont(new Font("Arial", Font.BOLD, 16));
		lblAdminname.setForeground(Color.GRAY);
		lblAdminname.setBounds(400, 200, 200, 23);
		frame.getContentPane().add(lblAdminname);

		JLabel lblUsername = new JLabel("Customer Username :");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 16));
		lblUsername.setForeground(Color.GRAY);
		lblUsername.setBounds(400, 300, 200, 23);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Enter Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 16));
		lblPassword.setForeground(Color.GRAY);
		lblPassword.setBounds(400, 400, 200, 23);
		frame.getContentPane().add(lblPassword);



		textField = new JTextField();
		textField.setBounds(600, 200, 300, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(600, 300, 300, 30);
		frame.getContentPane().add(textField_2);
		textField.setColumns(10);

		textField_1 = new JPasswordField();
		textField_1.setBounds(600, 400, 300, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String user, pass;
				String admin1, admin2, admin3, pass1, pass2, pass3;

				textField_2.setText("user");
				user = textField_2.getText();

				admin1 = "k";
				admin2 = "Darshan";
				admin3 = "Utsav";

				pass1 = textField_1.getText();
				if (admin1.equals("Keshav") && pass1.equals("9090")) {
					JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
					frame.setVisible(false);
					GUIForm.menu.setVisible(true);
				} 
				
				else {
					pass2 = textField_1.getText();
					if (admin2.equals("Darshan") && pass2.equals("9090")) {
						JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
						frame.setVisible(false);
						GUIForm.menu.setVisible(true);
					} 
					else {
						pass3 = textField_1.getText();
						if (admin3.equals("Utsav") && pass3.equals("9090")) {
							JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
							frame.setVisible(false);
							GUIForm.menu.setVisible(true);
						} 
						else {
							pass = textField_1.getText();
							if (user.equals("user") && pass.equals("group112")) {
								JOptionPane.showMessageDialog(frame.getComponent(0), "Login Successfully");
								frame.setVisible(false);
								GUIForm.menu.setVisible(true);
							}
							else {
								JOptionPane.showMessageDialog(frame.getComponent(0),
										"Username or Password Incorrect !!!");
							}
						}
					}
				}
			}
		});

		btnLogin.setBounds(550, 500, 200, 50);
		frame.getContentPane().add(btnLogin);
	}

}