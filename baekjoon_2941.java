import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_2941 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		char[] wordArray = word.toCharArray();
		
		String[] alphabet = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
		
		int sum = 0;
		
		//"dz="인 경우
		while(word.contains("dz=")) {
			int index = word.indexOf("dz=");
			word = word.replaceFirst("dz=", " ");
			sum++;
		}
		
		//그 외 경우
		
		for(int i = 0 ; i < word.length(); i++) {
			for(int j = 0 ; j < alphabet.length; j++) {
				if(word.contains(alphabet[j])) {
					word = word.replaceFirst(alphabet[j], " ");
					sum++;
				}
			}
		}
		
		for(int i = 0 ; i < word.length(); i++) {
			if(word.charAt(i) != ' ') {
				sum++;	
			}
			
		}
		
		System.out.println(sum);

	}

}
