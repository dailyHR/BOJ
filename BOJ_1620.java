package Nov_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<>();
		String[] indexArray = new String[N+1];

		for (int i = 1; i <= N; i++) {
			String name = br.readLine();
			map.put(name, i);
			indexArray[i] = name;
		}

		String[] inputArray = new String[M];
		for (int i = 0; i < M; i++) {
			inputArray[i] = br.readLine();
		}

		for (int i = 0; i < M; i++) {
			try {
				int num = Integer.parseInt(inputArray[i]);
				System.out.println(indexArray[num]);

			} catch (NumberFormatException e) {
				int num = map.get(inputArray[i]);
				System.out.println(num);
			}
		}

	}
	
//	public static int getKey(HashMap<Integer, String> map, String value) {
//		for(int key : map.keySet()) {
//			if(value.equals(map.get(key))) {
//				return key;
//			}
//		}
//		
//		return 0;
//	}
}
