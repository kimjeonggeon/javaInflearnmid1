package algorithm.number_theory;

import java.util.Scanner;

public class Boj1929 {
    /*1번째 줄에 자연수 M과 N이 빈칸 사이에 두고 주어진다 M이상 N이하의 소수가 1개이상 있는 입력만 주어진다. 에라토스테네스의 체를 이용*/
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for(int i=2; i<=N; i++){
            A[i] = i;
        }

        /*에라토스테네스으 체 이용*/
        /*n의 제곱근 까지 돌리면 됨 제곱근 위에 값들은 배수 처리가 되어서 할 필요가 없다. */
        for(int i =2; i<=Math.sqrt(N); i++){

            if(A[i]==0) continue;
            for(int j=i+i; j<=N; j = j+i){
                A[j] = 0;
            }

        }
        for(int j = M; j<N; j++){
            if(A[j]!=0){
                System.out.println(A[j]);
            }
        }
    }
}
