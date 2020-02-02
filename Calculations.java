
public class Calculations {

	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		
		//sum of x and y 
		int sum = x+y;
		System.out.println("The sum is= "+ sum);
		
		//member_B add the feature of subtracting x from y and print the result
		
		//member_C add the feature of dividing x by y and print the result
		System.out.println("The division is = " + divide(x,y));
		
		//member_D add the feature of multiplying x by y and print the result
				
		multiply(x,y);

		System.out.println("The product is = " + multiply(x,y));
		
		
		//Exercise 5: Spot the issues to be reported
		addition(4,5); // should print the sum of the values provided
		subtraction(x,y);
		System.out.println("The difference is = " + subtraction(x,y));
		welcome(); // should print the welcome message to the console
	}
	
	public static int addition(int w, int z) {
		int sum = w + z;
		return sum; 
	}
	
	
	// Member B _ Tasneem 
	public static int subtraction(int w, int z) {
		int sum = w - z;
		return sum; 
	}
	
<<<<<<< HEAD
		public static int multiply(int w, int z) {
		int sum = w * z;
		return sum; 
	}
=======
	
			public static int divide(int w, int z) {
		int d = w/z;
		return d; 
	}
	
	
	
	
>>>>>>> 4995c9ba65ef7326375b68f79c008982e43d3b32
	public static String welcome() {
		return "Hello World"; 
	}

}
