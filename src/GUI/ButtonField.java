package GUI;
import general.Block;
import general.Field;

import java.awt.GridLayout;
import java.awt.Point;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonField extends JPanel {
	private JButton[][] bA;
	private Field field;
	private HashMap<JButton, Point> buttonMap;
	//private ButtonFieldController controller;
	
	public ButtonField(Field field) {
		this.setLayout(new GridLayout(10, 10));
		this.field = field;
		HashMap<Point, Block> blocks = field.getBlocks();
		buttonMap = new HashMap();
		for(Point p : blocks.keySet()){
			JButton btn = new JButton();
			//TODO
			//btn.addActionListener(null);
			buttonMap.put(btn, p);
			this.add(btn);
		}
	}
	
	private void callBlock(int x,int y){
		//click(bA[x][y],x,y);
	}
}
