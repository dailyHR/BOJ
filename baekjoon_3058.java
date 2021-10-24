import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_3058 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 0 ; k < T; k++) {
			
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[7];
			for(int i = 0 ; i < 7; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			int sum = 0;
			int min = 0;
			for(int i = 0 ; i < 7; i++) {
				if(arr[i] % 2 == 0) {
					sum += arr[i];
				}
			}
			
			for(int i = 0 ; i < 7 ; i++) {
				if(arr[i] % 2 == 0) {
					min = arr[i];
					break;
				}
			}
			
			System.out.println(sum+" "+min);
		}

	}

}
