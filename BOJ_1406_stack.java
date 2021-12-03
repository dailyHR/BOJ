package Dec_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class BOJ_1406_stack {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		Stack<Character> leftStack = new Stack<>();
		Stack<Character> rightStack = new Stack<>();

		String sentence = br.readLine();
		for(int i = 0 ; i < sentence.length(); i++) {
			leftStack.add(sentence.charAt(i));
		}
		
		int M = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < M; i++) {
			String input = br.readLine();
			char word = input.charAt(0);
			
			switch(word) {
			case 'L' :
				if(!leftStack.isEmpty())
					rightStack.add(leftStack.pop());

				break;
			case 'D' :
				if(!rightStack.isEmpty())
					leftStack.add(rightStack.pop());

				break;
			case 'B' :
				if(!leftStack.isEmpty())
					leftStack.pop();

				break;
				
			case 'P' :
				char appendChar = input.charAt(2);
				leftStack.add(appendChar);

				break;
			}
			
		}
		
		while(!leftStack.isEmpty()) {
			rightStack.add(leftStack.pop());
		}
		while(!rightStack.isEmpty()) {
			stringBuilder.append(rightStack.pop());
		}
		
		System.out.println(stringBuilder);
	}
}
