package Nov_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2960 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= N; i++) {
			list.add(i);
		}
		int result = 0;
		int q = 0;

		while (true) {
			int P = list.remove(0);
			q++;
			if(q == K) {
				result = P;
				break;
			}
			
			for(int j = 0 ; j < list.size(); j++) {
				if(list.get(j) % P ==0) {
					result = list.remove(j);
					q++;
					if(q==K) {
						break;
					}
				}
				
			}
			if(q==K) {
				break;
			}

		}

		System.out.println(result);
	}

}
