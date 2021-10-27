package October_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_1212 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String N = br.readLine();
		for(int i = 0 ; i < N.length(); i++) {
			String num = Integer.toBinaryString(N.charAt(i) - 48);
			if(num.length()==1 && i!=0) {
				System.out.print("00");
			}else if(num.length()==2 && i!=0) {
				System.out.print("0");
			}
			System.out.print(num);


			

		}

		
	}
	

}
