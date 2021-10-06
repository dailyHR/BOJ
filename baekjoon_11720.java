import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 백준 11720번: 숫자의 합
 * */
public class baekjoon_11720 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		String num = br.readLine();
		
		for(int i = 0 ; i < num.length(); i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		
		System.out.println(sum);
	}

}
