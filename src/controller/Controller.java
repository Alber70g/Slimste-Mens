package controller;

import javax.swing.JFrame;
import tools.Tools;

public class Controller extends JFrame {
	
	public Controller() {
		
		super("SlimsteMens v" + Tools.Version);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		setLayout(null);
		setResizable(false);
		
		initializeComponents();
	}
	
	private void initializeComponents() {
		
		// TODO init window logic.
		
	}
	
}
