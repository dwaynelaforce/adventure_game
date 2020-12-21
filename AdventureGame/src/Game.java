import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Game {
	public static void main(String[] args) {
		new Game();
	}
	// game attributes
	JFrame window;
	Container container;
	
	// constructor
	public Game() {
		window = new JFrame();
		window.setSize(1600, 900);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.darkGray);
		window.setLayout(null);
		window.setVisible(true);
	}

}
