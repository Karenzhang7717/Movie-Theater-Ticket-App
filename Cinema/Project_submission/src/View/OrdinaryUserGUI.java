package View;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OrdinaryUserGUI extends JFrame{

	
	public void displayMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	public void addCalcListener (ActionListener listenForCalcButton) {
		
	}

}
