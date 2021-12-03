package Dec_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_10866 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> deque = new LinkedList<>();
		LinkedList<Integer> result = new LinkedList<>();

		
		int pushInt = 0;
		
		for(int i = 0 ; i < N; i++) {
			String[] input = br.readLine().split(" ");
			String command = input[0];
			
			switch(command) {
			
			case "push_front" :
				pushInt = Integer.parseInt(input[1]);
				deque.addFirst(pushInt);
				break;
				
			case "push_back":
				pushInt = Integer.parseInt(input[1]);
				deque.addLast(pushInt);
				break;
				
			case "pop_front":
				if(!deque.isEmpty())
					stringBuilder.append(deque.removeFirst()+"\n");
				else
					stringBuilder.append(-1+"\n");
				break;
				
			case "pop_back":
				if(!deque.isEmpty())
					stringBuilder.append(deque.removeLast()+"\n");
				else 
					stringBuilder.append(-1+"\n");
				break;
				
			case "size":
				stringBuilder.append(deque.size()+"\n");
				break;
				
			case "empty":
				if(deque.isEmpty())
					
					stringBuilder.append(1+"\n");
				else
					stringBuilder.append(0+"\n");
				break;
				
			case "front":
				if(!deque.isEmpty())
					stringBuilder.append(deque.get(0)+"\n");
				else 
					stringBuilder.append(-1+"\n");
				break;
				
			case "back":
				if(!deque.isEmpty())
					stringBuilder.append(deque.get(deque.size()-1)+"\n");
				else 
					stringBuilder.append(-1+"\n");
				break;
			}
		}
		
		System.out.println(stringBuilder);

	}

}
