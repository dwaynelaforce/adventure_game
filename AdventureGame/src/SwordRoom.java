import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SwordRoom extends Room {

	public SwordRoom(GUI gui, Player player) {
		super(gui, player);
		Choice1Listener c1l = new Choice1Listener();
		Choice2Listener c2l = new Choice2Listener();
//		Choice3Listener c3l = new Choice3Listener();
		Choice4Listener c4l = new Choice4Listener();
	
		this.textArea.setText(String.format(
			"You have found an apple tree and a sword. Which shall you take?"));
		this.textArea.setForeground(Color.red);
		this.choice1.setText("Get apples");
		this.player.addToInventory("apples");
		this.choice1.addActionListener(c1l);
		this.choice2.setText("Pick up Sword");
		this.player.addToInventory("sword");
		this.choice2.addActionListener(c2l);
		this.choice3.setVisible(false);
		this.choice4.setText("Go Back home");
		this.choice4.addActionListener(c4l);
		
		this.pushPanelsToGUI();
	}
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		
		}
	}	
	
	public class Choice3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		
		}
	}	
	
	public class Choice4Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Go Back home");
			Home home = new Home(gui, player);
		}
	}
	
}