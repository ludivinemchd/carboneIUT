package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.ControllerButtons;
import Main.UIMain;
import Model.Data;

public class PanelTransport extends JPanel{
	UIMain main;
	public PanelTransport(UIMain main)
	{
		this.main = main;
		this.setLayout(new FlowLayout());
		JLabel l = new JLabel("Choisissez votre mode de transport : ");
		JButton b1 = new JButton("Voiture");
		JButton b2 = new JButton("Co-voiturage");
		JButton b3 = new JButton("Velo");
		JButton b4 = new JButton("Transports en commun");
		JButton b5 = new JButton("Autre");
		this.add(l);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);

		b1.addActionListener(new ControllerButtons(main, ControllerButtons.VOITURE));
		b2.addActionListener(new ControllerButtons(main, ControllerButtons.CO_VOITURAGE));
		b3.addActionListener(new ControllerButtons(main, ControllerButtons.VELO));
		b4.addActionListener(new ControllerButtons(main, ControllerButtons.TRANSPORTS_EN_COMMUN));
		b5.addActionListener(new ControllerButtons(main, ControllerButtons.AUTRE_TRANSPORT));
		
	}
}
