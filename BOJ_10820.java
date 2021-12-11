package Dec_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10820 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		
		String input = "";
		while((input=br.readLine()) != null) {
			int low = 0;
			int upper = 0;
			int num = 0;
			int space = 0;
			
			for(int i = 0 ; i < input.length(); i++) {
				if('a' <= input.charAt(i) && 'z' >= input.charAt(i)) {
					low++;
				}
				else if('A' <= input.charAt(i) && 'Z' >= input.charAt(i)) {
					upper++;
				}
				else if('0' <= input.charAt(i) && '9' >= input.charAt(i)) {
					num++;
				}
				else if(input.charAt(i) == ' ') {
					space++;
				}
			}
			
			System.out.println(low +" " +upper+" "+num+" "+space);

		}
		
		System.out.println(stringBuilder);

	}

}
