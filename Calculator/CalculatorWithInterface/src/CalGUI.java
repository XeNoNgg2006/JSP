import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalGUI extends JFrame {
	
	 
	 private JButtonCalculator one;
	 private JButtonCalculator two;
	 private JButtonCalculator three;
	 private JButtonCalculator four;
	 private JButtonCalculator five;
	 private JButtonCalculator six;
	 private JButtonCalculator seven;
	 private JButtonCalculator eight;
	 private JButtonCalculator nine;
	 private JButtonCalculator zero;
	 private JButtonCalculator equal;
	 private JButtonCalculator clearCal;
	 private JButtonCalculator dot;
	 private JButtonCalculator delete;
	 private JButtonCalculator random1;
	 private JButtonCalculator random2;
	 private JButtonCalculator plusSign;
	 private JButtonCalculator minusSign;
	 private JButtonCalculator multiplicationSign;
	 private JButtonCalculator dividerSign;
	 private JLabel displayLabel;
	 private String whatIsClicked = "0";
	 private StringBuilder equation = new StringBuilder();
	 
	 public CalGUI() {

		this.setSize(400, 500); // sets the x-Dimesion, and y-dimension

		this.setTitle("Calculator");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application, by Default is HIDE_ON_CLOSE

		//this.setResizable(false); // prevents this from being resized

		ImageIcon image = new ImageIcon("of.jpg"); // makes an ImageIcon
		this.setIconImage(image.getImage()); // changes Icon of the this using the ImageIcon

		// this.getContentPane().setBackground(Color.blue); //changes Color of
		// Background-> default colors
		// this.getContentPane().setBackground(new Color(125,50,250)); //changes Color
		// of Background->RGB
		this.getContentPane().setBackground(new Color(74,50,114)); // changes Color of Background->HEX

		
		JPanel calcPanel = new JPanel();
		calcPanel.setBackground(Color.blue);
		calcPanel.setLayout(new GridLayout(5, 4,2,2));
		
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(new Color(22,55,54));
		displayPanel.setLayout(new BorderLayout());
		
		displayLabel = new JLabel();
		displayLabel.setForeground(new Color(234,224,214));
		displayLabel.setFont(new Font("Aharoni",Font.ITALIC,50));
		displayLabel.setHorizontalAlignment(JLabel.RIGHT);
		displayLabel.setText(whatIsClicked);
		
		displayPanel.add(displayLabel, BorderLayout.CENTER);
	
		
		one = new JButtonCalculator();
		one.setText("1");
		
		two = new JButtonCalculator();
		two.setText("2");
		
		three = new JButtonCalculator();
		three.setText("3");
		
		four = new JButtonCalculator();
		four.setText("4");
		
		five = new JButtonCalculator();
		five.setText("5");
		
		six = new JButtonCalculator();
		six.setText("6");
		
		seven = new JButtonCalculator();
		seven.setText("7");
		
		eight = new JButtonCalculator();
		eight.setText("8");
		
		nine = new JButtonCalculator();
		nine.setText("9");
		
		clearCal = new JButtonCalculator();
		clearCal.setText("C");
		clearCal.setBackground(Color.red);
		
		zero = new JButtonCalculator();
		
		zero.setText("0");
		
		dot = new JButtonCalculator();
		dot.setText(".");
		
		equal = new JButtonCalculator();
		equal.setText("=");
		equal.setBackground(Color.green);
		
		plusSign = new JButtonCalculator();
		plusSign.setText("+");
		
		minusSign = new JButtonCalculator();
		minusSign.setText("-");
		
		multiplicationSign = new JButtonCalculator();
		multiplicationSign.setText("×");
		
		dividerSign = new JButtonCalculator();
		dividerSign.setText("÷");
		
		delete = new JButtonCalculator();
		delete.setText("<---");
		random1 = new JButtonCalculator();
		
		random1.setText("random1");
		
		random2 = new JButtonCalculator();
		random2.setText("random2");
		
		isClicked(one,two,three,four,five,six,seven,eight,nine,zero,random1,random2,delete,dividerSign,multiplicationSign,minusSign,plusSign,clearCal,dot,equal);
		
		calcPanel.add(random1);
		calcPanel.add(random2);
		calcPanel.add(delete);
		calcPanel.add(dividerSign);
		
		calcPanel.add(seven);
		calcPanel.add(eight);
		calcPanel.add(nine);
		calcPanel.add(multiplicationSign);
		
		calcPanel.add(four);
		calcPanel.add(five);
		calcPanel.add(six);
		calcPanel.add(minusSign);
		
		calcPanel.add(one);
		calcPanel.add(two);
		calcPanel.add(three);
		calcPanel.add(plusSign);
		
		calcPanel.add(clearCal);
		calcPanel.add(zero);
		calcPanel.add(dot);
		calcPanel.add(equal);
		
	
		this.setLayout(new BorderLayout());
		this.add(calcPanel, BorderLayout.CENTER);
		this.add(displayPanel, BorderLayout.NORTH);
		
		
		
		
		
		this.setVisible(true);
		
	}
	
	 void isClicked(JButton... buttons) {
		 
			
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton button : buttons) {
					
                   if (e.getSource() == button) {
                   	 System.out.println("first " + button.getText());
                   	 whatIsClicked = button.getText();
                   	 System.out.println("second " + whatIsClicked);
                   	 boolean isPlusForZero = false;
                   	 boolean isMinusForZero = false;
                   	 boolean isMultiplicationForZero = false;
                   	 boolean isDivisionForZero = false;
                   	 boolean isOpForZero = false;
                   	 
                   	 int eqLength = equation.length();
                   	if (eqLength > 1) {
                 		 isPlusForZero = equation.substring((equation.length() - 2),equation.length()-1).equals("+");
                 		 isMinusForZero = equation.substring((equation.length() - 2),equation.length()-1).equals("-");
                 		 isMultiplicationForZero = equation.substring((equation.length() - 2),equation.length()-1).equals("×");
                 		 isDivisionForZero = equation.substring((equation.length() - 2),equation.length()-1).equals("÷");
                 	 }
                   	
                   	if (isPlusForZero || isMinusForZero|| isMultiplicationForZero||isDivisionForZero) {
                   		isOpForZero = true;
                   	}
                   	 
                   	
                   	 switch(whatIsClicked) {
                   	 
                   	 case "1","2","3","4","5","6","7","8","9": // case for clicking a number between 1 and 9
                   		
                   		            	 
                      		  if(eqLength > 1 && equation.substring(eqLength-1).equals("0") && isOpForZero ){
                      			 equation.delete(eqLength-1, eqLength);
                      			equation.append(whatIsClicked);
                      		 } else if (equation.substring(0).equals("0")) {
                             		 System.out.println("its zero");
                             		 equation.setLength(0);
                             		equation.append(whatIsClicked);
                      		 }
                      		  else {
                      			equation.append(whatIsClicked);
                      		 }
                   		 
                   		 System.out.println("third " + equation);
                   		 break;
                   	 case "+","×","÷","-":
                   		
                   	 	if (equation.length()== 0) {// if the first input is an operator it should set the equation to "0"
                   	 		
                   	 	equation.append("0"); 
                   	 	} 
                   	 	String lastCharOp = equation.substring(equation.length() - 1);
                   	 	 if(lastCharOp.equals("+")|| lastCharOp.equals("-")|| lastCharOp.equals("×")|| lastCharOp.equals("÷")) {
                   		
                   			equation.replace(equation.length()-1, equation.length(), whatIsClicked);
                   		} else {
               				equation.append(whatIsClicked);
               				System.out.println("five" + equation.substring(equation.length()-1));
               			}
                   		break;
                   		
                   	 case "0": // create a if for when start of equation is zero ( clicks zero and then clicks other number and should change)
                   		 	if (eqLength == 0 ||(eqLength == 1 && equation.substring(eqLength - 1).equals("0")) || (equation.substring(eqLength - 1).equals("0")) && isOpForZero) {
                   		 		break;
                   		 	} else {
                   			equation.append(whatIsClicked);            			
                   		 }
                   		 
                   		 break;
                   	 case "C":  // case for clearing everything
                   		 equation.delete(0, equation.length());
                   		 equation.append("0");
                   		 
                   		 break;
                   	
                   	 case "<---":  // case for delete a former input
                   		
                   		 if(equation.length() > 1) {
                   			equation.delete(equation.length()-1, equation.length());
                   			
                   		 } else if(equation.length() == 1) {
                   			equation.replace(0, 1, "0");
                   		 }
                   		 
                   		 
                   		 break;
                   	 
                   	 case "=": // case for equal sign
                   		 String eqString = equation.toString();
                   		 System.out.println("toString "+eqString);
                   		 
                   		Stack<Double> numbers = new Stack<>();
                        
                        // Stack for operators
                        Stack<Character> operators = new Stack<>();
                        double currentNumber = 0;
                        boolean numberInProgress = false;
                        double decimalMultiplier = 1; // To handle decimal numbers
                        boolean isDecimal = false; // Flag to check if we are processing a decimal

                        for (int i = 0; i < eqString.length(); i++) {
                            char currentChar = eqString.charAt(i);

                            if (Character.isDigit(currentChar)) {
                                // Building the current number
                                if (isDecimal) {
                                    // If we're in decimal mode, adjust currentNumber accordingly
                                    currentNumber += (currentChar - '0') / (decimalMultiplier *= 10);
                                } else {
                                    // Regular digit handling
                                    currentNumber = currentNumber * 10 + (currentChar - '0');
                                }
                                numberInProgress = true;
                            } else if (currentChar == '.') {
                                // Handling decimal point
                                isDecimal = true; // Set the flag for decimal processing
                            } else if (isOperator(currentChar)) {
                                if (numberInProgress) {
                                    // If a number was being built, push it to the stack
                                    numbers.push(currentNumber);
                                    numberInProgress = false; // Reset for the next number
                                    currentNumber = 0; // Reset current number for the next one
                                    decimalMultiplier = 1; // Reset decimal multiplier
                                    isDecimal = false; // Reset decimal flag
                                } while (!operators.isEmpty() && hasPrecedence(operators.peek(), currentChar)) {
                                    double b = numbers.pop();
                                    double a = numbers.pop();
                                    char op = operators.pop();
                                    numbers.push(applyOperation(op, a, b));
                                }
                                // Push the current operator
                                operators.push(currentChar);
                            }
                        }

                        // If we finished processing and there's a number in progress, push it
                        if (numberInProgress) {
                            numbers.push(currentNumber);
                        }

                        // Process all remaining operators
                        while (!operators.isEmpty()) {
                            double b = numbers.pop();
                            double a = numbers.pop();
                            char op = operators.pop();
                            numbers.push(applyOperation(op, a, b));
                        }

                        // The result is the last number remaining in the numbers stack
                       
                        double result = numbers.pop();
                        System.out.println("result1 "+ result);
                        String resultAsString = Double.toString(result);
                        
                        equation.setLength(0);
                   	 	equation.append(resultAsString);
                   	 	System.out.println("result2 "+resultAsString);
                      
                        break;
                   
                   	 case ".":  //case for clicking dot
                   		 
                   		 if (eqLength == 0 || (equation.substring(eqLength-1).equals("+")|| equation.substring(eqLength-1).equals("-")|| equation.substring(eqLength-1).equals("×")|| equation.substring(eqLength-1).equals("÷"))) {
                   			equation.append("0");
                   			equation.append(".");
                   		 } else if (eqLength == 1) {
                   			equation.append(".");
                   		 } else { // problem was the substring method need a start and an end
                   			boolean breakCaseDot = true;
                   			 for (int i = eqLength- 1; i >= 0; i--) {
                   				  
                   				 
                   				 if (equation.substring(i, i + 1).equals("+") || equation.substring(i, i + 1).equals("-") || equation.substring(i, i + 1).equals("÷") || equation.substring(i, i + 1).equals("×")) {
                   					 breakCaseDot = false;
                   					 equation.append(".");
                   					 break;
                   				 } else if(equation.substring(i, i + 1).equals(".")) {
                   					 breakCaseDot = false;
                   					 break;
                   				 }
                   				
                   			 } 
                   			 if (breakCaseDot) {
                   				equation.append(".");
                   			 }
                   			
                   		 }
                   		 
                   		 
                   		 break;
                   	 
                   	 /*case "random1","random2": // no case yet
                   		 break;
                   	 */
                   	 }
                   	 
                   	 
                   	 
                   	 displayLabel.setText(equation.toString());
                   	
                   }
				}
			}
		};
		
		for (JButton button : buttons) {
           button.addActionListener(listener);
       }
		
		
		
	 	}
	//Helper Methods Case: "="
   	 private static boolean isOperator(char c) {
    	return c == '+' || c == '-' || c == '*' || c == '/';
   	 }
  // Method to check precedence of operators
     private static boolean hasPrecedence(char op1, char op2) {
         if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
             return true;  // '*' and '/' have higher precedence over '+' and '-'
         }
         return false;
     }

     // Method to apply an operation between two numbers
     private static double applyOperation(char operator, double b, double a) {
         switch (operator) {
             case '+':
                 return a + b;
             case '-':
                 return a - b;
             case '*':
                 return a * b;
             case '/':
                 if (b == 0) {
                     throw new UnsupportedOperationException("Cannot divide by zero");
                 }
                 return a / b;
             default:
                 return 0;
         }
     }
	
	}
	

