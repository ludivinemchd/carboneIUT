package Model;

import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import Controller.ControllerButtons;
import Main.UIMain;
import Model.ModelFood.Meal;
import View.PanelFood;

public class ModelTransport {
	

	UIMain main;
	public static String message;
	



	public boolean add(int i)
	{
		
		PanelFood pn = main.getPm().getPf();
		boolean valide = true;
		
		switch (i)
		{
				
			case ControllerButtons.VOITURE :
				main.model.setCO2Min(main.data.CO2_MIN_VOI);
				main.model.setCO2Max(main.data.CO2_MAX_VOI);
				
				break;
			case ControllerButtons.CO_VOITURAGE :
				main.model.setCO2Min(main.data.CO2_MIN_COVOI);
				main.model.setCO2Max(main.data.CO2_MAX_COVOI);
				
				break;
			case ControllerButtons.VELO:
				main.model.setCO2Min(main.data.CO2_MIN_VELO);
				main.model.setCO2Max(main.data.CO2_MAX_VELO);
				
				break;
			case ControllerButtons.TRANSPORTS_EN_COMMUN :
				main.model.setCO2Min(main.data.CO2_MIN_TRAN);
				main.model.setCO2Max(main.data.CO2_MAX_TRAN);

				break;
			case ControllerButtons.AUTRE_TRANSPORT :
				main.model.setCO2Min(main.data.CO2_MIN_AUTRE);
				main.model.setCO2Max(main.data.CO2_MAX_AUTRE);

				break;
				
			case ControllerButtons.SUIVANT_WM :
				
				if (!pn.gettVegan().getText().isEmpty()) {
				    // Faire quelque chose si le label est rempli
					try
					{
						main.wm.addMeals(Meal.VEGAN, Integer.parseInt(pn.gettVegan().getText()));
					}catch(IllegalArgumentException   e)
					{
						valide = false;
					}
					
					

				}
				
				if (!pn.gettVegetarien().getText().isEmpty()) {
				    // Faire quelque chose si le label est rempli
					try
					{
						main.wm.addMeals(Meal.VEGETARIEN, Integer.parseInt(pn.gettVegetarien().getText()));
					}catch(IllegalArgumentException   e)
					{
						valide = false;
					}
				}
				
				if (!pn.gettBoeuf().getText().isEmpty()) {
				    // Faire quelque chose si le label est rempli
					try
					{
						main.wm.addMeals(Meal.BOEUF, Integer.parseInt(pn.gettBoeuf().getText()));
					}catch(IllegalArgumentException  e)
					{
						valide = false;
					}

				}
				
				if (!pn.gettAutreFood().getText().isEmpty()) {
				    // Faire quelque chose si le label est rempli
					try
					{
						main.wm.addMeals(Meal.AUTRE_VIANDE_POISSON, Integer.parseInt(pn.gettAutreFood().getText()));
					}catch(IllegalArgumentException   e)
					{
						valide = false;
						
					}

				}
				
				if (valide)
				{
					main.model.setCO2Min(main.wm.computeCO2());
					main.model.setCO2Max(main.wm.computeCO2());
					message = "Vous emettez entre " + main.model.getCO2Min() + " et " + main.model.getCO2Max() + " kg de CO2 par semaine";
					main.updateMessage(message);
					
				}
				else
				{
					
					pn.getB1().setText("Vous devez entrer des valeurs entieres positives ou nulles");
					pn.gettVegan().setText("");
					pn.gettVegetarien().setText("");
					pn.gettBoeuf().setText("");
					pn.gettAutreFood().setText("");
				}
				
				break;
			case ControllerButtons.END:
				
				
				pn.gettVegan().setText("");
				pn.gettVegetarien().setText("");
				pn.gettBoeuf().setText("");
				pn.gettAutreFood().setText("");
				pn.getB1().setText("Suivant");
				double CO2Min = - main.model.getCO2Min();
				double CO2Max = - main.model.getCO2Max();
				main.model.setCO2Min(CO2Min);
				main.model.setCO2Max(CO2Max);
				
				main.wm.init();
				break;
		}
		return valide;
		
	}
	
	public ModelTransport (UIMain main)
	{
		this.main = main;
		
	}
	
	
	
}
