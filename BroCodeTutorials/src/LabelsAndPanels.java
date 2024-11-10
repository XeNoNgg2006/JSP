import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class LabelsAndPanels {

	public static void main(String[] args) {

		MyFrame frame = new MyFrame();
		ImageIcon Icon = new ImageIcon("1077114.png");
		frame.setSize(500,500);
		Border border = BorderFactory.createLineBorder(Color.black,4); // creates a border , and thickness and can use more cases
		
		JLabel label = new JLabel();
		label.setText("Bro"); //set text of label
		label.setIcon(Icon);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.BOTTOM); // set text BOTTOM,CENTER, TOP of imageicon
		label.setForeground(new Color(0,0,0)); // change color of font"text"
		label.setFont(new Font("MV Boli",Font.ITALIC,20)); // sets font of text, and then style and then size
		label.setIconTextGap(10);// set gap of text to imageicon
		label.setBackground(Color.yellow); 
		label.setOpaque(true); // true= has background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set the position of whole label
		label.setHorizontalAlignment(JLabel.CENTER); // set the position of whole label
		//label.setBounds(100,100,250,250); //set x,y position within frame as well as dimensions
		
		frame.add(label);
		//frame.setLayout(null);
		frame.pack(); // the frame adjuts itself to its elements
		
		
		JPanel panel = new JPanel();
		
		
		frame.setLayout(null);

	}

}
