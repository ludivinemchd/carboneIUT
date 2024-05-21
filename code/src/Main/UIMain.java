package Main;
import javax.swing.JFrame;

import Model.Data;
import Model.Model;
import Model.ModelTransport;
import Model.ModelFood;
import View.PanelMain;

public class UIMain {
	PanelMain pm;
	public Data data;
	public ModelFood wm;
	public Model model;
	public ModelTransport modelT;
	public void changePanel()
	{
		pm.changePanel();
	}
	public static void main(String[] args) {
		//BulkCard frame = new BulkCard();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 100);
		frame.setLocationRelativeTo(null);  // Start the window in the middle of the screen
		frame.setVisible(true);
		new UIMain(frame);
	}
	public UIMain(JFrame frame)
	{
		pm =  new PanelMain(frame, this);
		data = new Data();
		wm = new ModelFood();
		model = new Model(this);
		modelT = new ModelTransport(this);
	}
	public Data getData() {
		return data;
	}
	
	
	public PanelMain getPm() {
		return pm;
	}
	public void updateMessage(String message)
	{
		this.pm.pt.updateMessage(message);
	}
}
