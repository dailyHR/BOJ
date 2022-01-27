import java.util.Scanner;

public class BOJ_1373 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String binary = scanner.nextLine();

        int length = binary.length();
        if(length%3==1){
            String zero2 = "00";
            binary = zero2.concat(binary);
        }
        else if(length%3==2){
            String zero1 = "0";
            binary = zero1.concat(binary);
        }

        for(int i = 0 ; i < length; i+=3){
            String str = binary.substring(i,i+3);
            int decimal = Integer.parseInt(str, 2);
            sb.append(decimal);
        }

        System.out.println(sb);
    }
}
