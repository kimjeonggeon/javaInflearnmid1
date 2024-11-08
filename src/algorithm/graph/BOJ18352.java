package algorithm.graph;

import java.util.*;

public class BOJ18352 {
    /*1번부터 n번까지도시와 m개의 도로가 존재한다. 모든 도시의 거리느 1이다.*/
    /*도시 x로부터 출발해 도달할 수 있는 모든 도시 중 최단 거리가 정확히 k인 모든 도시들의 번호는?
    *
    * 입력 4421 nmkx
    * 해당하는 도시가 없을 겨우 -1
    * bfs이용
    *  */
    static int visited[];
    static ArrayList<Integer>[] A;
    static int N,M,K,X;
    static List<Integer> answer;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();

        A = new ArrayList[N+1];

        for(int i=0; i<N; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++){
            int s = sc.nextInt();
            int E = sc.nextInt();
            A[s].add(E);
        }
        visited = new int[N+1];
        for(int i = 0; i<=N; i++){
            visited[i] = -1;
        }
        BFS(X);
        for(int i=0; i<=N; i++){
            if(visited[i] == K){
                answer.add(i);
            }
        }
        if(answer.isEmpty()){
            System.out.println("-1");
        }else{
            Collections.sort(answer);
            for(int temp:answer){
                System.out.println(temp);
            }
        }

    }
    public static void BFS(int Node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node]++;
        while(!queue.isEmpty()){
            int now_node = queue.poll();
            for(int i: A[now_node]){
                if(visited[i] == -1){
                    visited[i] = visited[now_node]+1;
                    queue.add(i);
                }
            }

        }
    }
}
