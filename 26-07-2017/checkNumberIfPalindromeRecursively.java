package sd5;

import java.util.Scanner;

public class checkNumberIfPalindromeRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iv = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = iv.nextInt();
		System.out.print("Is " + a + " palindrome: " + CheckPalindrome(a));
	}
	
	public static boolean CheckPalindrome(int a) {
		int tmp=a,num=0;
		while(tmp > 0) {
			num *= 10;
			num += tmp%10;
			tmp = tmp / 10;
		}
		
		if(num == a)		return true;
		else 				return false;
	}
}
