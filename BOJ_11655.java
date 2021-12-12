package Dec_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11655 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for(int i = 0 ; i < str.length(); i++) {
			int ch = str.charAt(i);
			if('A' <= ch && ch <= 'Z') {
				
				ch = ch + 13;
				if(ch > 'Z') {
					ch = ch % 91 + 65;
				}
				
				System.out.print((char)ch);
			}
			else if('a' <= ch && ch <='z') {
				ch = ch +13;
				if(ch > 'z') {
					ch = ch % 123;
					ch = ch + 97;
				}
				System.out.print((char)ch);
			}
			else if(ch == ' ') {
				System.out.print(' ');
			}
			else if('0' <= ch && ch <= '9') {
				System.out.print((char)ch);
			}
		}
	}

}
