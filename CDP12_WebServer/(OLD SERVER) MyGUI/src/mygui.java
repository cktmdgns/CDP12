import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class mygui extends JFrame implements ActionListener {
	
	private String[] corner_category={"����/�ػ�","����/���","����","ä��/�ǳ���","��/���","��/�̿�/�Ǿ�",
			"����ǰ/��������","�κ�/��ġ/�ҽ�","�õ���ǰ/���̽�ũ��","����/����","Ŀ��/��",
			"����","���","�Ŀ���/���̷�/�а���","������/ĵ",
			"���/����/�ҽ�","����/ȭ����","���/����/�ٵ�","��/ȣ��/���尩","����/�ֹ��ǰ/�׸�"};	
	
	private JPanel panel_main;
	private JPanel panel_goods;
	private JPanel panel_event;
	private JPanel panel_chart;

	private JButton button_view_goods;
	private JButton button_view_event;
	private JButton button_view_chart;
	
	private JButton button_search_goods;
	private JButton button_add_goods;
	private JButton button_del_goods;
	private JButton button_search_event;
	private JButton button_add_event;
	private JButton button_del_event;
	
	
	private JComboBox comboBox_corner_search_goods;
	private JComboBox comboBox_corner_search_event;
	
	private JTextField textField_name_search_goods;
	private JTextField textField_name_search_event;
	
	private JScrollPane total_List_Scroll_goods;
	private JScrollPane total_List_Scroll_event;
	
	private JList list_goods;
	private JList list_event;

	

	public mygui() {
		
		panel_main = new JPanel();
		panel_main.setLayout(null);
		panel_main.setBounds(450, 30, 150, 600);
		getContentPane().add(panel_main);
		
		panel_goods = new JPanel();
		panel_goods.setLayout(null);
		panel_goods.setBounds(0, 0, 450, 600);
		getContentPane().add(panel_goods);
		panel_goods.setVisible(true);
		
		panel_event = new JPanel();
		panel_event.setLayout(null);
		panel_event.setBounds(0, 0, 450, 600);
		getContentPane().add(panel_event);
		panel_event.setVisible(false);
		
		panel_chart = new JPanel();
		panel_chart.setLayout(null);
		panel_chart.setBounds(0, 0, 450, 600);
		getContentPane().add(panel_chart);
		panel_chart.setVisible(false);

		button_view_goods = new JButton("��ǰ����");
		button_view_goods.setBounds(0,10,96,30);
		button_view_goods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_goods.setVisible(true);
				panel_event.setVisible(false);
				panel_chart.setVisible(false);
			}
		});
		panel_main.add(button_view_goods);

		button_view_event= new JButton("�������");
		button_view_event.setBounds(0,50,96,30);
		button_view_event.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel_goods.setVisible(false);
				panel_event.setVisible(true);
				panel_chart.setVisible(false);
				
			}
		});
		panel_main.add(button_view_event);
		
		button_view_chart= new JButton("���");
		button_view_chart.setBounds(0,90,96,30);
		button_view_chart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel_goods.setVisible(false);
				panel_event.setVisible(false);
				panel_chart.setVisible(true);
				
			}
		});
		panel_main.add(button_view_chart);

		
		
		
		
		
		

		JLabel label_corner_check = new JLabel("�ڳ�");
		label_corner_check.setBounds(26,58,37,23);
		panel_goods.add(label_corner_check);
			
		comboBox_corner_search_goods = new JComboBox(corner_category);
		comboBox_corner_search_goods.setBounds(59,58,96,23);
		panel_goods.add(comboBox_corner_search_goods);
		
		JLabel label_name_check = new JLabel("�̸�");
		label_name_check.setBounds(170,58,37,23);
		panel_goods.add(label_name_check);
		
		textField_name_search_goods = new JTextField();
		textField_name_search_goods.setBounds(204,55,150,30);
		panel_goods.add(textField_name_search_goods);

		button_search_goods = new JButton("�˻�");
		button_search_goods.setBounds(366,53,72,33);
		button_search_goods.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String str = textField_name_search_goods.getText();

			}
		});
		panel_goods.add(button_search_goods);
		
		button_add_goods = new JButton("�߰�");
		button_add_goods.setBounds(261,134,72,30);
		button_add_goods.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				addd addd1 = new addd();
				addd1.createD();
				
				del del1 = new del();
				del1.createD_1();
				
			}
		});
		panel_goods.add(button_add_goods);
		
		button_del_goods = new JButton("����");
		button_del_goods.setBounds(345,134,72,30);
		button_del_goods.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				addd addd1 = new addd();
				addd1.createD();
				
				del del1 = new del();
				del1.createD_1();
				
			}
		});
		panel_goods.add(button_del_goods);
		
		
		JLabel label_top_goods = new JLabel(" �̸�               ����               ����               ��ġ      ");
		label_top_goods.setBounds(69,174,285,26);
		panel_goods.add(label_top_goods);
		

		total_List_Scroll_goods = new JScrollPane();
		total_List_Scroll_goods.setBounds(20, 210, 397, 320);
		GridBagConstraints gbc_total_List_Scroll = new GridBagConstraints();
		gbc_total_List_Scroll.gridheight = 2;
		gbc_total_List_Scroll.gridy = 0;
		panel_goods.add(total_List_Scroll_goods, gbc_total_List_Scroll);
		
		list_goods = new JList();
		total_List_Scroll_goods.setViewportView(list_goods);

		setSize(600,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		JLabel label_corner_check_event = new JLabel("�ڳ�");
		label_corner_check_event.setBounds(26,58,37,23);
		panel_event.add(label_corner_check_event);
			
		comboBox_corner_search_event = new JComboBox(corner_category);
		comboBox_corner_search_event.setBounds(59,58,96,23);
		panel_event.add(comboBox_corner_search_event);
		
		JLabel label_name_check_event = new JLabel("�̸�");
		label_name_check_event.setBounds(170,58,37,23);
		panel_event.add(label_name_check_event);
		
		textField_name_search_event = new JTextField();
		textField_name_search_event.setBounds(204,55,150,30);
		panel_event.add(textField_name_search_event);

		button_search_event = new JButton("�˻�");
		button_search_event.setBounds(366,53,72,33);
		button_search_event.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String str = textField_name_search_event.getText();

			}
		});
		panel_event.add(button_search_event);
		
		button_add_event = new JButton("�߰�");
		button_add_event.setBounds(261,134,72,30);
		button_add_event.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				addd addd1 = new addd();
				addd1.createD();
				
				del del1 = new del();
				del1.createD_1();
				
			}
		});
		panel_event.add(button_add_event);
		
		button_del_event = new JButton("����");
		button_del_event.setBounds(345,134,72,30);
		button_del_event.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				addd addd1 = new addd();
				addd1.createD();
				
				del del1 = new del();
				del1.createD_1();
				
			}
		});
		panel_event.add(button_del_event);
		
		
		JLabel label_top_event = new JLabel(" �̸�               ����               ����               ��ġ      ");
		label_top_event.setBounds(69,174,285,26);
		panel_event.add(label_top_event);
		

		total_List_Scroll_event = new JScrollPane();
		total_List_Scroll_event.setBounds(20, 210, 397, 320);
		GridBagConstraints gbc_total_List_Scroll_event = new GridBagConstraints();
		gbc_total_List_Scroll_event.gridheight = 2;
		gbc_total_List_Scroll_event.gridy = 0;
		panel_event.add(total_List_Scroll_event, gbc_total_List_Scroll_event);
		
		list_event = new JList();
		total_List_Scroll_event.setViewportView(list_event);

		setSize(600,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton  button_send_test = new JButton("send");
		button_send_test.setBounds(0,140,96,30);
		button_send_test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("send test : ");
			}
		});
		panel_main.add(button_send_test);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
}



