import java.util.Scanner;

public class BOJ_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		System.out.println(factorial(N));

	}
	
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
