package October_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_3036 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0 ; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int A = array[0];
		int GCD = 0;
		for(int i = 1 ; i < N; i++) {
			int B = array[i];
			GCD = GCD(A,B);
			System.out.println((array[0]/GCD) + "/" + (array[i]/GCD));
		}

	}
	
	public static int GCD(int a, int b) {
		int gcd = 0;
		while(true) {
			if(a%b==0) {
				gcd = b;
				break;
			}
			else {
				int temp = a % b;
				a = b;
				b = temp;
			}
		}
		return gcd;
	}
}
