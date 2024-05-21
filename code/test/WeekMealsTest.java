
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.ModelFood;

public class WeekMealsTest {
	
	private static ModelFood w;
	public static double e = 0.00000001;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		w = new ModelFood();
	}

	@Before
	public void setUp() throws Exception {
		w.init();
	}

	
	@Test
	public void testAddMeals() {
		w.init();
		w.addMeals(ModelFood.Meal.VEGETARIEN,5);
		assertEquals(5,w.getNbVegetarien());
		w.init();
		w.addMeals(ModelFood.Meal.VEGETARIEN,-3);
		assertEquals(0,w.getNbVegetarien());
			
	}
	
	@Test
	public void testINIT() {
		w.init();
		assertEquals(0,w.getNbBoeuf());
		assertEquals(0,w.getNbAutreViandePoisson());
		assertEquals(0,w.getNbVegan());
		assertEquals(0,w.getNbVegetarien());
	}
	
	@Test
	public void testComputeCO2() {
		w.addMeals(ModelFood.Meal.VEGAN,5);
		w.addMeals(ModelFood.Meal.BOEUF,7);
		double maVar = w.computeCO2();
		assertEquals(51, maVar,e);
		w.init();
		assertEquals(0,w.computeCO2(),e);
		
	}

}
