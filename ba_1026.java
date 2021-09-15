import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ba_1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputN;
		int inputSum = 0;
		
		Scanner scanner = new Scanner(System.in);
		inputN = scanner.nextInt();
		
		
		int[] arrayA = new int[inputN];
		Integer[] arrayB = new Integer[inputN];
		//Collection.reverseOrder()는 int로 사용불가능.

		for(int i = 0 ; i < inputN; i++) {
			arrayA[i] = scanner.nextInt();
		}
		
		for(int i = 0 ; i < inputN; i++) {
			arrayB[i] = scanner.nextInt();
		}
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB, Collections.reverseOrder());
		
		
		for(int i = 0 ; i < inputN; i++) {
			inputSum += arrayA[i] * arrayB[i];
		}
		
		System.out.println(inputSum);
		
	}

}
