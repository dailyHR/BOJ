package Dec_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17299 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		int[] input = new int[N];
		int[] F = new int[1000001];
		F[0] = 0;
		Stack<Integer> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			input[i] = num;
			F[num]++;
		}
		
		for(int i = 0 ; i < N; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			else {
				if(F[input[stack.peek()]] > F[input[i]]) {
					stack.push(i);
				}
				else {
					while(!stack.isEmpty() && F[input[stack.peek()]] < F[input[i]]) {
						input[stack.pop()] = input[i];
					}
					stack.push(i);
				}
			}
		}
		
		while(!stack.isEmpty()) {
			input[stack.pop()] = -1;
		}
		
		for(Integer i : input) {
			stringBuilder.append(i +" ");
		}
		
		System.out.println(stringBuilder);
		
	}

}
