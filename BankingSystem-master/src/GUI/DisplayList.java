package GUI;
import javax.swing.DefaultListModel;
import Data.FileIO;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import java.awt.SystemColor;

public class DisplayList extends JFrame {

	private static final long serialVersionUID = 1L;
	static DefaultListModel<String> arr = new DefaultListModel<String>();
	private JPanel contentPane;

	@SuppressWarnings({ })
	public DisplayList() {

		setTitle("Account List");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(-10, 0, 1650, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel lblAccountList = new JLabel("Account List");
		lblAccountList.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblAccountList.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountList.setBounds(340, 60, 613, 59);
		contentPane.add(lblAccountList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(100, 150, 1100, 400);
		contentPane.add(scrollPane);
		
		arr=FileIO.bank.display();
		JList<String> list = new JList<String>(arr);
		scrollPane.setViewportView(list);
		
	

	}
}
