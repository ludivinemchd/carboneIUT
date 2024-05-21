package Model;

public class ModelFood {

	public enum Meal {
		 VEGAN, VEGETARIEN, BOEUF, AUTRE_VIANDE_POISSON
	};
	
	public static double VEGANCO2 = 0.4; 
	public static double VEGETARIENCO2 = 0.5;
	public static double BOEUFCO2 = 7;
	public static double AUTRECO2 = 1.1;
	
	int nbVegan;
	int nbVegetarien;
	int nbBoeuf;
	int nbAutreViandePoisson;
	
	public void init() {
		nbVegan =0;
		nbVegetarien = 0;
		nbBoeuf = 0;
		nbAutreViandePoisson = 0;	
	}
	
	public void addMeals(Meal m , int q) {
		if (q < 0)
		{
			q =0;
		}
		switch (m) {	
			case VEGAN :
			nbVegan = nbVegan + q;
			break;
			case VEGETARIEN :
				nbVegetarien = nbVegetarien + q;
				break;
			case BOEUF :
				nbBoeuf = nbBoeuf + q;
				break;
			case  AUTRE_VIANDE_POISSON :
				nbAutreViandePoisson =nbAutreViandePoisson + q;
				break;
		}
	}
	
	
	public static double getCO2(Meal m) {
		switch (m) {
		
		
		case VEGAN:
			return ModelFood.VEGANCO2;
		case VEGETARIEN:
			return ModelFood.VEGETARIENCO2;
		case BOEUF:
			return ModelFood.BOEUFCO2;
		case AUTRE_VIANDE_POISSON :
			return ModelFood.AUTRECO2;
		default :
			return 0;
		}
	}
	
	public double computeCO2()
	{
		double somme = 0;
		somme += nbVegan * getCO2(Meal.VEGAN);
		somme += nbVegetarien * getCO2(Meal.VEGETARIEN);
		somme += nbBoeuf * getCO2(Meal.BOEUF);
		somme += nbAutreViandePoisson * getCO2(Meal.AUTRE_VIANDE_POISSON);
		return somme;
	}
	
	public int getNbVegan() {
		return nbVegan;
		
	}
	
	public int getNbVegetarien()
	{
		return nbVegetarien;
	}
	
	public int getNbBoeuf()
	{
		return nbBoeuf;
	}
	
	public int getNbAutreViandePoisson()
	{
		return nbAutreViandePoisson;
	}
	
	
}
	
	