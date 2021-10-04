import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/* 
 * ���� 2252��. ���� ���� ���� �� ������ ����.
*/
public class ba_2252 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); //�л��� 1���� n
		int m = scanner.nextInt(); //m�� ��
		
		int[] inDegree = new int[n+1];
		ArrayList<Integer>[] graph = new ArrayList[n+1];
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> result = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		for(int i = 0 ; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			graph[a].add(b);
			inDegree[b]++;
		}
		
		
		
		for(int i = 1 ; i <= n; i++) {
			if(inDegree[i]==0) {
				queue.add(i);
			}
		}

		while(!queue.isEmpty()) {
		
			int current = queue.poll();
			result.add(current);

			for(int i = 0 ; i < graph[current].size(); i++) {
				int index = graph[current].get(i);
				inDegree[index]--;
				if(inDegree[index] == 0) {
					queue.add(index);
				}
			}
			
			
		}
		
		for(Integer i : result) {
			System.out.print(i + " ");
		}

	}
}
