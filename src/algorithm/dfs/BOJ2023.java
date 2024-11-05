package algorithm.dfs;

import java.util.Scanner;

public class BOJ2023 {
    static int N ;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //n 자리수
        N =  sc.nextInt();

        //dfs 실행(숫자 시작, 자릿수)
        Dfs(2,1);
        Dfs(3,1);
        Dfs(5,1);
        Dfs(7,1);


    }
    public static void Dfs(int number, int digits){
    if(digits == N){
        //자릿수 일경우 바로 출력하면 됨
        //소수인지 부터 확인하고 맞으면 바로 출력
        if(isPrime(number)){
            System.out.println(number);
        }
        return;
    }
    for(int i =1; i<10; i++){
        if(i % 2 ==0){
            continue;
        }
        if(isPrime(number * 10 +i)){
            Dfs(number*10 + i ,digits + 1);
        }
    }


    }
    static boolean isPrime(int num){
        //소수인지 아닌지 판단하는 메서드
        for(int i = 2; i<= Math.sqrt(num) ; i++)
            //2부터 나눠봐서 맞는지 확인 약수면 false
            if(num % i ==0) return false;
        return true;
    }


}
