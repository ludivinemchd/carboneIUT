package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.ControllerButtons;
import Main.UIMain;

public class PanelFood extends JPanel{
	UIMain main;
	JTextField tVegan ;
	JTextField tVegetarien ;
	JTextField tBoeuf ;
	JTextField tAutreFood ;
	JButton b1 = new JButton("Suivant");
	
	public JButton getB1() {
		return b1;
	}
	public void setB1(JButton b1) {
		this.b1 = b1;
	}
	public void settVegan(JTextField tVegan) {
		this.tVegan = tVegan;
	}
	public void settVegetarien(JTextField tVegetarien) {
		this.tVegetarien = tVegetarien;
	}
	public void settBoeuf(JTextField tBoeuf) {
		this.tBoeuf = tBoeuf;
	}
	public void settAutreFood(JTextField tAutreFood) {
		this.tAutreFood = tAutreFood;
	}
	public JTextField gettVegan() {
		return tVegan;
	}
	public JTextField gettVegetarien() {
		return tVegetarien;
	}
	public JTextField gettBoeuf() {
		return tBoeuf;
	}
	public JTextField gettAutreFood() {
		return tAutreFood;
	}
	public PanelFood(UIMain main)
	{
		this.main = main;
		this.setLayout(new FlowLayout());
		
		
		
		
		JLabel l = new JLabel("Indiquez le nombre de repas de chaque type pris par semaine ");
		JLabel lVegan = new JLabel("Vegan");
		JLabel lVegetarien = new JLabel("Vegetarien");
		JLabel lBoeuf = new JLabel("A base de boeuf");
		JLabel lAutreFood = new JLabel("A base d'une autre viande ou d'un poisson");
		
		tVegan = new JTextField(3);
		tVegetarien = new JTextField(3);
		tBoeuf = new JTextField(3);
		tAutreFood = new JTextField(3);
		
		this.add(l);
		this.add(lVegan);
		this.add(tVegan);
		this.add(lVegetarien);
		this.add(tVegetarien);
		this.add(lBoeuf);
		this.add(tBoeuf);
		this.add(lAutreFood);
		this.add(tAutreFood);
		this.add(b1);
		
		
		b1.addActionListener(new ControllerButtons(main, ControllerButtons.SUIVANT_WM));
	
		
	}
}
