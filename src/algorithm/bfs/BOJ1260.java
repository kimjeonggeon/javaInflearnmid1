package algorithm.bfs;

import java.util.*;

public class BOJ1260 {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Start = sc.nextInt();
        A = new ArrayList[N+1];
        for(int i = 1; i< N+1; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        for(int i=1; i<= N; i++){
            Collections.sort(A[i]);
        }
        visited = new boolean[N+1];
        DFS(Start);
        System.out.println(" ");



    }

    public static void DFS(int Node){
        System.out.println(Node+" ");
        visited[Node] = true;
        for(int i : A[Node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}