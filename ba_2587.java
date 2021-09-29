import java.util.Arrays;
import java.util.Scanner;

public class ba_2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		//ЦђБе
		int sum = 0;
		for(int i = 0 ; i < array.length; i++) {
			sum += array[i];
		}
		
		Arrays.sort(array);
		
		System.out.println(sum/array.length);
		System.out.println(array[2]);

	}

}
