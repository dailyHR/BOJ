import java.util.Scanner;

public class BOJ_2004 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] splitStr = str.split(" ");
		long n = Long.parseLong(splitStr[0]);
		long m = Long.parseLong(splitStr[1]);
		
		long num1 = count1(n) - count1(n-m) - count1(m);
		long num2 = count2(n) - count2(n-m) - count2(m);
		
		System.out.println(Math.min(num1, num2));

	}
	
	public static int count1(long num) {
		int count = 0 ;
		while(num >= 2) {
			count += num/2;
			num /= 2;
		}
		return count;
	}
	
	public static int count2(long num) {
		int count = 0 ;
		while(num >= 5) {
			count += num/5;
			num /= 5;
		}
		return count;
	}
}
