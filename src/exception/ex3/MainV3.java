package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[ ] args)  {
//        NetworkServiceV2_1 service = new NetworkServiceV2_1();
//        NetworkServiceV2_2 service = new NetworkServiceV2_2();
//        NetworkServiceV2_3 service = new NetworkServiceV2_2();
//        NetworkServiceV3 service = new NetworkServiceV3();
          NetworkServiceV3_2 service = new NetworkServiceV3_2();


        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("전송 문자:");
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
