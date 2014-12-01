package controller;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {

	/**
	 * Test door tonnie
	 * Main entry point for this program
	 * @param {string[]} args Command Line Arguments
	 */
	public static void main(String[] args)
	{
		Controller controller = new Controller();
		
		// Zet het frame in het midden van het scherm
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = controller.getSize();
		controller.setLocation(	(screenSize.width  - frameSize.width ) / 2,
		           			(screenSize.height - frameSize.height) / 2);
		controller.setResizable(false);
		controller.setVisible(true);
	}
}
