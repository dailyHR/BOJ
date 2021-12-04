package Dec_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_17413 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();

		String S = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0 ; i < S.length(); i++) {
			char word = S.charAt(i);
			if(word == ' ') {
				while(!stack.isEmpty()) {
					stringBuilder.append(stack.pop());
				}
				stringBuilder.append(' ');
			}
			else if(word=='<') {
				while(!stack.isEmpty()) {
					stringBuilder.append(stack.pop());
				}
				while(true) {
					if(word != '>') {
						stringBuilder.append(word);
						i++;
					}
					else {
						break;
					}
					word = S.charAt(i);
				}
				stringBuilder.append(word);
			}
			else {
				if((word>96 && word <123) || (word>47 && word<58))
					stack.add(word);
			}
		}
		while(!stack.isEmpty()) {
			stringBuilder.append(stack.pop());
		}
		
		System.out.println(stringBuilder);
	}

}
