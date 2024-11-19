package algorithm.dfs;

public class SubSetDfs {
    /*자연수 n이 주어지면 1<부터 n까지 원소 갖는 집합의 부분집합 모두 출력 프로그램 **/
    /*ex)3 --> {1} {12}{13}{123}{2}{23}{3}
    *  1-> o,x ->2->o,x 3-> o,x
    *  1 포함하는 경우 안하는경우 -> 2 포함하는 경우 안하는경우 ... DFS 사용
    * **DFS는 스택구조로 선입후출
    * */
    static int n;
    static int[] SubSet;
    public void Dfs(int L){
        if(L==n+1){
            //종착지 마지,.ㅣㅣ막 숫자
        }
        else{
            SubSet[L]= 1;
            Dfs(L+1);//왼쪽 사용한다.
            SubSet[L]= 0;
            Dfs(L+1);//오른쪽 사용안한다.ㅣ
        }
    }
    public static void main(String[] args) {
        n = 3;
        SubSetDfs subSetDfs = new SubSetDfs();
        SubSet = new int[n+1];
        subSetDfs.Dfs(1);
        System.out.println();
    }
}
