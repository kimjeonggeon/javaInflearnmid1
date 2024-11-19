package algorithm.dfs;

 class Node {
     //이진트리 순회(인프런)
    int data;//노드 번호
    Node lt, rt ; // 왼쪽 자식 노드 , 오른쪽 자식 노드

    public Node(int val){
        data = val;
        lt = rt = null;
    }
}



public class Main{
    Node root;
    public void Dfs(Node root) {
        if (root == null) return;
        else{
        //root에서 lt rt로 가야함 그다음도 lt rt로 가야함
        // 1번 전위 순회 방식 1 2 4 5 3 6 7
        //          System.out.print(root.data + " ");
        //          Dfs(root.lt);
        //          Dfs(root.rt);
        //2번 중위 순회 방식
            Dfs(root.lt);
            Dfs(root.rt);
            System.out.println(root.lt);
            System.out.println(root.rt);
            System.out.println(root.data);

        }
    }

    public static void main(String[] args){
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.Dfs(tree.root);
    }




}