import java.util.Scanner;

public class FindHypotenuse {

	public static void main(String[] args) {
		
		double x;
		double y;
		double Hypotenuse;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Give side y: ");
		y = scanner.nextDouble();
		
		Hypotenuse = Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2)); // math.sqrt takes the square root of the number
		//Hypotenuse = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The Hypotenuse is: " + Hypotenuse);
		
		
		scanner.close();
	}

}
