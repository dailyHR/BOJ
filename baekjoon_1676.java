import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * ���� 1676��: ���丮�� 0�� ����
 * */

public class baekjoon_1676 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		sum = N / 5;
		

		while(N > 0) {
			
			if(N % 25 ==0) {
				sum++;
			}
			if(N % 125 == 0) {
				sum++;
			}			
			
			N --;
		}

		
		System.out.println(sum);
	}

}
