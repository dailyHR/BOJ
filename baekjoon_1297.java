package October_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1297 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double D = Integer.parseInt(st.nextToken());
		double H = Integer.parseInt(st.nextToken());
		double W = Integer.parseInt(st.nextToken());
		
		double x = (D*D) / (H*H + W*W);
		x = Math.sqrt(x);

		H = Math.floor(H * x);
		int h = (int) H;
		W = Math.floor(W * x);
		int w = (int) W;

		
		System.out.println(h+ " " + w);

	}

}
