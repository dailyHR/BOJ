import java.util.Scanner;

public class ba_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] pointX_array = new int[3];
		int[] pointY_array = new int[3];

		
		for(int i = 0 ; i < pointX_array.length; i++) {
			pointX_array[i] = scanner.nextInt();
			pointY_array[i] = scanner.nextInt();
		}
		
//		for(int i = 0 ; i <pointX_array.length;i++) {
//			System.out.print(pointX_array[i]);
//		}
//		for(int i = 0 ; i <pointX_array.length;i++) {
//			System.out.print(pointY_array[i]);
//		}
		
		int firstNumber = pointX_array[0];
		int xNumber = 0;
		if(firstNumber == pointX_array[1]) {
			xNumber = pointX_array[2];
		}
		else if(firstNumber == pointX_array[2]){
			xNumber = pointX_array[1];
		}
		else {
			xNumber = firstNumber;
		}
		
		
		firstNumber = pointY_array[0];
		int yNumber = 0;
		if(firstNumber == pointY_array[1]) {
			yNumber = pointY_array[2];
		}
		else if(firstNumber == pointY_array[2]){
			yNumber = pointY_array[1];
		}
		else {
			yNumber = firstNumber;
		}
		System.out.println(xNumber +" "+ yNumber);
	}

}
