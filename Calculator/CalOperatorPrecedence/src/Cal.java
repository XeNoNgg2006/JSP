import java.util.Stack;
import java.util.Scanner;

public class Cal {

    public static double evaluate(String expression) {
        // Remove spaces
        expression = expression.replaceAll(" ", "");  // Cleanup spaces
        
        // Stack for numbers
        Stack<Double> numbers = new Stack<>();
        
        // Stack for operators
        Stack<Character> operators = new Stack<>();
        
        // Variable to store current number
        double currentNumber = 0;
        boolean numberInProgress = false;  // Track if we're building a number

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // If the character is a digit or a decimal point, build the number
            if (Character.isDigit(currentChar) || currentChar == '.') {
                if (numberInProgress) {
                    // If we're building a number, continue appending
                    currentNumber = currentNumber * 10 + (currentChar - '0');
                } else {
                    // Start a new number
                    currentNumber = currentChar - '0';
                    numberInProgress = true;
                }
            } 
            // If the character is an operator, process the previous number and operator
            else if (isOperator(currentChar)) {
                // Push the current number to the stack
                if (numberInProgress) {
                    numbers.push(currentNumber);
                    numberInProgress = false;
                    currentNumber = 0;
                }

                // Handle operator precedence before pushing the current operator
                while (!operators.isEmpty() && hasPrecedence(operators.peek(), currentChar)) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                
                // Push the current operator
                operators.push(currentChar);
            }
        }

        // Push the last number to the stack, if any
        if (numberInProgress) {
            numbers.push(currentNumber);
        }

        // Process all the remaining operators
        while (!operators.isEmpty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }

        // The result is the last number remaining in the numbers stack
        return numbers.pop();
    }

    // Helper methods...

    // Method to check if the character is an operator
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mathematical expression: ");
        String expression = scanner.nextLine();

        try {
            double result = evaluate(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

