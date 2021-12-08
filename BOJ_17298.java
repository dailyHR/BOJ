package Dec_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		int[] input = new int[N];
		Stack<Integer> stack = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < N; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0 ; i < N; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			else {
				if(input[stack.peek()] > input[i]) {
					stack.push(i);
				}
				else {
					while(!stack.isEmpty() && input[stack.peek()] < input[i]) {
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
//		for(int i = 0 ; i < N - 1; i++) {
//			for(int j = i+1; j < N; j++) {
//				if(input[i] < input[j]) {
//					stringBuilder.append(input[j] +" ");
//					break;
//				}
//				if(j == N-1) {
//					stringBuilder.append(-1 + " ");
//				}
//			}
//			
//		}
//		stringBuilder.append(-1);
		
		System.out.println(stringBuilder);
	}

}
