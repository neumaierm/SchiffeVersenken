package GUI;

import general.Field;
import general.Player;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PlayBoard extends JFrame{
	static Field fieldOne = new Field();
	static Field fieldTwo = new Field();
	static Player playerOne = new Player(fieldOne, fieldTwo, "neumaierm");
	static Player playerTwo = new Player(fieldTwo, fieldOne, "joekoe");
	
	public PlayBoard (Field fieldOne, Field fieldTwo, Player playerOne, Player playerTwo){
		Container playBoard = getContentPane();
		setVisible(true);
		setTitle("Schiffe versenken");
		setSize(500,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setMinimumSize(playBoard.getSize());
		playBoard.setLayout(new GridLayout(0,1));
		
		JPanel playerOneContainer = new JPanel();
		TitledBorder titleOne = BorderFactory.createTitledBorder(playerOne.getName());
		playerOneContainer.setBorder(titleOne);
		//TODO ADD FIELD
		
		JPanel playerTwoContainer = new JPanel();
		TitledBorder titleTwo = BorderFactory.createTitledBorder(playerTwo.getName());
		playerTwoContainer.setBorder(titleTwo);
		//TODO ADD FIELD
		
		JPanel playerShips = new JPanel();
		playerShips.setLayout(new GridLayout(0,1));
		TitledBorder titleShips = BorderFactory.createTitledBorder("Schiffe");
		playerShips.setBorder(titleShips);
		
		Container shipOne = new Container();
		shipOne.setLayout(new FlowLayout(FlowLayout.LEFT));
		for (int i = 0; i < 5; i++) {
			shipOne.add(new JButton());
		}
		playerShips.add(shipOne);
		
		
		add(playerOneContainer);
		add(playerTwoContainer);
		add(playerShips);
		
	}
	public static void main(String args[]){
		new PlayBoard(fieldOne, fieldTwo, playerOne, playerTwo);
	}
}
