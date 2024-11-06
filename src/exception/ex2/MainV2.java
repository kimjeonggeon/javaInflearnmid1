package exception.ex2;

import exception.NetworkServiceV0;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[ ] args) throws NetworkClientExceptionV2 {
        NetworkServiceV2_1 service = new NetworkServiceV2_1();
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
        //checkpoint 현재 코드에선 disconnect가 안됐고 복구가 안된다.

    }
}
