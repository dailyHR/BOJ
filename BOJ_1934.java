package Dec_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1934 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T;i++) {
			String input = br.readLine();
			String[] num = input.split(" ");
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			System.out.println(LCM(A*B,GCD(A,B)));
		}
	}
	
	static int GCD(int A, int B) {
		int result = A % B;
		if(result == 0) return B;
		else return GCD(B, result);
	}
	
	static int LCM(int mul, int GCD) {
		return mul / GCD;
	}

}
