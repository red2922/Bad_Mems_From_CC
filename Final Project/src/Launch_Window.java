/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Launch_Window implements ActionListener {

	JFrame frame = new JFrame();
	JButton myButton = new JButton("New");
	JButton myButton_2 = new JButton("Open Current");
	
	
	Launch_Window(){
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		frame.add(myButton);
		
		myButton_2.setBounds(100,260,200,40);
		myButton_2.setFocusable(false);
		myButton_2.addActionListener(this);
		frame.add(myButton_2);

		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton actionSource = (JButton) e.getSource();

	    if(actionSource.equals(myButton)){
	    	newFile newfile = new newFile();
	    	
	     
	    	
	    } else if (actionSource.equals(myButton_2)) {
	    	
	    	
	       
	}
	
	
	
	
	
	
	
	
	
	}
}
*/
