import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 * 백준 11047번: 동전 0
 * */
public class baekjoon_11047 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Integer[] coin = new Integer[N];
		
		for(int i = 0 ; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(coin, Collections.reverseOrder());
		
		int num = 0;
		for(int i = 0 ; i < N; i++) {
			if(coin[i] <= K) {
				num += K / coin[i];
				K = K % coin[i];
			}
		}
		
		System.out.println(num);
	}

}
