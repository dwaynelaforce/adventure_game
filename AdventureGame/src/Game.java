import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
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
	
	Font titleFont = new Font("Papyrus", Font.PLAIN, 92);
	JPanel titlePanel;
	JLabel titleLabel;
	
	Font subtitleFont = new Font("Papyrus", Font.ITALIC, 18);
	JPanel subtitlePanel;
	JLabel subtitleLabel;
	
	Font buttonFont = new Font("Papyrus", Font.ITALIC, 32);
	JPanel startButtonPanel;
	JLabel startButtonLabel;
	JButton startButton;
	
	// constructor
	public Game() {
		window = new JFrame();
			window.setSize(1000, 600);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.getContentPane().setBackground(Color.darkGray);
			window.setLayout(null); // not sure what this does but hey it works
			window.setVisible(true);
		
		container = window.getContentPane();
		
		titlePanel = new JPanel();
			titlePanel.setBounds(100, 100, 800, 150);
			titlePanel.setBackground(Color.darkGray);
			titleLabel = new JLabel("Adventure Game");
				titleLabel.setForeground(Color.GRAY);
				titleLabel.setFont(titleFont);
			titlePanel.add(titleLabel);
		
		subtitlePanel = new JPanel();
			subtitlePanel.setBounds(100, 250, 800, 50);
			subtitlePanel.setBackground(Color.darkGray);
			subtitleLabel = new JLabel("by Anindo Khan & Dwayne LaForce | © 2020");
				subtitleLabel.setForeground(Color.lightGray);
				subtitleLabel.setFont(subtitleFont);
			subtitlePanel.add(subtitleLabel);
		
			
			
		startButtonPanel = new JPanel();
			startButtonPanel.setBounds(300, 350, 400, 200);
			startButtonPanel.setBackground(Color.darkGray);
			startButtonLabel = new JLabel("... embark on your journey ...");
				startButtonLabel.setForeground(Color.red);
				startButtonLabel.setFont(buttonFont);
			
			startButton = new JButton("start");
				startButton.setFont(buttonFont);
				startButton.setBackground(Color.black);
				startButton.setForeground(Color.lightGray);
			startButtonPanel.add(startButtonLabel);
			startButtonPanel.add(startButton);
		
		container.add(titlePanel);
		container.add(subtitlePanel);
		
		container.add(startButtonPanel);
		
	}

}
