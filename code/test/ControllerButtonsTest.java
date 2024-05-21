

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Controller.ControllerButtons;
import Main.UIMain;
import Model.Data;
import Model.ModelTransport;
import Model.ModelFood.Meal;

import static org.junit.Assert.assertEquals;



public class ControllerButtonsTest {

	private static ControllerButtons controller;
	public static int action;
	static UIMain main ;
	

	ActionEvent e;
	JFrame frame;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		controller = new ControllerButtons(main, action);
	}

	@Before
	public void setUp() throws Exception {
		frame = new JFrame(); 
		main = new UIMain(frame);
	     controller = new ControllerButtons(main, 1);

	}
	
	
	@Test
	public void actionPerformed_success() {
	    controller.action = ControllerButtons.SUIVANT_WM;
	    main.getPm().getPf().gettVegan().setText("4");
	    main.getPm().getPf().gettVegetarien().setText("1");
	    main.getPm().getPf().gettBoeuf().setText("2");
	    main.getPm().getPf().gettAutreFood().setText("3");
	    ActionEvent e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "button pressed");
	    controller.actionPerformed(e);
	    boolean isValid = main.modelT.add(controller.action);
	    assertTrue(isValid);
	}

	@Test
	public void actionPerformed_fail() {
	    controller.action = ControllerButtons.SUIVANT_WM;
	    main.getPm().getPf().gettVegan().setText("rouge");
	    main.getPm().getPf().gettVegetarien().setText("1");
	    main.getPm().getPf().gettBoeuf().setText("2");
	    main.getPm().getPf().gettAutreFood().setText("3");
	    ActionEvent e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "button pressed");
	    controller.actionPerformed(e);
	    boolean isValid = main.modelT.add(controller.action);
	    assertTrue(isValid);
	}
	






		
	
}
	
	

