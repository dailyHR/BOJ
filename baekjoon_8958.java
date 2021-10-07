import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 8958번 : OX퀴즈
 * */
public class baekjoon_8958 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] sum = new int[N];
		String[] array = new String[N];
		for(int i = 0 ; i < N ; i ++) {
			array[i] = br.readLine();
		}
		
		

		for(int j = 0 ; j < array.length ; j++) {
			sum[j] = 0;
			int num = 0;
			for(int i = 0 ; i < array[j].length(); i++) {
				if(array[j].charAt(i) == 'O') {
					num++;
					sum[j] += num;
				}
				else {
					num = 0;
				}
			}
			System.out.println(sum[j]);

		}

		
	}
}
