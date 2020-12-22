import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class EventScreen {
	Font eventFont = new Font("Papyrus", Font.PLAIN, 92);
	JPanel eventPanel;
	JLabel eventLabel;
	
	public EventScreen() {
		eventPanel = new JPanel();
		eventPanel.setBounds(100, 100, 800, 150);
		eventPanel.setBackground(Color.yellow);
		eventLabel = new JLabel("welcome to the journey");
			eventLabel.setForeground(Color.GRAY);
			eventLabel.setFont(eventFont);
		eventPanel.add(eventLabel);
		
		Game game = new Game();
		game.window.add(eventPanel);
	}
}
