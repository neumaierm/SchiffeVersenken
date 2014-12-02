package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FieldButton extends JPanel{
	public FieldButton(){
		super();
		this.setPreferredSize(new Dimension(20,20));
		this.setLayout(new BorderLayout());
		this.add(new JButton(), BorderLayout.CENTER);
	}
}
