import java.util.Scanner;

public class ba_2845 {
	public static void main(String[] args) {

		int people ;
		int width;
		int[] news = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		people = scanner.nextInt();
		width = scanner.nextInt();
		
		for(int i = 0 ; i < news.length; i++) {
			news[i] = scanner.nextInt();
		}
		
		for(int i = 0 ; i < news.length; i++) {
			news[i] = news[i] - width * people;
		}
		
		for(int i = 0 ; i < news.length; i++) {
			System.out.print(news[i]+" ");
		}
		
	}
}
