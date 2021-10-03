import java.util.Scanner;

public class ba_10808 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		int[] alphabet = new int[26];
		
		for(int i = 0 ; i < S.length(); i++) {
			int a = S.charAt(i);
			a = a-97;
			alphabet[a]++;
		}
		
		for(int i = 0 ; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}

}
