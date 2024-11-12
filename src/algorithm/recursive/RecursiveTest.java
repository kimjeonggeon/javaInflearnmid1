package algorithm.recursive;

public class RecursiveTest {
    public static void main(String[] args){
        RecursiveTest test = new RecursiveTest();
        test.DFS(3);
    }

    public void DFS(int n){
        if(n == 0) return;

        else{
            System.out.print(n+ " ");//3 2 1
            DFS(n-1);
            System.out.print(n+ " ");//1 2 3
        }
        //재귀함수 자기자신을 부른다.
        //재귀함수는 stack 프레임 사용한다.

    }
}
