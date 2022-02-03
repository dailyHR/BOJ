import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input = br.readLine();
        String[] inputSplit = input.split(" ");
        int N = Integer.parseInt(inputSplit[0]);
        int M = Integer.parseInt(inputSplit[1]);

        HashSet<String> set = new HashSet<String>();
        for(int i = 0 ; i < N ; i++){
            String key = br.readLine();
            set.add(key);
        }

        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0 ; i < M; i++){
            String key = br.readLine();
            if(set.contains(key)){
                list.add(key);
            }
        }
        list.sort(null);
        System.out.println(list.size());

        for(String s : list){
            sb.append(s + "\n");
        }
        System.out.println(sb);



    }
}
