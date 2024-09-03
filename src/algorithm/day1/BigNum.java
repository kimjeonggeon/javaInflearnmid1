package algorithm.day1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] A = new int[3];
        A[0] =sc.nextInt();
        A[1] =sc.nextInt();
        A[2] =sc.nextInt();
        System.out.printf("배열 1" + A.toString());
        for(int a:A){
            System.out.println("배열 1"+a);
        }
        Arrays.sort(A);
        for(int a:A){
            System.out.println("배열 2" +a);
        }

    }
}
