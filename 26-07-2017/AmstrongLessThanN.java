package sd5;

import java.util.Scanner;

public class AmstrongLessThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iv = new Scanner(System.in);
		System.out.print("Enter extreme: ");
		int n = iv.nextInt();
		
		for(int i = 1; i < n; i++) {
			if(AmstrongCheck(i))
				System.out.print(i + " ");
		}
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
