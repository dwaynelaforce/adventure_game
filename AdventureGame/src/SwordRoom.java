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
			"You have found a ));
		this.textArea.setForeground(Color.red);
		this.choice1.setText("Eat a Rabbit");
		this.choice1.addActionListener(c1l);
		this.choice2.setText("Kill a bear");
		this.choice2.addActionListener(c2l);
		this.choice3.setText("Fly");
		this.choice3.addActionListener(c3l);
		this.choice4.setText("Go Back home");
		this.choice4.addActionListener(c4l);
		
		this.pushPanelsToGUI();
	}
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("Eat a Rabbit");
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Kill a bear");
		}
	}	
	
	public class Choice3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Fly");
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
