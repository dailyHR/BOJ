package BOJ;

import java.util.ArrayList;

public class test {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int r = 2;
        int n = arr.length;
        permutation(arr, new int[r], new boolean[n], 0,n, r);
        combination(arr, new boolean[n], 0, n, r);
        System.out.println(result);
    }
    public static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r){
        if(depth == r){
            ArrayList<Integer> list = new ArrayList<>();
            for (int num: output) list.add(num);
            result.add(list);
            return;
        }
        for(int i = 0; i < n; i++){
            visited[i] = true;
            output[depth] = arr[i];
            permutation(arr, output, visited, depth+1, n, r);
            visited[i] = false;
        }
    }

    public static void combination(int[] arr, boolean[] visited, int start, int n, int r){
        if(r == 0){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(visited[i]){
                    list.add(arr[i]);
                }
            }
            result.add(list);
            return;
        }
        for(int i=start; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(arr, visited, i+1, n, r-1);
                visited[i] = false;
            }
        }
    }
}
