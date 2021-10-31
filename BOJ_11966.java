package October_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11966 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		double[] result = new double[31];
		
		for(int i = 0 ; i <= 30; i++) {
			result[i] = Math.pow(2, i);
		}
		
		boolean a = true;
		for(int i = 0 ; i <= 30; i++) {
			if(result[i] == N) {
				a = true;
				break;
			}
			else {
				a = false;
			}
		}
		
		if(a==true) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

	}

}
