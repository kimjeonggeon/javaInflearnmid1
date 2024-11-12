package algorithm.recursive;

import java.util.Scanner;

public class FibonacciNumber {
    /*피보나치 수열을 구해라*/
    // 재귀는 성능이 나쁘다 for문으로 하는게 더 좋다.
    // 배열이나 재귀는 스택프레임 이용해서 무겁다.
    // 방법 1. dfs를 for문으로 그냥 출력 --> 2. 배열에 담아서 출력
    // 방법 3. 메모제이션
    static int[] fibo;
     /*
     방법 2.
     public int Dfs(int n){
         if(n == 1) return fibo[n] = 1;
         if(n == 2) return fibo[n] = 1;
         else return fibo[n] = Dfs(n-1) + Dfs(n-2);
     }*/

    /*방법 3 메모제이션 이미 구해놓은것을 사용하기  때문에 시간 단축*/
    public int Dfs(int n){
        if(fibo[n] > 0) return fibo[n];
        if(n == 1) return fibo[n] = 1;
        if(n == 2) return fibo[n] = 1;
        else return fibo[n] = Dfs(n-1) + Dfs(n-2);
    }
     public static void main(String[] args){
         FibonacciNumber fibonacciNumber = new FibonacciNumber();
         int n = 7;
         fibo = new int[n+1];

         fibonacciNumber.Dfs(n);
         for(int i=1; i<n; i++){
             System.out.print(fibo[i]+" ");
         }
     }

}
