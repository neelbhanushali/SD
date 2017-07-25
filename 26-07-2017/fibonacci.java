package sd5;

public class fibonacci {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1;
		
		System.out.print(n1 + " " + n2 + " ");
		
		Fibonacci(n1, n2);
	}
	
	public static void Fibonacci(int n1, int n2) {
		int n3 = n1 + n2;
		
		if(n3 < 100) {
			
			System.out.print(n3 + " ");
			
			Fibonacci(n2, n3);
		}
		
		
	}
}
