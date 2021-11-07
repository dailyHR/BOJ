package Nov_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10824 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		String C = st.nextToken();
		String D = st.nextToken();
		
		String result1 = A + B;
		String result2 = C + D;
		Long result3 = Long.parseLong(result1);
		Long result4 = Long.parseLong(result2);

		
		System.out.println(result3+result4);

	}

}
