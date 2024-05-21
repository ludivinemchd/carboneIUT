package View;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.ControllerButtons;
import Main.UIMain;

public class PanelThanks extends JPanel{
	UIMain main;
	JLabel ack;
	public PanelThanks(UIMain main)
	{
		this.main = main;
		this.setLayout(new FlowLayout());
		ack = new JLabel("Merci !");
		JButton b2 = new JButton("Nouveau");
		this.add(ack);
		this.add(b2);

		b2.addActionListener(new ControllerButtons(main, ControllerButtons.END));
		
	}
	
	public void updateMessage(String message)
	{
		ack.setText(message);
	}
}
