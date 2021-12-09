package Dec_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1935 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		String input = br.readLine();
		Stack<Double> stack = new Stack<>();
		
		for(int i = 0 ; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		
		for(int i = 0 ; i < input.length() ; i++) {
			char ch = input.charAt(i);
			if(64<ch && ch<91) {
				int num = ch - 65;
				stack.push(Double.parseDouble(arr[num]));
			}
			else {
				double num1 = stack.pop();
				double num2 = stack.pop();
				
				switch(ch) {
				case '+':
					stack.push(num2+num1);
					break;
				case '-':
					stack.push(num2-num1);
					break;
				case '*':
					stack.push(num2*num1);
					break;
				case '/':
					stack.push(num2/num1);
					break;
				}
			}
		}
		System.out.printf("%.2f",stack.pop());
		
	}

}
