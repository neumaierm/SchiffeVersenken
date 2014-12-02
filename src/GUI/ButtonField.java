package GUI;




import general.Field;

import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonField extends JPanel {

	public ButtonField(final Field field) {
		this.setLayout(new GridLayout(10, 10));
		for ( int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				JButton button = new JButton();
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
                     field.getBlock(x,y).click();
					}
				});
				this.add(button);
			}
		}
	}
}
