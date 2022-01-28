import java.util.Scanner;
import java.util.Stack;

public class BOJ_2089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();

        if(N == 0){
            System.out.println(0);
        }
        else{
            while(true){

                if(N==0){
                    break;
                }

                if(N%(-2) ==0){
                    stack.push(0);
                    N = N/(-2);
                }
                else{
                    stack.push(1);
                    N = (N-1)/(-2);
                }

            }
        }



        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
