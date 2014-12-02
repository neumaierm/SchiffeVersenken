package graphical;

import general.Field;
import general.Player;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;

import GUI.ButtonField;

public class ButtonFieldController implements ActionListener {
	private ButtonField buttonField;
	private Player fieldOwner;
	private Field field;
	private HashMap<JButton, Point> buttonMap;
	
	public ButtonFieldController(ButtonField buttonField, Field field) {
		this.buttonField = buttonField;
		this.fieldOwner = field.getOwner();
		this.field = field;
		buttonMap = buttonField.getButtonMap();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton){
			JButton button = (JButton) e.getSource();
			this.act(button);
		}
				
	}
	
	private void act(JButton button){
		Point p = buttonMap.get(button);
		//TODO Spielsituation!! angenommen: setzen == true
		if(true){
			if(fieldOwner.isActive()){
				fieldOwner.setShip(field.getBlock(point));
			}
		}
		else{
			if(!fieldOwner.isActive()){
				field.getShot(p);
			}
		}
		
	}
	
	private void changeButtonColor(JButton button, Color color){
		button.setForeground(color);
		
	}
	

}
