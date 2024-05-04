package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;


public class AddAccount extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AddAccount() {
		setTitle("Add Account");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(-10, 0, 1650, 1080);


		contentPane = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image img = new ImageIcon("C:\\MinGW\\bin\\bank-1\\BankingSystem-master\\src\\GUI\\image-4.jpg").getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        setContentPane(contentPane);
        contentPane.setLayout(null); 

		
		JButton btnAddCurrentAccount = new JButton("Add Saving Account");
		btnAddCurrentAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddCurrentAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addsavingsaccount.isVisible()){
					GUIForm.addsavingsaccount.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}				
				dispose();
			}
		});
		btnAddCurrentAccount.setBounds(500, 200, 296, 40);
		contentPane.add(btnAddCurrentAccount);


		JButton button = new JButton("Add Current Account");
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addcurrentacc.isVisible()){
					GUIForm.addcurrentacc.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				dispose();
			}
		});
		button.setBounds(500, 300, 296, 40);
		contentPane.add(button);

		
		JButton btnAddStudentAccount = new JButton("Add Student Account");
		btnAddStudentAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddStudentAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addstudentaccount.isVisible()){					
					GUIForm.addstudentaccount.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				dispose();
			}			
		});
		btnAddStudentAccount.setBounds(500, 400, 296, 40);
		contentPane.add(btnAddStudentAccount);


		JLabel lblAddAccount = new JLabel("Add Account");
		lblAddAccount.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblAddAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAccount.setBounds(340, 120, 613, 59);
		contentPane.add(lblAddAccount);
	}
}
