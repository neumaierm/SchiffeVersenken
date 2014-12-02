package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FieldButton extends JPanel{
	private JButton button;
	public FieldButton(){
		super();
		this.setPreferredSize(new Dimension(20,20));
		this.setLayout(new BorderLayout());
		this.button = new JButton();
		this.add(button, BorderLayout.CENTER);
	}
	
	public void addActionListener(ActionListener a){
		this.button.addActionListener(a);
	}
	
	public JButton getButton(){
		return button;
	}
}
