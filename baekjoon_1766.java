import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 * 백준 1766번 : 문제집
 * */
public class baekjoon_1766 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] indegree = new int[N+1];
		
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		for(int i = 0 ; i < N + 1; i ++) {
			graph[i] = new ArrayList();
		}
		
		for(int i = 0 ; i < M ; i ++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			graph[a].add(b);
			indegree[b]++;
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		Queue<Integer> result = new LinkedList<>();
		for(int i = 1 ; i < indegree.length; i++) {
			if(indegree[i] == 0 ) {
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()) {
			int element = queue.poll();
			result.add(element);
			
			for(int i = 0 ; i < graph[element].size(); i++) {
				int k = graph[element].get(i);
				indegree[k]--;
				if(indegree[k] == 0) {
					queue.add(k);
				}
			}
		}
		
		for(Integer i : result) {
			System.out.print(i +" ");
		}
		
	}

}
