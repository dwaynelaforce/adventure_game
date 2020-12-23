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
			"You open your eyes. Slowly, as the direct sunlight is a bit blinding. "
			+ "The outside world is a complete blur at first, but after a few "
			+ "seconds your sight sharpens. It becomes apparent you are in the back "
			+ "of a horse-drawn wagon, driven by a soldier in imperial garb. "
			+ "Your hands are tied with rope. You're not alone- there are three "
			+ "others in the cart- hands bound just like yours, but one is dressed in "
			+ "fine clothing and also gagged with a piece of cloth."
			+ "%n"
			+ "\"Hey, you. You’re finally awake. You were trying to cross the border, "
			+ "right?  Walked right into that Imperial ambush, same as us, and that "
			+ "thief over there...\" "
			));
		this.choice1.setText("Wizard");
		this.choice1.addActionListener(c1l);
		this.choice2.setText("Dragon");
		this.choice2.addActionListener(c2l);
		this.choice3.setText("Corgi");
		this.choice3.addActionListener(c3l);
		this.choice4.setText("human");
		this.choice4.addActionListener(c4l);
		this.pushPanelsToGUI();
	}
		
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Wizard");
			Wizard wizard = new Wizard(gui, player);
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Dragon dragon = new Dragon(gui, player);
			System.out.println("Dragon");
		}
	}	
	
	public class Choice3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pick up Sword");
		}
	}	
	
	public class Choice4Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Do Backflip");
		}
	}	
	
	
	
	
}
