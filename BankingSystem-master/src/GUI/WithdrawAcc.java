package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Exceptions.AccNotFound;
import Exceptions.InvalidAmount;
import Exceptions.MaxBalance;
import Exceptions.MaxWithdraw;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import Data.FileIO;

import java.awt.*;


public class WithdrawAcc extends JFrame implements Serializable {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public WithdrawAcc() {
		setTitle("Withdraw From Account");
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
		
		JLabel lblDepositToAccount = new JLabel("Withdraw From Account");
		lblDepositToAccount.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblDepositToAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblDepositToAccount.setBounds(340, 120, 613, 59);
		contentPane.add(lblDepositToAccount);

		
		JLabel lblName = new JLabel("Account Number:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(300, 200, 250, 40);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(600, 200, 300, 40);
		contentPane.add(textField);
		textField.setColumns(10);


		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAmount.setBounds(300, 300, 250, 40);
		contentPane.add(lblAmount);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(600, 300, 300, 40);
		contentPane.add(textField_1);
		
		JButton btnDeposit = new JButton("Withdraw");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String aacountNum;
				double amt;
				aacountNum=textField.getText();
				amt=Double.parseDouble(textField_1.getText());
					try {
						int a=JOptionPane.showConfirmDialog(getComponent(0), "Confirm?");
						if(a==0)
						{
							
							FileIO.bank.withdraw(aacountNum, amt);
							JOptionPane.showMessageDialog(getComponent(0),"Withdraw Successful");
							dispose();
						}
						else
						{
						textField.setText(null);
						textField_1.setText(null);
						
						}
						
					} catch (MaxBalance e1) {
						JOptionPane.showMessageDialog(getComponent(0), "Insufficient Balance");
						JOptionPane.showMessageDialog(getComponent(0),"Failed");
						textField.setText(null);
						textField_1.setText(null);
				
					} catch (AccNotFound e1) {
						JOptionPane.showMessageDialog(getComponent(0), "Sorry! Account Not Found");
						JOptionPane.showMessageDialog(getComponent(0),"Failed");
						textField.setText(null);
						textField_1.setText(null);
					
					} catch (MaxWithdraw e1) {
						JOptionPane.showMessageDialog(getComponent(0), "Maximum Withdraw Limit Exceed");
						JOptionPane.showMessageDialog(getComponent(0),"Failed");
						textField.setText(null);
						textField_1.setText(null);
						
					} catch (InvalidAmount e1) {
						JOptionPane.showMessageDialog(getComponent(0), "Invalid Amount");
						JOptionPane.showMessageDialog(getComponent(0),"Failed");
						textField.setText(null);
						textField_1.setText(null);
					}
				
				
					textField.setText(null);
					textField_1.setText(null);
	
			}
		});
		btnDeposit.setBounds(400, 400, 200, 40);
		contentPane.add(btnDeposit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(700, 400, 200, 40);
		contentPane.add(btnReset);


		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText(null);
				textField_1.setText(null);
			}
		});	
	}
}
