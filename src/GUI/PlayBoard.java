package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayBoard extends JFrame{
	public PlayBoard (){
		JPanel welcomeBoard = new JPanel();
		setTitle("hi");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		welcomeBoard.setLayout(new BorderLayout());
		
		JLabel welcome = new JLabel("lol");
		JLabel welcomeText = new JLabel("Erstellt von:");
		JButton startButton = new JButton("un Spiel");
		JButton impressum = new JButton("Impressum");
		
		add(welcome, BorderLayout.NORTH);
		add(welcomeText, BorderLayout.CENTER);
		add(startButton, BorderLayout.SOUTH);
		
		pack();
	}
}
