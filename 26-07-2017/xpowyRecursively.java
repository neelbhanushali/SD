package sd5;

import java.util.Scanner;

public class xpowyRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iv = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = iv.nextInt();
		System.out.print("Enter power: ");
		int b = iv.nextInt();
		System.out.print(a + "^" + b + ": " + xpowy(a, b));
	}
	
	public static int xpowy(int a, int b) {
		if (b > 1)
	        return a * xpowy(a, b - 1);
	    else
	        return a;
	}

}
