import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class mygui extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	JTextField textfield;
	
	Vector<String> cat;
	JList<String> list;
	
	public mygui() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("��Ʈ�ȳ� ���α׷�");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.EAST);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{125, 0};
		gbl_panel_1.rowHeights = new int[]{29, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnNewButton = new JButton("��ǰ����");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("�������");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
	
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.NORTH);
		
		
		//////////////////////
		String []category={"����/�ػ�","����/���","����","ä��/�ǳ���","��/���","��/�̿�/�Ǿ�",
					"����ǰ/��������","�κ�/��ġ/�ҽ�","�õ���ǰ/���̽�ũ��","����/����","Ŀ��/��",
					"����","���","�Ŀ���/���̷�/�а���","������/ĵ",
					"���/����/�ҽ�","����/ȭ����","���/����/�ٵ�","��/ȣ��/���尩","����/�ֹ��ǰ/�׸�"};		
		JComboBox comboBox = new JComboBox(category);

		panel_3.add(comboBox);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_1 = new JButton("�˻�");
		panel_3.add(button_1);

		
		cat = new Vector<String>();

		
		getContentPane().setLayout(new BorderLayout());
		
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.CENTER);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{36, 375, 1, 0};
		gbl_panel_4.rowHeights = new int[]{29, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		/////////
		
		
		textfield = new JTextField(20);
		
		
		
		
		JPanel p = new JPanel();
		GridBagConstraints gbc_p = new GridBagConstraints();
		gbc_p.anchor = GridBagConstraints.NORTHWEST;
		gbc_p.insets = new Insets(0, 0, 5, 5);
		gbc_p.gridx = 1;
		gbc_p.gridy = 0;
		panel_4.add(p, gbc_p);
		p.setLayout(new BorderLayout());
		
		JButton btn=new JButton("�߰�");
		p.add(textfield,BorderLayout.CENTER);
		p.add(btn,BorderLayout.EAST );
		
	
		btn.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				
				String str = textfield.getText();
				
				cat.add(str);
				list.updateUI();
			}
		});
		
		list = new JList<String>(cat);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.gridx = 1;
		gbc_list.gridy = 1;
		panel_4.add(list, gbc_list);
						
				list.addListSelectionListener(new ListSelectionListener(){
					
					@Override
					public void valueChanged(ListSelectionEvent e){
						
						String str = list.getSelectedValue();
						
						
					}
				});
		
		
		
		getContentPane().add(panel,BorderLayout.NORTH);
		getContentPane().add(panel_1,BorderLayout.EAST);
		getContentPane().add(panel_2,BorderLayout.CENTER);
		
		setSize(600,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	
	public static void main(String[] args){
		
		new mygui();
	}
}


