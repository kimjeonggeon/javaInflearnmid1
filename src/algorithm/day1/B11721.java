package algorithm.day1;

import java.util.Scanner;

public class B11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        for (int i =0 ; i<input.length() ; i++) {
            System.out.print(input.charAt(i));
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}