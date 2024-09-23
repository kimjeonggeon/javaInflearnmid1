package algorithm.day16;

import java.util.Scanner;

public class BOJ2522 {
    /*별찍기 -12*/
    //  *
    // **
    //***
    // **
    //  *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<2*n-1;i++){
            for(int j = n-1; j>=0;j--){
                if((j<=i) || (i-n >= j)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }
}
