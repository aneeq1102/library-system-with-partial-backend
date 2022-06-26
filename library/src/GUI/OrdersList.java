package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import library.LibraryAccount;
public class OrdersList extends JFrame {
	static DefaultListModel<String> arr = new DefaultListModel<String>();
	private JPanel contentPane;
	JButton exit;
	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ })
	public OrdersList() {
		setResizable(false);
		setTitle("On The Way");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(116, 158, 178));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("On the way");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 11, 623, 31);
		contentPane.add(lblTitle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 66, 613, 358);
		contentPane.add(scrollPane);
		
		arr=GUIForm.account.inTransit.display();
		JList<String> list = new JList<String>(arr);
		scrollPane.setViewportView(list);
		
		exit = new JButton("Exit");
		exit.setBounds(250,500,130,30);
		contentPane.add(exit);
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
}