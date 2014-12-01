package GUI;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.GridLayout;


public class WinnerBoard extends JFrame {
public static void main(String [] args){
	WinnerBoard winner=new WinnerBoard("dsfasdfsadfasdfasdfJ");
}
	
public WinnerBoard (String winner){
super("WinnerBoard")	;
Container con=getContentPane();
con.setLayout(new GridLayout(6,1));
JLabel label1=new JLabel("***********************************************************************");
JLabel label2=new JLabel("**********                                                                                     **********");
JLabel label3=new JLabel("**********               Congratulations                                        **********");  
JLabel label4=new JLabel("**********                You have won !                                          **********");
JLabel label5=new JLabel("**********                                                                                     **********");
JLabel label6=new JLabel("***********************************************************************");
label1.setSize(1,1);
label2.setSize(1,1);
label3.setSize(1,1);
label4.setSize(1,1);
label5.setSize(1,1);
label6.setSize(1,1);
con.add(label1);
con.add(label2);
con.add(label3);
con.add(label4);
con.add(label5);
con.add(label6);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(600,600);
setVisible(true);
}

}
