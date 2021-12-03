package Dec_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class BOJ_1406 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		LinkedList<Character> list = new LinkedList<>();
		//Stack<Integer> stack = new Stack<>();
		
		String sentence = br.readLine();
		for(int i = 0 ; i < sentence.length(); i++) {
			list.add(sentence.charAt(i));
		}
		
		
		int M = Integer.parseInt(br.readLine());
//		int index = sentence.length();
		ListIterator<Character> iter = list.listIterator();
		while(iter.hasNext()) {
			iter.next();
		}
		
		for(int i = 0 ; i < M; i++) {
			String input = br.readLine();
			char word = input.charAt(0);
			
			switch(word) {
			case 'L' :
//				if(index != 0) {
//					index = index - 1;
//				}
				if(iter.hasPrevious()) {
					iter.previous();
				}
				break;
			case 'D' :
//				if(index != list.size()) { //list의 길이랑 같을때로 수정하기
//					index = index + 1;
//				}
				if(iter.hasNext()) {
					iter.next();
				}
				break;
			case 'B' :
//				if(index != 0) {
//					list.remove(index-1);
//					index--;
//				}
				if(iter.hasPrevious()) {
					
					iter.previous();
					iter.next();
					iter.remove();
					if(iter.hasPrevious()) {
						iter.previous();
						iter.next();
					}
					
					
					//iter.previous();
				}
				break;
				
			case 'P' :
				char appendChar = input.charAt(2);
//				list.add(index,appendChar);
//				index++;
				iter.add(appendChar);
				break;
			}
			
		}
		for(Character c : list) {
			stringBuilder.append(c);
		}
		
		System.out.println(stringBuilder);
	}
}
