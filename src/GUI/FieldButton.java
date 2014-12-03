package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Created by NeumaierMoritz on 02.12.14.
 */
public class FieldButton extends JButton{

    //craete Button
    //add event Listener

    int[][] coordinates = new int[1][2];
    boolean isShot;
    private Property property;

    public enum Property {
        WATER, SHIP
    }
    
    public int getXCoordinate(){
        return this.coordinates[0][0];
    }

    public int getYCoordinate(){
        return this.coordinates[0][1];
    }

    public FieldButton(int x, int y, int size){
        super();
        this.setPreferredSize(new Dimension(size, size));
        this.setMaximumSize(new Dimension(size, size));
        this.setMinimumSize(new Dimension(size, size));
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print(getXCoordinate());
                System.out.println(", " + getYCoordinate());
            }
        });
        this.coordinates[0][0] = x;
        this.coordinates[0][1] = y;
        this.property = Property.WATER;
        isShot = false;
    }
}
