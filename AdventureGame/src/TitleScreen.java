import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleScreen {
	// attributes

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
	
	public List<JPanel> allPanels = new ArrayList<JPanel>();
	
	// constructor
	public TitleScreen() {
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
			subtitleLabel = new JLabel("by Anindo Khan & Dwayne LaForce | � 2020");
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
		this.allPanels.add(titlePanel);
		this.allPanels.add(startButtonPanel);
		this.allPanels.add(subtitlePanel);
	}
	// methods
	
	
}
