package GUI;

import java.awt.Dimension;

import javax.swing.JButton;

public class buttonQuadrat extends JButton{
	
	int number;
	
	public buttonQuadrat(int number){
		new JButton();
		this.number = number;
		setPreferredSize(new Dimension(30,30));
		setSize(30,30);
		setMaximumSize(new Dimension(30,30));
		setMinimumSize(new Dimension(30,30));
	}
}
