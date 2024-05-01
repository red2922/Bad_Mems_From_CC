import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class newFile extends JFrame implements ActionListener {

protected static int NUM_ASSETS = 50;
protected static JTable Portfolio;

private JLabel messageLabel;
private JTextField messageField;
private JTextField addField;
private JTextField fileName;



	JFrame frame = new JFrame();
	JButton mAdd = new JButton("Add");
	JButton mDelete = new JButton("Delete");
	JButton mOpen = new JButton("Open");
	
	
	newFile(){
		//(x , y , length, height)
		
		Object[][] tableVals = new Object[12][4];               
	      String[] columnHeadings = {"Symbol", "Amount Owned", "Gain/Loss", "Dividends Paid"};
	       String data[][]= {};
	     
	      Portfolio = new JTable(tableVals, columnHeadings);
	      Portfolio.setEnabled(false);
	      Portfolio.setBounds(500, 100, 350, 200);
	      
	      DefaultTableModel model = new DefaultTableModel(data,columnHeadings);
	      
		messageLabel = new JLabel("Message: ");
		messageLabel.setBounds(30,100,350,50);
	
		
		mAdd = new JButton("Add");
		mAdd.setBounds(20,200,100,50);
		mAdd.addActionListener(this);
		
		mDelete = new JButton("Delete");
		mDelete.setBounds(20,300,100,50);
		mDelete.addActionListener(this);
	
		mOpen = new JButton("Open");
		mOpen.setBounds(20,400,100,50);
		mOpen.addActionListener(this);
		
		
		addField = new JTextField(60);
		addField.setEditable(true);
		addField.setBounds(150,250,300,50);
		addField.setFocusable(true);
		addField.setText("");
		addField.addActionListener(this);
		
		fileName = new JTextField(60);
		fileName.setEditable(true);
		fileName.setBounds(150,400,300,50);
		fileName.setFocusable(true);
		fileName.setText("");
		fileName.addActionListener(this);
	
		messageField = new JTextField(60);
	    messageField.setEditable(false);
	    messageField.setBounds(100,100,350,50);
	    messageField.setFocusable(false);
	    
	    frame.add(messageLabel);
		frame.add(messageField);
		frame.add(mAdd);
		frame.add(addField);
		frame.add(mDelete);
		frame.add(mOpen);
		frame.add(fileName);
	    frame.add(Portfolio);
	    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		frame.setLayout(null);
		frame.setVisible(true);
		messageField.setText("Enter a portfolio name");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		JButton actionSource = (JButton) event.getSource();
		
	    if(actionSource.equals(mAdd)){
	    	String input = addField.getText();
	    	String file_Name = fileName.getText();
	    	
	    	try {
	    		Files.write(Paths.get(file_Name + ".txt"),
	    				input.getBytes(),StandardOpenOption.APPEND);
	    	}
	    	catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    	
	    	SwingUtilities.updateComponentTreeUI(frame);
	     
	    } 
	    else if (actionSource.equals(mDelete)) {
	    	  String input = addField.getText();
	    	  
	    }
	    
	    else if (actionSource.equals(mOpen)) {
	    	
	    	
	    }
	    
	    
	    
	    
	//Use RefreshUI(); to refresh the UI
	//To delete items use portfolio.RemoveAssets(mSeleted Asset);
	}
	    public static void main(String[] args) {
	
	    	
	    	newFile newfile = new newFile();
	    	
	    	  newfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      newfile.pack();
		      newfile.setVisible(true);
	    	
	}
	
}
