import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String[] split_str1 = str1.split(" ");
        int N = Integer.parseInt(split_str1[0]);
        long S = Long.parseLong(split_str1[1]);

        String str2 = br.readLine();
        String[] split_str2 = str2.split(" ");
        long[] array = new long[split_str2.length];

        for(int i = 0; i < split_str2.length; i++){
            long num = Long.parseLong(split_str2[i]);
            if(num > S){
                array[i] = num - S;
            }
            else{
                array[i] = S - num;
            }
        }



        if(array.length > 1){
            long result = GCD(array[0], array[1]);
            for(int i = 2 ; i < array.length-1; i++){
                result = GCD(result, array[i]);
            }
            System.out.println(result);
        }
        else{
            System.out.println(array[0]);
        }


    }

    public static long GCD(long a, long b){
        return a%b==0 ? b : GCD(b,a%b);
    }
}
