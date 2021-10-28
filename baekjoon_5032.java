package October_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_5032 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int drink = e + f;
		int sum = 0;
		
		while(drink >= c) {
			sum += drink / c;
			int x = drink % c;
			drink /= c;
			drink += x;
			
		}
		
		
		System.out.println(sum);

		
	}

}
