import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Room {
	GUI gui;
	Player player;
	JPanel textPanel;
	JPanel buttonsPanel;
	JButton choice1;
	JButton choice2;
	JButton choice3;
	JButton choice4;
	ArrayList<JPanel> panels;
	
	public Room(GUI gui, Player player) {
		this.gui = gui;
		this.player = player;
	}
}
