package Nov_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9625 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int[] sumA = new int[46];
		int[] sumB = new int[46];
		sumA[1] = 0;
		sumB[1] = 1;
		sumA[2] = 1;
		sumB[2] = 1;
		
		for(int i = 3 ; i < sumA.length; i++) {
			sumA[i] = sumA[i-1] + sumA[i-2];
			sumB[i] = sumB[i-1] + sumB[i-2];
		}
		
		System.out.println(sumA[K] + " " + sumB[K]);
		
		
		
	}

}
