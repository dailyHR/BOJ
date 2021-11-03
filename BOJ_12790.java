package Nov_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12790 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] character = new int[T][8];
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0 ; j < 8 ; j++) {
				character[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		

		int power = 0;
		for(int i = 0; i < T; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				int HP = checkHP(character[i][0],character[i][4]);
				int MP = checkHP(character[i][1],character[i][5]);
				int attack = checkAttack(character[i][2],character[i][6]);
				int depense = character[i][3] + character[i][7];
				
				power = 1 * HP + 5 * MP + 2* attack + 2*depense;
			}
			System.out.println(power);

		}

	}
	
	static int checkHP(int base, int equip) {
		int result = base + equip;
		if(result < 1) {
			return 1;
		}
		else {
			return result;
		}
	}
	
	static int checkMP(int base, int equip) {
		int result = base + equip;
		if(result < 1) {
			return 1;
		}
		else {
			return result;
		}
	}
	
	static int checkAttack(int base, int equip) {
		int result = base + equip;
		if(result < 0) {
			return 0;
		}
		else {
			return result;
		}
	}
	
}
