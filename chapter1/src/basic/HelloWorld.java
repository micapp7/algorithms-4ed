package basic; // This must be declared to run the class from outside the package location.

import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdIn;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("StdIn worked! Enter something");
		String input = StdIn.readLine();
		
		System.out.println("You have entered: " + input);
		
	
	}
}