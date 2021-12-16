package Dec_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1929 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		String input = br.readLine();
		String[] array = input.split(" ");
		int[] num = new int[array.length];
		for(int i = 0 ; i < array.length; i++) {
			num[i] = Integer.parseInt(array[i]);
		}
		int M = num[0];
		int N = num[1];
		
		boolean[] arr = new boolean[N+1];
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2 ; i < Math.sqrt(N+1); i++) {
			for(int j = i*2; j < N+1; j+=i) {
				arr[j] = true;
			}
		}
		
		for(int i = M; i <= N; i++) {
			if(arr[i] == false) {
				stringBuilder.append(i+"\n");
			}
		}
		
		
		System.out.println(stringBuilder);
		
	}

}
