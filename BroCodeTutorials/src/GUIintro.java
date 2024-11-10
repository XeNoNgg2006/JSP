import javax.swing.JOptionPane;

public class GUIintro {

	public static void main(String[] args) {


		String name = JOptionPane.showInputDialog("Enter your name!"); // Prompts User Dialog  Box
		JOptionPane.showMessageDialog(null, "Hello "+ name); // sends you back a box with Hello and your name
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+ age +" years old!");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height!"));
		JOptionPane.showMessageDialog(null, "Your are "+ height + " cm tall!");
		
	}

}