package algorithm.day11;

import java.util.Scanner;

public class BOJ2443 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=N; i>=0;i--){
            for(int j=N;j>=0;j--){
                if(j<=i){
                    System.out.print("*");
                }
                else System.out.print("");
            }
            for(int j=0; j<N-1; j++){
                if(i>j){
                    System.out.print("*");
                }else System.out.print("");
            }
            System.out.println();
        }

    }
}
