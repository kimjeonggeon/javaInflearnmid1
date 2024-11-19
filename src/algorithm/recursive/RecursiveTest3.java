package algorithm.recursive;

public class RecursiveTest3 {
    //5!을 구해라
    public static void main(String[] args){
        RecursiveTest3 test = new RecursiveTest3();
        System.out.println(test.DFS(5));
    }

    public int DFS(int n){
        //0이 되면 멈춰야한다.
        if(n == 1) {
            System.out.println(n );
            return 1;
        }
        else{
            System.out.println(n);
            return n * DFS(n-1);
        }
        //재귀함수 자기자신을 부른다.
        //재귀함수는 stack 프레임 사용한다.

    }
}
