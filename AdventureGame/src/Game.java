import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	
	
	public static void main(String[] args) {
		//new Game();
		GUI gui = new GUI();
		TitleScreen ts = new TitleScreen(gui);
		
		
	}
	
//	// game attributes
//	public JFrame window;
//	public Container container;
//
//	
//	// constructor
//	public Game() {
//		window = new JFrame();
//			window.setSize(1000, 600);
//			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			window.getContentPane().setBackground(Color.darkGray);
//			window.setLayout(null);
//			window.setVisible(true);
//		
//		container = window.getContentPane();
//		TitleScreen titleScreen = new TitleScreen();
//		for(JPanel panel: titleScreen.allPanels) {
//			container.add(panel);
//		}
//	
//	}
//
//	public void updateScreen(JPanel panel) {
//		container.invalidate();
//		Container newContainer = window.getContentPane();
//		newContainer.add(panel);
//	}
//	
//	
}
