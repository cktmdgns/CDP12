import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class mygui extends JFrame {
	private JTextField textField;
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
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		
		String []category={"����/�ػ�","����/���","����","ä��/�ǳ���","��/���","��/�̿�/�Ǿ�",
					"����ǰ/��������","�κ�/��ġ/�ҽ�","�õ���ǰ/���̽�ũ��","����/����","Ŀ��/��",
					"����","���","�Ŀ���/���̷�/�а���","������/ĵ",
					"���/����/�ҽ�","����/ȭ����","���/����/�ٵ�","��/ȣ��/���尩","����/�ֹ��ǰ/�׸�"};		
		JComboBox comboBox = new JComboBox(category);

		panel_4.add(comboBox);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		
		JButton button = new JButton("�˻�");
		panel_6.add(button);
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("�߰�");
		panel_7.add(btnNewButton_2);
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8, BorderLayout.CENTER);
		
		JList list = new JList();
		panel_8.add(list);
	}

}
