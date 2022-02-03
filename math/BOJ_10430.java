package Dec_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10430 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] num = input.split(" ");
		int A = Integer.parseInt(num[0]);
		int B = Integer.parseInt(num[1]);
		int C = Integer.parseInt(num[2]);

		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);

	}
	
}
