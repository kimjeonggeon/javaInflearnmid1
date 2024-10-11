package algorithm.day19;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        /*알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.

          팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.

           level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.*/
        Scanner sc = new Scanner(System.in);
        char[] text = sc.next().toCharArray();
        int start_index = 0;
        int end_index = text.length - 1;
        boolean flag = true;
//        for(int i=0; i<text.length; i++){
//            if(text[i] == text[end_index]){
//                end_index--;
//            }else System.out.println("0");
//        }
        while (start_index < end_index) {
            if (text[start_index] == text[end_index]) {
                end_index--;

            }else flag = false; break;
        }
        if (flag) {
            System.out.println("1");
        }else System.out.println("0");
    }
}
