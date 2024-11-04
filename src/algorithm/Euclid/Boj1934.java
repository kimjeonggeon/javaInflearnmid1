package algorithm.Euclid;

import java.util.Scanner;

public class Boj1934 {
    /*유클리드 호제법 --> 최소 공배수 최대공약수 구할 때 사용 가능 , 재귀형태 구현 가능 , 소인수분해
    *
    * 입력 테스트 개수 , A B 두가지의 숫자의 공배수를 구하시오
    * 최대공약수는 공약수의 곱이고 최소공배수는 a*b / 최대공약수
    * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a= sc.nextInt();
            int b = sc.nextInt();
            int result = a*b/Gcd(a,b);
            System.out.println(result);
        }
    }

    public static int Gcd(int a, int b){
        if(b==0) return a;
        else{
            return Gcd(b,a%b);
        }

    }
}
