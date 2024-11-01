package algorithm.silver5;

import java.util.Scanner;

public class BOJ1676 {
    /*n!문제
    * 2*5 가 10 을 만든다. 5는 소인수분해 하게 된다면 무조건 2 보다 갯수가 적기 때문에 5의 갯수를 구하면 된다.
    *
    * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt();
        int count = 0;
        for(int i = 5; i<=N; i++){
            int now = 1;
            while(now%5 == 0){
                    count ++;
                    now /= 5;
            }


        }
    }
}
