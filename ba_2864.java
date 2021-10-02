import java.util.LinkedList;
import java.util.Scanner;

public class ba_2864 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();
		
		
		String minA = A.replace('6', '5');
		String minB = B.replace('6', '5');
		
		int num1 = Integer.parseInt(minA) + Integer.parseInt(minB);
		
		String maxA = A.replace('5', '6');
		String maxB = B.replace('5', '6');

		int num2 = Integer.parseInt(maxA) + Integer.parseInt(maxB);
		
		
		System.out.println(num1 +" " + num2);
	}

}
