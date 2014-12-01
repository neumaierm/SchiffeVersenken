package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WelcomeBoard extends JFrame {
	public WelcomeBoard (){
		JPanel welcomeBoard = new JPanel();
		setTitle("Wilkommen");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		welcomeBoard.setLayout(new BorderLayout());
		
		JLabel welcome = new JLabel("Wilkommen bei Schiffe versenken");
		JButton startButton = new JButton("Starte Spiel");
		JTextField playerOneName = new JTextField();
		JTextField playerTwoName = new JTextField();
		JLabel playerOneNameLabel = new JLabel("Spieler Eins: ");
		JLabel playerTwoNameLabel = new JLabel("Spieler Zwei: ");
		
		Container conInputs = new Container();
		conInputs.setLayout(new GridLayout(5, 1));
		conInputs.add(playerOneNameLabel);
		conInputs.add(playerOneName);
		conInputs.add(playerTwoNameLabel);
		conInputs.add(playerTwoName);
		
		add(welcome, BorderLayout.NORTH);
		add(conInputs, BorderLayout.CENTER);
		add(startButton, BorderLayout.SOUTH);
		
		pack();
		
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String playerOneNameString = playerOneName.getText();
				String playerTwoNameString = playerTwoName.getText();
				if(playerOneNameString.equals("") || playerTwoNameString.equals("")){
					JLabel warning = new JLabel("Bitte alle Felder ausfüllen!");
					conInputs.add(warning);
				} else {
					PlayBoard playBoard = new PlayBoard();
				}
			}
		});
	}
	public static void main(String args[]) {
		new WelcomeBoard();
	}
}
