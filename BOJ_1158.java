 package Dec_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1158 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> result = new LinkedList<>();

		for(int i = 1; i<=N; i++) {
			queue.add(i);
		}
		
		int count = K;
		while(!queue.isEmpty()) {
			while(count > 1) {
				queue.add(queue.remove());
				count--;
			}
			result.add(queue.remove());
			count = K;
		}
		
		System.out.print("<");
		while(!(result.size()==1)) {
			stringBuilder.append(result.remove()+", ");
		}
		stringBuilder.append(result.remove());
		System.out.print(stringBuilder);
		System.out.print(">");

	}
}
