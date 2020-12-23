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
		if (!player.getInventory().contains("sword") && !player.getInventory().contains("apple"))  {
			this.textArea.setText(String.format(
					"As you walk down a thing gravel path with the grass over grown, you uncover a tree. Youre knees are trembling as you "
					+ "walk up to it, and you see brigh red-delicous apples growing at every branch. Next to it, a pedistal is there used to get some apples."
					+ "Coincidentally, there is an old rusty sword laying in the grass.... What shall you do next?"));
		}
		else if(!player.getInventory().contains("apple") && player.getInventory().contains("sword")) {
			this.textArea.setText(String.format("The journey is long and harsh on an empty stomach, and apples are the nourishment a traveler like you needs."
					+ "Are you sure you do not want any for the long road ahead? "));
			this.choice2.setVisible(false);
		}
		else if (!player.getInventory().contains("sword") && player.getInventory().contains("apple")) {
			this.textArea.setText(String.format(
					"The quest shall be danjerous to go unprotected. It is up to you, but sticks and stones only get you so far. "));
			this.choice1.setVisible(false);
			}
		else if (player.getInventory().contains("apple")&& player.getInventory().contains("sword")) {
			this.textArea.setText(String.format(
					"You have looted the area of all necessary essentials. Now, ponder your quest"));
			this.choice2.setVisible(false);
			this.choice1.setVisible(false);
		}
		this.textArea.setForeground(Color.green);
		this.choice1.setText("Get apples");
		this.choice1.addActionListener(c1l);
		this.choice2.setText("Pick up Sword");
		this.choice2.addActionListener(c2l);
		this.choice3.setVisible(false);
		this.choice4.setText("Go Back home");
		this.choice4.addActionListener(c4l);
		
		this.pushPanelsToGUI();
	}
	public class Choice1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			player.addToInventory("apple");
			Apples apples = new Apples(gui, player);
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			player.addToInventory("sword");
			GetSword gs = new GetSword(gui,player);
		
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
