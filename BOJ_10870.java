package Nov_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10870 {
	
	static int[] array;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		array = new int[n+1];
		Arrays.fill(array, 0);
		System.out.println(fibonacci(n));
		
	}
	
	static int fibonacci(int x) {
		if(x == 0) {
			return 0;
		}
		if(x == 2 || x == 1) {
			return 1;
		}
		else if(array[x] != 0) {
			return array[x];
		}
		else {
			return array[x] = fibonacci(x-1) + fibonacci(x-2);
		}
	}

}
