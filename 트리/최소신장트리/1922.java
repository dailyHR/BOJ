import java.util.*;

class Main{
    public static int[] parent;
    public static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Edge> edges = new ArrayList<>();

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new Edge(cost, a, b));
        }

        Collections.sort(edges);
        parent = new int[n+1];
        for(int i=1; i<n+1; i++){
            parent[i] = i;
        }
        for(int i=0; i<m; i++){
            int a = edges.get(i).getNodeA();
            int b = edges.get(i).getNodeB();
            if(findParent(a) != findParent(b)){
                unionParent(a, b);
                result += edges.get(i).getDistance();
            }
        }
        System.out.println(result);
    }

    public static int findParent(int x){
        if(x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }

    public static void unionParent(int a, int b){
        a = findParent(a);
        b = findParent(b);
        if(a < b) parent[b] = a;
        else parent[a] = b;
    }
}

class Edge implements Comparable<Edge>{
    private int distance;
    private int nodeA;
    private int nodeB;

    public Edge(int distance, int nodeA, int nodeB){
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getDistance(){
        return this.distance;
    }

    public int getNodeA(){
        return this.nodeA;
    }

    public int getNodeB(){
        return this.nodeB;
    }

    @Override
    public int compareTo(Edge other){
        if(this.distance < other.getDistance()){
            return -1;
        }
        return 1;
    }
}
