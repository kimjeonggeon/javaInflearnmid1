package algorithm.day1;

import java.util.Scanner;

public class B4153 {
    public static void main(String[] args){
        while(true){
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A == 0 && B == 0 && C == 0 ) break;
            boolean result = false;


            if( B<A &&   C<A ){
                if(A*A + B*B == C*C) result =true;
            }else if(A<B && C<B){
                if(B*B == A*A + C*C) result =true;
            }else if(A<C && B<C) {
                if(C*C == A*A + B*B) result = true;
            }

            if(result) System.out.printf("right");
            else System.out.println("wrong");
        }



    }
}
