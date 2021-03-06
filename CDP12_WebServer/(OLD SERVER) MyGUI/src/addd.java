import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addd extends JFrame implements ActionListener{
	public addd() {}
	
	private JPanel panel_addd;

	JTextField textField;//이름
	JTextField textField_1;//가격
	JTextField textField_2;//무게
	JTextField textField_3;//위치
	JButton btnNewButton;//등록버튼
   
   public void createD() {
	  
	   panel_addd = new JPanel();
	   panel_addd.setLayout(null);
	   panel_addd.setBounds(0, 0, 500, 500);
	   getContentPane().add(panel_addd);

	   
	   this.setTitle("추가물품 등록");
	   
	   //이름
	   JLabel lblNewLabel = new JLabel("이름");
	   lblNewLabel.setBounds(12, 54, 62, 28);
	   panel_addd.add(lblNewLabel);
	   
	   textField = new JTextField();
	   textField.setBounds(71, 58, 116, 21);
	   panel_addd.add(textField);
	   textField.setColumns(10);
	      
	      
	   //가격
	   JLabel label = new JLabel("가격");
	   label.setBounds(12, 115, 57, 15);
	   panel_addd.add(label);
	   
	   textField_1 = new JTextField();
	   textField_1.setBounds(71, 112, 116, 21);
	   panel_addd.add(textField_1);
	   textField_1.setColumns(10);
	   
	   
	   //무게
	   JLabel lblNewLabel_1 = new JLabel("무게");
	   lblNewLabel_1.setBounds(12, 227, 57, 15);
	   panel_addd.add(lblNewLabel_1);
	      
	   textField_2 = new JTextField();
	   textField_2.setBounds(71, 168, 116, 21);
	   panel_addd.add(textField_2);
	   textField_2.setColumns(10);
	      
	   
	   //위치
	   JLabel lblNewLabel_2 = new JLabel("위치");
	   lblNewLabel_2.setBounds(12, 171, 57, 15);
	   panel_addd.add(lblNewLabel_2);
	      
	   textField_3 = new JTextField();
	   textField_3.setBounds(71, 224, 116, 21);
	   panel_addd.add(textField_3);
	   textField_3.setColumns(10);
	      
	   
	   //등록버튼
	   btnNewButton = new JButton("\uB4F1\uB85D");
	   btnNewButton.setBounds(130, 289, 97, 23);
	   btnNewButton.addActionListener(this);
	   panel_addd.add(btnNewButton);
	     
	   //등록버튼 감지기
	   btnNewButton.addActionListener(this);
	   
	   setVisible(true);
	   setSize(280, 380);

	   }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnNewButton){
			//창닫기 및 정보전달
			DTO dto=getViewData();
			DAO dao = new DAO();
			boolean ok = dao.update(dto);
			
			if(ok){
				JOptionPane.showMessageDialog(this, "등록되었습니다");
				this.dispose();
			}else{
				JOptionPane.showMessageDialog(this, "등록 실패");
			}
		}
	}
   
	
	public DTO getViewData(){
		DTO dto = new DTO();
		String name = textField.getText();
		String price = textField_1.getText();
		String weight = textField_2.getText();
		String where = textField_3.getText();
		
		//dto에 담음
		dto.setname(name);
		dto.setprice(price);
		dto.setweight(weight);
		dto.setwhere(where);
		
		return dto;
	}
	
}