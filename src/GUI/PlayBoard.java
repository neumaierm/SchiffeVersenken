package GUI;

import general.Field;
import general.Player;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/**
 * Created by NeumaierMoritz on 02.12.14.
 */
public class PlayBoard extends JFrame{

	public PlayBoard(Player playerOne, Player playerTwo, Field fieldOne, Field fieldTwo){
		Container playBoard = getContentPane();
		playBoard.setLayout(new GridLayout(2,2));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Schiffe versenken");

		//PlayerOneField
		JPanel playerOneField = new JPanel();
		TitledBorder titleOne = BorderFactory.createTitledBorder(playerOne.getName());
		playerOneField.setBorder(titleOne);
		playerOneField.setPreferredSize(new Dimension(330,340));
		playerOneField.add(fieldOne.getField());
		playBoard.add(playerOneField);

		// create Ship overview 
		JPanel shipOverview = new JPanel();
		TitledBorder titleShips = BorderFactory.createTitledBorder("Schiffe");
		titleShips.setTitleJustification(TitledBorder.RIGHT);
		shipOverview.setBorder(titleShips);
		shipOverview.setLayout(new GridLayout(5,1));

		//Panel for battleship
		JPanel battleship = new JPanel();
		TitledBorder titleBattleship = BorderFactory.createTitledBorder("Schlachtschiff");
		titleBattleship.setTitleJustification(TitledBorder.LEFT);
		battleship.setBorder(titleBattleship);
		battleship.setLayout(new GridBagLayout());
		for (int i = 0; i < 5; i++) {
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = i;
			gbc.gridy = 0;
			battleship.add(new FieldButton(0,i,20), gbc);
		}
		shipOverview.add(battleship);

		//Panel for Cruiser
		JPanel cruiser = new JPanel();
		TitledBorder titleCruiser = BorderFactory.createTitledBorder("Kreuzer");
		titleCruiser.setTitleJustification(TitledBorder.LEFT);
		cruiser.setBorder(titleCruiser);
		cruiser.setLayout(new GridBagLayout());
		for (int i = 0; i < 4; i++) {
			GridBagConstraints gbcc1 = new GridBagConstraints();
			gbcc1.gridx = i;
			gbcc1.gridy = 0;
			cruiser.add(new FieldButton(0,i,20), gbcc1);
		}
		GridBagConstraints gbcc0 = new GridBagConstraints();
		gbcc0.gridx = 5;
		gbcc0.gridy = 0;
		cruiser.add(new JLabel("   "), gbcc0);
		for (int i = 6; i < 10; i++) {
			GridBagConstraints gbcc2 = new GridBagConstraints();
			gbcc2.gridx = i;
			gbcc2.gridy = 0;
			cruiser.add(new FieldButton(0,i,20), gbcc2);
		}        
		shipOverview.add(cruiser);

		//Panel for Destroyer
		JPanel destroyer = new JPanel();
		TitledBorder titleDestroyer = BorderFactory.createTitledBorder("Zerstörer");
		titleDestroyer.setTitleJustification(TitledBorder.LEFT);
		destroyer.setBorder(titleDestroyer);
		destroyer.setLayout(new GridBagLayout());
		for (int i = 0; i < 3; i++) {
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = i;
			gbc.gridy = 0;
			destroyer.add(new FieldButton(0,i,20), gbc);
		}
		GridBagConstraints gbcd0 = new GridBagConstraints();
		gbcd0.gridx = 4;
		gbcd0.gridy = 0;
		destroyer.add(new JLabel("   "), gbcd0);
		for (int i = 5; i < 8; i++) {
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = i;
			gbc.gridy = 0;
			destroyer.add(new FieldButton(0,i,20), gbc);
		}
		GridBagConstraints gbcd1 = new GridBagConstraints();
		gbcd1.gridx = 9;
		gbcd1.gridy = 0;
		destroyer.add(new JLabel("   "), gbcd1);
		for (int i = 10; i < 13; i++) {
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridx = i;
			gbc.gridy = 0;
			destroyer.add(new FieldButton(0,i,20), gbc);
		}
		shipOverview.add(destroyer);

		//Panel for Submarine
		JPanel submarine = new JPanel();
		TitledBorder titleSub = BorderFactory.createTitledBorder("U-Boote");
		titleSub.setTitleJustification(TitledBorder.LEFT);
		submarine.setBorder(titleSub);
		submarine.setLayout(new GridBagLayout());
		for (int i = 0; i < 2; i++) {
			GridBagConstraints gbcs = new GridBagConstraints();
			gbcs.gridx = i;
			gbcs.gridy = 0;
			submarine.add(new FieldButton(0,i,20), gbcs);
		}
		GridBagConstraints gbcd2 = new GridBagConstraints();
		gbcd2.gridx = 3;
		gbcd2.gridy = 0;
		submarine.add(new JLabel("   "), gbcd2);
		for (int i = 4; i < 6; i++) {
			GridBagConstraints gbcs = new GridBagConstraints();
			gbcs.gridx = i;
			gbcs.gridy = 0;
			submarine.add(new FieldButton(0,i,20), gbcs);
		}
		GridBagConstraints gbcd3 = new GridBagConstraints();
		gbcd3.gridx = 7;
		gbcd3.gridy = 0;
		submarine.add(new JLabel("   "), gbcd3);
		for (int i = 8; i < 10; i++) {
			GridBagConstraints gbcs = new GridBagConstraints();
			gbcs.gridx = i;
			gbcs.gridy = 0;
			submarine.add(new FieldButton(0,i,20), gbcs);
		}
		GridBagConstraints gbcd4 = new GridBagConstraints();
		gbcd4.gridx = 11;
		gbcd4.gridy = 0;
		submarine.add(new JLabel("   "), gbcd4);
		for (int i = 12; i < 14; i++) {
			GridBagConstraints gbcs = new GridBagConstraints();
			gbcs.gridx = i;
			gbcs.gridy = 0;
			submarine.add(new FieldButton(0,i,20), gbcs);
		}
		shipOverview.add(submarine);

		//Panel Radio Buttons
		JPanel panelRadioButton = new JPanel();
		TitledBorder titleRadio = BorderFactory.createTitledBorder("Orientrierung");
		panelRadioButton.setBorder(titleRadio);
		panelRadioButton.setLayout(new GridLayout(1,2));

		ButtonGroup orientButGroup = new ButtonGroup();

		JRadioButton orientationChooserHor = new JRadioButton("Horizontal");
		orientationChooserHor.setSelected(true);
		JRadioButton orientationChooserVer = new JRadioButton("Vertikal");

		orientButGroup.add(orientationChooserHor);
		orientButGroup.add(orientationChooserVer);

		orientationChooserHor.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent ev) {
				if (ev.getStateChange()==ItemEvent.SELECTED) {
					//TODO ORIENTATION CHANGEN
				}

			}
		});
		orientationChooserVer.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent ev) {
				if (ev.getStateChange()==ItemEvent.SELECTED) {
					//TODO ORIENTATION CHANGEN
				}

			}
		});
		
		panelRadioButton.add(orientationChooserHor);
		panelRadioButton.add(orientationChooserVer);
		shipOverview.add(panelRadioButton);		
		playBoard.add(shipOverview);

		//PlayerTwoField
		JPanel playerTwoField = new JPanel();
		TitledBorder titleTwo = BorderFactory.createTitledBorder(playerTwo.getName());
		playerTwoField.setBorder(titleTwo);
		playerTwoField.setPreferredSize(new Dimension(330,340));
		playerTwoField.add(fieldTwo.getField());
		playBoard.add(playerTwoField);

		//create Button area
		JPanel btnArea = new JPanel();
		TitledBorder titleButtons = BorderFactory.createTitledBorder("Menü");
		titleButtons.setTitleJustification(TitledBorder.RIGHT);
		btnArea.setBorder(titleButtons);
		btnArea.setLayout(new GridLayout(3,1));
		JButton btnReady = new JButton("Bereit");
		JButton btnPause = new JButton("Pause");
		JButton btnExit = new JButton("Exit");
		btnArea.add(btnReady);
		btnArea.add(btnPause);
		btnArea.add(btnExit);
		playBoard.add(btnArea);

		pack();
		setMinimumSize(playBoard.getSize());
		setResizable(false);
	}
	/*
    public static void main(String args[]){
    	Field fieldOne = new Field();
    	Field fieldTwo = new Field();
    	Player playerOne = new Player(fieldOne, fieldTwo, "nuemaie");
    	Player playerTwo = new Player(fieldTwo, fieldOne,"kjsbdlf");
    	new PlayBoard(playerOne, playerTwo, fieldOne, fieldTwo);
    }
    */
}
