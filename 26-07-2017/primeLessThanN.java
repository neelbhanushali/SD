package sd5;

import java.util.Scanner;

public class primeLessThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iv = new Scanner(System.in);
		
		System.out.print("Enter extreme: ");
		int n = iv.nextInt();
		
		for(int i = 1; i < n; i++) {
			if(PrimeCheck(i))
				System.out.print(i + " ");
		}
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
