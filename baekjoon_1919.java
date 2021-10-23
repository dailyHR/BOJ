import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_1919 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstWord = br.readLine();
		String secondWord = br.readLine();
		
		int sum = 0;
		
		char[] sortWord1 = firstWord.toCharArray();
		char[] sortWord2 = secondWord.toCharArray();
		
		
		for(int i = 0 ; i < sortWord1.length; i++) {
			String word = String.valueOf(sortWord1[i]);
			for(int j = 0 ; j < sortWord2.length; j++) {
				if(sortWord2[j] == sortWord1[i]) {
					sortWord1[i] = ' ';
					sortWord2[j] = ' ';
					break;
				}
			}
		}

		
		for(int i = 0 ; i < sortWord1.length; i++) {
			if(sortWord1[i] != ' ') {
				sum++;

			}
		}
		
		for(int i = 0 ; i < sortWord2.length; i++) {
			if(sortWord2[i] != ' ') {
				sum++;

			}
		}
		
		
//		for(int i = 0 ; i < firstWord.length(); i++) {
//			String word = String.valueOf(firstWord.charAt(i));
//			if(!secondWord.contains(word)) {
//				sum++;
//			}
//		}
//		
//		for(int i = 0 ; i < secondWord.length(); i++) {
//			String word = String.valueOf(secondWord.charAt(i));
//			if(!firstWord.contains(word)) {
//				sum++;
//			}
//		}
		
		System.out.println(sum);

	}

}
