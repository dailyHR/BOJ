package Dec_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1918 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		String s = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0 ; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(64<ch && ch<91) {
				stringBuilder.append(ch);
			}
			else { //operator
				if(stack.isEmpty()) {
					stack.push(ch);
				}
				else {
					if(ch == '*' || ch =='/' || ch=='+' || ch=='-') {
						while((!stack.isEmpty()) && (operatorPriority(stack.peek()) >= operatorPriority(ch))) {
							stringBuilder.append(stack.pop());
						}
						stack.push(ch);
					}
					else if(ch == '(') {
						stack.push(ch);
					}
					else if(ch == ')') {
						while(!stack.isEmpty() && stack.peek() != '(') {
							stringBuilder.append(stack.pop());	
						}
						stack.pop();
					}
				}

			}
		}
		
		while(!stack.isEmpty()) {
			stringBuilder.append(stack.pop());		
		}
		
		System.out.println(stringBuilder);
	}
	
	public static int operatorPriority(char ch) {
		if(ch == '*' || ch =='/') {
			return 2;
		}
		else if(ch == '+' || ch == '-') {
			return 1;
		}
		else if(ch == '(' || ch == ')'){
			return 0;
		}
		else {
			return -1;
		}
	}

}

