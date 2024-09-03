package test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int httpCodeInput = scanner.nextInt();

    HttpStatus status = HttpStatus.findByCode(httpCodeInput);
    if(status == null){
        System.out.println("정의되지 않은 코드 입니다");
    } else{
        System.out.println(status.getCode()+" " +status.getMessage());
        System.out.println("isSuccess=" + status.isSuccess());
    }




    }
}
