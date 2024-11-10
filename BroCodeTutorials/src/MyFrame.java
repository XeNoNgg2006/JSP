import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() {
		this.setSize(420, 420); // sets the x-Dimesion, and y-dimension

		this.setTitle("Calculator");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application, by Default is HIDE_ON_CLOSE

		//this.setResizable(false); // prevents this from being resized

		ImageIcon image = new ImageIcon("of.jpg"); // makes an ImageIcon
		this.setIconImage(image.getImage()); // changes Icon of the this using the ImageIcon

		// this.getContentPane().setBackground(Color.blue); //changes Color of
		// Background-> default colors
		// this.getContentPane().setBackground(new Color(125,50,250)); //changes Color
		// of Background->RGB
		this.getContentPane().setBackground(new Color(0x654321)); // changes Color of Background->HEX

		this.setVisible(true); // it will make the frame visible
	}
}
