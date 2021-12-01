package Dec_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Stack;

public class BOJ_1874 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder stringBuilder = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int[] input = new int[n];
		LinkedList<Integer> sequence = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();

		for(int i = 0 ; i < n; i++) {
			input[i] = Integer.parseInt(br.readLine());
			sequence.add(i+1);
		}
		
		int number = 0;
		
		while(!sequence.isEmpty()) {
			if(sequence.get(0) != input[number]) {
				stack.add(sequence.get(0));
				sequence.removeFirst();
				stringBuilder.append("+\n");
//				bw.write("+\n");			

			}
			else {
				stack.add(sequence.get(0));
				sequence.removeFirst();
				stringBuilder.append("+\n");

//				bw.write("+\n");			

				while((!stack.isEmpty()) &&stack.peek() == input[number]) {
					result.add(stack.pop());
					number++;	
					stringBuilder.append("-\n");

//					bw.write("-\n");			
				}
				
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println(stringBuilder);
//			bw.flush();
//			bw.close();
		}else {
			System.out.println("NO");
		}
		
	}

}
