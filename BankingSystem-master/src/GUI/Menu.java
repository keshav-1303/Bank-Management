package GUI;
import javax.swing.border.EmptyBorder;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Data.FileIO;

public class Menu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public Menu() {
        setTitle("Banking System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(-10, 0, 1650, 1080);

		UIManager.put("nimbusBase", Color.WHITE);
        UIManager.put("nimbusBlueGrey", Color.WHITE);
        UIManager.put("control", Color.WHITE);
        UIManager.put("nimbusLightBackground", Color.WHITE);
        UIManager.put("info", Color.WHITE);
        UIManager.put("nimbusInfoBlue", Color.WHITE);

        contentPane = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image img = new ImageIcon("C:\\MinGW\\bin\\bank-1\\BankingSystem-master\\src\\GUI\\image-3.jpg").getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        setContentPane(contentPane);
        contentPane.setLayout(null); // Set layout to null for manual component positioning

        JLabel lblBankingSystem = new JLabel("Banking System");
        lblBankingSystem.setHorizontalAlignment(SwingConstants.CENTER);
        lblBankingSystem.setFont(new Font("Tahoma", Font.BOLD, 26));
        lblBankingSystem.setBounds(340, 120, 613, 59);
        contentPane.add(lblBankingSystem);

        FileIO.Read();

        JButton AddAccButton = new JButton("Add Account");
        AddAccButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        AddAccButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!GUIForm.addaccount.isVisible()) {
                    GUIForm.addaccount.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
                }
            }
        });
        AddAccButton.setBounds(500, 200, 296, 40);
        contentPane.add(AddAccButton);

        JButton btnWithdrawFromAccount = new JButton("Withdraw From Account");
        btnWithdrawFromAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnWithdrawFromAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!GUIForm.withdraw.isVisible()) {
                    GUIForm.withdraw.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
                }
            }
        });
        btnWithdrawFromAccount.setBounds(500, 250, 296, 40);
        contentPane.add(btnWithdrawFromAccount);

        JButton btnDepositToAccount = new JButton("Deposit To Account");
        btnDepositToAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnDepositToAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!GUIForm.depositacc.isVisible()) {
                    GUIForm.depositacc.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
                }
            }
        });
        btnDepositToAccount.setBounds(500, 300, 296, 40);
        contentPane.add(btnDepositToAccount);

        JButton btnDisplayAccountList = new JButton("Display Account List");
        btnDisplayAccountList.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnDisplayAccountList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!GUIForm.displaylist.isVisible()) {
                    GUIForm.displaylist.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
                }
            }
        });
        btnDisplayAccountList.setBounds(500, 350, 296, 40);
        contentPane.add(btnDisplayAccountList);

        JButton btnExit = new JButton("Exit");
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(getComponent(0), "Thanks For Using");
                FileIO.Write();
                System.exit(0);
            }
        });
        btnExit.setBounds(500, 400, 296, 40);
        contentPane.add(btnExit);
    }

    public static void main(String[] args) {
        Menu frame = new Menu();
        frame.setVisible(true);
    }
}
