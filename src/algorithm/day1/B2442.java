package algorithm.day1;

import java.util.Scanner;

public class B2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =0; i<N; i++){
            for(int j=N-1; j>=0; j--){
                if (j<=i){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            for(int j=0; j< N;j++){

                if (j<i){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
