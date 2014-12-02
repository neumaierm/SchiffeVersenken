package GUI;

import general.Field;
import general.Player;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WelcomeBoard extends JFrame {
	public WelcomeBoard (){
		Container welcomeBoard = getContentPane();
		welcomeBoard.setLayout(new BorderLayout());
		setVisible(true);
		setTitle("Schiffe versenken");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container con = new Container();
		con.setLayout(new GridLayout(4,1));
		
		JLabel lblSchiffeVersenken = new JLabel(" Schiffe versenken ");
		lblSchiffeVersenken.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblSchiffeVersenken.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel playerOneLabel = new JLabel(" Spieler Eins: ");
		JTextField playerOneName = new JTextField();
		JLabel playerTwoLabel = new JLabel(" Spieler Zwei: ");
		JTextField playerTwoName = new JTextField();
		
		JButton btnStart = new JButton("Start");
		
		
		con.add(playerOneLabel);
		con.add(playerOneName);
		con.add(playerTwoLabel);
		con.add(playerTwoName);
		
		welcomeBoard.add(btnStart, BorderLayout.SOUTH);
		welcomeBoard.add(con, BorderLayout.CENTER);
		welcomeBoard.add(lblSchiffeVersenken, BorderLayout.NORTH);
		
		pack();
		
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(playerOneName.getText().equals("") || playerTwoName.getText().equals("")){
					
				} else {
					Field fieldOne = new Field();
					Field fieldTwo = new Field();
					Player playerOne = new Player(fieldOne, fieldTwo, playerOneName.getText());
					Player playerTwo = new Player(fieldTwo, fieldOne, playerTwoName.getText());
					fieldOne.setOwner(playerOne);
					fieldTwo.setOwner(playerTwo);
					PlayBoard playBoard = new PlayBoard(fieldOne, fieldTwo, playerOne, playerTwo);
					
				}
				
			}
		});	
	}
}
