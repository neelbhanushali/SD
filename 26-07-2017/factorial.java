package sd5;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner iv = new Scanner(System.in);
		System.out.print("Enter number: ");
		int i = iv.nextInt();
		System.out.print("Factorial("+i+"): " + factorial(i));
	}
	
	public static int factorial(int a) {if (a >= 1)
	        return a * factorial(a-1);
	    else
	        return 1;
	}

}
