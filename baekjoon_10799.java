import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 백준 10799번: 쇠막대기
 * */
public class baekjoon_10799 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pipe = br.readLine();
		Stack<String> stack = new Stack<>();
		int sum = 0;
		
		for(int i = 0 ; i < pipe.length(); i++) {
			if(pipe.charAt(i) == '(') {
				if(pipe.charAt(i) == '(' && pipe.charAt(i+1) == ')') {
					sum += stack.size();
					i++;
				}
				else {
					stack.push("(");
				}
			}
			else {
				stack.pop();
				sum += 1;
			}
			
		}
		
		System.out.println(sum);
	}

}
