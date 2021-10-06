import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_9237 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] tree;
		tree = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < N ; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(tree, Collections.reverseOrder()); //역순 정렬
		
		int max = 0;
		int day = 1;
		for(int i = 0 ; i < N; i++) {
			int value = tree[i] + day;
			if(value > max) {
				max = value;
			}
			day++;
		}
		
		System.out.println(max + 1);
		
		
	}

}
