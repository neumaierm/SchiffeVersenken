package GUI;
import general.Block;
import general.Field;
import graphical.ButtonFieldController;

import java.awt.GridLayout;
import java.awt.Point;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonField extends JPanel {
	private Field field;
	private HashMap<JButton, Point> buttonMap;
	private ButtonFieldController controller;
	
	public ButtonField(Field field) {
		this.setLayout(new GridLayout(10, 10));
		this.field = field;
		this.controller = new ButtonFieldController(this, field);
		HashMap<Point, Block> blocks = field.getBlocks();
		buttonMap = new HashMap();
		for(Point p : blocks.keySet()){
			FieldButton fieldButton = new FieldButton();
			//TODO
			fieldButton.addActionListener(controller);
			buttonMap.put(fieldButton.getButton(), p);
			this.add(fieldButton);
		}
	}
	
	private void callBlock(int x,int y){
		//click(bA[x][y],x,y);
	}
	
	public HashMap<JButton, Point> getButtonMap(){
		return buttonMap;
	}
}
