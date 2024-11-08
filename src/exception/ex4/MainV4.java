package exception.ex4;

import exception.ex3.NetworkServiceV3_2;
import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[ ] args)  {
        NetworkServiceV4 service = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);


        //주로 요즘 라이브러리는 런타임체크와 같은 언체크를 많이한다. 처리 못하는 부분은 공통에서 처리하는 것도 좋다.
        while(true){
            System.out.print("전송 문자:");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            //네트워크나 개발 단에서 해결 불가능한 거는 공통에서 처리
            try{
               service.sendMessage(input);
            }catch (Exception e){
                //Exception으로 모든 에러를 잡는다.
                exceptionHandler(e);
            }
            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");

    }

    private static void exceptionHandler(Exception e) {

        //사용자 입장에서 시스템의 디테일한 오류를 알 필요는 없다. 개발자가 빠르게 처리 할 수 있도록 오류메시지를 남기는게 좋다.
        //예외는 객체라 별도 추가 처리 가능하다.
        //공통 처리
        //html파일로
        System.out.println("죄송합니다. 알 수 없는 문제가 생겼습니다.");
        System.out.println("개발자용 디버깅 메시지---");
        e.printStackTrace(System.out); // 스택 트레이스 출력

        //위 시스템 아웃과 차이는 흐름이 다르다 조금 꼬일 수 있음
        //그러나 주로 로그백이나 slf4j같은 로그라이브러리를 사용한다.
//        e.printStackTrace(System.err); // 스택 트레이스 출력



        //예외로 별도 추가 처리 가능 할 수 있다.
//        if(e instanceof SendExceptionV4 sendEx){
//            //현재 자바 8에서는 사용 못하는 다운 캐스팅
//            System.out.println("[전송오류]" + sendEx.getSendData());
//
//        }
            //에러는 객체이니까 조금 자세하게 확인할 수 있음



    }
}
