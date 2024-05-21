package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import Main.UIMain;
import Model.Data;
import Model.ModelTransport;

public class ControllerButtons implements ActionListener {
	
	public static final int COMMENCER =0;
	public static final int VOITURE =1;
	public static final int CO_VOITURAGE = 2;
	public static final int VELO = 3;
	public static final int TRANSPORTS_EN_COMMUN =4 ;
	public static final int AUTRE_TRANSPORT =5;
	public static final int SUIVANT_WM = 6;
	public static final int SUIVANT_PC = 7;
	public static final int END =8;
	public static final int VEGAN = 9;
	public static final int VEGETARIEN = 10;
	public static final int BOEUF =11;
	public static final int AUTRE_REPAS = 12;
	
	
	public  int action;
	public UIMain main ;
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		boolean valide ;
		valide =main.modelT.add(this.action);
		
		if (valide)
		{
			main.changePanel();
		}
		
		
	}
	
	
	public ControllerButtons(UIMain main, int i)
	{
		this.main = main;
		this.action = i;

		
	}
	
}
