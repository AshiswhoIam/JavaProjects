import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ExitListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
}


public class main {

	public static final int BUTTON_WIDTH = 500;
	public static final int BUTTON_HIGHT = 400;


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		JFrame myWindow = new JFrame("Welcome to Swing");
		myWindow.setSize(BUTTON_WIDTH, BUTTON_HIGHT);

		// Disable the default close button of the frame (this is the X button usually located 
		// on the top right corner of the frame) 
		myWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		JButton exitButton = new JButton("Click Here to Terminate the Program.");

		exitButton.setBackground(new Color(200,100,150));


		// Now create the listener, which will actually handle the event
		ExitListener endLsnr = new ExitListener();

		// Relate the button to that listener
		exitButton.addActionListener(endLsnr);

		// Add the button to the frame
		myWindow.add(exitButton);


		// Finally, show the frame after everything is ready
		myWindow.setVisible(true);


	}

}
