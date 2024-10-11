package algorithm.day19;

import java.util.Scanner;

public class BOJ5565 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int Sum = sc.nextInt();
        for(int i =0; i<9; i++){
            Sum  -= sc.nextInt();
        }
        System.out.println(Sum);

    }
}
