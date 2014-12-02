package GUI;
import general.Block;
import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonField extends JPanel {
	private JButton[][] bA;
	public ButtonField() {
		this.setLayout(new GridLayout(10, 10));
		 bA = new JButton[10][10];

		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				JButton button = new JButton();
				bA[x][y] = button;
				Block block=new Block(x,y);
				button.setActionCommand(String.valueOf(x) + String.valueOf(y));

				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						callBlock(Integer.parseInt(e.getActionCommand()
								.substring(0, 1)), Integer.parseInt(e
								.getActionCommand().substring(1, 2)));

					}
				});
				this.add(button);
			}
		}
	}
	private void callBlock(int x,int y){
		click(bA[x][y],x,y);
	}
}
