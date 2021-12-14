package Dec_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1978 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		String[] array = input.split(" ");
		int[] num = new int[array.length];
		for(int i = 0 ; i < array.length; i++) {
			num[i] = Integer.parseInt(array[i]);
		}
		
		int count = 0;
		for(int i = 0 ; i < array.length; i++) {
			int number = num[i];
			boolean isPrime = true; 
			if(number == 1) {
				isPrime = false;
			}
			if(number == 2) {
				isPrime = true;
			}
			if(number > 2) {
				for(int j = 2 ; j < number; j++) {
					if(number % j == 0) 
						isPrime = false;
						continue;
				}
			}
			
			if(isPrime == true) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
