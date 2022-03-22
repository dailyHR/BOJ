package Nov_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10448 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] input = new int[T];
		
		for(int i = 0 ; i < T; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		int[] tri = new int[45];
		for(int i = 1 ; i < tri.length; i++) {
			tri[i] = (i*(i+1))/2; 
		}
		
		for(int i = 0 ; i < T; i++) {
			System.out.println(three(input[i], tri));
		}

		
		
	}
	
	static int three(int num, int[] arr) {
		int sum = 0;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1 ; j < arr.length; j++) {
				for(int k = 1 ; k < arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum == num) {
						return 1;
						
					}
				}
			}
		}
		return 0;
		
	}

}
