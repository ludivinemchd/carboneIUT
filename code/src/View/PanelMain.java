package View;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Main.UIMain;

public class PanelMain extends JPanel {
	public PanelWelcome pw;
	public PanelThanks pt;
	public PanelFood pf;
	public CardLayout card;
	public Container c;
	public PanelTransport pd;
	
	UIMain main ;
	
	public PanelMain(JFrame frame, UIMain main)
	{
		c = frame.getContentPane();
		card = new CardLayout();
		c.setLayout(card);
		pw = new PanelWelcome(main);
		c.add(pw);
		pd = new PanelTransport(main);
		c.add(pd);
		pf = new PanelFood(main);
		c.add(pf);
		pt = new PanelThanks(main);
		c.add(pt);
		
		
	}
	
	public PanelFood getPf() {
		return pf;
	}

	public void changePanel()
	{
		card.next(c);
	}
}
