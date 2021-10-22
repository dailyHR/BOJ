import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * 백준 11866번 : 요세푸스 문제 0
 * */
public class baekjoon_11866 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList();
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1 ; i <= N; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			for(int i = 1 ; i < M ; i ++) {
				int val = queue.poll();
				queue.add(val);
			}
			list.add(queue.poll());
		}
		
		System.out.print("<");
		
		for(int i = 0 ; i < list.size(); i++) {
			if(i == list.size() - 1) {
				System.out.print(list.get(i));
			}
			else {
				System.out.print(list.get(i)+", ");
			}
		}
		System.out.print(">");


	}

}
