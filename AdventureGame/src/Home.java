import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Home extends Room{
	
	
	
	
	
public Home(GUI gui, Player player) {
		super(gui, player);
		Choice1Listener c1l = new Choice1Listener();
		Choice2Listener c2l = new Choice2Listener();
		Choice3Listener c3l = new Choice3Listener();
		Choice4Listener c4l = new Choice4Listener();
		this.textArea.setText(" Welcome to the Journey, the path is in your own hands. Decide how you will fulfill your journey");
		this.textArea.setForeground(Color.red);
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
			
			System.out.println("Eat Apple");
		}
	}	
	public class Choice2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("kill Goblin");
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
