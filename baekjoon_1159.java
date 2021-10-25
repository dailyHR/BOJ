package October_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1159 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] alphabet = new int[26];
		
		String[] player = new String[N];
		for(int i = 0; i < N ; i++) {
			player[i] = br.readLine();
		}
		
		for(int i = 0 ; i < N ; i++) {
			String name = player[i];
			int index = name.charAt(0) - 97;
			alphabet[index]++;
		}
		
		boolean surrender = true;
		for(int i = 0 ; i < alphabet.length; i++) {
			if(alphabet[i] >= 5) {
				System.out.print((char)(i+97));
				surrender = false;
			}
		}
		
		if(surrender == true) {
			System.out.println("PREDAJA");
		}
		
		
	}
}
