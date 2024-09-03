package exception.ex01;

import exception.NetworkServiceV0;

import java.util.Scanner;

public class MainV12 {
    public static void main(String[ ] args){
        NetworkServiceV1_3 service = new NetworkServiceV1_3();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("전송 문자");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
