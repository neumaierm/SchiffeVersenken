package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class WelcomeBoard extends JFrame {
	public WelcomeBoard (){
		Container welcomePanel = getContentPane();
		welcomePanel.setLayout(null);
		
		JLabel lblWilkommenBeiSchiffe = new JLabel("Schiffe versenken");
		lblWilkommenBeiSchiffe.setBounds(6, 6, 438, 50);
		lblWilkommenBeiSchiffe.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblWilkommenBeiSchiffe.setHorizontalAlignment(SwingConstants.CENTER);
		welcomePanel.add(lblWilkommenBeiSchiffe);
		
		JButton btnNeuesSpielStarten = new JButton("Neues Spiel starten");
		btnNeuesSpielStarten.setBounds(142, 222, 165, 50);
		welcomePanel.add(btnNeuesSpielStarten);
		
		JLabel lblSpielerEins = new JLabel(" Spieler Eins");
		lblSpielerEins.setBounds(6, 79, 76, 16);
		welcomePanel.add(lblSpielerEins);
		
		JLabel lblSpielerZwei = new JLabel(" Spieler Zwei");
		lblSpielerZwei.setBounds(3, 145, 79, 16);
		welcomePanel.add(lblSpielerZwei);
		
		JTextField textField = new JTextField();
		textField.setBounds(6, 105, 438, 28);
		welcomePanel.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(6, 173, 438, 28);
		welcomePanel.add(textField_1);
		
		setVisible(true);
		setTitle("Schiffe versenken");
		setSize(450,325);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnNeuesSpielStarten.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String one = textField.getText();
				String two = textField_1.getText();
				if (one.equals("") || two.equals("")) {
					
				} else {
					new PlayBoard();
				}				
			}
		});
		
	}
}
