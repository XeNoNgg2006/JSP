import java.util.ArrayList;

public class forEachLoop {

	public static void main(String[] args) {
		
		// for-each = tranversing technique to iterate through the elements in an array/collection 
		//		      less steps, more readable
		//		  	  less flexible
		
		//String[] animals = {"cat","dog","rat","bird"};
		
		ArrayList<String> animals = new ArrayList();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
	}

}

//https://www.youtube.com/watch?v=xk4_1vDrzzo&t=8257s