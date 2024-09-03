package algorithm.day1;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class Oven1 {
    public static void main(String[] args){
        /*시간이 주어짐*/
        int hour = Integer.MIN_VALUE;
        int minute = Integer.MIN_VALUE;
        int time = Integer.MIN_VALUE;
        String answer =  " ";
        /*걸리는 시간이 주어짐*/
        Scanner sc = new Scanner(System.in);
         hour = sc.nextInt();
         minute = sc.nextInt();
         time = sc.nextInt();
        /*59보다 크면 시간에 +1이 돼고 0으로 다시 돌아감*/
         if (minute + time >= 60){
           minute =  minute + time - 60;
           hour =hour + 1;
               if(hour > 24){
                   hour = hour -24 ;
               }
         }
        /*24는 0이 됨*/
        answer = hour + " " + minute;

        System.out.printf(answer);
    }

}
