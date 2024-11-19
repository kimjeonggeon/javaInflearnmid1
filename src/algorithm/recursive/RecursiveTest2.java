package algorithm.recursive;

public class RecursiveTest2 {
    //10진수로 제공되는 숫자를 이진수로 출력해라
    public static void main(String[] args){
        RecursiveTest2 test = new RecursiveTest2();
        test.DFS(11);
    }

    public void DFS(int n){
        //0이 되면 멈춰야한다.
        if(n == 0) return;

        else{
            DFS(n/2);
            System.out.print(n%2+ " ");//1 2 3
        }
        //재귀함수 자기자신을 부른다.
        //재귀함수는 stack 프레임 사용한다.

    }
}
