package Dec_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_9093 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T; i++) {

			Stack<Character> stack = new Stack<>();
			String sentence = br.readLine();
			for(int j = 0; j < sentence.length(); j++) {
				char c = sentence.charAt(j);
				if(c == ' ') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());						
					}
					bw.write(" ");					
					
				}
				else {
					stack.add(c);
					
				}
			}
			while(!stack.isEmpty()) {
				bw.write((char)stack.pop());
			
			}
			bw.write("\n");
			
		}
		bw.flush();

		bw.close();

	}

}
