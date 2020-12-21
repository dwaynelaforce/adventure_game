import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	public static void main(String[] args) {
		new Game();
	}
	// game attributes
	JFrame window;
	Container container;
	
	Font titleFont = new Font("Papyrus", Font.PLAIN, 100);
	JPanel titlePanel;
	JLabel titleLabel;
	
	Font buttonFont = new Font("Papyrus", Font.ITALIC, 40);
	JPanel startButtonPanel;
	JLabel startButtonLabel;
	
	
	
	
	// constructor
	public Game() {
		window = new JFrame();
			window.setSize(1600, 900);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.getContentPane().setBackground(Color.darkGray);
			window.setLayout(null);
			window.setVisible(true);
		
		container = window.getContentPane();
		
		titlePanel = new JPanel();
			titlePanel.setBounds(400, 200, 800, 200);
			titlePanel.setBackground(Color.darkGray);
			
			titleLabel = new JLabel("Adventure Game");
				titleLabel.setForeground(Color.GRAY);
				titleLabel.setFont(titleFont);
		
			titlePanel.add(titleLabel);
		
		startButtonPanel = new JPanel();
			startButtonPanel.setBounds(400, 600, 800, 200);
			startButtonPanel.setBackground(Color.DARK_GRAY);
			
			startButtonLabel = new JLabel("...click to embark on your journey...");
				startButtonLabel.setForeground(Color.red);
				startButtonLabel.setFont(buttonFont);
			
			startButtonPanel.add(startButtonLabel);
		
		
		container.add(titlePanel);
		container.add(startButtonPanel);
		
	}

}
