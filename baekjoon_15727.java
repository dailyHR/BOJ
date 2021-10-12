import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_15727 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int minute = 0;
		
		minute = L/5;
		if(L%5 == 0) {
			minute = L/5;
		}
		else {
			minute = L/5 + 1;
		}
		
		System.out.println(minute);

	}

}
