import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준 5585번 : 거스름돈 
 * 그리디 알고리즘관련 문제
 */
public class baekjoon_5585 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		money = 1000 - money;
		int coin = 0 ;
		
		int value = money / 500;
		money = money % 500;
		coin += value;
		
		value = money / 100;
		money = money % 100;
		coin += value;
		
		value = money / 50;
		money = money % 50;
		coin += value;
		
		value = money / 10;
		money = money % 10;
		coin += value;
		
		value = money / 5;
		money = money % 5;
		coin += value;

		coin += money;
		System.out.println(coin);
		
	}

}
