package algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BfsTest {
    /*주로 최단 거리 구할 때 사용  */
        Node root;
        public void Bfs(Node root){
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            int L = 0;
            while(!q.isEmpty()){
              int len = q.size();
                System.out.print(L+":  ");
                for(int i=0;i<len;i++){
                    Node cur = q.poll();
                    System.out.print(cur.data+"");
                    if(cur.lt!=null) q.offer(cur.lt);
                    if(cur.rt!=null) q.offer(cur.rt);
                }
                L++;
                System.out.println();
            }
        }
        public static void main(String[] args){
            BfsTest tree = new BfsTest();
            tree.root = new Node(1);
            tree.root.lt = new Node(2);
            tree.root.rt = new Node(3);
            tree.root.lt.lt = new Node(4);
            tree.root.lt.rt = new Node(5);
            tree.root.rt.lt = new Node(6);
            tree.root.rt.rt = new Node(7);
            tree.Bfs(tree.root);
        }

}
class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}
