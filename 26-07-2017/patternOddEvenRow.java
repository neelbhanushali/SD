package sd5;

import java.util.Scanner;

public class patternOddEvenRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iv = new Scanner(System.in);
		System.out.print("Enter Row: ");
		int r = iv.nextInt();
		for(int i = 1; i <= r; i++) {
			if(i%2 == 0)
				for(int j = i; j > 0; j--)
					System.out.print(j + " ");
			else
				for(int k = 1; k <= i; k++)
					System.out.print(k + " ");
			
			System.out.println("");
		}
	}

}
