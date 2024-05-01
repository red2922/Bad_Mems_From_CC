/*import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.File;

/*
 GUI first loads into a open + message screen
 Enter portfolio name 
 Should open another window displaying portfolio info 
 If portfolio does not exist should display a message that it doesn't exists
 Should be able to add or delete assets
ex
Symbol
Type
Amount Owned
Price bought at 

 if dividend
 How much has been paid out to the user
 
Then save and close the program

 */

/*public class main_gui extends JFrame implements ActionListener {
	private JLabel openLabel;
	private JLabel messageLabel;
	private JTextField openField;
	private JTextField messageField;
	
	main_gui(){
		
		
		GridBagConstraints layoutConst = null;
		
		setTitle("WallStreet Bets");
		
		messageLabel = new JLabel("Message: ");
		openLabel = new JLabel("Open");
		
		openField = new JTextField(15);
		openField.setEditable(true);
		openField.setText("");
	    openField.addActionListener(this);
	    
	    messageField = new JTextField(15);
	    messageField.setEditable(false);

		setLayout(new GridBagLayout());
		layoutConst = new GridBagConstraints();
		
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		
		layoutConst.insets = new Insets(10,10,10,10);
		
		add(openLabel, layoutConst);
		
		 layoutConst = new GridBagConstraints();
	      layoutConst.gridx = 1;
	      layoutConst.gridy = 0;
	      layoutConst.insets = new Insets(10, 10, 10, 10);
	      add(openField, layoutConst);
		
	      layoutConst = new GridBagConstraints();
	      layoutConst.gridx = 0;
	      layoutConst.gridy = 1;
	      layoutConst.insets = new Insets(10, 10, 10, 10);
	      add(messageLabel, layoutConst);
		
	      layoutConst = new GridBagConstraints();
	      layoutConst.gridx = 1;
	      layoutConst.gridy = 1;
	      layoutConst.insets = new Insets(10, 10, 10, 10);
	      add(messageField, layoutConst);
	      
	      messageField.setText("Enter a Portfolio Name");
	}
		
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			String userInput;
			
		      userInput = openField.getText();
		      String filePath = openField.getText() + ".txt";
		      //File file = new File(filePath);
		      //String path = file.getPath();
		      
		      
		      Launch_Window launchWindow = new Launch_Window();
			
		}
		
		
	public static void main(String[] args) {
		
		
		main_gui myFrame = new main_gui();
		
	
	      /*JFrame appFrame = new JFrame();

	      appFrame.setSize(500, 300);
	      appFrame.setTitle("Personal Portfolio");
	      */
	      
	   /*   
	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      myFrame.pack();
	      myFrame.setVisible(true);

	      
	      
	      
	      
	      

	}

}
*/