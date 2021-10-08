import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10162 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int A = 0;
		int B = 0;
		int C = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int value = 0;
		
		value = T / 300;
		A = value;
		T = T % 300;

		value = T / 60;
		B = value;
		T = T % 60;
		
		value = T / 10;
		C = value;
		T = T % 10;
		
		
		if(T!=0) {
			System.out.println(-1);
		}
		else {
			System.out.println(A + " " + B + " " +  C);
		}
	}

}
