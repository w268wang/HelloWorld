package demo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JComboBoxDemo extends JDialog implements ActionListener  {
	
	private static final int WIDTH = 200;
	private static final int HEIGHT = 200;
	DefaultComboBoxModel<String> monthTemp = new DefaultComboBoxModel();
	DefaultComboBoxModel<String> dayTemp = new DefaultComboBoxModel();
	JComboBox month;
	JComboBox day;
	JButton okButton = new JButton("Change");
	String preItem;
	
	public JComboBoxDemo(Frame owner) {
		
		super(owner,"record search",true);
		setSize(WIDTH,HEIGHT);
        setResizable(true);
        setLayout(new BorderLayout());
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2
                - WIDTH / 2, Toolkit.getDefaultToolkit()
                .getScreenSize().height
                / 2 - HEIGHT / 2); 
        
        monthTemp.addElement("");
        month = new JComboBox();
        month.addActionListener(this);
        for(int i=1; i<13; i++)
        	monthTemp.addElement(""+i);
        month.setModel(monthTemp);
        preItem = (String)month.getSelectedItem();
        //add(month, BorderLayout.CENTER);
        
        MutableComboBoxModel<String> mutday = (MutableComboBoxModel) dayTemp;
        mutday.addElement("");
        day = new JComboBox();
        day.addActionListener(this);
        day.setModel(mutday);
        day.setEnabled(false);
        //add(day, BorderLayout.CENTER);
        JPanel panelComboBox = new JPanel(new GridLayout(1, 2));
        panelComboBox.add(month);
        panelComboBox.add(day);
        add(panelComboBox, BorderLayout.CENTER);
        
        okButton.setActionCommand("ok");
        okButton.addActionListener(this);
        add(okButton, BorderLayout.SOUTH);
        
        setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String strMonth = (String)month.getSelectedItem();
		if(preItem.compareTo(strMonth)!=0){
			System.out.println("BKBKJDNA");
			preItem = (String)month.getSelectedItem();
			if(strMonth.compareTo("")==0) {
				day.setEnabled(false);
			} else {
				int tempMonth = Integer.valueOf(strMonth).intValue();
				int maxDay;
				if(tempMonth==2) {
					maxDay = 29;
				} else if(tempMonth==4||tempMonth==6||tempMonth==9||tempMonth==11){
					maxDay = 30;
				} else {
					maxDay = 31;
				}
				MutableComboBoxModel<String> tempDCBM = (MutableComboBoxModel) dayTemp;
				while(true) {
					if(tempDCBM.getSize()==1){
						tempDCBM.removeElementAt(0);
						break;
					} else {
						tempDCBM.removeElementAt(0);
					}
				}
				tempDCBM.addElement("");
				for(int i=1; i<=maxDay; i++){
					tempDCBM.addElement(""+i);
				}
				day.setModel(tempDCBM);
				day.setEnabled(true);
			}
		}
		
		String cmd = e.getActionCommand();
		if(cmd.equals("ok")){
			MutableComboBoxModel<String> tempDCBM = (MutableComboBoxModel) dayTemp;
			for(int i=0; i<tempDCBM.getSize(); i++) {
				tempDCBM.removeElementAt(0);
			}
			tempDCBM.addElement("");
			for(int i=1; i<=30; i++){
				tempDCBM.addElement(""+i);
			}
			day.setModel(tempDCBM);
			day.setEnabled(true);
		}
	}
	
	public static void main(String[] args) {
		JComboBoxDemo modifyitemframe = new JComboBoxDemo(null);
	}
}
