import java.util.Scanner;
// importing scanner using for promping user for input

public class CalBasic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter the second number: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Emter an operation (+, -, *, /): ");
		char operation = scanner.next().charAt(0);
		
		double result = 0;
		
		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if(num2 != 0) {
				result = num1 / num2;
			}	else {
				System.out.println("Division by 0 is not posible");
			}
				
			break;
		default:
			System.out.println("Error: Invalid operation.");
            return; // Exit the program if an invalid operation is entered
		
		}
		
		System.out.println("The result is: " + result);
	}

}
