package GUI;
import graphical.ButtonFieldController;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonField extends JPanel {
	
	private HashMap<JButton, Point> buttonMap;
	private ButtonFieldController controller;
	JPanel fieldB;
	private final int rowSize = 10;
	
	public ButtonField() {
		/*
		 * Create Button Field as a JPanel
		 * FieldButton(x-Coordinate, y-Coordinate, size)
		 */
		super();
		this.setLayout(new GridLayout(10,10));
		for (int x = 1; x <= rowSize; x++) {
        	for (int y = 1; y <= rowSize; y++) {
        		this.add(new FieldButton(x,y,30));
			}
        }
        this.setMaximumSize(new Dimension(300,300));
        this.setPreferredSize(new Dimension(300,300));
		
		//TODO: ADD THE HASHMAP FUNCTION
		///this.controller = new ButtonFieldController(this, field);
		//HashMap<Point, Block> blocks = field.getBlocks();
		//buttonMap = new HashMap();
		//for(Point p : blocks.keySet()){
			//FieldButton fieldButton = new FieldButton();
			//TODO
			//fieldButton.addActionListener(controller);
			//TODO
			//buttonMap.put(fieldButton.getButton(), p);
			//this.add(fieldButton);
		//}
        
	}
	
	public HashMap<JButton, Point> getButtonMap(){
		return buttonMap;
	}
}
