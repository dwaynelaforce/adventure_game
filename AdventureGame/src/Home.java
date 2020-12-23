import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends Room {
	
	public Home(GUI gui, Player player) {
		super(gui, player);
		Choice1Listener c1l = new Choice1Listener();
		Choice2Listener c2l = new Choice2Listener();
		Choice3Listener c3l = new Choice3Listener();
		Choice4Listener c4l = new Choice4Listener();
		this.textArea.setText(String.format(
			"As you walk along the forest road, you come upon a "
			+ "small, wooden bridge spanning a deep ravine. "
			+ "Between you and the bridge is a big ugly troll. %n"
			+ "He says \"My toll to cross this here bridge is 5 copper pieces. "
			+ "Man, I\'m hungry though.  I would waive my fee if you had something "
			+ "to eat...\" %n"
			+ "You have no money, but earlier you remember seeing a grove of apple "
			+ "tress back up the road."
			));
		this.choice1.setText("go to apple tree grove");
		this.choice1.addActionListener(c1l);
		this.choice2.setText("try to shove through");
		this.choice2.addActionListener(c2l);
		this.choice3.setText("give apple");
		this.choice3.addActionListener(c3l);
		this.choice4.setText("stab");
		this.choice4.addActionListener(c4l);
		this.pushPanelsToGUI();
	}
		
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {	
			SwordRoom sr = new SwordRoom(gui,player);
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
		}
	}	
	
	
	
	
}
