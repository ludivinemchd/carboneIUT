package Model;

import Main.UIMain;

public class Model {
	private double CO2Min;
	private double CO2Max;
	UIMain main;
	
	public void initCO2()
	{
		CO2Min = 0;
		CO2Max = 0;
	}

	public double getCO2Min() {
		return CO2Min;
	}

	public double getCO2Max() {
		return CO2Max;
	}

	public void setCO2Min(double cO2Min) {
		CO2Min += cO2Min;
	}

	public void setCO2Max(double cO2Max) {
		CO2Max += cO2Max;
	}
	
	public Model (UIMain main)
	{
		this.main = main;
		
	}
}
