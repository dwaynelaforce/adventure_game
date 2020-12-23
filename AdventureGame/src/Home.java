import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Home {
	GUI gui;
	public Home(GUI gui) {
		Choice1Listener c1l = new Choice1Listener();
		Choice2Listener c2l = new Choice2Listener();
		Choice3Listener c3l = new Choice3Listener();
		Choice4Listener c4l = new Choice4Listener();
		this.gui = gui;
		
		ArrayList<JPanel> panels = new ArrayList<JPanel>();
		Font font = new Font("Papyrus", Font.PLAIN, 16);
		
		JPanel choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(100,100,500,100);
		choiceButtonPanel.setBackground(Color.pink);
		

		JButton choice1 = new JButton("Eat Apple");
		choice1.setFont(font);
		choice1.setForeground(Color.black);
		choice1.setBackground(Color.blue);	
		choice1.addActionListener(c1l);
		choiceButtonPanel.add(choice1);
		
		JButton choice2 = new JButton("Kill Goblin");
		choice2.setFont(font);
		choice2.setForeground(Color.black);
		choice2.setBackground(Color.blue);	
		choice2.addActionListener(c2l);
		choiceButtonPanel.add(choice2);
	
		JButton choice3 = new JButton("Pick Up Sword");
		choice3.setFont(font);
		choice3.setForeground(Color.black);
		choice3.setBackground(Color.blue);	
		choice3.addActionListener(c3l);
		choiceButtonPanel.add(choice3);
	
		JButton choice4 = new JButton("Do a Backflip");
		choice4.setFont(font);
		choice4.setForeground(Color.black);
		choice4.setBackground(Color.blue);	
		choice4.addActionListener(c4l);
		choiceButtonPanel.add(choice4);
	
		gui.updateContainer(choiceButtonPanel);
		
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
