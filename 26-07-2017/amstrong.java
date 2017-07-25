package sd5;

import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iv = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = iv.nextInt();
		System.out.print("Is "+a+" Amstrong: " + AmstrongCheck(a));
	}
	
	public static boolean AmstrongCheck(int a) {
		int tmp=a, sum=0;
		while(tmp>0) {
			sum += Math.pow(tmp%10, 3);
			tmp = tmp/10;
		}
		
		if(sum == a)		return true;
		else				return false;
	}

}
