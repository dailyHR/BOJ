import java.util.Scanner;

public class ba_2740 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int[][] A = new int[N][M];
		
		for(int i = 0 ; i < N; i ++) {
			for(int j = 0 ; j < M ; j++) {
				A[i][j] = scanner.nextInt();
			}
		}
		
		M = scanner.nextInt();
		int K = scanner.nextInt();
		
		int[][] B = new int[M][K];
		
		for(int i = 0 ; i < M; i ++) {
			for(int j = 0 ; j < K ; j++) {
				B[i][j] = scanner.nextInt();
			}
		}
		
		
		int[][] array = new int[N][K];
		
		for(int i = 0 ; i < N; i++) {
			for(int j = 0 ; j < K; j++) {
				
				for(int k = 0 ; k < M ; k ++) {
					array[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		for(int i = 0 ; i < N ; i ++) {
			for(int j = 0 ; j < K ; j ++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
