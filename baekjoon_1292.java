import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1292 {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[] array = new int[1001];
		int num = 1;

		int i = 1;
		while(i<1001) {
			for(int j = num; j > 0 ; j--) {
				
				array[i] = num;
				i++;
				if(i == 1001) {
					break;
				}
			}
			num++;
		}
		
		int sum = 0;
		for(int k = A; k <= B ; k ++) {
			sum += array[k];
		}
		
		System.out.println(sum);
	}

}
