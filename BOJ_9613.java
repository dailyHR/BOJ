import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_9613 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        String[] strSplit = {};
        for(int i = 0 ; i < t; i++){
            String str = br.readLine();
            strSplit = str.split(" ");
            int n = Integer.parseInt(strSplit[0]);
            long sum = 0;
            for(int j = 1 ; j < n; j++){
                for(int k = j+1; k <=n; k++){
                    int num1 = Integer.parseInt(strSplit[j]);
                    int num2 = Integer.parseInt((strSplit[k]));
                    sum += GCD(num1, num2);
                }

            }
            stringBuilder.append(sum+"\n");
        }

        System.out.println(stringBuilder);


    }

    public static int GCD(int a, int b){
        if(a%b != 0)
            return GCD(b, a%b);
        else
            return b;
    }
}
