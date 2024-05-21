package View;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.ControllerButtons;
import Main.UIMain;

public class PanelWelcome extends JPanel {
	UIMain main;
	public PanelWelcome(UIMain main)
	{
		this.main = main;
		this.setLayout(new FlowLayout());
		JLabel l = new JLabel("Bienvenue !");
		JButton b1 = new JButton("Commencer");
		this.add(l);
		this.add(b1);
		

		b1.addActionListener(new ControllerButtons(main,ControllerButtons.COMMENCER));
		
	}
}
