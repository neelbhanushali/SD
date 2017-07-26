package sd5;

import java.util.Scanner;

public class gcdlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iv = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int a = iv.nextInt();
		System.out.print("Enter number 2: ");
		int b = iv.nextInt();
		
		// Source: https://youtu.be/nMK0I6cTFkk		
		System.out.println("GCD("+a+","+b+"): " + GCD(a, b));
		System.out.print("LCM("+a+","+b+"): " + LCM(a, b));
	}
	
	public static int GCD(int a, int b) {
		int gcd = 0;
		int n1 = a, n2 = b, tmp;
		
		if(n1 < n2) {
			tmp = n1;
			n1 = n2;
			n2 = tmp;
		}

		while(n2 != 0) {
			tmp = n1 % n2;
			n1 = n2;
			n2 = tmp;
		}
		
		gcd = n1;
		
		return gcd;
		
	}
	
	public static int LCM(int a, int b) {
		int p = a * b;
		int gcd = GCD(a, b);
		
		return p/gcd;
	}

}
