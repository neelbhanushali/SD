package sd5;

import java.util.Scanner;

public class primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iv = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int a = iv.nextInt();
		System.out.println("Is "+a+" prime: " + PrimeCheck(a));
	}
	
	public static boolean PrimeCheck(int a) {
		// Source: https://youtu.be/2p3kwF04xcA		
		boolean prime = false;
		if(a == 1) 						prime = false;
		else if(a == 2) 				prime = true;
		else if(a > 2 && a%2 == 0) 		prime = false;
		else {
			for(int i = 3; i <= Math.ceil(Math.sqrt(a)); i += 2) {
				if(a%i == 0) 			return false;
				else					return true;
			}
		}
		return prime;
	}
}
