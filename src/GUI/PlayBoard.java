package GUI;

import general.Field;
import general.Player;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayBoard extends JFrame{
	static Field fieldOne = new Field();
	static Field fieldTwo = new Field();
	static Player playerOne = new Player(fieldOne, fieldTwo, "neumaierm");
	static Player playerTwo = new Player(fieldTwo, fieldOne, "joekoe");
	
	public PlayBoard (Field fieldOne, Field fieldTwo, Player playerOne, Player playerTwo){
		Container playBoard = getContentPane();
		playBoard.setLayout(new GridLayout(3, 1));
		setVisible(true);
		setTitle("Schiffe versenken");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container topContainer = new Container();
		topContainer.setLayout(new BorderLayout());
		JLabel playerOneName = new JLabel(playerOne.getName());
		topContainer.add(playerOneName, BorderLayout.SOUTH);
		topContainer.add(fieldOne, BorderLayout.CENTER);
		
		Container bottomContainer = new Container();
		bottomContainer.setLayout(new BorderLayout());
		JLabel playerTwoName = new JLabel(playerTwo.getName());
		bottomContainer.add(playerTwoName, BorderLayout.SOUTH);	
		bottomContainer.add(fieldTwo, BorderLayout.CENTER);	
		
		Container shipsContainer = new Container();
		shipsContainer.setLayout(new BorderLayout());
		
		playBoard.add(topContainer);
		playBoard.add(bottomContainer);
		playBoard.add(shipsContainer);
		
		pack();
	}
	public static void main(String args[]){
		new PlayBoard(fieldOne, fieldTwo, playerOne, playerTwo);
	}
}
